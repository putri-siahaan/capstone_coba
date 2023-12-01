package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class User_CancelTicketBooking {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_109 - Cancel Ticket Booking [Positive]

    @Step("User input endpoint with valid invoice number to cancel booking ticket")
    public String userInputEndpointWIthValidInvoiceNumberToCancelTicket(){
        return url + "user/ticket/1701413967-110";
    }

    @Step("User request with HTTP method DELETE to cancel booking ticket and click Send Button")
    public void userRequestWithHTTPMethodDELETEToCancelBookingTicket(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .delete(userInputEndpointWIthValidInvoiceNumberToCancelTicket()).then().statusCode(200);
    }

    @Step("Validate success to cancel booking ticket and display message {string} in the response body")
    public void successToCancelBookingTicketWithValidInvoiceNumber(String successToCancelBookingTicket){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(successToCancelBookingTicket)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }








    //TC_AA_User_110 - Cancel Ticket Booking [Negative 1]

    @Step("User input endpoint with invalid invoice number to cancel booking ticket")
    public String userInputEndpointWithInvalidInvoiceNumberToCancelTicket(){
        return url + "user/ticket/1700318165-841";
    }

    @Step("User request with DELEte HTTP method to cancel booking ticket and click Send Button")
    public void userRequestWithDELETEHTTPMethodToCancelBookingTicket(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .delete(userInputEndpointWithInvalidInvoiceNumberToCancelTicket()).then().statusCode(404);
    }

    @Step("Validate failed to cancel booking ticket and display error message {string} in the response body")
    public void failedToCancelBookingTicketBecauseInvalidInvoiceNumber(String failedBecauseInvalidInvoiceNumber){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedBecauseInvalidInvoiceNumber)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }















    //TC_AA_User_111 - Cancel Ticket Booking [Negative 2]

    @Step("User input endpoint with valid invoice number but has been canceled before")
    public String userInputEndpointWithValidInvoiceNumberButHasBeenCanceledBefore(){
        return url + "user/ticket/1701163175-233";
    }

    @Step("User request DELETE HTTP method to cancel booking ticket and click Send Button")
    public void userRequestDELETEHTTPMethodToCancelBookingTicket(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .delete(userInputEndpointWithValidInvoiceNumberButHasBeenCanceledBefore()).then().statusCode(400);
    }

    @Step("Validate failed to cancel booking ticket because has been canceled before and display error message {string} in the response body")
    public void failedToCancelBookingTicketBecauseInvoiceNumberHasBeenCanceledBefore(String failedBecauseInvoiceNumberHasBeenCanceledBefore){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseInvoiceNumberHasBeenCanceledBefore)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
