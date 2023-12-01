package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetTNCByID;

public class User_GetTNCByIDSteps {

    @Steps
    User_GetTNCByID getTNCByID;


    //TC_AA_User_136 - Get Terms and Conditions Data By ID [Positive]

    @Given("User input endpoint with valid ID to get tnc")
    public void userInputEndpointWithValidIDToGetTnc() {
        getTNCByID.userInputEndpointWithValidIDToGetTNC();
    }

    @When("User request with HTTP method GET to get tnc by ID with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETToGetTncByIDWithAuthorizationAndClickSendButton() {
        getTNCByID.userRequestWithHTTPMethodGETAndInputValidIDToGetTNCWithAuthorization();

    }

    @Then("Validate success to get tnc by ID and display all tnc in the response body")
    public void validateSuccessToGetTncByIDAndDisplayAllTncInTheResponseBody() {
        getTNCByID.successToGetTNCByID();
    }














    //TC_AA_User_137 - Get Terms and Conditions Data By ID [Negative 1]

    @When("User request with GET HTTP method to get tnc by ID without authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetTncByIDWithoutAuthorizationAndClickSendButton() {
        getTNCByID.userRequestWithHTTPMethodGETAndInputValidIDToGetTNCWithoutAuthorization();
    }

    @Then("Validate failed to get tnc by ID and display error message {string} in the response body")
    public void validateFailedToGetTncByIDAndDisplayErrorMessageInTheResponseBody(String failedGetTNCByID) {
        getTNCByID.failedToGetTNCByIDBecauseWithoutAuthorization("Token autentikasi harus dimasukan");
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    


    //TC_AA_User_138 - Get Terms and Conditions Data By ID [Negative 2]

    @Given("User input endpoint with invalid ID to get tnc")
    public void userInputEndpointWithInvalidIDToGetTnc() {
        getTNCByID.userInputEndpointWithInvalidIDToGetTNC();
    }


    @When("User request with GET HTTP method to get tnc by ID with authorization and click Send Button")
    public void userRequestWithGETHTTPMethodToGetTncByIDWithAuthorizationAndClickSendButton() {
        getTNCByID.userRequestWithGetHTTPMethodAndInputInvalidIDToGetTNC();
        
    }

    @Then("Validate failed to get tnc because invalid ID and display error message {string} in the response body")
    public void validateFailedToGetTncBecauseInvalidIDAndDisplayErrorMessageInTheResponseBody(String failedGetTNCBecauseInvalidID) {
        getTNCByID.failedToGetTNCBecauseInvalidID("Term Condition tidak ditemukan");
    }
}
