Feature: User - Get All Wisata With User Preferences

  As a user
  I want to get all wisata with user preferences
  So that I can see details of tourist attractions

  @GetAllWisataWithUserPreferences @TC_MA_User_39
  Scenario: Get All Wisata With User Preferences (TC_MA_User_39) - Verify success to get all wisata data by user preferences with valid endpoint
    Given User input valid endpoint to get all wisata based on user preferences
    When User request with HTTP method GET to get wisata based on user preferences and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get all wisata based on user preferences and display information detail all wisata in the response body


  @TC_MA_User_40
  Scenario: Get All Wisata With User Preferences (TC_MA_User_40) - Verify failed to get all wisata data by user preferences because input invalid endpoint
    Given User input invalid endpoint to get all wisata based on user preferences
    When User request GET HTTP method to get all promo and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get all wisata based on user preferences and display error message "Invalid user ID" in the response body
