Feature: User - Get Point User

  As a user
  I want to get point
  So that I can see detail of my point

  @GetPoinUser @TC_AA_User_71
  Scenario: Get Point User (TC_AA_User_71) - Verify success to get point user with valid endpoint
    Given User input valid endpoint to get point user
    When User request with HTTP method GET to get point user and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get point user and display detail users ticket retrieved in the response body


  @TC_AA_User_72
  Scenario: Get Point User (TC_AA_User_72) - Verify failed to get point user because input invalid endpoint
    Given User input invalid endpoint to get point user
    When User request with GET HTTP method to get point user and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get point user and display error message "Invalid user ID" in the response body
