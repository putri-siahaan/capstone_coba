package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetAllWisataData;

public class User_GetAllWisataDataSteps {
    @Steps
    User_GetAllWisataData getAllWisataData;


    //TC_AA_User_31 - Get All Wisata Data [Positive]

    @Given("User input valid endpoint to get all wisata data")
    public void userInputValidEndpointToGetAllWisataData() {
        getAllWisataData.userInputValidEndpointToGetAllWisataData();
    }

    @When("User request with HTTP method GET and click Send Button")
    public void userRequestWithHTTPMethodGETAndClickSendButton() {
        getAllWisataData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllWisata();

    }

    @Then("Validate success to get all wisata data and display information detail all wisata in the response body")
    public void validateSuccessToGetAllWisataDataAndDisplayInformationDetailAllWisataInTheResponseBody() {
        getAllWisataData.successToGetAllWisata();
    }




    //TC_AA_User_32 - Get All Wisata Data [Negative]

    @Given("User input invalid endpoint to get all wisata data")
    public void userInputInvalidEndpointToGetAllWisataData() {
        getAllWisataData.userInputInvalidEndpointToGetAllWisataData();
    }

    @When("User request with GET HTTP method and click Send Button")
    public void userRequestWithGETHTTPMethodAndClickSendButton() {
        getAllWisataData.userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllWisata();

    }

    @And("User receive a response with status code 404 Not Found")
    public void userReceiveAResponseWithStatusCodeNotFound() {
        getAllWisataData.receiveHttpResponseCode404();

    }

    @Then("Validate failed to get all wisata data and display error message {string} in the response body")
    public void validateFailedToGetAllWisataDataAndDisplayErrorMessageInTheResponseBody(String failedGetAllWisata) {
        getAllWisataData.failedToGetAllWisataData("Kesalahan wisata ID");
    }
}
