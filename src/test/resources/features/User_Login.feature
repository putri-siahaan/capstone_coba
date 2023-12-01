Feature: User - Login

  As a user
  I want to login
  So that I can go to the Destimate dashboard

  @Login @TC_AA_User_22
  Scenario: Login (TC_AA_User_22) - Verify success to login with valid endpoint and request body
    Given User input valid endpoint to login
    When User request with the HTTP method POST and input valid username and password in the request body and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success login and display message "User login successful" in the response body


  @TC_AA_User_23
  Scenario: Login (TC_AA_User_23) - Verify failed to login because input invalid username in the request body
    Given User input valid endpoint to login
    When User request HTTP method POST and input invalid username in the request body and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed login and display message "Invalid username" in the response body


  @TC_AA_User_24
  Scenario: Login (TC_AA_User_24) - Verify failed to login because input invalid password in the request body
    Given User input valid endpoint to login
    When User request HTTP method POST and input invalid password in the request body and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed login and display error message "Invalid password" in the response body


  @TC_AA_User_25
  Scenario: Login (TC_AA_User_25) - Verify failed to login because input invalid username and password in the request body
    Given User input valid endpoint to login
    When User request HTTP method POST and input invalid username and password in the request body and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed login and display message "Invalid username" in the response body


  @TC_AA_User_26
  Scenario: Login (TC_AA_User_26) - Verify failed to login because did not input username in the request body
    Given User input valid endpoint to login
    When User request HTTP method POST and did not input username in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to login and display message "Username is required" in the response body


  @TC_AA_User_27
  Scenario: Login (TC_AA_User_27) - Verify failed to login because did not input password in the request body
    Given User input valid endpoint to login
    When User request HTTP method POST and did not input password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to login and display error message "Password is required" in the response body


  @TC_AA_User_28
  Scenario: Login (TC_AA_User_28) - Verify failed to login because did not input username and password in the request body
    Given User input valid endpoint to login
    When User request HTTP method POST and did not input username and password in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to login and display message "Username is required" in the response body

