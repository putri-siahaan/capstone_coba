Feature: User - Get All Promo

  As a user
  I want to get all promo
  So that I can see the details of available promo

  @GetAllPromo @TC_AA_User_35
  Scenario: Get All Promo (TC_AA_User_35) - Verify success to get all promo with valid endpoint
    Given User input valid endpoint to get all promo
    When User request with HTTP method GET to get all promo and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get all wisata promo and display information detail all promo in the response body


  @TC_AA_User_36
  Scenario: Get All Promo (TC_AA_User_36) - Verify failed to get all promo because input invalid endpoint
    Given User input invalid endpoint to get all promo
    When User request with GET HTTP method to get all promo and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to get all promo and display error message "Invalid user ID" in the response body
