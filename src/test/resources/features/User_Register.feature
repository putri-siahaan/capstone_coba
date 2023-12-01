Feature: User - Register

  As a user
  I want to register
  So that I will hava a account to login to Destimate

  @Register @TC_AA_User_1
  Scenario: Register (TC_AA_User_1) - Verify success to create new account with valid endpoint and valid request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input valid name, username, password, confirmation password, email, and phone number in the request body and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to create new account and display message "User created successfully, Please check your email to verify your account" in the response body


  @TC_AA_User_2
  Scenario: Register (TC_AA_User_2) - Verify failed to create new account because the registered account username already exists
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input username already exists in the request body and click Send Button
    And User receive a response with status code 409 Conflict
    Then Validate failed to create account because username already exists and display error message "Username already exists" in the response body


  @TC_AA_User_3
  Scenario: Register (TC_AA_User_3) - Verify failed to create new account because the registered account email already exists
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input email already exists in the request body and click Send Button
    And User receive a response with status code 409 Conflict
    Then Validate failed to create new account because email already exists and display error message "Email already exists" in the response body


  @TC_AA_User_4
  Scenario: Register (TC_AA_User_4) - Verify failed to create new account because the registered account phone number already exists
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input phone number already exists in the request body and click Send Button
    And User receive a response with status code 409 Conflict
    Then Validate failed to create a new account and display error message "Phone number already exists" in the response body


  @TC_AA_User_5
  Scenario: Register (TC_AA_User_5) - Verify failed to create new account because name is empty
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and did not input name in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create account because did not input name and display error message "Name must be at least 3 characters" in the response body


  @TC_AA_User_6
  Scenario: Register (TC_AA_User_6) - Verify failed to create new account because username is empty
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and did not input username in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create account because did not input username and display error message "Username must be at least 5 characters" in the response body


  @TC_AA_User_7
  Scenario: Register (TC_AA_User_7) - Verify failed to create new account because password is empty
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and did not input password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create account because did not input password and display error message "Password must be at least 8 characters and contain a combination of letters and numbers" in the response body


  @TC_AA_User_8
  Scenario: Register (TC_AA_User_8) - Verify failed to create new account because confirm password is empty
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and did not input confirm password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create account because did not input confirm password and display error message "Password confirmation does not match" in the response body


  @TC_AA_User_9
  Scenario: Register (TC_AA_User_9) - Verify failed to create new account because email is empty
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and did not input email in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create account user because did not input email and display error message "Invalid email format" in the response body


  @TC_AA_User_10
  Scenario: Register (TC_AA_User_10) - Verify failed to create new account because phone number is empty
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and did not input phone number in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create account because did not input phone number and display error message "Invalid phone number format" in the response body


  @TC_AA_User_11
  Scenario: Register (TC_AA_User_11) - Verify failed to create new account because input name with only space in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input name with a space in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input name with only space and display error message "Name must be at least 5 characters" in the response body


  @TC_AA_User_12
  Scenario: Register (TC_AA_User_12) - Verify failed to create new account because input username with only space in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input username with a space in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input username with only space and display error message "Username must be at least 5 characters" in the response body


  @TC_AA_User_13
  Scenario: Register (TC_AA_User_13) - Verify failed to create new account because input password with only space in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input password with a space in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input password with only space and display error message "Password must be at least 8 characters and contain a combination of letters and numbers" in the response body


  @TC_AA_User_14
  Scenario: Register (TC_AA_User_14) - Verify failed to create new account because input email with only space in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input email with a space in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input email with only space and display error message "Invalid email format" in the response body


  @TC_AA_User_15
  Scenario: Register (TC_AA_User_15) - Verify failed to create new account because input phone number with only space in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input phone number with a space in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input phone number with only space and display error message "Invalid phone number format" in the response body


  @TC_AA_User_16
  Scenario: Register (TC_AA_User_16) - Verify failed to create new account because input invalid name in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input invalid name in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input invalid name and display error message "Name must be at least 3 characters" in the response body


  @TC_AA_User_17
  Scenario: Register (TC_AA_User_17) - Verify failed to create new account because input invalid username in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input invalid username in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input invalid username and display error message "Username must be at least 5 characters" in the response body


  @TC_AA_User_18
  Scenario: Register (TC_AA_User_18) - Verify failed to create new account because input invalid password in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input invalid password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input invalid password and display error message "Password must be at least 8 characters and contain a combination of letters and numbers" in the response body


  @TC_AA_User_19
  Scenario: Register (TC_AA_User_19) - Verify failed to create new account because input invalid confirmation password in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input invalid confirmation password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input invalid confirmation password and display error message "Password confirmation does not match" in the response body


  @TC_AA_User_20
  Scenario: Register (TC_AA_User_20) - Verify failed to create new account because input invalid email in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input invalid email in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input invalid email and display error message "Invalid email format" in the response body


  @TC_AA_User_21
  Scenario: Register (TC_AA_User_21) - Verify failed to create new account because input invalid phone number with abjad in the request body
    Given User input valid endpoint to create new account
    When User request with the HTTP method POST and input invalid phone number with abjad in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to create new account user because input invalid phone number with abjad and display error message "Invalid phone number format" in the response body

