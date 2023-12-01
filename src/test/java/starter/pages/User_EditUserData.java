package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class User_EditUserData {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_83 - Edit User Data By ID [Positive]

    @Step("User input endpoint with valid user ID to edit user data")
    public String userInputValidEndpointWithValidIDToEditUserData(){
        return url + "user/29";
    }

    @Step("User request with the HTTP method PUT and input valid name, category favorite and profile image in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputValidNameCategoryFavoriteAndProfileImage(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "Putri Ruth Berliana Siahaan")
                .multiPart("category_kesukaan", "pantai")
                .multiPart("profile_image", new File("src/test/resources/foto/profile.jpg"), "image/jpeg")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithValidIDToEditUserData());
    }

    @Step("Validate success edit user data and display message {string} in the response body")
    public void successToEditUserData(String successEditUserData){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(successEditUserData)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }








    //TC_AA_User_84 - Edit User Data By ID [Negative 1]

    @Step("User input endpoint with invalid ID to edit user data")
    public String userInputValidEndpointWithInvalidIDToEditUserData(){
        return url + "user/1";
    }

    @Step("User request HTTP method PUT and input valid name, category favorite and profile image in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidIDToEditUserData(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "Putri Ruth Berliana Siahaan")
                .multiPart("category_kesukaan", "pantai")
                .multiPart("profile_image", new File("src/test/resources/foto/profile.jpg"), "image/jpeg")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithInvalidIDToEditUserData());
    }

    @Step("Validate failed edit user data because invalid ID and display message {string} in the response body")
    public void failedEditUserDataBecauseInvalidID(String invalidIDToEditUserData){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(invalidIDToEditUserData)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_85 - Edit User Data By ID [Negative 2]

    @Step("User request HTTP method PUT and input invalid name in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidNameToEditUserData(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "P")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithValidIDToEditUserData());
    }

    @Step("Validate failed edit user data because invalid name and display message {string} in the response body")
    public void failedEditUserDataBecauseInvalidName(String invalidNameToEditDataUser){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidNameToEditDataUser)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_86 - Edit User Data By ID [Negative 3]

    @Step("User request HTTP method PUT and input invalid username in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidUsername(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("username", "P")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithValidIDToEditUserData());
    }


    @Step("Validate failed edit user data because invalid username and display error message {string} in the response body")
    public void failedEditUserDataBecauseInvalidUsername(String invalidUsernameToEditUserData){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidUsernameToEditUserData)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_87 - Edit User Data By ID [Negative 4]

    @Step("User request HTTP method PUT and input invalid email in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidEmail(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("email", "putri")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithValidIDToEditUserData());
    }


    @Step("Validate failed edit user data because invalid email and display error message {string} in the response bod")
    public void failedEditUserDataBecauseInvalidEmail(String invalidEmailToEditUserData){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidEmailToEditUserData)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_88 - Edit User Data By ID [Negative 5]

    @Step("User request HTTP method PUT and input invalid phone number in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndDInputInvalidPhoneNumber(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("phone_number", "abcineifneee123")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithValidIDToEditUserData());
    }

    @Step("Validate failed edit user data because invalid phone number and display message {string} in the response body")
    public void failedEditUserDataBecauseInvalidPhoneNumber(String invalidPhoneNumberToEditUserData){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidPhoneNumberToEditUserData)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_89 - Edit User Data By ID [ Negative 6]

    @Step("User request HTTP method PUT and input invalid format profile image in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputInvalidFormatProfileImage(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("profile_image", new File("src/test/resources/foto/Pembekalan KP S1-IF 2023 (rev) (1).pptx"), "application/vnd.openxmlformats-officedocument.presentationml.presentation")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithValidIDToEditUserData());
    }

    @Step("Validate failed edit user data because input invalid format profile image and display error message {string} in the response body")
    public void failedEditUserDataBecauseInvalidFormatProfileImage(String invalidFormatProfileImage){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidFormatProfileImage)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }















    //TC_AA_User_90 - Edit User Data By ID [ Negative 7]

    @Step("User request HTTP method PUT and input invalid category favorite in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInvalidCategoryFavorite(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("category_kesukaan", "Seluncuran")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .put(userInputValidEndpointWithValidIDToEditUserData());
    }

    @Step("Validate failed edit user data because input invalid category favorite and display error message {string} in the response body")
    public void failedEditUserDataBecauseInvalidCategoryFavorite(String invalidCategoryFavorite){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(invalidCategoryFavorite)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
