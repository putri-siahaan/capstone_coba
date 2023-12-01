package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

import java.util.List;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetDataBySearching {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_96 - Get Wisata Data by Searching the Title [Positive 1]

    @Step("User input valid endpoint to get wisata data by searching the title")
    public String userInputValidEndpointToGetWisataDataBySearchingTheTitle(){
        return url + "wisata/mobile?page=1&limit=5&title=moja museum";
    }

    @Step("User request with HTTP method GET and input title that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputTitleThatHasTheResultSearching(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetWisataDataBySearchingTheTitle()).then().statusCode(200);
    }

    @Step("Validate success to get wisata data by title and display detail wisata  in the response body")
    public void successToGetWisataDataByTitle(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_97 - Get Wisata Data by Searching the Title [Positive 2]

    @Step("User input valid endpoint to get wisata data even though the title searched will not have results")
    public String userInputValidEndpointToGetWisataDataEvenThoughTheTitleSearchedWillNotHaveResult(){
        return url + "wisata/mobile?title=TB Center";
    }

    @Step("User request with GET HTTP method and input title where the title that doesn't exis and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputTitleWhereDoesnotResult(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetWisataDataEvenThoughTheTitleSearchedWillNotHaveResult()).then().statusCode(200);
    }

    @Step("Validate failed to get wisata data because the search returned no results or empty data in the response body")
    public void failedToGetWisataDataByTitleBecauseTheResultIsEmpty(){
        List<Object> wisatas = SerenityRest.then().extract().path("wisatas");
        Assertions.assertThat(wisatas).as("Search result should be empty").isEmpty();
    }













    //TC_AA_User_98 - Get Wisata Data by Searching the City [Positive 1]

    @Step("User input valid endpoint to get wisata data by searching the city")
    public String userInputValidEndpointToGetWisataDataBySearchingTheCity(){
        return url + "wisata/mobile?page=1&limit=5&kota=jakarta";
    }

    @Step("User request with HTTP method GET and input the city that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputCityThatHasTheResultSearching(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetWisataDataBySearchingTheCity()).then().statusCode(200);
    }

    @Step("Validate success to get wisata data by searching the city and display detail wisata in the response body")
    public void successToGetWisataDataByCity(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }















    //TC_AA_User_99 - Get Wisata Data by Searching the City [Positive 2]

    @Step("User input valid endpoint to get wisata data even though the city searched will not have results")
    public String userInputValidEndpointToGetWisataDataEvenThoughTheCitySearchedWillNotHaveResult(){
        return url + "wisata/mobile?page=1&limit=5&kota=Laguboti";
    }

    @Step("User request with GET HTTP method and input title where the title that doesn't exis and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputCityWhereDoesnotResult(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetWisataDataEvenThoughTheCitySearchedWillNotHaveResult()).then().statusCode(200);
    }

    @Step("Validate failed to get wisata data because the result of the search is empty in the response body")
    public void failedToGetWisataDataByCityBecuaseTheResultIsEmpty(){
        List<Object> wisatas = SerenityRest.then().extract().path("wisatas");
        Assertions.assertThat(wisatas).as("Search result should be empty").isEmpty();
    }


















    //TC_AA_User_100 - Get Wisata Data by Searching the Category Name [Positive 1]

    @Step("User input valid endpoint to get wisata data by searching the name of category")
    public String userInputValidEndpointToGetWisataDataBySearchingTheCategoryName(){
        return url + "wisata/mobile?page=1&limit=5&category_name=pantai";
    }

    @Step("User request with HTTP method GET and input the name of category that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputCategoryNameThatHasTheResultSearching(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetWisataDataBySearchingTheCategoryName()).then().statusCode(200);
    }

    @Step("Validate success to get wisata data by searching the name of category and display detail wisata in the response body")
    public void successToGetWisataDataByCategoryName(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }


















    //TC_AA_User_101 - Get Wisata Data by Searching the Category Name [Positive 2]

    @Step("User input valid endpoint to get wisata data even though the name of category searched will not have results")
    public String userInputValidEndpointToGetWisataDataEvenThoughTheCategoryNameSearchedWillNotHaveResult(){
        return url + "wisata/mobile?page=1&limit=5&category_name=salju";
    }

    @Step("User request with GET HTTP method and input name of category where the name that doesn't exis and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputCategoryNameWhereDoesnotResult(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetWisataDataEvenThoughTheCategoryNameSearchedWillNotHaveResult()).then().statusCode(200);
    }

    @Step("Validate failed to get wisata data because the result of search name category is empty in the response body")
    public void failedToGetWisataDataByCategoryNameBecauseTheResultIsEmpty(){
        List<Object> wisatas = SerenityRest.then().extract().path("wisatas");
        Assertions.assertThat(wisatas).as("Search result should be empty").isEmpty();
    }


















    //TC_AA_User_102 - Get Promo Data by Searching Name of the promo [Positive 1]

    @Step("User input valid endpoint to get promo data by searching the name of promo")
    public String userInputValidEndpointToGetPromoDataBySearchingTheName(){
        return url + "user/promo?nama_promo=November Liburan";
    }

    @Step("User request with HTTP method GET and input the name of promo that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputNameOfPromoThatHasTheResultSearching(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetPromoDataBySearchingTheName()).then().statusCode(200);
    }

    @Step("Validate success to get promo data by searching the name of promo and display detail promo in the response body")
    public void successToGetPromoDataByName(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }


















    //TC_AA_User_103 - Get Promo Data by Searching Name of the promo [Positive 2]

    @Step("User input valid endpoint to get promo data even though the name of promo searched will not have results")
    public String userInputValidEndpointToGetPromoDataEvenThoughTheNameSearchedWillNotHaveResult(){
        return url + "user/promo?nama_promo=HUT RI";
    }

    @Step("User request with GET HTTP method and input name of promo where the name that doesn't exis and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputNamePromoWhereDoesnotResult(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetPromoDataEvenThoughTheNameSearchedWillNotHaveResult()).then().statusCode(200);
    }

    @Step("Validate success to get promo data where the result of search name promo is empty in the response body")
    public void successToGetPromoDataByNameEvenThoughTheResultIsEmpty(){
        List<Object> promos = SerenityRest.then().extract().path("promos");
        Assertions.assertThat(promos).as("Search result should be empty").isEmpty();
    }


















    //TC_AA_User_104 - Get Category Data by Searching Name of the categories [Positive 1]

    @Step("User input valid endpoint to get category data by searching the name of categories")
    public String userInputValidEndpointToGetCategoryDataBySearchingTheName(){
        return url + "categories?category_name=alam";
    }

    @Step("User request with HTTP method GET and input the name of categories that has the result in to the params and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputNameOfCategoriesThatHasTheResultSearching(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetCategoryDataBySearchingTheName()).then().statusCode(200);
    }

    @Step("Validate success to get categories data by searching the name of categories and display detail category in the response body")
    public void successToGetCategoryDataByName(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }



















    //TC_AA_User_105 - Get Category Data by Searching Name of the categories [Positive 2]

    @Step("User input valid endpoint to get category data even though the name of categories searched will not have results")
    public String userInputValidEndpointToGetCategoryDataEvenThoughTheNameSearchedWillNotHaveResult(){
        return url + "categories?category_name=salju";
    }

    @Step("User request with GET HTTP method and input name category where the name that doesn't exis and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputNameCategoryWhereDoesnotResult(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetCategoryDataEvenThoughTheNameSearchedWillNotHaveResult()).then().statusCode(200);
    }

    @Step("Validate success to get category data where the result of search name category is empty in the response body")
    public void successToGetCategoryDataByNameEvenThoughTheResultIsEmpty(){
        List<Object> categories = SerenityRest.then().extract().path("categories");
        Assertions.assertThat(categories).as("Search result should be empty").isEmpty();
    }

}
