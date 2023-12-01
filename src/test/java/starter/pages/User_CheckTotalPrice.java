package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_CheckTotalPrice {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_58 - Check Total Price [Positive 1]

    @Step("User input valid endpoint to check price")
    public String userInputValidEndpointToCheckPrice(){
        return url + "cekharga";
    }

    @Step("User request with HTTP method POST with valid request body to check price and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInputValidRequestBodyToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 2);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 3);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(200);
    }

    @Step("Validate success to check price and display total price after calculate discount in the response body")
    public void successToCheckPriceWithValidRequestBody(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_59 - Check Total Price [Negative 1]

    @Step("User request with POST HTTP method with invalid wisata ID to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidWisataIDToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 100);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(404);
    }

    @Step("Validate failed to check price because invalid wisata ID and display error message {string} in the response body")
    public void failedToCheckPriceBecauseInvalidWisataID(String failedCheckPriceBecauseInvalidWisataID){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedCheckPriceBecauseInvalidWisataID)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_60 - Check Total Price [Negative 2]

    @Step("User request with POST HTTP method with invalid use all points to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidUseAllPointsToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 3);
        requestBody.put("use_all_points", 0);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(400);
    }

    @Step("Validate failed to check price because invalid use all points and display error message {string} and error message {string} in the response body")
    public void failedToCheckPriceBecauseInvalidUseAllPoints(String failedCheckPriceBecauseInvalidUseAllPoints){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedCheckPriceBecauseInvalidUseAllPoints)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }








    //TC_AA_User_61 - Check Total Price [Negative 3]

    @Step("User request with POST HTTP method with invalid kode voucher to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidKodeVoucherToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 3);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "putri");
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(400);
    }

    @Step("Validate failed to check price because invalid kode voucher and display error message {string} in the response body")
    public void failedToCheckPriceBecauseInvalidKodeVoucher(String failedCheckPriceBecauseInvalidKodeVoucher){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedCheckPriceBecauseInvalidKodeVoucher)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }











    //TC_AA_User_62 - Check Total Price [Negative 4]

    @Step("User request with POST HTTP method with invalid quantity to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidQuantityToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 2);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 0);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(400);
    }

    @Step("Validate failed to check price because invalid quantity and display error message {string} in the response body")
    public void failedToCheckPriceBecauseInvalidQuantity(String failedCheckPriceBecauseInvalidQuantity){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedCheckPriceBecauseInvalidQuantity)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_63 - Check Total Price [Negative5]

    @Step("User request with POST HTTP method with invalid checking booking to check price and click Send Buttonn")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidCheckingBookingToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 2);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 5);
        requestBody.put("checkin_booking", "2020-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(400);
    }

    @Step("Validate failed to check price because input invalid checking booking and display total price after calculate discount in the response body")
    public void failedToCheckPriceBecauseInvalidCheckingBooking(String failedCheckPriceBecauseInvalidCheckingBooking){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedCheckPriceBecauseInvalidCheckingBooking)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_64 - Check Total Price [Negative 6]

    @Step("User request with POST HTTP method but in the request body did not input wisata ID to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputWisataIDToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(404);
    }

    @Step("Validate failed to check price because did not input wisata ID and display error message {string} in the response body")
    public void failedToCheckPriceBecauseDidNotInputWisataID(String failedCheckPriceBecauseDidNotInputWisataID){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedCheckPriceBecauseDidNotInputWisataID)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }












    //TC_AA_User_65 - Check Total Price [Positive 2]

    @Step("User request with POST HTTP method but in the request body did not input use all points to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputUseAllPointsToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 3);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 5);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(200);    }

    @Step("Validate success to check price even though did not input use all points and display total price after calculate discount in the response body")
    public void successToCheckPriceEvenThoughDidNotInputUseAllPoints(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }










    //TC_AA_User_66 - Check Total Price [Positive 3]

    @Step("User request with POST HTTP method but in the request body did not input kode voucher to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputKodeVoucherToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 12);
        requestBody.put("use_all_points", true);
        requestBody.put("quantity", 5);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(200);    }

    @Step("Validate success to check price even though did not input kode voucher and display total price after calculate discount in the response body")
    public void successToCheckPriceEvenThoughDidNotInputKodeVoucher(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }











    //TC_AA_User_67 - Check Total Price [Negative 7]

    @Step("User request with POST HTTP method but in the request body did not input quantity to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputQuantityToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 3);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(400);
    }

    @Step("Validate failed to check price because did not input quantity and display error message {string} in the response body")
    public void failedToCheckPriceBecauseDidNotInputQuantity(String failedCheckPriceBecauseDidNotInputQuantity){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedCheckPriceBecauseDidNotInputQuantity)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }











    //TC_AA_User_68 - Check Total Price [Negative 8]

    @Step("User request with POST HTTP method but in the request body did not input checking booking to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputCheckingBookingToCheckPrice(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 3);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 5);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToCheckPrice()).then().statusCode(400);
    }

    @Step("Validate success to check price because did not input checking booking and display total price after calculate discount in the response body")
    public void failedToCheckPriceBecauseDidNotInputCheckingBooking(String failedCheckPriceBecauseDidNotInputCheckingBooking){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedCheckPriceBecauseDidNotInputCheckingBooking)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }

}
