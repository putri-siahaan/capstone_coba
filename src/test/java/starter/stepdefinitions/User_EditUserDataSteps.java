package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_EditUserData;

public class User_EditUserDataSteps {

    @Steps
    User_EditUserData editUserData;

    //TC_AA_User_83 - Edit User Data By ID [Positive]

    @Given("User input endpoint with valid user ID to edit user data")
    public void userInputEndpointWithValidUserIDToEditUserData() {
        editUserData.userInputValidEndpointWithValidIDToEditUserData();
    }

    @When("User request with the HTTP method PUT and input valid name, category favorite and profile image in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPUTAndInputValidNameCategoryFavoriteAndProfileImageInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndInputValidNameCategoryFavoriteAndProfileImage();
    }

    @Then("Validate success edit user data and display message {string} in the response body")
    public void validateSuccessEditUserDataAndDisplayMessageInTheResponseBody(String successEditUserData) {
        editUserData.successToEditUserData("User updated successfully");
    }








    //TC_AA_User_84 - Edit User Data By ID [Negative 1]

    @Given("User input endpoint with invalid ID to edit user data")
    public void userInputEndpointWithInvalidIDToEditUserData() {
        editUserData.userInputValidEndpointWithInvalidIDToEditUserData();
    }


    @When("User request HTTP method PUT and input valid name, category favorite and profile image in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputValidNameCategoryFavoriteAndProfileImageInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndInputInvalidIDToEditUserData();

    }

    @Then("Validate failed edit user data because invalid ID and display message {string} in the response body")
    public void validateFailedEditUserDataBecauseInvalidIDAndDisplayMessageInTheResponseBody(String invalidIDToEditUserData) {
        editUserData.failedEditUserDataBecauseInvalidID("Unauthorized to edit this user");
    }








    //TC_AA_User_85 - Edit User Data By ID [Negative 2]

    @When("User request HTTP method PUT and input invalid name in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidNameInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndInputInvalidNameToEditUserData();
    }


    @Then("Validate failed edit user data because invalid name and display message {string} in the response body")
    public void validateFailedEditUserDataBecauseInvalidNameAndDisplayMessageInTheResponseBody(String invalidNameToEditDataUser) {
        editUserData.failedEditUserDataBecauseInvalidName("Name should be at least 3 characters");
    }









    //TC_AA_User_86 - Edit User Data By ID [Negative 3]

    @When("User request HTTP method PUT and input invalid username in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidUsernameInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndInputInvalidUsername();
    }

    @Then("Validate failed edit user data because invalid username and display error message {string} in the response body")
    public void validateFailedEditUserDataBecauseInvalidUsernameAndDisplayErrorMessageInTheResponseBody(String invalidUsernameToEditUserData) {
        editUserData.failedEditUserDataBecauseInvalidUsername("Username should be at least 5 characters");
    }








    //TC_AA_User_87 - Edit User Data By ID [Negative 4]

    @When("User request HTTP method PUT and input invalid email in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidEmailInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndInputInvalidEmail();
    }


    @Then("Validate failed edit user data because invalid email and display error message {string} in the response body")
    public void validateFailedEditUserDataBecauseInvalidEmailAndDisplayErrorMessageInTheResponseBody(String invalidEmailToEditUserData) {
        editUserData.failedEditUserDataBecauseInvalidEmail("Invalid email format");
    }






    //TC_AA_User_88 - Edit User Data By ID [Negative 5]

    @When("User request HTTP method PUT and input invalid phone number in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidPhoneNumberInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndDInputInvalidPhoneNumber();
    }

    @Then("Validate failed edit user data because invalid phone number and display message {string} in the response body")
    public void validateFailedEditUserDataBecauseInvalidPhoneNumberAndDisplayMessageInTheResponseBody(String invalidPhoneNumberToEditUserData) {
        editUserData.failedEditUserDataBecauseInvalidPhoneNumber("Invalid phone number format");
    }








    //TC_AA_User_89 - Edit User Data By ID [ Negative 6]

    @When("User request HTTP method PUT and input invalid format profile image in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidFormatProfileImageInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndInputInvalidFormatProfileImage();
    }


    @Then("Validate failed edit user data because input invalid format profile image and display error message {string} in the response body")
    public void validateFailedEditUserDataBecauseInputInvalidFormatProfileImageAndDisplayErrorMessageInTheResponseBody(String invalidFormatProfileImage) {
        editUserData.failedEditUserDataBecauseInvalidFormatProfileImage("Invalid image format");
    }









    //TC_AA_User_90 - Edit User Data By ID [ Negative 7]

    @When("User request HTTP method PUT and input invalid category favorite in the request body and click Send Button")
    public void userRequestHTTPMethodPUTAndInputInvalidCategoryFavoriteInTheRequestBodyAndClickSendButton() {
        editUserData.userRequestWithTheHTTPMethodPUTAndInvalidCategoryFavorite();
    }


    @Then("Validate failed edit user data because input invalid category favorite and display error message {string} in the response body")
    public void validateFailedEditUserDataBecauseInputInvalidCategoryFavoriteAndDisplayErrorMessageInTheResponseBody(String invalidCategoryFavorite) {
        editUserData.failedEditUserDataBecauseInvalidCategoryFavorite("Category not found");
    }
}
