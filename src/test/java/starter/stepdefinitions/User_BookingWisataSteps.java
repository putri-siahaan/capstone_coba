package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_BookingWisata;

public class User_BookingWisataSteps {
    @Steps
    User_BookingWisata bookingWisata;


    //TC_AA_User_47 - Booking Wisata [Positive 1]

    @Given("User input valid endpoint to booking wisata")
    public void userInputValidEndpointToBookingWisata() {
        bookingWisata.userInputValidEndpointToBookingwisata();
    }

    @When("User request with HTTP method POST with valid request body to booking wisata and click Send Button")
    public void userRequestWithHTTPMethodPOSTWithValidRequestBodyToBookingWisataAndClickSendButton() {
        bookingWisata.userRequestWithHTTPMethodPOSTAndInputValidRequestBodyToBookingWisata();
    }

    @Then("Validate success to booking wisata and display detail data transaction in the response body")
    public void validateSuccessToBookingWisataAndDisplayDetailDataTransactionInTheResponseBody() {
        bookingWisata.successToBookingWisataWithValidRequestBody();
    }






    //TC_AA_User_48 - Booking Wisata [Negative 1]

    @When("User request with POST HTTP method with invalid wisata ID to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidWisataIDToBookingWisataAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndInputInvalidWisataIDToBookingWisata();
    }


    @Then("Validate failed to booking wisata and display error message {string} in the response body")
    public void validateFailedToBookingWisataAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseInvalidWisataID) {
        bookingWisata.failedToBookingWisataBecauseInvalidWisataID("Wisata not found");
    }







    //TC_AA_User_49 - Booking Wisata [Negative 2]

    @When("User request with POST HTTP method with invalid use all points to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidUseAllPointsToBookingWisataAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndInputInvalidUseAllPointsToBookingWisata();
    }

    @Then("Validate failed to booking wisata because invalid use all points and display error message {string} in the response body")
    public void validateFailedToBookingWisataBecauseInvalidUseAllPointsAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseInvalidUseAllPoints) {
        bookingWisata.failedToBookingWisataBecauseInvalidUseAllPoints("cannot unmarshal number into Go struct field .use_all_points of type bool");
    }







    //TC_AA_User_50 - Booking Wisata [Negative 3]

    @When("User request with POST HTTP method with invalid kode voucher to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidKodeVoucherToBookingWisataAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndInputInvalidKodeVoucherToBookingWisata();
    }


    @Then("Validate failed to booking wisata because invalid kode voucher and display error message {string} in the response body")
    public void validateFailedToBookingWisataBecauseInvalidKodeVoucherAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseInvalidKodeVoucher) {
        bookingWisata.failedToBookingWisataBecauseInvalidKodeVoucher("Invalid kode voucher");
    }






    //TC_AA_User_51 - Booking Wisata [Negative 4]

    @When("User request with POST HTTP method with invalid quantity to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidQuantityToBookingWisataAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndInputInvalidQuantityToBookingWisata();
    }

    @Then("Validate failed to booking wisata because invalid quantity and display error message {string} in the response body")
    public void validateFailedToBookingWisataBecauseInvalidQuantityAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseInvalidQuantity) {
        bookingWisata.failedToBookingWisataBecauseInvalidQuantity("Quantity must be greater than 0");
    }





    //TC_AA_User_52 - Booking Wisata [Negative 5]

    @When("User request with POST HTTP method with invalid checking booking to booking wisata and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidCheckingBookingToBookingWisataAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndInputInvalidCheckingBookingToBookingWisata();
    }

    @Then("Validate failed to booking wisata because invalid checking booking and display error message {string} in the response body")
    public void validateFailedToBookingWisataBecauseInvalidCheckingBookingAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseInvalidCheckingBooking) {
        bookingWisata.failedToBookingWisataBecauseInvalidCheckingBooking("Checkin date must be today or later");
    }






    //TC_AA_User_53 - Booking Wisata [Negative 6]

    @When("User request with POST HTTP method but in the request body did not input wisata ID and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputWisataIDAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndDidNotInputWisataID();
    }

    @Then("Validate failed to booking wisata because did not input wisata ID and display error message {string} in the response body")
    public void validateFailedToBookingWisataBecauseDidNotInputWisataIDAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseDidNotInputWisataID) {
        bookingWisata.failedToBookingWisataBecauseDidNotInputWisataID("Wisata not found");
    }






    //TC_AA_User_54 - Booking Wisata [Positive 2]

    @When("User request with POST HTTP method but in the request body did not input use all points and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputUseAllPointsAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndDidNotInputUseAllPoints();
    }

    @Then("Validate success to booking wisata even though did not input use all points and display detail data transaction in the response body")
    public void validateSuccessToBookingWisataEvenThoughDidNotInputUseAllPointsAndDisplayDetailDataTransactionInTheResponseBody() {
        bookingWisata.successToBookingWisataEvenThoughDidNotInputUseAllPoints();
    }






    //TC_AA_User_55 - Booking Wisata [Positive 3]

    @When("User request with POST HTTP method but in the request body did not input kode voucher and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputKodeVoucherAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndDidNotInputKodeVoucher();
    }

    @Then("Validate success to booking wisata even though did not input kode voucher and display detail data transaction in the response body")
    public void validateSuccessToBookingWisataEvenThoughDidNotInputKodeVoucherAndDisplayDetailDataTransactionInTheResponseBody() {
        bookingWisata.successToBookingWisataEvenThoughDidNotInputKodeVoucher();
    }





    //TC_AA_User_56 - Booking Wisata [Negative 7]

    @When("User request with POST HTTP method but in the request body did not input quantity and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputQuantityAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndDidNotInputQuantity();
    }

    @Then("Validate failed to booking wisata because did not input quantity and display error message {string} in the response body")
    public void validateFailedToBookingWisataBecauseDidNotInputQuantityAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseDidNotInputQuantity) {
        bookingWisata.failedToBookingWisataBecauseDidNotInputQuantity("Quantity must be greater than 0");
    }

    
    


    //TC_AA_User_57 - Booking Wisata [Negative 8]

    @When("User request with POST HTTP method but in the request body did not input checking booking and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputCheckingBookingAndClickSendButton() {
        bookingWisata.userRequestWithPOSTHTTPMethodAndDidNotInputCheckingBooking();
    }

    @Then("Validate failed to booking wisata because did not input checking booking and display error message {string} in the response body")
    public void validateFailedToBookingWisataBecauseDidNotInputCheckingBookingAndDisplayErrorMessageInTheResponseBody(String failedBookingBecauseDidNotInputCheckingBooking) {
        bookingWisata.failedToBookingWisataBecauseDidNotInputCheckingBooking("Invalid checkin_booking date format");
    }
}
