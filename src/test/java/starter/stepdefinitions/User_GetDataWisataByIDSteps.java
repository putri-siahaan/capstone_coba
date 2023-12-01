package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.pages.User_GetDataWisataByID;

public class User_GetDataWisataByIDSteps {
    @Steps
    User_GetDataWisataByID getDataWisataByID;


    //TC_MA_User_33 - Get Data Wisata By ID [Positive]

    @Given("User input endpoint with valid ID to get data wisata")
    public void userInputEndpointWithValidIDToGetDataWisata() {
        getDataWisataByID.userInputEndpointWithValidIDToGetWisataData();
    }


    @When("User request with the HTTP method GET to get data wisata and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetDataWisataAndClickSendButton() {
        getDataWisataByID.userRequestWithTheHTTPMethodGETToGetDataWisata();

    }

    @Then("Validate success to get data wisata by ID and display information detail data wisata in the response body")
    public void validateSuccessToGetDataWisataByIDAndDisplayInformationDetailDataWisataInTheResponseBody() {
        getDataWisataByID.successToGetDataWisata();
    }




    //TC_MA_User_34 - Get Data Wisata By ID [Negative]

    @Given("User input endpoint with invalid ID to get data wisata")
    public void userInputEndpointWithInvalidIDToGetDataWisata() {
        getDataWisataByID.userInputEndpointWithInvalidIDToGetDataWisata();
    }

    @When("User request HTTP method GET to get data wisata and click Send Button")
    public void userRequestHTTPMethodGETToGetDataWisataAndClickSendButton() {
        getDataWisataByID.userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetDataWisata();

    }

    @Then("Validate failed to get data wisata and display error message {string} in the response body")
    public void validateFailedToGetDataWisataAndDisplayErrorMessageInTheResponseBody(String invalidIDToGetDataWisata) {
        getDataWisataByID.failedToGetDataWisata("Wisata tidak ditemukan");
    }
}
