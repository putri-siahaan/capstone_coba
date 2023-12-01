package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetPointUser;

public class User_GetPointUserSteps {

    @Steps
    User_GetPointUser getPointUser;


    //TC_AA_User_71 - Get Point User [Positive]

    @Given("User input valid endpoint to get point user")
    public void userInputValidEndpointToGetPointUser() {
        getPointUser.userInputValidEndpointToGetPointUser();
    }

    @When("User request with HTTP method GET to get point user and click Send Button")
    public void userRequestWithHTTPMethodGETToGetPointUserAndClickSendButton() {
        getPointUser.userRequestWithHTTPMethodGETAndInputValidEndpointToGetPointUser();

    }

    @Then("Validate success to get point user and display detail users ticket retrieved in the response body")
    public void validateSuccessToGetPointUserAndDisplayDetailUsersTicketRetrievedInTheResponseBody() {
        getPointUser.successToGetPointUser();
    }







    //TC_AA_User_72 - Get Point User [Negative]

    @Given("User input invalid endpoint to get point user")
    public void userInputInvalidEndpointToGetPointUser() {
        getPointUser.userInputInvalidEndpointToGetPointUser();
    }

    @When("User request with GET HTTP method to get point user and click Send Button")
    public void userRequestWithGETHTTPMethodToGetPointUserAndClickSendButton() {
        getPointUser.userRequestWithGetHTTPMethodAndInputValidEndpointToGetPointUser();
    }

    @Then("Validate failed to get point user and display error message {string} in the response body")
    public void validateFailedToGetPointUserAndDisplayErrorMessageInTheResponseBody(String failedGetPointUser) {
        getPointUser.failedToGetPointUser("Invalid user ID");
    }
}
