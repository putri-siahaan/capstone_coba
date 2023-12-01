package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_DeletePhotoProfile;

public class User_DeletePhotoProfileSteps {

    @Steps
    User_DeletePhotoProfile deletePhotoProfile;


    //TC_MA_User_124 - Delete User Photo Profile [Positive]

    @Given("User input endpoint with valid ID to delete photo profile")
    public void userInputEndpointWithValidIDToDeletePhotoProfile() {
        deletePhotoProfile.userInputEndpointWithValidIDToDeletePhotoProfile();
    }

    @When("User request with the HTTP method DELETE to photo profile and click Send Button")
    public void userRequestWithTheHTTPMethodDELETEToPhotoProfileAndClickSendButton() {
        deletePhotoProfile.userRequestWithTheHTTPMethodDELETEToDeletePhotoProfile();
    }

    @Then("Validate success to delete photo profile and display message {string} in the response body")
    public void validateSuccessToDeletePhotoProfileAndDisplayMessageInTheResponseBody(String successDeletePhotoProfile) {
        deletePhotoProfile.successToDeletePhotoProfile("User profile photo deleted successfully");
    }










    //TC_MA_User_125 - Delete User Photo Profile [Negative]

    @Given("User input endpoint with invalid ID to delete photo profile")
    public void userInputEndpointWithInvalidIDToDeletePhotoProfile() {
        deletePhotoProfile.userInputEndpointWithInvalidIDToDeletePhotoProfile();
    }

    @When("User request HTTP method DELETE to delete photo profile and click Send Button")
    public void userRequestHTTPMethodDELETEToDeletePhotoProfileAndClickSendButton() {
        deletePhotoProfile.userRequestWithTheHTTPMethodDELETEAndInputInvalidIDToDeletePhotoProfile();
        
    }

    @Then("Validate failed to delete photo profile and display error message {string} in the response body")
    public void validateFailedToDeletePhotoProfileAndDisplayErrorMessageInTheResponseBody(String invalidIDToDeletePhotoProfile) {
        deletePhotoProfile.failedToGetDeletePhotoProfileBecauseInvalidID("User not found");
    }
}
