package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetAllCategories;

public class User_GetAllCategoriesSteps {
    @Steps
    User_GetAllCategories getAllCategories;


    //TC_MA_User_43 - Get All Categories [Positive]

    @Given("User input valid endpoint to get all categories")
    public void userInputValidEndpointToGetAllCategories() {
        getAllCategories.userInputValidEndpointToGetAllCategories();
    }

    @When("User request with HTTP method GET to get all categories and click Send Button")
    public void userRequestWithHTTPMethodGETToGetAllCategoriesAndClickSendButton() {
        getAllCategories.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllCategories();
        
    }

    @Then("Validate success to get all categories and display information detail all category in the response body")
    public void validateSuccessToGetAllCategoriesAndDisplayInformationDetailAllCategoryInTheResponseBody() {
        getAllCategories.successToGetAllCategories();
    }

    
    
    


    //TC_MA_User_44 - Get All Categories [Negative]

    @Given("User input invalid endpoint to get all categories")
    public void userInputInvalidEndpointToGetAllCategories() {
        getAllCategories.userInputInvalidEndpointToGetAllCategories();
    }

    @When("User request with GET HTTP method to get all categories and click Send Button")
    public void userRequestWithGETHTTPMethodToGetAllCategoriesAndClickSendButton() {
        getAllCategories.userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllCategories();
        
    }

    @Then("Validate failed to get all categories and display error message {string} in the response body")
    public void validateFailedToGetAllCategoriesAndDisplayErrorMessageInTheResponseBody(String failedGetAllCategories) {
        getAllCategories.failedToGetAllCategories("Not Found");
    }
}
