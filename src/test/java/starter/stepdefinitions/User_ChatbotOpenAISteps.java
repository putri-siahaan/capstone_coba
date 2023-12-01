package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_ChatbotOpenAI;

public class User_ChatbotOpenAISteps {

    @Steps
    User_ChatbotOpenAI chatbotOpenAI;


    //TC_AA_User_91 - Chatbot Access Powered By Open AI GPT 3.5 [Positive]

    @Given("User input valid endpoint to ask something in chatbot OpenAI")
    public void userInputValidEndpointToAskSomethingInChatbotOpenAI() {
        chatbotOpenAI.userInputValidEndpointToAskSomethingInChatbotOpenAI();
    }

    @When("User request with HTTP method POST with valid message related to travel questions and click Send Button")
    public void userRequestWithHTTPMethodPOSTWithValidMessageRelatedToTravelQuestionsAndClickSendButton() {
        chatbotOpenAI.userRequestWithHTTPMethodPOSTWithValidMessageRelatedToTravelQuestions();

    }

    @Then("Validate success to get recommendation about destination and display detail data answer from chatbot")
    public void validateSuccessToGetRecommendationAboutDestinationAndDisplayDetailDataAnswerFromChatbot() {
        chatbotOpenAI.successToGetRecommendationAboutDestination();
    }








    //TC_AA_User_92 - Chatbot Access Powered By Open AI GPT 3.5 [Negative 1]

    @When("User request with POST HTTP method but did not input message in the request body and click Send Button")
    public void userRequestWithPOSTHTTPMethodButDidNotInputMessageInTheRequestBodyAndClickSendButton() {
        chatbotOpenAI.userRequestWithPOSTHTTPMethodButDidNotInputMessage();
    }

    @Then("Validate failed to get recommendation of destination because did not input message and display error message {string} in the response body")
    public void validateFailedToGetRecommendationOfDestinationBecauseDidNotInputMessageAndDisplayErrorMessageInTheResponseBody(String failedToGetRecommendationBecauseDidNotInputMessage) {
        chatbotOpenAI.failedToGetRecommendationOfDestinationBecauseDidNotInputMessage("Invalid or missing 'message' in the request");
    }









    //TC_AA_User_93 - Chatbot Access Powered By Open AI GPT 3.5 [Negative 2]

    @When("User request with POST HTTP method with invalid message which asks unrelated questions about destination and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidMessageWhichAsksUnrelatedQuestionsAboutDestinationAndClickSendButton() {
        chatbotOpenAI.userRequestWithPOSTHTTPMethodWithInvalidMessageWhichAskUnrelatedQuestionAboutDestination();
    }

    @Then("Validate failed to get recommendation of destination because ask unrelated question about destination and display error message {string} in the response body")
    public void validateFailedToGetRecommendationOfDestinationBecauseAskUnrelatedQuestionAboutDestinationAndDisplayErrorMessageInTheResponseBody(String failedGetRecommendationBecauseInvalidMessage) {
        chatbotOpenAI.failedToGetRecommendationDestinationBecauseAskUnrelatedQuestionOfDestination("Sorry, this chatbot only serves questions about tempat wisata");
    }
}
