package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetPromoByID {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_37 - Get Promo By ID [Positive]

    @Step("User input endpoint with valid ID to get promo")
    public String userInputEndpointWithValidIDToGetPromo(){
        return url + "user/promo/17";
    }

    @Step("User request with the HTTP method GET to get data promo and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetPromo(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidIDToGetPromo()).then().statusCode(200);
    }

    @Step("Validate success to get promo by ID and display information detail promo in the response body")
    public void successToGetPromo(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_38 - Get Promo By ID [Negative]

    @Step("User input endpoint with invalid ID to get promo")
    public String userInputEndpointWithInvalidIDToGetPromo(){
        return url + "user/promo/27";
    }

    @Step("User request HTTP method GET to get promo and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetPromo(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithInvalidIDToGetPromo()).then().statusCode(404);
    }

    @Step("Validate failed to get promo and display error message {string} in the response body")
    public void failedToGetPromoBecauseInvalidID(String invalidIDToGetPromo){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(invalidIDToGetPromo)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
