package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetTotalCarbonFootprintByWisataID;

public class User_GetTotalCarbonFootprintByWisataIDSteps {
    @Steps
    User_GetTotalCarbonFootprintByWisataID getTotalCarbonFootprintByWisataID;


    //TC_MA_User_41 - Get Total Carbon Footprint By ID [Positive]

    @Given("User input endpoint with valid ID to get total carbon footprint")
    public void userInputEndpointWithValidIDToGetTotalCarbonFootprint() {
        getTotalCarbonFootprintByWisataID.userInputEndpointWithValidIDToGetTotalCarbonFootprint();
    }

    @When("User request with the HTTP method GET to get total carbon footprint and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetTotalCarbonFootprintAndClickSendButton() {
        getTotalCarbonFootprintByWisataID.userRequestWithTheHTTPMethodGETToGetTotalCarbonFootprint();

    }

    @Then("Validate success to get total carbon footprint based on ID and display information detail data total carbon footprint in the response body")
    public void validateSuccessToGetTotalCarbonFootprintBasedOnIDAndDisplayInformationDetailDataTotalCarbonFootprintInTheResponseBody() {
        getTotalCarbonFootprintByWisataID.successToGetTotalCarbonFootprint();
    }






    //TC_MA_User_42 - Get Total Carbon Footprint By ID [Negative]

    @Given("User input endpoint with invalid ID to get total carbon footprint")
    public void userInputEndpointWithInvalidIDToGetTotalCarbonFootprint() {
        getTotalCarbonFootprintByWisataID.userInputEndpointWithInvalidIDToGetTotalCarbonFootprint();
    }

    @When("User request HTTP method GET to get total carbon footprint and click Send Button")
    public void userRequestHTTPMethodGETToGetTotalCarbonFootprintAndClickSendButton() {
        getTotalCarbonFootprintByWisataID.userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetTotalCarbonFootprint();
    }

    @Then("Validate failed to get total carbon footprint based on ID and display error message {string} in the response body")
    public void validateFailedToGetTotalCarbonFootprintBasedOnIDAndDisplayErrorMessageInTheResponseBody(String invalidIDToGetTotalCarbonFootprint) {
        getTotalCarbonFootprintByWisataID.failedToGetTotalCarbonFootprint("Wisata not found");
    }
}
