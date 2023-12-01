package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class User_ChangesPasswordUser {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_73 - Changes Password User [Positive]

    @Step("User input endpoint with valid ID to changes password")
    public String userInputValidEndpointWithValidIDToChangesPassword(){
        return url + "user/change-password/29";
    }

    @Step("User request with the HTTP method PUT and input valid current and new password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputValidDataNewPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("currentPassword", "siahaan123");
        requestBody.put("newPassword", "siahaan12345");
        requestBody.put("confirmPassword", "siahaan12345");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToChangesPassword()).then().statusCode(200);
    }

    @Step("Validate success changes password and display message {string} in the response body")
    public void successToChangesPassword(String successChangesPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(successChangesPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }








    //TC_AA_User_74 - Changes Password User [Negative 1]

    @Step("User input endpoint with invalid ID to changes password")
    public String userInputValidEndpointWithInvalidIDToChangesPassword(){
        return url + "user/change-password/1";
    }

    @Step("User request HTTP method PUT and input valid current and new password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidIDToChangesPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("currentPassword", "siahaan123");
        requestBody.put("newPassword", "siahaan12345");
        requestBody.put("confirmPassword", "siahaan12345");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithInvalidIDToChangesPassword()).then().statusCode(403);    }

    @Step("Validate failed changes password because invalid ID and display message {string} in the response body")
    public void failedChangesPasswordBecauseInvalidID(String invalidIDToChangesPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 403 && responseBody.contains(invalidIDToChangesPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_75 - Changes Password User [Negative 2]

    @Step("User request HTTP method PUT and input invalid current password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidCurrentPasswordToChangesPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("currentPassword", "putri123");
        requestBody.put("newPassword", "siahaan1234567");
        requestBody.put("confirmPassword", "siahaan1234567");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToChangesPassword()).then().statusCode(401);
    }

    @Step("Validate failed changes password because invalid current password and display message {string} in the response body")
    public void failedChangesPasswordBecauseInvalidCurrentPassword(String invalidCurrentPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(invalidCurrentPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_76 - Changes Password User [Negative 3]

    @Step("User request HTTP method PUT and input invalid new and confirm password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidNewPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("currentPassword", "siahaan12345");
        requestBody.put("newPassword", "s");
        requestBody.put("confirmPassword", "s");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToChangesPassword()).then().statusCode(400);
    }


    @Step("Validate failed changes password because invalid new password and display error message {string} in the response body")
    public void failedChangesPasswordBecauseInvalidNewPassword(String invalidNewPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidNewPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_77 - Changes Password User [Negative 4]

    @Step("User request HTTP method PUT and input invalid confirm password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidConfirmPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("currentPassword", "siahaan12345");
        requestBody.put("newPassword", "siahaan123");
        requestBody.put("confirmPassword", "siahaan");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToChangesPassword()).then().statusCode(400);
    }


    @Step("Validate failed changes password because invalid confirm password and display error message {string} in the response body")
    public void failedChangesPasswordBecauseInvalidConfirmPassword(String invalidConfirmPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidConfirmPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_78 - Changes Password User [Negative 5]

    @Step("User request HTTP method PUT and did not input current password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndDidNotInputCurrentPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("newPassword", "siahaan270302");
        requestBody.put("confirmPassword", "siahaan270302");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToChangesPassword()).then().statusCode(401);
    }

    @Step("Validate failed changes password because did not input current password and display message {string} in the response body")
    public void failedChangesPasswordBecauseDidNotInputCurrentPassword(String didNotInputCurrentPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(didNotInputCurrentPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_79 - Changes Password User [Negative 6]

    @Step("User request HTTP method PUT and did not input new password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndDidNotInputNewPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("currentPassword", "siahaan12345");
        requestBody.put("confirmPassword", "siahaan123");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToChangesPassword()).then().statusCode(400);
    }

    @Step("Validate failed changes password and display error message {string} in the response body")
    public void failedChangesPasswordBecauseDidNotInputNewPassword(String didNotInputNewPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(didNotInputNewPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }















    //TC_AA_User_80 - Changes Password User [Negative 7]

    @Step("User request HTTP method PUT and did not input confirm password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndDidNotInputConfirmPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("currentPassword", "siahaan12345");
        requestBody.put("newPassword", "siahaan123");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(userInputValidEndpointWithValidIDToChangesPassword()).then().statusCode(400);
    }

    @Step("Validate failed changes password because did not input confirm password and display error message {string} in the response body")
    public void failedChangesPasswordBecauseDidNotInputConfirmPassword(String didNotInputConfirmPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(didNotInputConfirmPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }


}
