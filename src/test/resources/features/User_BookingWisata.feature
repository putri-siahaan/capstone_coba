Feature: User - Booking Wisata

  As a user
  I want to booking wisata
  So that I got an entry ticket

  @BookingWisata @TC_AA_User_47
  Scenario: Booking Wisata (TC_AA_User_47) - Verify success to booking wisata because input valid endpoint and request body
    Given User input valid endpoint to booking wisata
    When User request with HTTP method POST with valid request body to booking wisata and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to booking wisata and display detail data transaction in the response body


  @TC_AA_User_48
  Scenario: Booking Wisata (TC_AA_User_48) - Verify failed to booking wisata because input invalid wisata ID in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method with invalid wisata ID to booking wisata and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to booking wisata and display error message "Wisata not found" in the response body


  @TC_AA_User_49
  Scenario: Booking Wisata (TC_AA_User_49) - Verify failed to booking wisata because input invalid "use_all_points" in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method with invalid use all points to booking wisata and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to booking wisata because invalid use all points and display error message "code=400, message=Unmarshal type error: expected=bool, got=number, field=use_all_points, offset=48, internal=json: cannot unmarshal number into Go struct field .use_all_points of type bool" in the response body


  @TC_AA_User_50
  Scenario: Booking Wisata (TC_AA_User_50) - Verify failed to booking wisata because input invalid "kode_voucher" in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method with invalid kode voucher to booking wisata and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to booking wisata because invalid kode voucher and display error message "Invalid kode voucher" in the response body


  @TC_AA_User_51
  Scenario: Booking Wisata (TC_AA_User_51) - Verify failed to booking wisata because input invalid "quantity" where the amount is 0 in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method with invalid quantity to booking wisata and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to booking wisata because invalid quantity and display error message "Quantity must be greater than 0" in the response body


  @TC_AA_User_52
  Scenario: Booking Wisata (TC_AA_User_52) - Verify failed to booking wisata ticket because input invalid "checking booking" where booking tickets in the past in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method with invalid checking booking to booking wisata and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to booking wisata because invalid checking booking and display error message "Checkin date must be today or later" in the response body


  @TC_AA_User_53
  Scenario: Booking Wisata (TC_AA_User_53) - Verify failed to booking wisata ticket because did not input wisata ID in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method but in the request body did not input wisata ID and click Send Button
    And User receive a response with status code 404 Not Found
    Then Validate failed to booking wisata because did not input wisata ID and display error message "Wisata not found" in the response body


  @TC_AA_User_54
  Scenario: Booking Wisata (TC_AA_User_54) - Verify success to booking wisata even though the "use_all_points" field is empty in request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method but in the request body did not input use all points and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to booking wisata even though did not input use all points and display detail data transaction in the response body


  @TC_AA_User_55
  Scenario: Booking Wisata (TC_AA_User_55) - Verify success to booking wisata even though the "kode_voucher" field is empty in request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method but in the request body did not input kode voucher and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to booking wisata even though did not input kode voucher and display detail data transaction in the response body


  @TC_AA_User_56
  Scenario: Booking Wisata (TC_AA_User_56) - Verify failed to booking wisata ticket because did not input quantity in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method but in the request body did not input quantity and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to booking wisata because did not input quantity and display error message "Quantity must be greater than 0" in the response body


  @TC_AA_User_57
  Scenario: Booking Wisata (TC_AA_User_57) - Verify failed to booking wisata ticket because did not input checking booking in the request body
    Given User input valid endpoint to booking wisata
    When User request with POST HTTP method but in the request body did not input checking booking and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to booking wisata because did not input checking booking and display error message "Invalid checkin_booking date format" in the response body
