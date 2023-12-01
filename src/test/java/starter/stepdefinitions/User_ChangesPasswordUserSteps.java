package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_ChangesPasswordUser;

public class User_ChangesPasswordUserSteps {

    @Steps
    User_ChangesPasswordUser changesPasswordUser;

    //TC_AA_User_73 - Changes Password User [Positive]

    @Given("User input endpoint with valid ID to changes password")
    public void userInputEndpointWithValidIDToChangesPassword() {
        changesPasswordUser.userInputValidEndpointWithValidIDToChangesPassword();
    }

    @When("User request with the HTTP method PUT and input valid current and new password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputValidCurrentAndNewPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndInputValidDataNewPassword();

    }

    @Then("Validate success changes password and display message {string} in the response body")
    public void validateSuccessChangesPasswordAndDisplayMessageInTheResponseBody(String successChangesPassword) {
        changesPasswordUser.successToChangesPassword("Password updated successfully");
    }







    //TC_AA_User_74 - Changes Password User [Negative 1]

    @Given("User input endpoint with invalid ID to changes password")
    public void userInputEndpointWithInvalidIDToChangesPassword() {
        changesPasswordUser.userInputValidEndpointWithInvalidIDToChangesPassword();
    }


    @When("User request HTTP method PUT and input valid current and new password in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputValidCurrentAndNewPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndInputInvalidIDToChangesPassword();

    }

    @Then("Validate failed changes password because invalid ID and display message {string} in the response body")
    public void validateFailedChangesPasswordBecauseInvalidIDAndDisplayMessageInTheResponseBody(String invalidIDToChangesPassword) {
        changesPasswordUser.failedChangesPasswordBecauseInvalidID("Access denied");
    }







    //TC_AA_User_75 - Changes Password User [Negative 2]

    @When("User request HTTP method PUT and input invalid current password in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidCurrentPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndInputInvalidCurrentPasswordToChangesPassword();
    }

    @Then("Validate failed changes password because invalid current password and display message {string} in the response body")
    public void validateFailedChangesPasswordBecauseInvalidCurrentPasswordAndDisplayMessageInTheResponseBody(String invalidCurrentPassword) {
        changesPasswordUser.failedChangesPasswordBecauseInvalidCurrentPassword("Incorrect current password");
    }







    //TC_AA_User_76 - Changes Password User [Negative 3]

    @When("User request HTTP method PUT and input invalid new and confirm password in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidNewPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndInputInvalidNewPassword();
    }

    @Then("Validate failed changes password because invalid new password and display error message {string} in the response body")
    public void validateFailedChangesPasswordBecauseInvalidNewPasswordAndDisplayErrorMessageInTheResponseBody(String invalidNewPassword) {
        changesPasswordUser.failedChangesPasswordBecauseInvalidNewPassword("New password must be at least 8 characters and contain a combination of letters and numbers");
    }






    //TC_AA_User_77 - Changes Password User [Negative 4]

    @When("User request HTTP method PUT and input invalid confirm password in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidConfirmPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndInputInvalidConfirmPassword();

    }

    @Then("Validate failed changes password because invalid confirm password and display error message {string} in the response body")
    public void validateFailedChangesPasswordBecauseInvalidConfirmPasswordAndDisplayErrorMessageInTheResponseBody(String invalidConfirmPassword) {
        changesPasswordUser.failedChangesPasswordBecauseInvalidConfirmPassword("Confirmation password does not match the new password");
    }








    //TC_AA_User_78 - Changes Password User [Negative 5]

    @When("User request HTTP method PUT and did not input current password in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndDidNotInputCurrentPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndDidNotInputCurrentPassword();
    }

    @Then("Validate failed changes password because did not input current password and display message {string} in the response body")
    public void validateFailedChangesPasswordBecauseDidNotInputCurrentPasswordAndDisplayMessageInTheResponseBody(String didNotInputCurrentPassword) {
        changesPasswordUser.failedChangesPasswordBecauseDidNotInputCurrentPassword("Incorrect current password");
    }

    
    
    
    


    //TC_AA_User_79 - Changes Password User [Negative 6]

    @When("User request HTTP method PUT and did not input new password in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndDidNotInputNewPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndDidNotInputNewPassword();
    }

    @Then("Validate failed changes password because did not input new password and display error message {string} in the response body")
    public void validateFailedChangesPasswordBecauseDidNotInputNewPasswordAndDisplayErrorMessageInTheResponseBody(String didNotInputNewPassword) {
        changesPasswordUser.failedChangesPasswordBecauseDidNotInputNewPassword("New password must be at least 8 characters and contain a combination of letters and numbers");
    }









    //TC_AA_User_80 - Changes Password User [Negative 7]

    @When("User request HTTP method PUT and did not input confirm password in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndDidNotInputConfirmPasswordInTheRequestBodyAndClickSendButton() {
        changesPasswordUser.userRequestWithTheHTTPMethodPUTAndDidNotInputConfirmPassword();
    }

    @Then("Validate failed changes password because did not input confirm password and display error message {string} in the response body")
    public void validateFailedChangesPasswordBecauseDidNotInputConfirmPasswordAndDisplayErrorMessageInTheResponseBody(String didNotInputConfirmPassword) {
        changesPasswordUser.failedChangesPasswordBecauseDidNotInputConfirmPassword("Confirmation password does not match the new password");
    }
}
