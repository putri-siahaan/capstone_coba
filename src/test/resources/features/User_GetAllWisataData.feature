Feature: User - Get All Wisata Data

  As a user
  I want to get all wisata data
  So that I can see details of tourist attractions

  @GetAllWisataData @TC_AA_User_31
  Scenario: Get All Wisata Data (TC_AA_User_31) - Verify success to get all wisata data with valid endpoint
    Given User input valid endpoint to get all wisata data
    When User request with HTTP method GET and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get all wisata data and display information detail all wisata in the response body


  @TC_AA_User_32
  Scenario: Get All Wisata Data (TC_AA_User_32) - Verify failed to get all wisata data because input invalid endpoint
    Given User input invalid endpoint to get all wisata data
    When User request with GET HTTP method and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get all wisata data and display error message "Kesalahan wisata ID" in the response body
