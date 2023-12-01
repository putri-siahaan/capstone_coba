package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_CMSVisitorSendMessage;

public class User_CMSVisitorSendMessageSteps {

    @Steps
    User_CMSVisitorSendMessage cmsVisitorSendMessage;


    //TC_AA_User_112 - CMS Visitors Send Cooperation Message/Feedback without Login [Positive 1]

    @Given("User input valid endpoint to send cooperation message")
    public void userInputValidEndpointToSendCooperationMessage() {
        cmsVisitorSendMessage.userInputValidEndpointToSendCooperationMessage();
    }

    @When("User request with the HTTP method POST and input valid request body without login in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputValidRequestBodyWithoutLoginInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTToSuccessSendCooperationMessage();

    }

    @And("User receive a response with status code 201 Created")
    public void userReceiveAResponseWithStatusCodeCreated() {
        cmsVisitorSendMessage.receiveHttpResponseCode201();
    }

    @Then("Validate success to send cooperation message and display message {string} in the response body")
    public void validateSuccessToSendCooperationMessageAndDisplayMessageInTheResponseBody(String successToSendCooperationMessage) {
        cmsVisitorSendMessage.successToSendCooperationMessage("Pesan kerjasama berhasil dikirim");
    }











    //TC_AA_User_113 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 1]

    @When("User request with the HTTP method POST and input invalid first name in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidFirstNameInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndInvalidFirstName();
    }

    @Then("Validate failed to send cooperation message because invalid first name and display error message {string} in the response body")
    public void validateFailedToSendCooperationMessageBecauseInvalidFirstNameAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvalidFirstName) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseInvalidFirstName("first name harus minimal 3 huruf");
    }













    //TC_AA_User_114 - CMS Visitors Send Cooperation Message/Feedback without Login [Positive 2]

    @When("User request with the HTTP method POST and input invalid last name in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidLastNameInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndInvalidLastName();
    }














    //TC_AA_User_115 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 2]

    @When("User request with HTTP method POST and input invalid email in the request body and click Send Button")
    public void userRequestWithHTTPMethodPOSTAndInputInvalidEmailInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndInvalidEmail();
    }

    @Then("Validate failed to send cooperation message because invalid email and display error message {string} in the response body")
    public void validateFailedToSendCooperationMessageBecauseInvalidEmailAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvalidEmail) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseInvalidEmail("Format email tidak valid");
    }













    //TC_AA_User_116 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 3]

    @When("User request with the HTTP method POST and input invalid phone number with character in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidPhoneNumberWithCharacterInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndInvalidPhoneNumberWithCharacter();
    }

    @Then("Validate failed to send cooperation message because invalid phone number with character and display error message {string} in the response body")
    public void validateFailedToSendCooperationMessageBecauseInvalidPhoneNumberWithCharacterAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvalidPhoneNumberWithCharacter) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseInvalidPhoneNumberWithCharacter("Phone number harus mengandung angka semua");
    }




















    //TC_AA_User_117 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 4]

    @When("User request with the HTTP method POST and input invalid phone number when les than 10 digit in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidPhoneNumberWhenLesThanDigitInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndInvalidPhoneNumberLessThan10Digit();
    }

    @Then("Validate failed to send cooperation message because invalid phone number because ess than 10 digit and display error message {string} in the response body")
    public void validateFailedToSendCooperationMessageBecauseInvalidPhoneNumberBecauseEssThanDigitAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvalidPhoneNumberLessThan10Digit) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseInvalidPhoneNumberLessThan10Digit("Phone number kurang dari 10 digit");
    }















    //TC_AA_User_118 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 5]

    @When("User request with the HTTP method POST and input invalid message in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputInvalidMessageInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndInvalidMessage();
    }

    @Then("Validate failed to send cooperation message because invalid message and display error message {string} in the response body")
    public void validateFailedToSendCooperationMessageBecauseInvalidMessageAndDisplayErrorMessageInTheResponseBody(String failedBecauseInvalidMessageCooperation) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseInvalidMessageCooperation("Message harus minimal 10 huruf");
    }

















    //TC_AA_User_119 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 6]

    @When("User request with the HTTP method POST and did not input first name in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputFirstNameInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndDidNotInputFirstName();
    }

    @Then("Validate failed to send cooperation message because did not input first name and display error message {string} in the response body")
    public void validateFailedToSendCooperationMessageBecauseDidNotInputFirstNameAndDisplayErrorMessageInTheResponseBody(String failedBecauseDidNotInputFirstName) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseDidNotInputFirstName("first name harus minimal 3 huruf");
    }














    //TC_AA_User_120 - CMS Visitors Send Cooperation Message/Feedback without Login [Positive 3]

    @When("User request with the HTTP method POST and did not input last name in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputLastNameInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndDidNotInputLastName();
    }
















    //TC_AA_User_121 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 7]

    @When("User request with the HTTP method POST and did not input email to send cooperation in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputEmailToSendCooperationInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndDidNotInputEmail();
    }

    @Then("Validate failed to send cooperation message because did not input email and display error message {string} in the response body")
    public void validateFailedToSendCooperationMessageBecauseDidNotInputEmailAndDisplayErrorMessageInTheResponseBody(String failedBecauseDidNotInputEmail) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseDidNotInputEmail("Format email tidak valid");
    }
















    //TC_AA_User_122 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 8]

    @When("User request with the HTTP method POST and did not input phone number to send cooperation in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputPhoneNumberToSendCooperationInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndDidNotInputPhoneNumber();
    }

    @Then("Validate failed to end cooperation because did not input phone number to send cooperation and display error message {string} in the response body")
    public void validateFailedToEndCooperationBecauseDidNotInputPhoneNumberToSendCooperationAndDisplayErrorMessageInTheResponseBody(String failedBecauseDidNotInputPhoneNumber) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseDidNotInputPhoneNumber("Phone number kurang dari 10 digit");
    }












    //TC_AA_User_123 - CMS Visitors Send Cooperation Message/Feedback without Login [Negative 9]

    @When("User request with the HTTP method POST and did not input message include cooperation in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndDidNotInputMessageIncludeCooperationInTheRequestBodyAndClickSendButton() {
        cmsVisitorSendMessage.userRequestWithHTTPMethodPOSTAndDidNotInputMessage();
    }

    @Then("Validate failed to send cooperation because did not input message include cooperation and display error message {string} in the response body")
    public void validateFailedToSendCooperationBecauseDidNotInputMessageIncludeCooperationAndDisplayErrorMessageInTheResponseBody(String failedBecauseDidNotInputMessageCooperation) {
        cmsVisitorSendMessage.failedToSendCooperationMessageBecauseDidNotInputMessageCooperation("Message harus minimal 10 huruf");
    }
}
