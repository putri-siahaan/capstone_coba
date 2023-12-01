Feature: User - Chatbot Access Powered By OpenAI GPT 3.5

  As a user
  I want to ask about destination in chatbot access powered openAI
  So that I get recommendation of destination

  @ChatbotOpenAI @TC_AA_User_91
  Scenario: Chatbot Access Powered By OpenAI GPT 3.5 (TC_AA_User_91) - Verify success to ask in Chatbot Access Powered By OpenAI GPT 3.5 with valid endpoint
    Given User input valid endpoint to ask something in chatbot OpenAI
    When User request with HTTP method POST with valid message related to travel questions and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get recommendation about destination and display detail data answer from chatbot


  @TC_AA_User_92
  Scenario: Chatbot Access Powered By OpenAI GPT 3.5 (TC_AA_User_92) - Verify failed to ask in Chatbot Access Powered By OpenAI GPT 3.5 because did not input message in request body
    Given User input valid endpoint to ask something in chatbot OpenAI
    When User request with POST HTTP method but did not input message in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get recommendation of destination because did not input message and display error message "Invalid or missing 'message' in the request" in the response body


  @TC_AA_User_93
  Scenario: Chatbot Access Powered By OpenAI GPT 3.5 (TC_AA_User_93) - Verify failed to ask in Chatbot Access Powered By OpenAI GPT 3.5 because input invalid message in request body
    Given User input valid endpoint to ask something in chatbot OpenAI
    When User request with POST HTTP method with invalid message which asks unrelated questions about destination and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get recommendation of destination because ask unrelated question about destination and display error message "Sorry, this chatbot only serves questions about tempat wisata & rekomendasi wisata" in the response body