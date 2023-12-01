Feature: User - Changes Password User Data By ID

  As a user
  I want to changes my password
  So that I can get new password of my account

  @ChangesPasswordUser @TC_AA_User_73
  Scenario: Changes Password User Data By ID  (TC_AA_User_73) - Verify success to changes password with valid ID in endpoint, valid current password and new password
    Given User input endpoint with valid ID to changes password
    When User request with the HTTP method PUT and input valid current and new password in the request body and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success changes password and display message "Password updated successfully" in the response body


  @TC_AA_User_74
  Scenario: Changes Password User Data By ID  (TC_AA_User_74) - Verify failed to changes password because input invalid user ID
    Given User input endpoint with invalid ID to changes password
    When User request HTTP method PUT and input valid current and new password in the request body and click Send Button
    And User receive a response with status code 403 Forbidden
    Then Validate failed changes password because invalid ID and display message "Access denied" in the response body


  @TC_AA_User_75
  Scenario: Changes Password User Data By ID  (TC_AA_User_75) - Verify failed to changes password because input invalid current Password
    Given User input endpoint with valid ID to changes password
    When User request HTTP method PUT and input invalid current password in the request body and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed changes password because invalid current password and display message "Incorrect current password" in the response body


  @TC_AA_User_76
  Scenario: Changes Password User Data By ID  (TC_AA_User_76) - Verify failed to changes password because input invalid new Password and confirm password which only consists of 1 character
    Given User input endpoint with valid ID to changes password
    When User request HTTP method PUT and input invalid new and confirm password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed changes password because invalid new password and display error message "New password must be at least 8 characters and contain a combination of letters and numbers" in the response body


  @TC_AA_User_77
  Scenario: Changes Password User Data By ID  (TC_AA_User_77) - Verify failed to changes password because input invalid confirm password (does not match the new password)
    Given User input endpoint with valid ID to changes password
    When User request HTTP method PUT and input invalid confirm password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed changes password because invalid confirm password and display error message "Confirmation password does not match the new password" in the response body


  @TC_AA_User_78
  Scenario: Changes Password User Data By ID  (TC_AA_User_78) - Verify failed to changes password because did not input current password in request body
    Given User input endpoint with valid ID to changes password
    When User request HTTP method PUT and did not input current password in the request body and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed changes password because did not input current password and display message "Incorrect current password" in the response body


  @TC_AA_User_79
  Scenario: Changes Password User Data By ID  (TC_AA_User_79) - Verify failed to changes password because did not input "new password" in request body
    Given User input endpoint with valid ID to changes password
    When User request HTTP method PUT and did not input new password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed changes password because did not input new password and display error message "New password must be at least 8 characters and contain a combination of letters and numbers" in the response body


  @TC_AA_User_80
  Scenario: Changes Password User Data By ID  (TC_AA_User_80) - Verify failed to changes password because did not input "confirm password" in request body
    Given User input endpoint with valid ID to changes password
    When User request HTTP method PUT and did not input confirm password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed changes password because did not input confirm password and display error message "Confirmation password does not match the new password" in the response body
