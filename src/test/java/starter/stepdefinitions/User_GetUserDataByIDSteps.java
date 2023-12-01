package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetUserDataByID;

public class User_GetUserDataByIDSteps {
    @Steps
    User_GetUserDataByID getUserDataByID;




    //TC_MA_User_29 - Get User Data By ID [Positive]

    @Given("User input endpoint with valid ID to get user data")
    public void userInputValidEndpointToLogin() {
        getUserDataByID.userInputEndpointWithValidIDToGetUserData();
    }

    @When("User request with the HTTP method GET and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputAndClickSendButton() {
        getUserDataByID.userRequestWithTheHTTPMethodGETAndInputValidIDToGetUserData();
    }

    @Then("Validate success to get user data by ID and display information detail of the account in the response body")
    public void validateSuccessToGetUserDataByIDAndDisplayInformationDetailOfTheAccountInTheResponseBody() {
        getUserDataByID.successToGetUserData();
    }




    //TC_MA_User_30 - Get User Data By ID [Negative]

    @Given("User input endpoint with invalid ID to get user data")
    public void userInputEndpointWithInvalidIDToGetUserData() {
        getUserDataByID.userInputEndpointWithInvalidIDToGetUserData();
    }

    @When("User request HTTP method GET and click Send Button")
    public void userRequestHTTPMethodGETAndInputAndClickSendButton() {
        getUserDataByID.userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetUserData();
    }

    @And("User receive a response with status code 403 Forbidden")
    public void userReceiveAResponseWithStatusCodeForbidden() {
        getUserDataByID.receiveHttpResponseCode403();

    }

    @Then("Validate failed to get user data and display error message {string} in the response body")
    public void validateFailedToGetUserDataAndDisplayErrorMessageInTheResponseBody(String invalidIDToGetUserData) {
        getUserDataByID.failedToGetUserData("Access denied");
    }


}
