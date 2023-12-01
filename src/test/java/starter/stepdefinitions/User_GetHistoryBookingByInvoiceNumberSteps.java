package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetHistoryBookingByInvoiceNumber;

public class User_GetHistoryBookingByInvoiceNumberSteps {

    @Steps
    User_GetHistoryBookingByInvoiceNumber getHistoryBookingByInvoiceNumber;


    //TC_AA_User_126 - Get History Booking Wisata by Invoice Number [Positive 1]

    @Given("User input endpoint with valid Invoice number to get history booking wisata case success transaction")
    public void userInputEndpointWithValidInvoiceNumberToGetHistoryBookingWisataCaseSuccessTransaction() {
        getHistoryBookingByInvoiceNumber.userInputEndpointWithValidInvoiceNumberCaseSuccessTransaction();
    }

    @When("User request with the HTTP method GET to get history booking wisata case success transaction and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCaseSuccessTransactionAndClickSendButton() {
        getHistoryBookingByInvoiceNumber.userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCaseSuccessTransaction();
    }

    @Then("Validate success to get history booking wisata by valid invoice number case success transaction and display detail transaction in the response body")
    public void validateSuccessToGetHistoryBookingWisataByValidInvoiceNumberCaseSuccessTransactionAndDisplayDetailTransactionWithMessageInTheResponseBody() {
        getHistoryBookingByInvoiceNumber.successToGeHistoryBookingCaseSuccessTransaction();
    }












    //TC_AA_User_127 - Get History Booking Wisata by Invoice Number [Positive 2]

    @Given("User input endpoint with valid Invoice number to get history booking wisata case pending transaction")
    public void userInputEndpointWithValidInvoiceNumberToGetHistoryBookingWisataCasePendingTransaction() {
        getHistoryBookingByInvoiceNumber.userInputEndpointWithValidInvoiceNumberCasePendingTransaction();
    }


    @When("User request with the HTTP method GET to get history booking wisata case pending transaction and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCasePendingTransactionAndClickSendButton() {
        getHistoryBookingByInvoiceNumber.userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCasePendingTransaction();
        
    }

    @Then("Validate success to get history booking wisata by valid invoice number case pending transaction and display detail transaction in the response body")
    public void validateSuccessToGetHistoryBookingWisataByValidInvoiceNumberCasePendingTransactionAndDisplayDetailTransactionWithMessageInTheResponseBody() {
        getHistoryBookingByInvoiceNumber.successToGeHistoryBookingCasePendingTransaction();
    }














    //TC_AA_User_128 - Get History Booking Wisata by Invoice Number [Positive 3]

    @Given("User input endpoint with valid Invoice number to get history booking wisata case canceled transaction")
    public void userInputEndpointWithValidInvoiceNumberToGetHistoryBookingWisataCaseCanceledTransaction() {
        getHistoryBookingByInvoiceNumber.userInputEndpointWithValidInvoiceNumberCaseCanceledTransaction();
    }

    @When("User request with the HTTP method GET to get history booking wisata case canceled transaction and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCaseCanceledTransactionAndClickSendButton() {
        getHistoryBookingByInvoiceNumber.userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCaseCanceledTransaction();

    }

    @Then("Validate success to get history booking wisata by valid invoice number case canceled transaction and display detail transaction in the response body")
    public void validateSuccessToGetHistoryBookingWisataByValidInvoiceNumberCaseCanceledTransactionAndDisplayDetailTransactionWithMessageInTheResponseBody() {
        getHistoryBookingByInvoiceNumber.successToGeHistoryBookingCaseCanceledTransaction();
    }
















    //TC_AA_User_129 - Get History Booking Wisata by Invoice Number [Positive 4]

    @Given("User input endpoint with invalid Invoice number to get history booking wisata")
    public void userInputEndpointWithInvalidInvoiceNumberToGetHistoryBookingWisata() {
        getHistoryBookingByInvoiceNumber.userInputEndpointWithInvalidInvoiceNumberToGetHistoryBooking();
    }

    @When("User request with the HTTP method GET to get history booking wisata and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataAndClickSendButton() {
        getHistoryBookingByInvoiceNumber.userRequestWithTheHTTPMethodGETAndInputInvalidInvoiceNumber();
    }

    @Then("Validate success to get history booking wisata by invalid invoice number and display transaction detail is null in the response body")
    public void validateSuccessToGetHistoryBookingWisataByInvalidInvoiceNumberAndDisplayTransactionDetailIsInTheResponseBody() {
        getHistoryBookingByInvoiceNumber.successToGetHistoryBookingEvenThoughInvalidInvoiceNumber();
    }
}
