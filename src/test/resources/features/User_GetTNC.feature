Feature: User - Get Terms and Conditions Data

  As a user
  I want to get terms and conditions data
  So that I know what requirements are needed for this platform

  @GetUserNotification @TC_AA_User_133
  Scenario: Get Terms and Conditions Data (TC_AA_User_133) - Verify success to get terms and Conditions Data with valid endpoint and authorization
    Given User input valid endpoint to get tnc
    When User request with HTTP method GET to get tnc with authorization and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get tnc and display all tnc in the response body


  @TC_AA_User_134
  Scenario: Get Terms and Conditions Data (TC_AA_User_134) - Verify failed to get history point user because without authorization
    Given User input valid endpoint to get tnc
    When User request with GET HTTP method to get tnc without authorization and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed to get tnc and display error message "Authorization token is missing" in the response body


  @TC_AA_User_135
  Scenario: Get Terms and Conditions Data (TC_AA_User_135) - Verify failed to get history point user because input invalid endpoint
    Given User input invalid endpoint to get tnc
    When User request with GET HTTP method to get tnc with authorization and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to get tnc because invalid endpoint and display error message "Not Found" in the response body
