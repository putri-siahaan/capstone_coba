package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_Register;

public class User_RegisterSteps {

    @Steps
    User_Register register;

    //TC_AA_User_1 - Register [Positive]

    @Given("User input valid endpoint to create new account")
    public void userInputValidEndpointToCreateAccount() {
        register.userInputValidEndpointToCreateAccount();
    }

    @When("User request with the HTTP method POST and input valid name, username, password, confirmation password, email, and phone number in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputValidNameUsernamePasswordEmailAndPhoneNumberInTheRequestBodyAndClickSendButton() {
        register.userRequestWithTheHTTPMethodPOSTAndInputValidDataRegister();
    }

    @And("User receive a response with status code 200 OK")
    public void userReceiveAResponseWithStatusCodeOK() {
        register.receiveHttpResponseCode200();
    }


    @Then("Validate success to create new account and display message {string} in the response body")
    public void validateSuccessToCreateNewAccountAndDisplayMessageSuccessCreateAccountInTheResponseBody(String successRegister) {
        register.successToCreateAccount("User created successfully, Please check your email to verify your account");
    }




    //TC_AA_User_2 - Register [Negative 1]

    @When("User request with the HTTP method POST and input username already exists in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputUsernameAlreadyExistsInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputUsernameAlreadyExists();
    }

    @And("User receive a response with status code 409 Conflict")
    public void userReceiveAResponseWithStatusCodeConflict() {
        register.receiveHttpResponseCode409();
    }

    @Then("Validate failed to create account because username already exists and display error message {string} in the response body")
    public void validateFailedToCreateAccountAndDisplayErrorMessageInTheResponseBody(String usernameAlreadyExists) {
        register.failedToCreateAccountBecauseUsernameAlreadyExists("Username already exists");
    }




    //TC_AA_User_3 - Register [Negative 2]

    @When("User request with the HTTP method POST and input email already exists in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputEmailAlreadyExistsInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputEmailAlreadyExists();
    }

    @Then("Validate failed to create new account because email already exists and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountAndDisplayErrorMessageInTheResponseBody(String emailAlreadyExists) {
        register.failedToCreateAccountBecauseEmailAlreadyExists("Email already exists");
    }




    //TC_AA_User_4 - Register [Negative 3]

    @When("User request with the HTTP method POST and input phone number already exists in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputPhoneNumberAlreadyExistsInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputPhoneNumberAlreadyExists();
    }

    @Then("Validate failed to create a new account and display error message {string} in the response body")
    public void validateFailedToCreateANewAccountAndDisplayErrorMessageInTheResponseBody(String phoneNumberAlreadyExists) {
        register.failedToCreateAccountBecausePhoneNumberAlreadyExists("Phone number already exists");
    }

    


    //TC_AA_User_5 - Register [Negative 4]

    @When("User request with the HTTP method POST and did not input name in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputNameInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndDidNotInputName();
    }

    @And("User receive a response with status code 400 Bad Request")
    public void userReceiveAResponseWithStatusCodeBadRequest() {
        register.receiveHttpResponseCode400();
    }

    @Then("Validate failed to create account because did not input name and display error message {string} in the response body")
    public void validateFailedToCreateAccountBecauseDidNotInputNameAndDisplayErrorMessageInTheResponseBody(String emptyName) {
        register.failedToCreateAccountBecauseDidNotInputName("Name must be at least 3 characters");
    }

    


    //TC_AA_User_6 - Register [Negative 5]

    @When("User request with the HTTP method POST and did not input username in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputUsernameInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndDidNotInputUsername();
    }

    @Then("Validate failed to create account because did not input username and display error message {string} in the response body")
    public void validateFailedToCreateAccountBecauseDidNotInputUsernameAndDisplayErrorMessageInTheResponseBody(String emptyUsername) {
        register.failedToCreateAccountBecauseDidNotInputUsername("Username must be at least 5 characters");
    }








    //TC_AA_User_7 - Register [Negative 6]

    @When("User request with the HTTP method POST and did not input password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputPasswordInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndDidNotInputPassword();
    }

    @Then("Validate failed to create account because did not input password and display error message {string} in the response body")
    public void validateFailedToCreateAccountBecauseDidNotInputPasswordAndDisplayErrorMessageInTheResponseBody(String emptyPassword) {
        register.failedToCreateAccountBecauseDidNotInputPassword("Password must be at least 8 characters and contain a combination of letters and numbers");
    }





    //TC_AA_User_8 - Register [Negative 7]

    @When("User request with the HTTP method POST and did not input confirm password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputConfirmPasswordInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndDidNotInputConfirmPassword();
    }

    @Then("Validate failed to create account because did not input confirm password and display error message {string} in the response body")
    public void validateFailedToCreateAccountBecauseDidNotInputConfirmPasswordAndDisplayErrorMessageInTheResponseBody(String emptyConfirmPassword) {
        register.failedToCreateAccountBecauseDidNotInputConfirmPassword("Password confirmation does not match");
    }






    //TC_AA_User_9 - Register [Negative 8]

    @When("User request with the HTTP method POST and did not input email in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputEmailInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndDidNotInputEmail();
    }

    @Then("Validate failed to create account user because did not input email and display error message {string} in the response body")
    public void validateFailedToCreateAccountUserBecauseDidNotInputEmailAndDisplayErrorMessageInTheResponseBody(String emptyEmail) {
        register.failedToCreateAccountBecauseDidNotInputEmail("Invalid email format");
    }





    //TC_AA_User_10 - Register [Negative 9]

    @When("User request with the HTTP method POST and did not input phone number in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputPhoneNumberInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndDidNotInputPhoneNumber();
    }

    @Then("Validate failed to create account because did not input phone number and display error message {string} in the response body")
    public void validateFailedToCreateAccountBecauseDidNotInputPhoneNumberAndDisplayErrorMessageInTheResponseBody(String emptyPhoneNumber) {
        register.failedToCreateAccountBecauseDidNotInputPhoneNumber("Invalid phone number format");
    }






    //TC_AA_User_11 - Register [Negative 10]

    @When("User request with the HTTP method POST and input name with a space in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputNameWithASpaceInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputNameWithSpace();
    }

    @Then("Validate failed to create new account user because input name with only space and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputNameWithOnlySpaceAndDisplayErrorMessageInTheResponseBody(String nameOnlySpace) {
        register.failedToCreateAccountBecauseInputNameWithOnlySpace("Name must be at least 3 characters");
    }






    //TC_AA_User_12 - Register [Negative 11]

    @When("User request with the HTTP method POST and input username with a space in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputUsernameWithASpaceInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputUsernameWithSpace();
    }

    @Then("Validate failed to create new account user because input username with only space and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputUsernameWithOnlySpaceAndDisplayErrorMessageInTheResponseBody(String usernameOnlySpace) {
        register.failedToCreateAccountBecauseInputUsernameWithOnlySpace("Username must be at least 5 characters");
    }





    //TC_AA_User_13 - Register [Negative 12]

    @When("User request with the HTTP method POST and input password with a space in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputPasswordWithASpaceInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputPasswordWithSpace();
    }


    @Then("Validate failed to create new account user because input password with only space and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputPasswordWithOnlySpaceAndDisplayErrorMessageInTheResponseBody(String passwrodOnlySpace) {
        register.failedToCreateAccountBecauseInputPasswordWithOnlySpace("Password must be at least 8 characters and contain a combination of letters and numbers");
    }






    //TC_AA_User_14 - Register [Negative 13]

    @When("User request with the HTTP method POST and input email with a space in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputEmailWithASpaceInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputEmailWithSpace();
    }

    @Then("Validate failed to create new account user because input email with only space and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputEmailWithOnlySpaceAndDisplayErrorMessageInTheResponseBody(String emailOnlySpace) {
        register.failedToCreateAccountBecauseInputEmailWithOnlySpace("Invalid email format");
    }





    //TC_AA_User_15 - Register [Negative 14]

    @When("User request with the HTTP method POST and input phone number with a space in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputPhoneNumberWithASpaceInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputPhoneNumberWithSpace();
    }


    @Then("Validate failed to create new account user because input phone number with only space and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputPhoneNumberWithOnlySpaceAndDisplayErrorMessageInTheResponseBody(String phoneNumberOnlySpace) {
        register.failedToCreateAccountBecauseInputPhoneNumberWithOnlySpace("Invalid phone number format");
    }






    //TC_AA_User_16 - Register [Negative 15]

    @When("User request with the HTTP method POST and input invalid name in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidNameInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputInvalidName();
    }


    @Then("Validate failed to create new account user because input invalid name and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputInvalidNameAndDisplayErrorMessageInTheResponseBody(String invalidName) {
        register.failedToCreateAccountBecauseInputInvalidName("Name must be at least 3 characters");
    }







    //TC_AA_User_17 - Register [Negative 16]

    @When("User request with the HTTP method POST and input invalid username in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidUsernameInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputInvalidUsername();
    }

    @Then("Validate failed to create new account user because input invalid username and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputInvalidUsernameAndDisplayErrorMessageInTheResponseBody(String invalidUsername) {
        register.failedToCreateAccountBecauseInputInvalidUsername("Username must be at least 5 characters");
    }







    //TC_AA_User_18 - Register [Negative 17]

    @When("User request with the HTTP method POST and input invalid password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidPasswordInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputInvalidPassword();
    }


    @Then("Validate failed to create new account user because input invalid password and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputInvalidPasswordAndDisplayErrorMessageInTheResponseBody(String invalidPassword) {
        register.failedToCreateAccountBecauseInputInvalidPassword("Password must be at least 8 characters and contain a combination of letters and numbers");
    }






    //TC_AA_User_19 - Register [Negative 18]

    @When("User request with the HTTP method POST and input invalid confirmation password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidConfirmationPasswordInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputInvalidConfirmationPassword();
    }


    @Then("Validate failed to create new account user because input invalid confirmation password and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputInvalidConfirmationPasswordAndDisplayErrorMessageInTheResponseBody(String invalidConfirmationPassword) {
        register.failedToCreateAccountBecauseInputInvalidConfirmationPassword("Password confirmation does not match");
    }








    //TC_AA_User_20 - Register [Negative 19]

    @When("User request with the HTTP method POST and input invalid email in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidEmailInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputInvalidEmail();
    }


    @Then("Validate failed to create new account user because input invalid email and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputInvalidEmailAndDisplayErrorMessageInTheResponseBody(String invalidEmail) {
        register.failedToCreateAccountBecauseInputInvalidEmail("Invalid email format");
    }






    //TC_AA_User_21 - Register [Negative 20]

    @When("User request with the HTTP method POST and input invalid phone number with abjad in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidPhoneNumberWithAbjadInTheRequestBodyAndClickSendButton() {
        register.userRequestPOSTMethodAndInputInvalidPhoneNumber();
    }


    @Then("Validate failed to create new account user because input invalid phone number with abjad and display error message {string} in the response body")
    public void validateFailedToCreateNewAccountUserBecauseInputInvalidPhoneNumberWithAbjadAndDisplayErrorMessageInTheResponseBody(String invalidPhoneNumber) {
        register.failedToCreateAccountBecauseInputInvalidPhoneNumber("Invalid phone number format");
    }
}
