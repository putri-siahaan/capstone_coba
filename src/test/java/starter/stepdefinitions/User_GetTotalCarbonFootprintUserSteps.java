package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetTotalCarbonFootprintUser;

public class User_GetTotalCarbonFootprintUserSteps {
    @Steps
    User_GetTotalCarbonFootprintUser getTotalCarbonFootprintUser;


    //TC_MA_User_45 - Get Total Carbon Footprint User [Positive]

    @Given("User input endpoint with valid ID user to get total carbon footprint")
    public void userInputEndpointWithValidIDUserToGetTotalCarbonFootprint() {
        getTotalCarbonFootprintUser.userInputEndpointWithValidIDUserToGetTotalCarbonFootprint();
    }

    @When("User request with the HTTP method GET to get total carbon footprint user and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetTotalCarbonFootprintUserAndClickSendButton() {
        getTotalCarbonFootprintUser.userRequestWithTheHTTPMethodGETToGetTotalCarbonFootprintUser();
    }

    @Then("Validate success to get total carbon footprint user and display information detail data total carbon footprint user in the response body")
    public void validateSuccessToGetTotalCarbonFootprintUserAndDisplayInformationDetailDataTotalCarbonFootprintUserInTheResponseBody() {
        getTotalCarbonFootprintUser.successToGetTotalCarbonFootprintUser();
    }

    
    


    
    
    //TC_MA_User_46 - Get Total Carbon Footprint User [Negative]

    @Given("User input endpoint with invalid ID user to get total carbon footprint")
    public void userInputEndpointWithInvalidIDUserToGetTotalCarbonFootprint() {
        getTotalCarbonFootprintUser.userInputEndpointWithInvalidIDUserToGetTotalCarbonFootprint();
    }


    @When("User request HTTP method GET to get total carbon footprint user and click Send Button")
    public void userRequestHTTPMethodGETToGetTotalCarbonFootprintUserAndClickSendButton() {
        getTotalCarbonFootprintUser.userRequestWithTheHTTPMethodGETAndInputInvalidIDUserToGetTotalCarbonFootprint();
    }

    @Then("Validate failed to get total carbon footprint user and display error message {string} in the response body")
    public void validateFailedToGetTotalCarbonFootprintUserAndDisplayErrorMessageInTheResponseBody(String invalidIDToGetTotalCarbonFootprintUser) {
        getTotalCarbonFootprintUser.failedToGetTotalCarbonFootprintUser("Access denied");
    }
}
