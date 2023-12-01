Feature: User - Cancel Ticket Booking

  As a user
  I want to cancel my ticket booking
  So that I don't need to pay for a ticket

  @CancelTicketBooking @TC_AA_User_109
  Scenario: Cancel Ticket Booking (TC_AA_User_109) - Verify success to cancel booking ticket with valid invoice_number
    Given User input endpoint with valid invoice number to cancel booking ticket
    When User request with HTTP method DELETE to cancel booking ticket and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to cancel booking ticket and display message "Ticket canceled successfully" in the response body


  @TC_AA_User_110
  Scenario: Cancel Ticket Booking (TC_AA_User_110) - Verify failed to cancel booking ticket because input invalid invoice_number
    Given User input endpoint with invalid invoice number to cancel booking ticket
    When User request with DELETE HTTP method to cancel booking ticket and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to cancel booking ticket and display error message "Ticket not found" in the response body


  @TC_AA_User_111
  Scenario: Cancel Ticket Booking (TC_AA_User_111) - Verify failed to cancel booking ticket because input invoice_number which has been canceled before
    Given User input endpoint with valid invoice number but has been canceled before
    When User request DELETE HTTP method to cancel booking ticket and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to cancel booking ticket because has been canceled before and display error message "Ticket has already been canceled" in the response body
