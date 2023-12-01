Feature: User - Get User Notification When Payment is Successful

  As a user
  I want to get notification success payment
  So that I can confirm that the payment has been made successfully

  @GetUserNotification @TC_AA_User_106
  Scenario: Get User Notification (TC_AA_User_106) - Verify success to get notification when payment is successful
    Given User input valid endpoint to get notification when payment is successful
    When User request with HTTP method GET to get the notification with authorization and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get notification and display all notification messages in the response body


  @TC_AA_User_107
  Scenario: Get User Notification (TC_AA_User_107) - Verify failed to get notification because without authorization
    Given User input valid endpoint to get notification when payment is successful
    When User request with GET HTTP method to get the notification without authorization and click Send Button
    And User receive a response with status code 401 Unauthorized
    Then Validate failed to get notification and display error message "Authorization token is missing" in the response body


  @TC_AA_User_108
  Scenario: Get User Notification (TC_AA_User_108) - Verify failed to get notification because input invalid endpoint but with authorization
    Given User input invalid endpoint to get notification when payment is successful
    When User request with GET HTTP method to get notification with authorization and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get notification because invalid endpoint and display error message "Invalid user ID" in the response body
