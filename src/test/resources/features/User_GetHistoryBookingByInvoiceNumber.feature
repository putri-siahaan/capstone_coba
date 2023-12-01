Feature: User - Get History Booking Wisata by Invoice Number

  As a user
  I want to get history booking wisata by invoice number
  So that I can see detail of the history

  @GetHistoryBookingByInvoiceNumber @TC_AA_User_126
  Scenario: Get History Booking Wisata by Invoice Number (TC_AA_User_126) - Verify success to get history booking wisata with valid invoice number (success transaction)
    Given User input endpoint with valid Invoice number to get history booking wisata case success transaction
    When User request with the HTTP method GET to get history booking wisata case success transaction and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get history booking wisata by valid invoice number case success transaction and display detail transaction in the response body


  @TC_AA_User_127
  Scenario: Get History Booking Wisata by Invoice Number (TC_AA_User_127) - Verify success to get history booking wisata with valid invoice number (pending transaction)
    Given User input endpoint with valid Invoice number to get history booking wisata case pending transaction
    When User request with the HTTP method GET to get history booking wisata case pending transaction and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get history booking wisata by valid invoice number case pending transaction and display detail transaction in the response body


  @TC_AA_User_128
  Scenario: Get History Booking Wisata by Invoice Number (TC_AA_User_128) - Verify success to get history booking wisata with valid invoice number (cancel transaction)
    Given User input endpoint with valid Invoice number to get history booking wisata case canceled transaction
    When User request with the HTTP method GET to get history booking wisata case canceled transaction and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get history booking wisata by valid invoice number case canceled transaction and display detail transaction in the response body


  @TC_AA_User_129
  Scenario: Get History Booking Wisata by Invoice Number (TC_AA_User_129) - Verify success to get history booking wisata even though input invalid invoice number
    Given User input endpoint with invalid Invoice number to get history booking wisata
    When User request with the HTTP method GET to get history booking wisata and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get history booking wisata by invalid invoice number and display transaction detail is null in the response body
