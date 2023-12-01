package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetUserDataByID {
    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_29 - Get User Data By ID [Positive]

    @Step("User input endpoint with valid ID to get user data")
    public String userInputEndpointWithValidIDToGetUserData(){
        return url + "user/29";
    }

    @Step("User request with the HTTP method GET and input and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputValidIDToGetUserData(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidIDToGetUserData()).then().statusCode(200);
    }

    @Step("Validate success to get user data by ID and display information detail of the account in the response body")
    public void successToGetUserData(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_MA_User_30 - Get User Data By ID [Negative]

    @Step("User input endpoint with invalid ID to get user data")
    public String userInputEndpointWithInvalidIDToGetUserData(){
        return url + "user/100";
    }

    @Step("User request HTTP method GET and input and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetUserData(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithInvalidIDToGetUserData()).then().statusCode(403);
    }

    @Step("User receive a response with status code 403 Forbidden")
    public void receiveHttpResponseCode403(){
        restAssuredThat(response -> response.statusCode(403));
    }

    @Step("Validate failed to get user data and display error message {string} in the response body")
    public void failedToGetUserData(String invalidIDToGetUserData){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 403 && responseBody.contains(invalidIDToGetUserData)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }

}
