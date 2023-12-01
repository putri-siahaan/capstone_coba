Feature: User - Get All Categories Data

  As a user
  I want to get all categories
  So that I can see the details of category

  @GetAllCategories @TC_AA_User_43
  Scenario: Get All Categories (TC_AA_User_43) - Verify success to get all categories data with valid endpoint
    Given User input valid endpoint to get all categories
    When User request with HTTP method GET to get all categories and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get all categories and display information detail all category in the response body


  @TC_MA_User_44
  Scenario: Get All Categories (TC_AA_User_44) - Verify failed to get all categories data because input invalid endpoint
    Given User input invalid endpoint to get all categories
    When User request with GET HTTP method to get all categories and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to get all categories and display error message "Not Found" in the response body
