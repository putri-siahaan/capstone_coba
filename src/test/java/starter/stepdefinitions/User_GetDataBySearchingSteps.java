package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_GetDataBySearching;

public class User_GetDataBySearchingSteps {

    @Steps
    User_GetDataBySearching getDataBySearching;


    //TC_AA_User_96 - Get Wisata Data by Searching the Title [Positive 1]

    @Given("User input valid endpoint to get wisata data by searching the title")
    public void userInputValidEndpointToGetWisataDataBySearchingTheTitle() {
        getDataBySearching.userInputValidEndpointToGetWisataDataBySearchingTheTitle();
    }

    @When("User request with HTTP method GET and input title that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputTitleThatHasTheResultInToTheParamsAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputTitleThatHasTheResultSearching();

    }

    @Then("Validate success to get wisata data by title and display detail wisata  in the response body")
    public void validateSuccessToGetWisataDataByTitleAndDisplayDetailWisataInTheResponseBody() {
        getDataBySearching.successToGetWisataDataByTitle();
    }









    //TC_AA_User_97 - Get Wisata Data by Searching the Title [Positive 2]

    @Given("User input valid endpoint to get wisata data even though the title searched will not have results")
    public void userInputValidEndpointToGetWisataDataEvenThoughTheTitleSearchedWillNotHaveResults() {
        getDataBySearching.userInputValidEndpointToGetWisataDataEvenThoughTheTitleSearchedWillNotHaveResult();
    }

    @When("User request with GET HTTP method and input title where the title that doesn't exis and click Send Button")
    public void userRequestWithGETHTTPMethodAndInputTitleWhereTheTitleThatDoesnTExisAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputTitleWhereDoesnotResult();
    }

    @Then("Validate failed to get wisata data because the search returned no results or empty data in the response body")
    public void validateFailedToGetWisataDataBecauseTheSearchReturnedNoResultsEmptyDataInTheResponseBody() {
        getDataBySearching.failedToGetWisataDataByTitleBecauseTheResultIsEmpty();
    }










    //TC_AA_User_98 - Get Wisata Data by Searching the City [Positive 1]

    @Given("User input valid endpoint to get wisata data by searching the city")
    public void userInputValidEndpointToGetWisataDataBySearchingTheCity() {
        getDataBySearching.userInputValidEndpointToGetWisataDataBySearchingTheCity();
    }


    @When("User request with HTTP method GET and input the city that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputTheCityThatHasTheResultInToTheParamsAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputCityThatHasTheResultSearching();

    }

    @Then("Validate success to get wisata data by searching the city and display detail wisata in the response body")
    public void validateSuccessToGetWisataDataBySearchingTheCityAndDisplayDetailWisataInTheResponseBody() {
        getDataBySearching.successToGetWisataDataByCity();
    }











    //TC_AA_User_99 - Get Wisata Data by Searching the City [Positive 2]

    @Given("User input valid endpoint to get wisata data even though the city searched will not have results")
    public void userInputValidEndpointToGetWisataDataEvenThoughTheCitySearchedWillNotHaveResults() {
        getDataBySearching.userInputValidEndpointToGetWisataDataEvenThoughTheCitySearchedWillNotHaveResult();
    }

    @When("User request with GET HTTP method and input city where the title that doesn't exis and click Send Button")
    public void userRequestWithGETHTTPMethodAndInputCityWhereTheTitleThatDoesnTExisAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputCityWhereDoesnotResult();

    }

    @Then("Validate failed to get wisata data because the result of the search is empty in the response body")
    public void validateFailedToGetWisataDataBecauseTheResultOfTheSearchIsEmptyInTheResponseBody() {
        getDataBySearching.failedToGetWisataDataByCityBecuaseTheResultIsEmpty();
    }










    //TC_AA_User_100 - Get Wisata Data by Searching the Category Name [Positive 1]

    @Given("User input valid endpoint to get wisata data by searching the name of category")
    public void userInputValidEndpointToGetWisataDataBySearchingTheNameOfCategory() {
        getDataBySearching.userInputValidEndpointToGetWisataDataBySearchingTheCategoryName();
    }

    @When("User request with HTTP method GET and input the name of category that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputTheNameOfCategoryThatHasTheResultInToTheParamsAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputCategoryNameThatHasTheResultSearching();

    }

    @Then("Validate success to get wisata data by searching the name of category and display detail wisata in the response body")
    public void validateSuccessToGetWisataDataBySearchingTheNameOfCategoryAndDisplayDetailWisataInTheResponseBody() {
        getDataBySearching.successToGetWisataDataByCategoryName();
    }








    //TC_AA_User_101 - Get Wisata Data by Searching the Category Name [Positive 2]

    @Given("User input valid endpoint to get wisata data even though the name of category searched will not have results")
    public void userInputValidEndpointToGetWisataDataEvenThoughTheNameOfCategorySearchedWillNotHaveResults() {
        getDataBySearching.userInputValidEndpointToGetWisataDataEvenThoughTheCategoryNameSearchedWillNotHaveResult();
    }

    @When("User request with GET HTTP method and input name of category where the name that doesn't exis and click Send Button")
    public void userRequestWithGETHTTPMethodAndInputNameOfCategoryWhereTheNameThatDoesnTExisAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputCategoryNameWhereDoesnotResult();

    }

    @Then("Validate failed to get wisata data because the result of search name category is empty in the response body")
    public void validateFailedToGetWisataDataBecauseTheResultOfSearchNameCategoryIsEmptyInTheResponseBody() {
        getDataBySearching.failedToGetWisataDataByCategoryNameBecauseTheResultIsEmpty();
    }










    //TC_AA_User_102 - Get Promo Data by Searching Name of the promo [Positive 1]

    @Given("User input valid endpoint to get promo data by searching the name of promo")
    public void userInputValidEndpointToGetPromoDataBySearchingTheNameOfPromo() {
        getDataBySearching.userInputValidEndpointToGetPromoDataBySearchingTheName();
    }

    @When("User request with HTTP method GET and input the name of promo that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputTheNameOfPromoThatHasTheResultInToTheParamsAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputNameOfPromoThatHasTheResultSearching();

    }

    @Then("Validate success to get promo data by searching the name of promo and display detail promo in the response body")
    public void validateSuccessToGetPromoDataBySearchingTheNameOfPromoAndDisplayDetailPromoInTheResponseBody() {
        getDataBySearching.successToGetPromoDataByName();
    }










    //TC_AA_User_103 - Get Promo Data by Searching Name of the promo [Positive 2]

    @Given("User input valid endpoint to get promo data even though the name of promo searched will not have results")
    public void userInputValidEndpointToGetPromoDataEvenThoughTheNameOfPromoSearchedWillNotHaveResults() {
        getDataBySearching.userInputValidEndpointToGetPromoDataEvenThoughTheNameSearchedWillNotHaveResult();
    }


    @When("User request with GET HTTP method and input name of promo where the name that doesn't exis and click Send Button")
    public void userRequestWithGETHTTPMethodAndInputNameOfPromoWhereTheNameThatDoesnTExisAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputNamePromoWhereDoesnotResult();
    }

    @Then("Validate success to get promo data where the result of search name promo is empty in the response body")
    public void validateSuccessToGetPromoDataWhereTheResultOfSearchNamePromoIsEmptyInTheResponseBody() {
        getDataBySearching.successToGetPromoDataByNameEvenThoughTheResultIsEmpty();
    }








    //TC_AA_User_104 - Get Category Data by Searching Name of the categories [Positive 1]

    @Given("User input valid endpoint to get category data by searching the name of categories")
    public void userInputValidEndpointToGetCategoryDataBySearchingTheNameOfCategories() {
        getDataBySearching.userInputValidEndpointToGetCategoryDataBySearchingTheName();
    }

    @When("User request with HTTP method GET and input the name of categories that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputTheNameOfCategoriesThatHasTheResultInToTheParamsAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputNameOfCategoriesThatHasTheResultSearching();

    }

    @Then("Validate success to get categories data by searching the name of categories and display detail category in the response body")
    public void validateSuccessToGetCategoriesDataBySearchingTheNameOfCategoriesAndDisplayDetailCategoryInTheResponseBody() {
        getDataBySearching.successToGetCategoryDataByName();
    }









    //TC_AA_User_105 - Get Category Data by Searching Name of the categories [Positive 2]

    @Given("User input valid endpoint to get category data even though the name of categories searched will not have results")
    public void userInputValidEndpointToGetCategoryDataEvenThoughTheNameOfCategoriesSearchedWillNotHaveResults() {
        getDataBySearching.userInputValidEndpointToGetCategoryDataEvenThoughTheNameSearchedWillNotHaveResult();
    }

    @When("User request with GET HTTP method and input name category where the name that doesn't exis and click Send Button")
    public void userRequestWithGETHTTPMethodAndInputNameCategoryWhereTheNameThatDoesnTExisAndClickSendButton() {
        getDataBySearching.userRequestWithHTTPMethodGETAndInputNameCategoryWhereDoesnotResult();
        
    }

    @Then("Validate success to get category data where the result of search name category is empty in the response body")
    public void validateSuccessToGetCategoryDataWhereTheResultOfSearchNameCategoryIsEmptyInTheResponseBody() {
        getDataBySearching.successToGetCategoryDataByNameEvenThoughTheResultIsEmpty();
    }
}
