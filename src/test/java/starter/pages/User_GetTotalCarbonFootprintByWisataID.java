package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetTotalCarbonFootprintByWisataID {
    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_41 - Get Total Carbon Footprint By ID [Positive]

    @Step("User input endpoint with valid ID to get total carbon footprint")
    public String userInputEndpointWithValidIDToGetTotalCarbonFootprint(){
        return url + "carbonfootprintwisata/2";
    }

    @Step("User request with the HTTP method GET to get total carbon footprint and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetTotalCarbonFootprint(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidIDToGetTotalCarbonFootprint()).then().statusCode(200);
    }

    @Step("Validate success to get total carbon footprint based on ID and display information detail data total carbon footprint in the response body")
    public void successToGetTotalCarbonFootprint(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_MA_User_42 - Get Total Carbon Footprint By ID [Negative]

    @Step("User input endpoint with invalid ID to get total carbon footprint")
    public String userInputEndpointWithInvalidIDToGetTotalCarbonFootprint(){
        return url + "carbonfootprintwisata/100";
    }

    @Step("User request HTTP method GET to get total carbon footprint and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetTotalCarbonFootprint(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithInvalidIDToGetTotalCarbonFootprint()).then().statusCode(404);
    }

    @Step("Validate failed to get total carbon footprint based on ID and display error message {string} in the response body")
    public void failedToGetTotalCarbonFootprint(String invalidIDToGetTotalCarbonFootprint){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(invalidIDToGetTotalCarbonFootprint)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
