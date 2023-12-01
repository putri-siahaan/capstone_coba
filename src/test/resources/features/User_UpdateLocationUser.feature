Feature: User - Update Location User Data By ID

  As a user
  I want to update my location
  So that I can get destination in my location

  @UpdateLocationUser @TC_AA_User_81
  Scenario: Update Location User Data By ID  (TC_AA_User_81) - Verify success to update location user with valid ID in endpoint and request body
    Given User input endpoint with valid ID to update location
    When User request with the HTTP method PUT and input valid data lat and long in the request body and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success update location user and display message "User location updated successfully" in the response body


  @TC_AA_User_82
  Scenario: Update Location User Data By ID (TC_AA_User_82) - Verify failed to update location user because input invalid user ID
    Given User input endpoint with invalid ID to update location
    When User request HTTP method PUT and input valid data lat and long in the request body and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed update location because invalid ID and display message "Unauthorized to edit this user" in the response body
