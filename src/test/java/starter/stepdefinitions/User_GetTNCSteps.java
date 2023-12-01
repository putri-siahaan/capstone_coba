package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetTNC;

public class User_GetTNCSteps {

    @Steps
    User_GetTNC getTNC;


    //TC_AA_User_133 - Get Terms and Conditions Data [Positive]

    @Given("User input valid endpoint to get tnc")
    public void userInputValidEndpointToGetTnc() {
        getTNC.userInputValidEndpointToGetTNC();
    }

    @When("User request with HTTP method GET to get tnc with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETToGetTncWithAuthorizationAndClickSendButton() {
        getTNC.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNCWithAuthorization();

    }

    @Then("Validate success to get tnc and display all tnc in the response body")
    public void validateSuccessToGetTncAndDisplayAllTncInTheResponseBody() {
        getTNC.successToGetTNC();
    }
























    //TC_AA_User_134 - Get Terms and Conditions Data [Negative 1]

    @When("User request with GET HTTP method to get tnc without authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetTncWithoutAuthorizationAndClickSendButton() {
        getTNC.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNCWithoutAuthorization();
    }

    @Then("Validate failed to get tnc and display error message {string} in the response body")
    public void validateFailedToGetTncAndDisplayErrorMessageInTheResponseBody(String failedGetTNC) {
        getTNC.failedToGetTNCBecauseWithoutAuthorization("Authorization token is missing");
    }

















    //TC_AA_User_135 - Get Terms and Conditions Data [Negative 2]

    @Given("User input invalid endpoint to get tnc")
    public void userInputInvalidEndpointToGetTnc() {
        getTNC.userInputInvalidEndpointToGetTNC();
    }

    @When("User request with GET HTTP method to get tnc with authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetTncWithAuthorizationAndClickSendButton() {
        getTNC.userRequestWithGetHTTPMethodAndInputInvalidEndpointToGetTNC();
    }

    @Then("Validate failed to get tnc because invalid endpoint and display error message {string} in the response body")
    public void validateFailedToGetTncBecauseInvalidEndpointAndDisplayErrorMessageInTheResponseBody(String failedGetTNCBecauseInvalidEndpoint) {
        getTNC.failedToGetTNCBecauseInvalidEndpoint("Not Found");
    }
}
