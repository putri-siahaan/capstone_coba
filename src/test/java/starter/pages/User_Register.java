package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class User_Register {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_1 - Register [Positive]

    @Step("User input valid endpoint to create new account")
    public String userInputValidEndpointToCreateAccount(){
        return url + "signup";
    }

    @Step("User request with the HTTP method POST and input valid name, username, password, confirmation password, email, and phone number in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputValidDataRegister(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Putri R.B Siahaan");
        requestBody.put("username", "putrishn2732002");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri1356@gmail.com");
        requestBody.put("phone_number", "085260892711");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("User receive a response with status code 200 OK")
    public void receiveHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("Validate success to create new account and display message {string} in the response body")
    public void successToCreateAccount(String successRegister){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(successRegister)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }





    //TC_AA_User_2 - Register [Negative 1]

    @Step("User request with the HTTP method POST and input username already exists in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputUsernameAlreadyExists(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn27");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }

    @Step("User receive a response with status code 409 Conflict")
    public void receiveHttpResponseCode409(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Validate failed to create account because username already exists and display error message {string} in the response body")
    public void failedToCreateAccountBecauseUsernameAlreadyExists(String usernameAlreadyExists){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(usernameAlreadyExists)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_3 - Register [Negative 2]

    @Step("User request with the HTTP method POST and input email already exists in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputEmailAlreadyExists(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri135@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account because email already exists and display error message {string} in the response body")
    public void failedToCreateAccountBecauseEmailAlreadyExists(String emailAlreadyExists){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(emailAlreadyExists)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_4 - Register [Negative 3]

    @Step("User request with the HTTP method POST and input phone number already exists in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputPhoneNumberAlreadyExists(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892711");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create a new account and display error message {string} in the response body")
    public void failedToCreateAccountBecausePhoneNumberAlreadyExists(String phoneNumberAlreadyExists){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(phoneNumberAlreadyExists)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }





    //TC_AA_User_5 - Register [Negative 4]

    @Step("User request with the HTTP method POST and did not input name in the request body and click Send Button")
    public void userRequestPOSTMethodAndDidNotInputName(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("User receive a response with status code 400 Bad Request")
    public void receiveHttpResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("Validate failed to create account because did not input name and display error message {string} in the response body")
    public void failedToCreateAccountBecauseDidNotInputName(String emptyName){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(emptyName)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_6 - Register [Negative 5]

    @Step("User request with the HTTP method POST and did not input username in the request body and click Send Button")
    public void userRequestPOSTMethodAndDidNotInputUsername(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create account because did not input username and display error message {string} in the response body")
    public void failedToCreateAccountBecauseDidNotInputUsername(String emptyUsername){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(emptyUsername)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }







    //TC_AA_User_7 - Register [Negative 6]

    @Step("User request with the HTTP method POST and did not input password in the request body and click Send Button")
    public void userRequestPOSTMethodAndDidNotInputPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create account because did not input password and display error message {string} in the response body")
    public void failedToCreateAccountBecauseDidNotInputPassword(String emptyPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(emptyPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_8 - Register [Negative 7]

    @Step("User request with the HTTP method POST and did not input confirm password in the request body and click Send Button")
    public void userRequestPOSTMethodAndDidNotInputConfirmPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create account because did not input confirm password and display error message {string} in the response body")
    public void failedToCreateAccountBecauseDidNotInputConfirmPassword(String emptyConfirmPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(emptyConfirmPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_9 - Register [Negative 8]

    @Step("User request with the HTTP method POST and did not input email in the request body and click Send Button")
    public void userRequestPOSTMethodAndDidNotInputEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create account user because did not input email and display error message {string} in the response body")
    public void failedToCreateAccountBecauseDidNotInputEmail(String emptyEmail){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(emptyEmail)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_10 - Register [Negative 9]

    @Step("User request with the HTTP method POST and did not input phone number in the request body and click Send Button")
    public void userRequestPOSTMethodAndDidNotInputPhoneNumber(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create account because did not input phone number and display error message {string} in the response body")
    public void failedToCreateAccountBecauseDidNotInputPhoneNumber(String emptyPhoneNumber){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(emptyPhoneNumber)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }








    //TC_AA_User_11 - Register [Negative 10]

    @Step("User request with the HTTP method POST and input name with a space in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputNameWithSpace(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", " ");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input name with only space and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputNameWithOnlySpace(String nameOnlySpace){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(nameOnlySpace)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_12 - Register [Negative 11]

    @Step("User request with the HTTP method POST and input username with a space in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputUsernameWithSpace(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", " ");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input username with only space and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputUsernameWithOnlySpace(String usernameOnlySpace){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(usernameOnlySpace)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_13 - Register [Negative 12]

    @Step("User request with the HTTP method POST and input password with a space in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputPasswordWithSpace(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", " ");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input password with only space and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputPasswordWithOnlySpace(String passwordOnlySpace){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(passwordOnlySpace)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_14 - Register [Negative 13]

    @Step("User request with the HTTP method POST and input email with a space in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputEmailWithSpace(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", " ");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input email with only space and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputEmailWithOnlySpace(String emailOnlySpace){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(emailOnlySpace)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_15 - Register [Negative 14]

    @Step("User request with the HTTP method POST and input phone number with a space in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputPhoneNumberWithSpace(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input phone number with only space and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputPhoneNumberWithOnlySpace(String phoneNumberOnlySpace){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(phoneNumberOnlySpace)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }







    //TC_AA_User_16 - Register [Negative 15]

    @Step("User request with the HTTP method POST and input invalid name in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputInvalidName(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "A");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input invalid name and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputInvalidName(String invalidName){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidName)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_17 - Register [Negative 16]

    @Step("User request with the HTTP method POST and input invalid username in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputInvalidUsername(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "p");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input invalid username and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputInvalidUsername(String invalidUsername){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidUsername)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_18 - Register [Negative 17]

    @Step("User request with the HTTP method POST and input invalid password in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputInvalidPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "s");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input invalid password and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputInvalidPassword(String invalidPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }











    //TC_AA_User_19 - Register [Negative 18]

    @Step("User request with the HTTP method POST and input invalid confirmation password in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputInvalidConfirmationPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan12345");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input invalid confirmation password and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputInvalidConfirmationPassword(String invalidConfirmationPassword){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidConfirmationPassword)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_20 - Register [Negative 19]

    @Step("User request with the HTTP method POST and input invalid email in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputInvalidEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri");
        requestBody.put("phone_number", "085260892703");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input invalid email and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputInvalidEmail(String invalidEmail){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidEmail)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_21 - Register [Negative 20]

    @Step("User request with the HTTP method POST and input invalid phone number with abjad in the request body and click Send Button")
    public void userRequestPOSTMethodAndInputInvalidPhoneNumber(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Ana Siahaan");
        requestBody.put("username", "putrishn273");
        requestBody.put("password", "siahaan123");
        requestBody.put("confirm_password", "siahaan123");
        requestBody.put("email", "ruthputri123@gmail.com");
        requestBody.put("phone_number", "abc123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToCreateAccount());
    }


    @Step("Validate failed to create new account user because input invalid phone number with abjad and display error message {string} in the response body")
    public void failedToCreateAccountBecauseInputInvalidPhoneNumber(String invalidPhoneNumber){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(invalidPhoneNumber)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }


}



