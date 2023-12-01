package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class User_Login {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_22 - Login [Positive]

    @Step("User input valid endpoint to login")
    public String userInputValidEndpointToLogin(){
        return url + "signin";
    }

    @Step("User request with the HTTP method POST and input valid username and password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputValidDataLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "putrishn27");
        requestBody.put("password", "siahaan123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToLogin());
    }

    @Step("Validate success login and display message {string} in the response body")
    public void successToLogin(String successLogin){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(successLogin)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }





    //TC_MA_User_23 - Login [Negative 1]

    @Step("User request HTTP method POST and input invalid username in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidUsernameToLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "putrishn37");
        requestBody.put("password", "siahaan123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToLogin());
    }

    @Step("User receive a response with status code 401 Unauthorized")
    public void receiveHttpResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("Validate failed login and display message {string} in the response body")
    public void failedLoginBecauseInvalidUsername(String invalidUsernameForLogin){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(invalidUsernameForLogin)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_MA_User_24 - Login [Negative 2]

    @Step("User request HTTP method POST and input invalid password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidPasswordToLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "putrishn27");
        requestBody.put("password", "siahaan");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToLogin());
    }

    @Step("Validate failed login and display error message {string} in the response body")
    public void failedLoginBecauseInvalidPassword(String invalidPasswordForLogin){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(invalidPasswordForLogin)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_MA_User_25 - Login [Negative 3]

    @Step("User request HTTP method POST and input invalid username and password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidUsernameAndPasswordToLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "putrishn37");
        requestBody.put("password", "siahaan");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToLogin());
    }





    //TC_MA_User_26 - Login [Negative 4]

    @Step("User request HTTP method POST and did not input username in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputUsernameWhenLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "");
        requestBody.put("password", "siahaan123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToLogin());
    }

    @Step("Validate failed to login and display message {string} in the response body")
    public void failedLoginBecauseDidNotInputUsername(String didNotInputUsernameForLogin){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(didNotInputUsernameForLogin)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_MA_User_27 - Login [Negative 5]

    @Step("User request HTTP method POST and did not input password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputPasswordWhenLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "putrishn27");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToLogin());
    }

    @Step("Validate failed to login and display error message {string} in the response body")
    public void failedLoginBecauseDidNotInputPassword(String didNotInputPasswordForLogin){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(didNotInputPasswordForLogin)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }







    //TC_MA_User_28 - Login [Negative 6]

    @Step("User request HTTP method POST and did not input username and password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputUsernameAndPasswordWhenLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userInputValidEndpointToLogin());
    }
}
