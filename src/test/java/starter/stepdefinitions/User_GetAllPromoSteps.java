package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetAllPromo;

public class User_GetAllPromoSteps {
    @Steps
    User_GetAllPromo getAllPromo;


    //TC_AA_User_35 - Get All Promo [Positive]

    @Given("User input valid endpoint to get all promo")
    public void userInputValidEndpointToGetAllPromo() {
        getAllPromo.userInputValidEndpointToGetAllPromo();
    }

    @When("User request with HTTP method GET to get all promo and click Send Button")
    public void userRequestWithHTTPMethodGETToGetAllPromoAndClickSendButton() {
        getAllPromo.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllPromo();
        
    }

    @Then("Validate success to get all wisata promo and display information detail all promo in the response body")
    public void validateSuccessToGetAllWisataPromoAndDisplayInformationDetailAllPromoInTheResponseBody() {
        getAllPromo.successToGetAllPromo();
    }

    
    
    


    //TC_AA_User_36 - Get All Promo [Negative]

    @Given("User input invalid endpoint to get all promo")
    public void userInputInvalidEndpointToGetAllPromo() {
        getAllPromo.userInputInvalidEndpointToGetAllPromo();
        
    }

    @When("User request with GET HTTP method to get all promo and click Send Button")
    public void userRequestWithGETHTTPMethodToGetAllPromoAndClickSendButton() {
        getAllPromo.userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllPromo();
    }

    @Then("Validate failed to get all promo and display error message {string} in the response body")
    public void validateFailedToGetAllPromoAndDisplayErrorMessageInTheResponseBody(String faileGetAllPromo) {
        getAllPromo.failedToGetAllPromo("Invalid user ID");
    }
}
