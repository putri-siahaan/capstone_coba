package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class User_CMSVisitorSendMessage {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_112 - CMS Visitors Send Cooperation Message/Feedback without Login [Positive 1]

    @Step("User input valid endpoint to send cooperation message")
    public String userInputValidEndpointToSendCooperationMessage(){
        return url + "cooperation";
    }

    @Step("User request with the HTTP method POST and input valid request body without login in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTToSuccessSendCooperationMessage(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(201);
    }


    @Step("User receive a response with status code 201 Created")
    public void receiveHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("Validate success to send cooperation message and display message {string} in the response body")
    public void successToSendCooperationMessage(String successToSendCooperationMessage){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 201 && responseBody.contains(successToSendCooperationMessage)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }














    //TC_AA_User_113 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 1]

    @Step("User request with the HTTP method POST and input invalid first name in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInvalidFirstName(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "H");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation message because invalid first name and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseInvalidFirstName(String failedBecauseInvalidFirstName){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseInvalidFirstName)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }


















    //TC_AA_User_114 - CMS Visitors Send Cooperation Message/Feedback without Login [Positive 2]

    @Step("User request with the HTTP method POST and input invalid last name in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInvalidLastName(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "L");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(201);    }













    //TC_AA_User_115 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 2]

    @Step("User request with HTTP method POST and input invalid email in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInvalidEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation message because invalid email and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseInvalidEmail(String failedBecauseInvalidEmail){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseInvalidEmail)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }














    //TC_AA_User_116 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 3]

    @Step("User request with the HTTP method POST and input invalid phone number with character in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInvalidPhoneNumberWithCharacter(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "abc123");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation message because invalid phone number with character and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseInvalidPhoneNumberWithCharacter(String failedBecauseInvalidPhoneNumberWithCharacter){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseInvalidPhoneNumberWithCharacter)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }














    //TC_AA_User_117 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 4]

    @Step("User request with the HTTP method POST and input invalid phone number when les than 10 digit in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInvalidPhoneNumberLessThan10Digit(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "123");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation message because invalid phone number because ess than 10 digit and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseInvalidPhoneNumberLessThan10Digit(String failedBecauseInvalidPhoneNumberLessThan10Digit){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseInvalidPhoneNumberLessThan10Digit)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }















    //TC_AA_User_118 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 5]

    @Step("User request with the HTTP method POST and input invalid message in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInvalidMessage(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "H");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation message because invalid message and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseInvalidMessageCooperation(String failedBecauseInvalidMessageCooperation){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseInvalidMessageCooperation)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }


















    //TC_AA_User_119 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 6]

    @Step("User request with the HTTP method POST and did not input first name in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndDidNotInputFirstName(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation message because did not input first name and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseDidNotInputFirstName(String failedBecauseDidNotInputFirstName){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseDidNotInputFirstName)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }



















    //TC_AA_User_120 - CMS Visitors Send Cooperation Message/Feedback without Login [Positive 3]

    @Step("User request with the HTTP method POST and did not input last name in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndDidNotInputLastName(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(201);    }
















    //TC_AA_User_121 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 7]

    @Step("User request with the HTTP method POST and did not input email to send cooperation in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndDidNotInputEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation message because did not input email and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseDidNotInputEmail(String failedBecauseDidNotInputEmail){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseDidNotInputEmail)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }





























    //TC_AA_User_122 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 8]

    @Step("User request with the HTTP method POST and did not input phone number to send cooperation in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndDidNotInputPhoneNumber(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "");
        requestBody.put("message", "Halo Tim DestiMate. Saya adalah Haru, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to end cooperation because did not input phone number to send cooperation and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseDidNotInputPhoneNumber(String failedBecauseDidNotInputPhoneNumber){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseDidNotInputPhoneNumber)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }


























    //TC_AA_User_123 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 9]

    @Step("User request with the HTTP method POST and did not input message include cooperation in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndDidNotInputMessage(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "Haru");
        requestBody.put("last_name", "Lee");
        requestBody.put("email", "haru@gmail.com");
        requestBody.put("phone_number", "081234567892");
        requestBody.put("message", "");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToSendCooperationMessage()).then().statusCode(400);    }

    @Step("Validate failed to send cooperation because did not input message include cooperation and display error message {string} in the response body")
    public void failedToSendCooperationMessageBecauseDidNotInputMessageCooperation(String failedBecauseDidNotInputMessageCooperation){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseDidNotInputMessageCooperation)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
