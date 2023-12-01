package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_Login;

public class User_LoginSteps {
    @Steps
    User_Login login;

    //TC_AA_User_22 - Login [Positive]

    @Given("User input valid endpoint to login")
    public void userInputValidEndpointToLogin() {
        login.userInputValidEndpointToLogin();
    }

    @When("User request with the HTTP method POST and input valid username and password in the request body and click Send Button")
    public void userRequestWithTheHTTPMethodPOSTAndInputValidUsernameAndPasswordInTheRequestBodyAndClickSendButton() {
        login.userRequestWithTheHTTPMethodPOSTAndInputValidDataLogin();
    }

    @Then("Validate success login and display message {string} in the response body")
    public void validateSuccessLoginAndDisplayMessageInTheResponseBody(String successLogin) {
        login.successToLogin("User login successful");
    }




    //TC_AA_User_23 - Login [Negative 1]

    @When("User request HTTP method POST and input invalid username in the request body and click Send Button")
    public void userRequestHTTPMethodPOSTAndInputInvalidUsernameInTheRequestBodyAndClickSendButton() {
        login.userRequestWithTheHTTPMethodPOSTAndInputInvalidUsernameToLogin();
    }

    @And("User receive a response with status code 401 Unauthorized")
    public void userReceiveAResponseWithStatusCodeUnauthorized() {
        login.receiveHttpResponseCode401();
    }

    @Then("Validate failed login and display message {string} in the response body")
    public void validateFailedLoginAndDisplayMessageInTheResponseBody(String invalidUsernameForLogin) {
        login.failedLoginBecauseInvalidUsername("Invalid username");
    }






    //TC_AA_User_24 - Login [Negative 2]

    @When("User request HTTP method POST and input invalid password in the request body and click Send Button")
    public void userRequestHTTPMethodPOSTAndInputInvalidPasswordInTheRequestBodyAndClickSendButton() {
        login.userRequestWithTheHTTPMethodPOSTAndInputInvalidPasswordToLogin();
    }

    @Then("Validate failed login and display error message {string} in the response body")
    public void validateFailedLoginAndDisplayErrorMessageInTheResponseBody(String invalidPasswordForLogin) {
        login.failedLoginBecauseInvalidPassword("Invalid password");
    }





    //TC_AA_User_25 - Login [Negative 3]

    @When("User request HTTP method POST and input invalid username and password in the request body and click Send Button")
    public void userRequestHTTPMethodPOSTAndInputInvalidUsernameAndPasswordInTheRequestBodyAndClickSendButton() {
        login.userRequestWithTheHTTPMethodPOSTAndInputInvalidUsernameAndPasswordToLogin();
    }





    //TC_AA_User_26 - Login [Negative 4]

    @When("User request HTTP method POST and did not input username in the request body and click Send Button")
    public void userRequestHTTPMethodPOSTAndDidNotInputUsernameInTheRequestBodyAndClickSendButton() {
        login.userRequestWithTheHTTPMethodPOSTAndDidNotInputUsernameWhenLogin();
    }


    @Then("Validate failed to login and display message {string} in the response body")
    public void validateFailedToLoginAndDisplayMessageInTheResponseBody(String didNotInputUsernameForLogin) {
        login.failedLoginBecauseDidNotInputUsername("Username is required");
    }






    //TC_AA_User_27 - Login [Negative 5]

    @When("User request HTTP method POST and did not input password in the request body and click Send Button")
    public void userRequestHTTPMethodPOSTAndDidNotInputPasswordInTheRequestBodyAndClickSendButton() {
        login.userRequestWithTheHTTPMethodPOSTAndDidNotInputPasswordWhenLogin();
    }

    @Then("Validate failed to login and display error message {string} in the response body")
    public void validateFailedToLoginAndDisplayErrorMessageInTheResponseBody(String didNotInputPasswordForLogin) {
        login.failedLoginBecauseDidNotInputPassword("Password is required");
    }





    //TC_AA_User_28 - Login [Negative 6]

    @When("User request HTTP method POST and did not input username and password in the request body and click Send Button")
    public void userRequestHTTPMethodPOSTAndDidNotInputUsernameAndPasswordInTheRequestBodyAndClickSendButton() {
        login.userRequestWithTheHTTPMethodPOSTAndDidNotInputUsernameAndPasswordWhenLogin();
    }
}
