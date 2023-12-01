Feature: User - Get User Data By ID

  As a user
  I want to get user data by ID
  So that I can see detail user data

  @GetUserDataByID @TC_MA_User_29
  Scenario: Get User Data By ID (TC_MA_User_29) - Verify success to get user data with valid ID
    Given User input endpoint with valid ID to get user data
    When User request with the HTTP method GET and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get user data by ID and display information detail of the account in the response body


  @TC_MA_User_30
  Scenario: Get User Data By ID (TC_MA_User_30) - Verify failed to get user data because input invalid ID
    Given User input endpoint with invalid ID to get user data
    When User request HTTP method GET and click Send Button
    And User receive a response with status code 403 Forbidden
    Then Validate failed to get user data and display error message "Access denied" in the response body
