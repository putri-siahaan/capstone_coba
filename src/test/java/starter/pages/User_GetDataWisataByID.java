package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetDataWisataByID {
    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_33 - Get Data Wisata By ID [Positive]

    @Step("User input endpoint with valid ID to get data wisata")
    public String userInputEndpointWithValidIDToGetWisataData(){
        return url + "wisata/3";
    }

    @Step("User request with the HTTP method GET to get data wisata and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetDataWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidIDToGetWisataData()).then().statusCode(200);
    }

    @Step("Validate success to get data wisata by ID and display information detail data wisata in the response body")
    public void successToGetDataWisata(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_MA_User_34 - Get Data Wisata By ID [Negative]

    @Step("User input endpoint with invalid ID to get data wisata")
    public String userInputEndpointWithInvalidIDToGetDataWisata(){
        return url + "wisata/5";
    }

    @Step("User request HTTP method GET to get data wisata and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetDataWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithInvalidIDToGetDataWisata()).then().statusCode(404);
    }

    @Step("Validate failed to get data wisata and display error message {string} in the response body")
    public void failedToGetDataWisata(String invalidIDToGetDataWisata){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(invalidIDToGetDataWisata)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
