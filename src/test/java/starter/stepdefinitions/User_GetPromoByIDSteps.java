package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetPromoByID;

public class User_GetPromoByIDSteps {
    @Steps
    User_GetPromoByID getPromoByID;


    //TC_AA_User_37 - Get Promo By ID [Positive]

    @Given("User input endpoint with valid ID to get promo")
    public void userInputEndpointWithValidIDToGetPromo() {
        getPromoByID.userInputEndpointWithValidIDToGetPromo();
    }

    @When("User request with the HTTP method GET to get data promo and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetDataPromoAndClickSendButton() {
        getPromoByID.userRequestWithTheHTTPMethodGETToGetPromo();

    }

    @Then("Validate success to get promo by ID and display information detail promo in the response body")
    public void validateSuccessToGetPromoByIDAndDisplayInformationDetailPromoInTheResponseBody() {
        getPromoByID.successToGetPromo();
    }







    //TC_AA_User_38 - Get Promo By ID [Negative]

    @Given("User input endpoint with invalid ID to get promo")
    public void userInputEndpointWithInvalidIDToGetPromo() {
        getPromoByID.userInputEndpointWithInvalidIDToGetPromo();
    }


    @When("User request HTTP method GET to get promo and click Send Button")
    public void userRequestHTTPMethodGETToGetPromoAndClickSendButton() {
        getPromoByID.userRequestWithTheHTTPMethodGETAndInputInvalidIDToGetPromo();
        
    }

    @Then("Validate failed to get promo and display error message {string} in the response body")
    public void validateFailedToGetPromoAndDisplayErrorMessageInTheResponseBody(String invalidIDToGetPromo) {
        getPromoByID.failedToGetPromoBecauseInvalidID("Promo tidak ditemukan");
    }
}
