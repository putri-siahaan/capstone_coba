package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class User_GetTNCByID {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_136 - Get Terms and Conditions Data By ID [Positive]

    @Step("User input endpoint with valid ID to get tnc")
    public String userInputEndpointWithValidIDToGetTNC(){
        return url + "tnc/1";
    }

    @Step("User request with HTTP method GET to get tnc by ID with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidIDToGetTNCWithAuthorization(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidIDToGetTNC()).then().statusCode(200);
    }

    @Step("Validate success to get tnc by ID and display all tnc in the response body")
    public void successToGetTNCByID(){
        String successGetTNC = SerenityRest.lastResponse().jsonPath().getString("term_condition");

        assertThat(successGetTNC).isNotEmpty();
    }





    //TC_AA_User_137 - Get Terms and Conditions Data By ID [Negative 1]

    @Step("User request with GET HTTP method to get tnc by ID without authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidIDToGetTNCWithoutAuthorization(){
        SerenityRest
                .given()
                .get(userInputEndpointWithValidIDToGetTNC()).then().statusCode(401);
    }

    @Step("Validate failed to get tnc by ID and display error message {string} in the response body")
    public void failedToGetTNCByIDBecauseWithoutAuthorization(String failedGetTNCByID){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(failedGetTNCByID)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_138 - Get Terms and Conditions Data By ID [Negative 2]

    @Step("User input endpoint with invalid ID to get tnc")
    public String userInputEndpointWithInvalidIDToGetTNC(){
        return url + "tnc/500000";
    }

    @Step("User request with GET HTTP method to get tnc by ID with authorization and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputInvalidIDToGetTNC(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithInvalidIDToGetTNC()).then().statusCode(404);
    }

    @Step("Validate failed to get tnc because invalid ID and display error message {string} in the response body")
    public void failedToGetTNCBecauseInvalidID(String failedGetTNCBecauseInvalidID){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedGetTNCBecauseInvalidID)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
