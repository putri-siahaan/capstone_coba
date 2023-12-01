Feature: User - Get Total Carbon Footprint With Wisata ID

  As a user
  I want to get total carbon footprint based on wisata ID
  So that I can see detail information of total carbon footprint

  @GetTotalCarbonFootprintByID @TC_MA_User_41
  Scenario: Get Total Carbon Footprint By ID (TC_MA_User_41) - Verify success to get total carbon footprint with valid wisata ID
    Given User input endpoint with valid ID to get total carbon footprint
    When User request with the HTTP method GET to get total carbon footprint and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get total carbon footprint based on ID and display information detail data total carbon footprint in the response body


  @TC_MA_User_42
  Scenario: Get Total Carbon Footprint By ID (TC_MA_User_42) - Verify failed to get total carbon footprint because input invalid wisata ID
    Given User input endpoint with invalid ID to get total carbon footprint
    When User request HTTP method GET to get total carbon footprint and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to get total carbon footprint based on ID and display error message "Wisata not found" in the response body
