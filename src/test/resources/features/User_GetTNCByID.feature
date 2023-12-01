Feature: User - Get Terms and Conditions Data By ID

  As a user
  I want to get terms and conditions data by ID
  So that I know what requirements are needed for this platform

  @GetUserNotification @TC_AA_User_136
  Scenario: Get Terms and Conditions Data By ID (TC_AA_User_136) - Verify success to get terms and Conditions Data with valid ID and authorization
    Given User input endpoint with valid ID to get tnc
    When User request with HTTP method GET to get tnc by ID with authorization and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get tnc by ID and display all tnc in the response body


  @TC_AA_User_137
  Scenario: Get Terms and Conditions Data By ID (TC_AA_User_137) - Verify failed to get history point user because without authorization but valid ID
    Given User input endpoint with valid ID to get tnc
    When User request with GET HTTP method to get tnc by ID without authorization and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed to get tnc by ID and display error message "Token autentikasi harus dimasukan" in the response body


  @TC_AA_User_138
  Scenario: Get Terms and Conditions Data By ID (TC_AA_User_138) - Verify failed to get history point user because input invalid ID
    Given User input endpoint with invalid ID to get tnc
    When User request with GET HTTP method to get tnc by ID with authorization and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to get tnc because invalid ID and display error message "Term Condition tidak ditemukan" in the response body
