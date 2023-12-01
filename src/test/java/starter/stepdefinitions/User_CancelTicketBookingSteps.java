package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_CancelTicketBooking;

public class User_CancelTicketBookingSteps {

    @Steps
    User_CancelTicketBooking cancelTicketBooking;


    //TC_AA_User_109 - Cancel Ticket Booking [Positive]

    @Given("User input endpoint with valid invoice number to cancel booking ticket")
    public void userInputEndpointWithValidInvoiceNumberToCancelBookingTicket() {
        cancelTicketBooking.userInputEndpointWIthValidInvoiceNumberToCancelTicket();
    }

    @When("User request with HTTP method DELETE to cancel booking ticket and click Send Button")
    public void userRequestWithHTTPMethodDELETEToCancelBookingTicketAndClickSendButton() {
        cancelTicketBooking.userRequestWithHTTPMethodDELETEToCancelBookingTicket();
    }

    @Then("Validate success to cancel booking ticket and display message {string} in the response body")
    public void validateSuccessToCancelBookingTicketAndDisplayMessageInTheResponseBody(String successToCancelBookingTicket) {
        cancelTicketBooking.successToCancelBookingTicketWithValidInvoiceNumber("Ticket canceled successfully");
    }











    //TC_AA_User_110 - Cancel Ticket Booking [Negative 1]

    @Given("User input endpoint with invalid invoice number to cancel booking ticket")
    public void userInputEndpointWithInvalidInvoiceNumberToGetNotificationWhenPaymentIsSuccessful() {
        cancelTicketBooking.userInputEndpointWithInvalidInvoiceNumberToCancelTicket();
    }

    @When("User request with DELETE HTTP method to cancel booking ticket and click Send Button")
    public void userRequestWithDELEteHTTPMethodToCancelBookingTicketAndClickSendButton() {
        cancelTicketBooking.userRequestWithDELETEHTTPMethodToCancelBookingTicket();
        
    }

    @Then("Validate failed to cancel booking ticket and display error message {string} in the response body")
    public void validateFailedToCancelBookingTicketAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvalidInvoiceNumber) {
        cancelTicketBooking.failedToCancelBookingTicketBecauseInvalidInvoiceNumber("Ticket not found");
    }










    //TC_AA_User_111 - Cancel Ticket Booking [Negative 2]
    
    @Given("User input endpoint with valid invoice number but has been canceled before")
    public void userInputEndpointWithValidInvoiceNumberButHasBeenCanceledBefore() {
        cancelTicketBooking.userInputEndpointWithValidInvoiceNumberButHasBeenCanceledBefore();
    }

    @When("User request DELETE HTTP method to cancel booking ticket and click Send Button")
    public void userRequestDELETEHTTPMethodToCancelBookingTicketAndClickSendButton() {
        cancelTicketBooking.userRequestDELETEHTTPMethodToCancelBookingTicket();
        
    }

    @Then("Validate failed to cancel booking ticket because has been canceled before and display error message {string} in the response body")
    public void validateFailedToCancelBookingTicketBecauseHasBeenCanceledBeforeAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvoiceNumberHasBeenCanceledBefore) {
        cancelTicketBooking.failedToCancelBookingTicketBecauseInvoiceNumberHasBeenCanceledBefore("Ticket has already been canceled");
    }
}
