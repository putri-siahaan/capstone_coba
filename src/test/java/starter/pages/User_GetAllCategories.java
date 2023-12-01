package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetAllCategories {
    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_User_43 - Get All Categories [Positive]

    @Step("User input valid endpoint to get all categories")
    public String userInputValidEndpointToGetAllCategories(){
        return url + "categories";
    }

    @Step("User request with HTTP method GET to get all categories and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllCategories(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetAllCategories()).then().statusCode(200);
    }

    @Step("Validate success to get all categories and display information detail all category in the response body")
    public void successToGetAllCategories(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_MA_User_44 - Get All Categories [Negative]

    @Step("User input invalid endpoint to get all categories")
    public String userInputInvalidEndpointToGetAllCategories(){
        return url + "Categories";
    }

    @Step("User request with GET HTTP method to get all categories and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllCategories(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetAllCategories()).then().statusCode(404);
    }

    @Step("Validate failed to get all categories and display error message {string} in the response body")
    public void failedToGetAllCategories(String failedGetAllCategories){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(failedGetAllCategories)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
