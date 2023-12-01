package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetUserNotification {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_106 - Get User Notification [Positive]

    @Step("User input valid endpoint to get notification when payment is successful")
    public String userInputValidEndpointToGetAllNotification(){
        return url + "user/notification";
    }

    @Step("User request with HTTP method GET to get the notification with authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllNotificationWithAuthorization(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputValidEndpointToGetAllNotification()).then().statusCode(200);
    }

    @Step("Validate success to get notification and display all notification messages in the response body")
    public void successToGetAllNotification(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }





    //TC_AA_User_107 - Get User Notification [Negative 1]

    @Step("User request with GET HTTP method to get the notification without authorization and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllNotificationWithoutAuthorization(){
        SerenityRest
                .given()
                .get(userInputValidEndpointToGetAllNotification()).then().statusCode(401);
    }

    @Step("Validate failed to get notification and display error message {string} in the response body")
    public void failedToGetAllNotificationBecauseWithoutAuthorization(String failedBecauseWithoutAuthorization){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(failedBecauseWithoutAuthorization)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_108 - Get User Notification [Negative 2]

    @Step("User input invalid endpoint to get notification when payment is successful")
    public String userInputInvalidEndpointToGetAllNotification(){
        return url + "user/Notification";
    }

    @Step("User request with GET HTTP method to get notification with authorization and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputInvalidEndpointToGetAllNotification(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputInvalidEndpointToGetAllNotification()).then().statusCode(400);
    }

    @Step("Validate failed to get notification because invalid endpoint and display error message {string} in the response body")
    public void failedToGetAllNotificationBecauseInvalidEndpoint(String failedBecauseInvalidEndpoint){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedBecauseInvalidEndpoint)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
