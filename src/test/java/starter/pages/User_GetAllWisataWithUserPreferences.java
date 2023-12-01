package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetAllWisataWithUserPreferences {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_39 - Get All Wisata With User Preferences [Positive]

    @Step("User input valid endpoint to get all wisata based on user preferences")
    public String userInputValidEndpointToGetAllWisataBasedOnUserPreferences(){
        return url + "user/preferences";
    }

    @Step("User request with HTTP method GET to get wisata based on user preferences and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllWisataBasedOnUserPreferences(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetAllWisataBasedOnUserPreferences()).then().statusCode(200);
    }

    @Step("Validate success to get all wisata based on user preferences and display information detail all wisata in the response body")
    public void successToGetAllWisataBasedOnUserPreferences(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_MA_User_40 - Get All Wisata With User Preferences [Negative]

    @Step("User input invalid endpoint to get all wisata based on user preferences")
    public String userInputInvalidEndpointToGetAllWisataBasedOnUserPreferences(){
        return url + "user/Preferences";
    }

    @Step("User request GET HTTP method to get all promo and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllWisataBasedOnUserPreferences(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetAllWisataBasedOnUserPreferences()).then().statusCode(400);
    }

    @Step("Validate failed to get all wisata based on user preferences and display error message {string} in the response body")
    public void failedToGetAllWisataBasedOnUserPreferences(String failedGetAllWisataBasedOnUserPreferences){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedGetAllWisataBasedOnUserPreferences)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }

}
