package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetAllKota;

public class User_GetAllKotaSteps {

    @Steps
    User_GetAllKota getAllKota;


    //TC_AA_User_94 - Get All Kota Data [Positive]

    @Given("User input valid endpoint to get all kota data")
    public void userInputValidEndpointToGetAllKotaData() {
        getAllKota.userInputValidEndpointToGetAllKotaData();
    }

    @When("User request with HTTP method GET to get all kota and click Send Button")
    public void userRequestWithHTTPMethodGETToGetAllKotaAndClickSendButton() {
        getAllKota.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllKota();

    }

    @Then("Validate success to get all kota data and display information detail all kota in the response body")
    public void validateSuccessToGetAllKotaDataAndDisplayInformationDetailAllKotaInTheResponseBody() {
        getAllKota.successToGetAllKota();
    }








    //TC_AA_User_95 - Get All Kota Data [Negative]

    @Given("User input invalid endpoint to get all kota data")
    public void userInputInvalidEndpointToGetAllKotaData() {
        getAllKota.userInputInvalidEndpointToGetAllKotaData();
    }

    @When("User request with GET HTTP method to get all kota and click Send Button")
    public void userRequestWithGETHTTPMethodToGetAllKotaAndClickSendButton() {
        getAllKota.userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllKota();
        
    }

    @Then("Validate failed to get all kota data and display error message {string} in the response body")
    public void validateFailedToGetAllKotaDataAndDisplayErrorMessageInTheResponseBody(String failedGetAllKota) {
        getAllKota.failedToGetAllKotaData("Not Found");
    }
}
