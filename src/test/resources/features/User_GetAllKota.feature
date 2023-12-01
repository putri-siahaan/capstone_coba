Feature: User - Get All Kota Data

  As a user
  I want to get all kota
  So that I can see details all kota data

  @GetAllKota @TC_AA_User_94
  Scenario: Get All Kota Data (TC_AA_User_94) - Verify success to get all Kota data with valid endpoint
    Given User input valid endpoint to get all kota data
    When User request with HTTP method GET to get all kota and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get all kota data and display information detail all kota in the response body


  @TC_AA_User_95
  Scenario: Get All Kota Data (TC_AA_User_95) - Verify failed to get all Kota data because input invalid endpoint
    Given User input invalid endpoint to get all kota data
    When User request with GET HTTP method to get all kota and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to get all kota data and display error message "Not Found" in the response body
