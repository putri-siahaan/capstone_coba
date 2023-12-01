package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetAllPromo {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_35 - Get All Promo [Positive]

    @Step("User input valid endpoint to get all promo")
    public String userInputValidEndpointToGetAllPromo(){
        return url + "user/promo";
    }

    @Step("User request with HTTP method GET to get all promo and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllPromo(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetAllPromo()).then().statusCode(200);
    }

    @Step("Validate success to get all wisata promo and display information detail all promo in the response body")
    public void successToGetAllPromo(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_36 - Get All Promo [Negative]

    @Step("User input invalid endpoint to get all promo")
    public String userInputInvalidEndpointToGetAllPromo(){
        return url + "user/Promo";
    }

    @Step("User request with GET HTTP method to get all promo and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllPromo(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetAllPromo()).then().statusCode(400);
    }

    @Step("Validate failed to get all promo and display error message {string} in the response body")
    public void failedToGetAllPromo(String failedGetAllPromo){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedGetAllPromo)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
