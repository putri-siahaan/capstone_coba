package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class User_GetTNC {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_133 - Get Terms and Conditions Data [Positive]

    @Step("User input valid endpoint to get tnc")
    public String userInputValidEndpointToGetTNC(){
        return url + "tnc";
    }

    @Step("User request with HTTP method GET to get tnc with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNCWithAuthorization(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetTNC()).then().statusCode(200);
    }

    @Step("Validate success to get tnct and display all in the response body")
    public void successToGetTNC(){
        String successGetTNC = SerenityRest.lastResponse().jsonPath().getString("term_conditions");

        assertThat(successGetTNC).isNotEmpty();
    }





    //TC_AA_User_134 - Get Terms and Conditions Data [Negative 1]

    @Step("User request with GET HTTP method to get tnc without authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNCWithoutAuthorization(){
        SerenityRest
                .given()
                .get(userInputValidEndpointToGetTNC()).then().statusCode(401);
    }

    @Step("Validate failed to get tnc and display error message {string} in the response body")
    public void failedToGetTNCBecauseWithoutAuthorization(String failedGetTNC){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(failedGetTNC)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_135 - Get Terms and Conditions Data [Negative 2]

    @Step("User input invalid endpoint to get tnc")
    public String userInputInvalidEndpointToGetTNC(){
        return url + "Tnc";
    }

    @Step("User request with GET HTTP method to get tnc with authorization and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputInvalidEndpointToGetTNC(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetTNC()).then().statusCode(404);
    }

    @Step("Validate failed to gettnc because invalid endpoint and display error message {string} in the response body")
    public void failedToGetTNCBecauseInvalidEndpoint(String failedGetTNCBecauseInvalidEndpoint){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedGetTNCBecauseInvalidEndpoint)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
