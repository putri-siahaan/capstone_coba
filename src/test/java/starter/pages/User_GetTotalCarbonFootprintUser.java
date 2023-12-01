package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetTotalCarbonFootprintUser {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_45 - Get Total Carbon Footprint User [Positive]

    @Step("User input endpoint with valid ID user to get total carbon footprint")
    public String userInputEndpointWithValidIDUserToGetTotalCarbonFootprint(){
        return url + "carbonfootprint/29";
    }

    @Step("User request with the HTTP method GET to get total carbon footprint user and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetTotalCarbonFootprintUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidIDUserToGetTotalCarbonFootprint()).then().statusCode(200);
    }

    @Step("Validate success to get total carbon footprint user and display information detail data total carbon footprint user in the response body")
    public void successToGetTotalCarbonFootprintUser(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_MA_User_46 - Get Total Carbon Footprint User [Negative]

    @Step("User input endpoint with invalid ID user to get total carbon footprint")
    public String userInputEndpointWithInvalidIDUserToGetTotalCarbonFootprint(){
        return url + "carbonfootprint/35";
    }

    @Step("User request HTTP method GET to get total carbon footprint user and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputInvalidIDUserToGetTotalCarbonFootprint(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithInvalidIDUserToGetTotalCarbonFootprint()).then().statusCode(403);
    }

    @Step("Validate failed to get total carbon footprint user and display error message {string} in the response body")
    public void failedToGetTotalCarbonFootprintUser(String invalidIDToGetTotalCarbonFootprintUser){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 403 && responseBody.contains(invalidIDToGetTotalCarbonFootprintUser)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
