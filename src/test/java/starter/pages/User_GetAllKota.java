package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetAllKota {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_94 - Get All Kota Data [Positive]

    @Step("User input valid endpoint to get all kota data")
    public String userInputValidEndpointToGetAllKotaData(){
        return url + "cities";
    }

    @Step("User request with HTTP method GET to get all kota and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllKota(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetAllKotaData()).then().statusCode(200);
    }

    @Step("Validate success to get all kota data and display information detail all kota in the response body")
    public void successToGetAllKota(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_95 - Get All Kota Data [Negative]

    @Step("User input invalid endpoint to get all kota data")
    public String userInputInvalidEndpointToGetAllKotaData(){
        return url + "city";
    }

    @Step("User request with GET HTTP method to get all kota and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllKota(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetAllKotaData()).then().statusCode(404);
    }

    @Step("Validate failed to get all kota data and display error message {string} in the response body")
    public void failedToGetAllKotaData(String failedGetAllKota){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedGetAllKota)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }

}
