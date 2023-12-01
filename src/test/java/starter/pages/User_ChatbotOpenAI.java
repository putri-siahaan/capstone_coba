package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_ChatbotOpenAI {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_91 - Chatbot Access Powered By Open AI GPT 3.5 [Positive]

    @Step("User input valid endpoint to ask something in chatbot OpenAI")
    public String userInputValidEndpointToAskSomethingInChatbotOpenAI(){
        return url + "chatbot/recommend-wisata";
    }

    @Step("User request with HTTP method POST with valid message related to travel questions and click Send Button")
    public void userRequestWithHTTPMethodPOSTWithValidMessageRelatedToTravelQuestions(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "Saya butuh rekomendasi Wisata di Medan");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToAskSomethingInChatbotOpenAI()).then().statusCode(200);
    }

    @Step("Validate success to get recommendation about destination and display detail data answer from chatbot")
    public void successToGetRecommendationAboutDestination(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_92 - Chatbot Access Powered By Open AI GPT 3.5 [Negative 1]

    @Step("User request with POST HTTP method but did not input message in the request body and click Send Button")
    public void userRequestWithPOSTHTTPMethodButDidNotInputMessage(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToAskSomethingInChatbotOpenAI()).then().statusCode(400);
    }

    @Step("Validate failed to get recommendation of destination because did not input message and display error message {string} in the response body")
    public void failedToGetRecommendationOfDestinationBecauseDidNotInputMessage(String failedToGetRecommendationBecauseDidNotInputMessage){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedToGetRecommendationBecauseDidNotInputMessage)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }






    //TC_AA_User_93 - Chatbot Access Powered By Open AI GPT 3.5 [Negative 2]

    @Step("User request with POST HTTP method with invalid message which asks unrelated questions about destination and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidMessageWhichAskUnrelatedQuestionAboutDestination(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "kapan masuk kampus?");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(userInputValidEndpointToAskSomethingInChatbotOpenAI()).then().statusCode(400);
    }

    @Step("Validate failed to get recommendation of destination because ask unrelated question about destination and display error message {string} in the response body")
    public void failedToGetRecommendationDestinationBecauseAskUnrelatedQuestionOfDestination(String failedGetRecommendationBecauseInvalidMessage){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedGetRecommendationBecauseInvalidMessage)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }
}
