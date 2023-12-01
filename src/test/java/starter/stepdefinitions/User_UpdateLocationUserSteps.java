package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_UpdateLocationUser;

public class User_UpdateLocationUserSteps {

    @Steps
    User_UpdateLocationUser updateLocationUser;

    //TC_AA_User_81 - Update Location User [Positive]

    @Given("User input endpoint with valid ID to update location")
    public void userInputEndpointWithValidIDToUpdateLocation() {
        updateLocationUser.userInputValidEndpointWithValidIDToUpdateLocationUser();
    }

    @When("User request with the HTTP method PUT and input valid data lat and long in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputValidDataLatAndLongInTheRequestBodyAndClickSendButton() {
        updateLocationUser.userRequestWithTheHTTPMethodPUTAndInputValidDataLatAndLong();

    }

    @Then("Validate success update location user and display message {string} in the response body")
    public void validateSuccessUpdateLocationUserAndDisplayMessageInTheResponseBody(String successUpdateLocation) {
        updateLocationUser.successToUpdateLocationUser("User location updated successfully");
    }







    //TC_AA_User_82 - Update Location User [Negative]

    @Given("User input endpoint with invalid ID to update location")
    public void userInputEndpointWithInvalidIDToUpdate() {
        updateLocationUser.userInputValidEndpointWithInvalidIDToUpdateLocation();
    }


    @When("User request HTTP method PUT and input valid data lat and long in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputValidDataLatAndLongInTheRequestBodyAndClickSendButton() {
        updateLocationUser.userRequestWithTheHTTPMethodPUTAndInputInvalidIDToUpdateLocationUser();
        
    }

    @Then("Validate failed update location because invalid ID and display message {string} in the response body")
    public void validateFailedUpdateLocationBecauseInvalidIDAndDisplayMessageInTheResponseBody(String invalidIDToUpdateLocation) {
        updateLocationUser.failedUpdateLocationBecauseInvalidID("Unauthorized to edit this user");
    }
}
