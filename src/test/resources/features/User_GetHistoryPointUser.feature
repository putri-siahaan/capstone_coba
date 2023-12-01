Feature: User - Get History Point User

  As a user
  I want to get history point of user
  So that I can see the points increasing and decreasing

  @GetUserNotification @TC_AA_User_130
  Scenario: Get History Point User (TC_AA_User_130) - Verify success to get history point of user with valid endpoint and authorization
    Given User input valid endpoint to get history point
    When User request with HTTP method GET to get history point with authorization and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get history point and display all in the response body


  @TC_AA_User_131
  Scenario: Get History Point User (TC_AA_User_131) - Verify failed to get history point user because without authorization
    Given User input valid endpoint to get history point
    When User request with GET HTTP method to get history point without authorization and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed to get history point and display error message "Authorization token is missing" in the response body


  @TC_AA_User_132
  Scenario: Get History Point User (TC_AA_User_132) - Verify failed to get history point user because input invalid endpoint
    Given User input invalid endpoint to get history point
    When User request with GET HTTP method to get history point with authorization and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get history point because invalid endpoint and display error message "Invalid user ID" in the response body
