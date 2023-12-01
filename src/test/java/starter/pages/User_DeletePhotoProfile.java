package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class User_DeletePhotoProfile {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_124 - Delete User Photo Profile [Positive]

    @Step("User input endpoint with valid ID to delete photo profile")
    public String userInputEndpointWithValidIDToDeletePhotoProfile(){
        return url + "user/photo/29";
    }

    @Step("User request with the HTTP method DELETE to photo profile and click Send Button")
    public void userRequestWithTheHTTPMethodDELETEToDeletePhotoProfile(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .delete(userInputEndpointWithValidIDToDeletePhotoProfile()).then().statusCode(200);
    }

    @Step("Validate success to delete photo profile and display message {string} in the response body")
    public void successToDeletePhotoProfile(String successDeletePhotoProfile){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(successDeletePhotoProfile)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }







    //TC_MA_User_125 - Delete User Photo Profile [Negative]

    @Step("User input endpoint with invalid ID to delete photo profile")
    public String userInputEndpointWithInvalidIDToDeletePhotoProfile(){
        return url + "user/photo/38";
    }

    @Step("User request HTTP method DELETE to delete photo profile and click Send Button")
    public void userRequestWithTheHTTPMethodDELETEAndInputInvalidIDToDeletePhotoProfile(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .delete(userInputEndpointWithInvalidIDToDeletePhotoProfile()).then().statusCode(404);
    }

    @Step("Validate failed to delete photo profile and display error message {string} in the response body")
    public void failedToGetDeletePhotoProfileBecauseInvalidID(String invalidIDToDeletePhotoProfile){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(invalidIDToDeletePhotoProfile)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
