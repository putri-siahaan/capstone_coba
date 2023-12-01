package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetPointUser {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_71 - Get Point User [Positive]

    @Step("User input valid endpoint to get point user")
    public String userInputValidEndpointToGetPointUser(){
        return url + "user/points";
    }

    @Step("User request with HTTP method GET to get point user and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetPointUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetPointUser()).then().statusCode(200);
    }

    @Step("Validate success to get point user and display detail users ticket retrieved in the response body")
    public void successToGetPointUser(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_72 - Get Point User [Negative]

    @Step("User input invalid endpoint to get point user")
    public String userInputInvalidEndpointToGetPointUser(){
        return url + "user/point";
    }

    @Step("User request with GET HTTP method to get point user and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputValidEndpointToGetPointUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetPointUser()).then().statusCode(400);
    }

    @Step("Validate failed to get point user and display error message {string} in the response body")
    public void failedToGetPointUser(String failedGetPointUser){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedGetPointUser)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
