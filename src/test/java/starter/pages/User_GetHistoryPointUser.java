package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class User_GetHistoryPointUser {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_130 - Get History Point User [Positive]

    @Step("User input valid endpoint to get history point")
    public String userInputValidEndpointToGetHistoryPoint(){
        return url + "user/points/history";
    }

    @Step("User request with HTTP method GET to get history point with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetHistoryPointWithAuthorization(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetHistoryPoint()).then().statusCode(200);
    }

    @Step("Validate success to get history point and display all in the response body")
    public void successToGetHistoryPoint(){
        String actualMessage = SerenityRest.lastResponse().jsonPath().getString("message");

        String expectedMessage = "User's points history retrieved successfully";
        assertThat(actualMessage).isEqualTo(expectedMessage);
    }





    //TC_AA_User_131 - Get History Point User [Negative 1]

    @Step("User request with GET HTTP method to get history point without authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetHistoryPointWithoutAuthorization(){
        SerenityRest
                .given()
                .get(userInputValidEndpointToGetHistoryPoint()).then().statusCode(401);
    }

    @Step("Validate failed to get history point and display error message {string} in the response body")
    public void failedToGetHistoryPointBecauseWithoutAuthorization(String failedGetHistoryPoint){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(failedGetHistoryPoint)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_132 - Get History Point User [Negative 2]

    @Step("User input invalid endpoint to get history point")
    public String userInputInvalidEndpointToGetHistoryPoint(){
        return url + "user/points/History";
    }

    @Step("User request with GET HTTP method to get history point with authorization and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputInvalidEndpointToGetHistoryPoint(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetHistoryPoint()).then().statusCode(400);
    }

    @Step("Validate failed to get history point because invalid endpoint and display error message {string} in the response body")
    public void failedToGetHistoryPointBecauseInvalidEndpoint(String failedGetHistoryBecauseInvalidEndpoint){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedGetHistoryBecauseInvalidEndpoint)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
