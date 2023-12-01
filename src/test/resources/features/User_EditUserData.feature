Feature: User - Edit User Data By ID

  As a user
  I want to edit my profile
  So that I can update my account

  @EditUserData @TC_AA_User_83
  Scenario: Edit User Data By ID (TC_AA_User_83) - Verify success to edit user data with valid ID in endpoint and request body
    Given User input endpoint with valid user ID to edit user data
    When User request with the HTTP method PUT and input valid name, category favorite and profile image in the request body and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success edit user data and display message "User updated successfully" in the response body


  @TC_AA_User_84
  Scenario: Edit User Data By ID (TC_AA_User_84) - Verify failed to edit user data because input invalid user ID
    Given User input endpoint with invalid ID to edit user data
    When User request HTTP method PUT and input valid name, category favorite and profile image in the request body and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed edit user data because invalid ID and display message "Unauthorized to edit this user" in the response body


  @TC_AA_User_85
  Scenario: Edit User Data By ID (TC_AA_User_85) - Verify failed to edit user data because input invalid name which only consists of 1 character
    Given User input endpoint with valid user ID to edit user data
    When User request HTTP method PUT and input invalid name in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed edit user data because invalid name and display message "Name should be at least 3 characters" in the response body


  @TC_AA_User_86
  Scenario: Edit User Data By ID (TC_AA_User_86) - Verify failed to edit user data because input invalid username which only consists of 1 character
    Given User input endpoint with valid user ID to edit user data
    When User request HTTP method PUT and input invalid username in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed edit user data because invalid username and display error message "Username should be at least 5 characters" in the response body


  @TC_AA_User_87
  Scenario: Edit User Data By ID (TC_AA_User_87) - Verify failed to edit user data because input invalid email which did not match the format
    Given User input endpoint with valid user ID to edit user data
    When User request HTTP method PUT and input invalid email in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed edit user data because invalid email and display error message "Invalid email format" in the response body


  @TC_AA_User_88
  Scenario: Edit User Data By ID (TC_AA_User_88) - Verify failed to edit user data because input invalid phone number which did not match the format
    Given User input endpoint with valid user ID to edit user data
    When User request HTTP method PUT and input invalid phone number in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed edit user data because invalid phone number and display message "Invalid phone number format" in the response body


  @TC_AA_User_89
  Scenario: Edit User Data By ID (TC_AA_User_89) - Verify failed to edit user data because upload profile image that do not match the format
    Given User input endpoint with valid user ID to edit user data
    When User request HTTP method PUT and input invalid format profile image in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed edit user data because input invalid format profile image and display error message "Invalid image format" in the response body


  @TC_AA_User_90
  Scenario: Edit User Data By ID (TC_AA_User_90) - Verify failed to edit user data because input invalid category favorite where category data does not exist
    Given User input endpoint with valid user ID to edit user data
    When User request HTTP method PUT and input invalid category favorite in the request body and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed edit user data because input invalid category favorite and display error message "Category not found" in the response body
