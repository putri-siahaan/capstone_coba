Feature: User - Get Data Wisata By ID

  As a user
  I want to data wisata by ID
  So that I can see detail wisata data

  @GetDataWisataByID @TC_MA_User_33
  Scenario: Get Data Wisata By ID (TC_MA_User_33) - Verify success to get data wisata with valid ID
    Given User input endpoint with valid ID to get data wisata
    When User request with the HTTP method GET to get data wisata and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get data wisata by ID and display information detail data wisata in the response body


  @TC_MA_User_34
  Scenario: Get Data Wisata By ID (TC_MA_User_34) - Verify failed to get data wisata because input invalid ID
    Given User input endpoint with invalid ID to get data wisata
    When User request HTTP method GET to get data wisata and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to get data wisata and display error message "Wisata not found" in the response body
