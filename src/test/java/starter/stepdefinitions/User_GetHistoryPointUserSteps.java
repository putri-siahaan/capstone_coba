package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetHistoryPointUser;

public class User_GetHistoryPointUserSteps {

    @Steps
    User_GetHistoryPointUser getHistoryPointUser;


    //TC_AA_User_130 - Get History Point User [Positive]

    @Given("User input valid endpoint to get history point")
    public void userInputValidEndpointToGetHistoryPoint() {
        getHistoryPointUser.userInputValidEndpointToGetHistoryPoint();
    }

    @When("User request with HTTP method GET to get history point with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETToGetHistoryPointWithAuthorizationAndClickSendButton() {
        getHistoryPointUser.userRequestWithHTTPMethodGETAndInputValidEndpointToGetHistoryPointWithAuthorization();

    }

    @Then("Validate success to get history point and display all in the response body")
    public void validateSuccessToGetHistoryPointAndDisplayAllInTheResponseBody() {
        getHistoryPointUser.successToGetHistoryPoint();
    }

















    //TC_AA_User_131 - Get History Point User [Negative 1]

    @When("User request with GET HTTP method to get history point without authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetHistoryPointWithoutAuthorizationAndClickSendButton() {
        getHistoryPointUser.userRequestWithHTTPMethodGETAndInputValidEndpointToGetHistoryPointWithoutAuthorization();
    }

    @Then("Validate failed to get history point and display error message {string} in the response body")
    public void validateFailedToGetHistoryPointAndDisplayErrorMessageInTheResponseBody(String failedGetHistoryPoint) {
        getHistoryPointUser.failedToGetHistoryPointBecauseWithoutAuthorization("Authorization token is missing");
    }















    //TC_AA_User_132 - Get History Point User [Negative 2]

    @Given("User input invalid endpoint to get history point")
    public void userInputInvalidEndpointToGetHistoryPoint() {
        getHistoryPointUser.userInputInvalidEndpointToGetHistoryPoint();
    }


    @When("User request with GET HTTP method to get history point with authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetHistoryPointWithAuthorizationAndClickSendButton() {
        getHistoryPointUser.userRequestWithGetHTTPMethodAndInputInvalidEndpointToGetHistoryPoint();
        
    }

    @Then("Validate failed to get history point because invalid endpoint and display error message {string} in the response body")
    public void validateFailedToGetHistoryPointBecauseInvalidEndpointAndDisplayErrorMessageInTheResponseBody(String failedGetHistoryBecauseInvalidEndpoint) {
        getHistoryPointUser.failedToGetHistoryPointBecauseInvalidEndpoint("Invalid user ID");
    }
}
