Feature: User - Check Price, Detail of Total Discount, and Total Price

  As a user
  I want to check price and discount of the destination
  So that I can estimate the price I will pay to visit a destination

  @CheckTotalPrice @TC_AA_User_58
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_58) - Verify success to check Price and discount details with valid endpoint and request body
    Given User input valid endpoint to check price
    When User request with HTTP method POST with valid request body to check price and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to check price and display total price after calculate discount in the response body


  @TC_AA_User_59
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_59) - Verify failed to check Price and discount details because input invalid wisata ID in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method with invalid wisata ID to check price and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to check price because invalid wisata ID and display error message "Wisata not found" in the response body


  @TC_AA_User_60
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_60) - Verify failed to check Price and discount details because input invalid "use_all_points" in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method with invalid use all points to check price and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to check price because invalid use all points and display error message "code=400, message=Unmarshal type error: expected=bool, got=number, field=use_all_points, offset=49, internal=json: cannot unmarshal number into Go struct field .use_all_points of type bool" in the response body


  @TC_AA_User_61
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_61) - Verify failed to check Price and discount details because input invalid "kode_voucher" in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method with invalid kode voucher to check price and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to check price because invalid kode voucher and display error message "Invalid kode voucher" in the response body


  @TC_AA_User_62
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_62) - Verify failed to check Price and discount details because input invalid "quantity" where the amount is 0 in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method with invalid quantity to check price and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to check price because invalid quantity and display error message "Quantity must be greater than 0" in the response body


  @TC_AA_User_63
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_63) - Verify failed to check Price and discount details because input invalid "checking booking" where booking tickets in the past in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method with invalid checking booking to check price and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to check price because input invalid checking booking and display error message "Checkin date must be today or later" in the response body


  @TC_AA_User_64
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_64) - Verify failed to check Price and discount details because did not input wisata ID in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method but in the request body did not input wisata ID to check price and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to check price because did not input wisata ID and display error message "Wisata not found" in the response body


  @TC_AA_User_65
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_65) - Verify success to check Price and discount details even though the "use_all_points" field is empty in request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method but in the request body did not input use all points to check price and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to check price even though did not input use all points and display total price after calculate discount in the response body


  @TC_AA_User_66
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_66) - Verify success to check Price and discount details even though the "kode_voucher" field is empty in request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method but in the request body did not input kode voucher to check price and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to check price even though did not input kode voucher and display total price after calculate discount in the response body


  @TC_AA_User_67
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_67) - Verify failed to check Price and discount details ticket because did not input quantity in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method but in the request body did not input quantity to check price and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to check price because did not input quantity and display error message "Quantity must be greater than 0" in the response body


  @TC_AA_User_68
  Scenario: Check Price, Detail of Total Discount, and Total Price (TC_AA_User_68) - Verify failed to check Price and discount details ticket because did not input checking booking in the request body
    Given User input valid endpoint to check price
    When User request with POST HTTP method but in the request body did not input checking booking to check price and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to check price because did not input checking booking and display error message "Invalid checkin_booking date format" in the response body
