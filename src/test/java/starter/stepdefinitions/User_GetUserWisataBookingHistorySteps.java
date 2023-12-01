package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetUserWisataBookingHistory;

public class User_GetUserWisataBookingHistorySteps {

    @Steps
    User_GetUserWisataBookingHistory getUserWisataBookingHistory;


    //TC_AA_User_69 - Get User Wisata Booking History [Positive]

    @Given("User input valid endpoint to get user wisata booking history")
    public void userInputValidEndpointToGetUserWisataBookingHistory() {
        getUserWisataBookingHistory.userInputValidEndpointToGetUserWisataBookingHistory();
    }

    @When("User request with HTTP method GET to get user wisata booking history and click Send Button")
    public void userRequestWithHTTPMethodGETToGetUserWisataBookingHistoryAndClickSendButton() {
        getUserWisataBookingHistory.userRequestWithHTTPMethodGETAndInputValidEndpointToGetUserWisataBookingHistory();

    }

    @Then("Validate success to get user wisata booking history and display detail users ticket retrieved in the response body")
    public void validateSuccessToGetUserWisataBookingHistoryAndDisplayDetailUsersTicketRetrievedInTheResponseBody() {
        getUserWisataBookingHistory.successToGetUserWisataBookingHistory();
    }







    //TC_AA_User_70 - Get User Wisata Booking History [Negative]

    @Given("User input invalid endpoint to get user wisata boooking history")
    public void userInputInvalidEndpointToGetUserWisataBoookingHistory() {
        getUserWisataBookingHistory.userInputInvalidEndpointToGetUserWisataBookingHistory();
    }

    @When("User request with GET HTTP method to get user wisata booking history and click Send Button")
    public void userRequestWithGETHTTPMethodToGetUserWisataBookingHistoryAndClickSendButton() {
        getUserWisataBookingHistory.userRequestWithGetHTTPMethodAndInputValidEndpointToGetUserWisataBookingHistory();
    }

    @Then("Validate failed to get user wisata booking history and display error message {string} in the response body")
    public void validateFailedToGetUserWisataBookingHistoryAndDisplayErrorMessageInTheResponseBody(String failedGetUserWisataBookingHistory) {
        getUserWisataBookingHistory.failedToGetUserWisataBookingHistory("Invalid user ID");
    }
}
