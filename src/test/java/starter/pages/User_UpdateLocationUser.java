package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class User_UpdateLocationUser {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_81 - Update Location User [Positive]

    @Step("User input endpoint with valid ID to update location")
    public String userInputValidEndpointWithValidIDToUpdateLocationUser(){
        return url + "userlocation/29";
    }

    @Step("User request with the HTTP method PUT and input valid data lat and long in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputValidDataLatAndLong(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("lat", 2.329090);
        requestBody.put("long", 99.062600);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToUpdateLocationUser()).then().statusCode(200);
    }

    @Step("Validate success update location user and display message {string} in the response body")
    public void successToUpdateLocationUser(String successUpdateLocation){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(successUpdateLocation)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }








    //TC_AA_User_82 - Update Location User [Negative]

    @Step("User input endpoint with invalid ID to update location")
    public String userInputValidEndpointWithInvalidIDToUpdateLocation(){
        return url + "userlocation/1";
    }

    @Step("User request HTTP method PUT and input valid data lat and long in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidIDToUpdateLocationUser(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("lat", 2.329090);
        requestBody.put("long", 99.062600);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithInvalidIDToUpdateLocation()).then().statusCode(401);    }

    @Step("Validate failed update location because invalid ID and display message {string} in the response body")
    public void failedUpdateLocationBecauseInvalidID(String invalidIDToUpdateLocation){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(invalidIDToUpdateLocation)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }

}
