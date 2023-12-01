Feature: User - Get Promo By ID

  As a user
  I want to get promo by ID
  So that I can see detail promo on each ID

  @GetPromoByID @TC_AA_User_37
  Scenario: Get Promo By ID (TC_AA_User_37) - Verify success to get promo with valid ID
    Given User input endpoint with valid ID to get promo
    When User request with the HTTP method GET to get data promo and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get promo by ID and display information detail promo in the response body


  @TC_AA_User_38
  Scenario: Get Promo By ID (TC_AA_User_38) - Verify failed to get promo because input invalid ID
    Given User input endpoint with invalid ID to get promo
    When User request HTTP method GET to get promo and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to get promo and display error message "Promo not found" in the response body
