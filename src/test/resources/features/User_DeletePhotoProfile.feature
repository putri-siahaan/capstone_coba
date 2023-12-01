Feature: User - Delete User Photo Profile

  As a user
  I want to delete my photo profile
  So that my photo profile is empty

  @DeletePhotoProfile @TC_AA_User_124
  Scenario: Delete User Photo Profile (TC_MA_User_124) - Verify success to delete user photo profile with valid ID
    Given User input endpoint with valid ID to delete photo profile
    When User request with the HTTP method DELETE to photo profile and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to delete photo profile and display message "User profile photo deleted successfully" in the response body


  @TC_AA_User_125
  Scenario: Delete User Photo Profile (TC_AA_User_125) - Verify failed to delete user photo profile because input invalid ID
    Given User input endpoint with invalid ID to delete photo profile
    When User request HTTP method DELETE to delete photo profile and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to delete photo profile and display error message "User not found" in the response body
