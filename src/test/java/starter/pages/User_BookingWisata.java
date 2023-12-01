package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_BookingWisata {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_47 - Booking Wisata [Positive 1]

    @Step("User input valid endpoint to booking wisata")
    public String userInputValidEndpointToBookingwisata(){
        return url + "user/buy";
    }

    @Step("User request with HTTP method POST with valid request body to booking wisata and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInputValidRequestBodyToBookingWisata(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 3);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(200);
    }

    @Step("Validate success to booking wisata and display detail data transaction in the response body")
    public void successToBookingWisataWithValidRequestBody(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_48 - Booking Wisata [Negative 1]

    @Step("User request with POST HTTP method with invalid wisata ID to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidWisataIDToBookingWisata(){
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
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(404);
    }

    @Step("Validate failed to booking wisata and display error message {string} in the response body")
    public void failedToBookingWisataBecauseInvalidWisataID(String failedBookingBecauseInvalidWisataID){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedBookingBecauseInvalidWisataID)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_49 - Booking Wisata [Negative 2]

    @Step("User request with POST HTTP method with invalid use all points to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidUseAllPointsToBookingWisata(){
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
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(400);
    }

    @Step("Validate failed to booking wisata because invalid use all points and display error message {string} in the response body")
    public void failedToBookingWisataBecauseInvalidUseAllPoints(String failedBookingBecauseInvalidUseAllPoints){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBookingBecauseInvalidUseAllPoints)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }








    //TC_AA_User_50 - Booking Wisata [Negative 3]

    @Step("User request with POST HTTP method with invalid kode voucher to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidKodeVoucherToBookingWisata(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 2);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "putri");
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(400);
    }

    @Step("Validate failed to booking wisata because invalid kode voucher and display error message {string} in the response body")
    public void failedToBookingWisataBecauseInvalidKodeVoucher(String failedBookingBecauseInvalidKodeVoucher){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBookingBecauseInvalidKodeVoucher)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }











    //TC_AA_User_51 - Booking Wisata [Negative 4]

    @Step("User request with POST HTTP method with invalid quantity to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidQuantityToBookingWisata(){
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
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(400);
    }

    @Step("Validate failed to booking wisata because invalid quantity and display error message {string} in the response body")
    public void failedToBookingWisataBecauseInvalidQuantity(String failedBookingBecauseInvalidQuantity){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBookingBecauseInvalidQuantity)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_52 - Booking Wisata [Negative 5]

    @Step("User request with POST HTTP method with invalid checking booking to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndInputInvalidCheckingBookingToBookingWisata(){
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
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(400);
    }

    @Step("Validate failed to booking wisata because invalid checking booking and display error message {string} in the response body")
    public void failedToBookingWisataBecauseInvalidCheckingBooking(String failedBookingBecauseInvalidCheckingBooking){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBookingBecauseInvalidCheckingBooking)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }









    //TC_AA_User_53 - Booking Wisata [Negative 6]

    @Step("User request with POST HTTP method but in the request body did not input wisata ID and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputWisataID(){
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
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(404);
    }

    @Step("Validate failed to booking wisata because did not input wisata ID and display error message {string} in the response body")
    public void failedToBookingWisataBecauseDidNotInputWisataID(String failedBookingBecauseDidNotInputWisataID){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedBookingBecauseDidNotInputWisataID)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }












    //TC_AA_User_54 - Booking Wisata [Positive 2]

    @Step("User request with POST HTTP method but in the request body did not input use all points and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputUseAllPoints(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 14);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(200);    }

    @Step("Validate success to booking wisata even though did not input use all points and display detail data transaction in the response body")
    public void successToBookingWisataEvenThoughDidNotInputUseAllPoints(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }










    //TC_AA_User_55 - Booking Wisata [Positive 3]

    @Step("User request with POST HTTP method but in the request body did not input kode voucher and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputKodeVoucher(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 12);
        requestBody.put("use_all_points", true);
        requestBody.put("quantity", 10);
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(200);    }

    @Step("Validate success to booking wisata even though did not input kode voucher and display detail data transaction in the response body")
    public void successToBookingWisataEvenThoughDidNotInputKodeVoucher(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }











    //TC_AA_User_56 - Booking Wisata [Negative 7]

    @Step("User request with POST HTTP method but in the request body did not input quantity and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputQuantity(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 2);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("checkin_booking", "2023-12-27");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(400);
    }

    @Step("Validate failed to booking wisata because did not input quantity and display error message {string} in the response body")
    public void failedToBookingWisataBecauseDidNotInputQuantity(String failedBookingBecauseDidNotInputQuantity){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBookingBecauseDidNotInputQuantity)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }











    //TC_AA_User_57 - Booking Wisata [Negative 8]

    @Step("User request with POST HTTP method but in the request body did not input checking booking and click Send Button")
    public void userRequestWithPOSTHTTPMethodAndDidNotInputCheckingBooking(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("wisata_id", 2);
        requestBody.put("use_all_points", true);
        requestBody.put("kode_voucher", "liburan15");
        requestBody.put("quantity", 10);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToBookingwisata()).then().statusCode(400);
    }

    @Step("Validate failed to booking wisata because did not input checking booking and display error message {string} in the response body")
    public void failedToBookingWisataBecauseDidNotInputCheckingBooking(String failedBookingBecauseDidNotInputCheckingBooking){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBookingBecauseDidNotInputCheckingBooking)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }

}
