package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetAllWisataWithUserPreferences;

public class User_GetAllWisataWithUserPreferencesSteps {
    @Steps
    User_GetAllWisataWithUserPreferences getAllWisataWithUserPreferences;


    //TC_MA_User_39 - Get All Wisata With User Preferences [Positive]

    @Given("User input valid endpoint to get all wisata based on user preferences")
    public void userInputValidEndpointToGetAllWisataBasedOnUserPreferences() {
        getAllWisataWithUserPreferences.userInputValidEndpointToGetAllWisataBasedOnUserPreferences();
    }

    @When("User request with HTTP method GET to get wisata based on user preferences and click Send Button")
    public void userRequestWithHTTPMethodGETToGetWisataBasedOnUserPreferencesAndClickSendButton() {
        getAllWisataWithUserPreferences.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllWisataBasedOnUserPreferences();
    }

    @Then("Validate success to get all wisata based on user preferences and display information detail all wisata in the response body")
    public void validateSuccessToGetAllWisataBasedOnUserPreferencesAndDisplayInformationDetailAllWisataInTheResponseBody() {
        getAllWisataWithUserPreferences.successToGetAllWisataBasedOnUserPreferences();
    }






    //TC_MA_User_40 - Get All Wisata With User Preferences [Negative]

    @Given("User input invalid endpoint to get all wisata based on user preferences")
    public void userInputInvalidEndpointToGetAllWisataBasedOnUserPreferences() {
        getAllWisataWithUserPreferences.userInputInvalidEndpointToGetAllWisataBasedOnUserPreferences();
    }


    @When("User request GET HTTP method to get all promo and click Send Button")
    public void userRequestGETHTTPMethodToGetAllPromoAndClickSendButton() {
        getAllWisataWithUserPreferences.userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllWisataBasedOnUserPreferences();
        
    }

    @Then("Validate failed to get all wisata based on user preferences and display error message {string} in the response body")
    public void validateFailedToGetAllWisataBasedOnUserPreferencesAndDisplayErrorMessageInTheResponseBody(String failedGetAllWisataBasedOnUserPreferences) {
        getAllWisataWithUserPreferences.failedToGetAllWisataBasedOnUserPreferences("Invalid user ID");
    }
}
