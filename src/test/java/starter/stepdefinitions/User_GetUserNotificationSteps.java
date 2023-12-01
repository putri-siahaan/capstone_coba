package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetUserNotification;

public class User_GetUserNotificationSteps {

    @Steps
    User_GetUserNotification getUserNotification;


    //TC_AA_User_106 - Get User Notification [Positive]


    @Given("User input valid endpoint to get notification when payment is successful")
    public void userInputValidEndpointToGetNotificationWhenPaymentIsSuccessful() {
        getUserNotification.userInputValidEndpointToGetAllNotification();
    }

    @When("User request with HTTP method GET to get the notification with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETToGetTheNotificationWithAuthorizationAndClickSendButton() {
        getUserNotification.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllNotificationWithAuthorization();

    }

    @Then("Validate success to get notification and display all notification messages in the response body")
    public void validateSuccessToGetNotificationAndDisplayAllNotificationMessagesInTheResponseBody() {
        getUserNotification.successToGetAllNotification();
    }



















    //TC_AA_User_107 - Get User Notification [Negative 1]

    @When("User request with GET HTTP method to get the notification without authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetTheNotificationWithoutAuthorizationAndClickSendButton() {
        getUserNotification.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllNotificationWithoutAuthorization();
    }

    @Then("Validate failed to get notification and display error message {string} in the response body")
    public void validateFailedToGetNotificationAndDisplayErrorMessageInTheResponseBody(String failedBecauseWithoutAuthorization) {
        getUserNotification.failedToGetAllNotificationBecauseWithoutAuthorization("Authorization token is missing");
    }














    //TC_AA_User_108 - Get User Notification [Negative 2]

    @Given("User input invalid endpoint to get notification when payment is successful")
    public void userInputInvalidEndpointToGetNotificationWhenPaymentIsSuccessful() {
        getUserNotification.userInputInvalidEndpointToGetAllNotification();
    }

    @When("User request with GET HTTP method to get notification with authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetNotificationWithAuthorizationAndClickSendButton() {
        getUserNotification.userRequestWithGetHTTPMethodAndInputInvalidEndpointToGetAllNotification();
    }

    @Then("Validate failed to get notification because invalid endpoint and display error message {string} in the response body")
    public void validateFailedToGetNotificationBecauseInvalidEndpointAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvalidEndpoint) {
        getUserNotification.failedToGetAllNotificationBecauseInvalidEndpoint("Invalid user ID");
    }
}
