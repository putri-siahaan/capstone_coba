Feature: User - Get User Wisata Booking History

  As a user
  I want to open history of wisata booking
  So that I can see detail user's tickets retrieved

  @GetUserWisataBookingHistory @TC_AA_User_69
  Scenario: Get User Wisata Booking History (TC_AA_User_69) - Verify success to get user wisata booking with valid endpoint
    Given User input valid endpoint to get user wisata booking history
    When User request with HTTP method GET to get user wisata booking history and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get user wisata booking history and display detail users ticket retrieved in the response body


  @TC_AA_User_70
  Scenario: Get User Wisata Booking History (TC_AA_User_70) - Verify failed to get user wisata booking because input invalid endpoint
    Given User input invalid endpoint to get user wisata boooking history
    When User request with GET HTTP method to get user wisata booking history and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get user wisata booking history and display error message "Invalid user ID" in the response body
