Feature: User - Get Total Carbon Footprint User

  As a user
  I want to get total carbon footprint user
  So that I can see the details rounded total carbon footprint

  @GetAllTotalCarbonFootprintUser @TC_MA_User_45
  Scenario: Get Total Carbon Footprint User (TC_MA_User_45) - Verify success to get total carbon footprint with valid ID user
    Given User input endpoint with valid ID user to get total carbon footprint
    When User request with the HTTP method GET to get total carbon footprint user and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get total carbon footprint user and display information detail data total carbon footprint user in the response body



  @TC_MA_User_46
  Scenario: Get Total Carbon Footprint User (TC_MA_User_46) - Verify failed to get total carbon footprint because input invalid user ID
    Given User input endpoint with invalid ID user to get total carbon footprint
    When User request HTTP method GET to get total carbon footprint user and click Send Button
    And User receive a response with status code 403 Forbidden
    Then Validate failed to get total carbon footprint user and display error message "Access denied" in the response body
