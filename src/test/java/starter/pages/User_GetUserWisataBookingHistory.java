package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetUserWisataBookingHistory {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_69 - Get User Wisata Booking History [Positive]

    @Step("User input valid endpoint to get user wisata booking history")
    public String userInputValidEndpointToGetUserWisataBookingHistory(){
        return url + "user/wisata";
    }

    @Step("User request with HTTP method GET to get user wisata booking history and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetUserWisataBookingHistory(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetUserWisataBookingHistory()).then().statusCode(200);
    }

    @Step("Validate success to get user wisata booking history and display detail users ticket retrieved in the response body")
    public void successToGetUserWisataBookingHistory(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_70 - Get User Wisata Booking History [Negative]

    @Step("User input invalid endpoint to get user wisata boooking history")
    public String userInputInvalidEndpointToGetUserWisataBookingHistory(){
        return url + "user/Wisata";
    }

    @Step("User request with GET HTTP method to get user wisata booking history and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputValidEndpointToGetUserWisataBookingHistory(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetUserWisataBookingHistory()).then().statusCode(400);
    }

    @Step("Validate failed to get user wisata booking history and display error message {string} in the response body")
    public void failedToGetUserWisataBookingHistory(String failedGetUserWisataBookingHistory){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedGetUserWisataBookingHistory)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
