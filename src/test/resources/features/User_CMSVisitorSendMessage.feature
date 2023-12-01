Feature: User - CMS Visitors can send Cooperation Message or Feedback without Login

  As a user
  I want to send cooperation message to admin
  So that I can cooperate with Destimate

  @CMSVisitors @TC_AA_User_112
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_112) - Verify success to send cooperation message from CSM Visitors to Admin DestiMate because input valid endpoint and request body
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and input valid request body without login in the request body and click Send Button
    And User receive a response with status code 201 Created
    Then Validate success to send cooperation message and display message "Pesan kerjasama berhasil dikirim" in the response body


  @TC_AA_User_113
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_113) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because input invalid first name
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and input invalid first name in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation message because invalid first name and display error message "nama depan harus minimal 3 huruf" in the response body


  @TC_AA_User_114
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_114) - Verify success to send cooperation message from CSM Visitors to Admin DestiMate even though input invalid last name because the last name is not required
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and input invalid last name in the request body and click Send Button
    And User receive a response with status code 201 Created
    Then Validate success to send cooperation message and display message "Pesan kerjasama berhasil dikirim" in the response body


  @TC_AA_User_115
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_115) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because input invalid email
    Given User input valid endpoint to send cooperation message
    When User request with HTTP method POST and input invalid email in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation message because invalid email and display error message "Format email tidak valid" in the response body


  @TC_AA_User_116
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_116) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because input invalid phone number with character
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and input invalid phone number with character in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation message because invalid phone number with character and display error message "Nomor telphone harus mengandung angka semua" in the response body


  @TC_AA_User_117
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_117) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because input invalid phone number when number less than 10 digits
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and input invalid phone number when les than 10 digit in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation message because invalid phone number because ess than 10 digit and display error message "Nomor telphone number kurang dari 10 digit" in the response body


  @TC_AA_User_118
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_118) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because input invalid message
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and input invalid message in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation message because invalid message and display error message "Pesan harus minimal 10 huruf" in the response body


  @TC_AA_User_119
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_119) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because did not input first name in request body
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and did not input first name in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation message because did not input first name and display error message "nama depan harus minimal 3 huruf" in the response body


  @TC_AA_User_120
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_120) - Verify success to send cooperation message from CSM Visitors to Admin DestiMate even though did not input last name in request body (the last name is not required)
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and did not input last name in the request body and click Send Button
    And User receive a response with status code 201 Created
    Then Validate success to send cooperation message and display message "Pesan kerjasama berhasil dikirim" in the response body


  @TC_AA_User_121
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_121) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because did not input email in request body
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and did not input email to send cooperation in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation message because did not input email and display error message "Format email tidak valid" in the response body


  @TC_AA_User_122
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_122) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because did not input email in request body
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and did not input phone number to send cooperation in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to end cooperation because did not input phone number to send cooperation and display error message "Nomor telphone number kurang dari 10 digit" in the response body


  @TC_AA_User_123
  Scenario: CMS Visitor Send Cooperation Message (TC_AA_User_123) - Verify failed to send cooperation message from CSM Visitors to Admin DestiMate because did not input message
    Given User input valid endpoint to send cooperation message
    When User request with the HTTP method POST and did not input message include cooperation in the request body and click Send Button
    And User receive a response with status code 400 Bad Request
    Then Validate failed to send cooperation because did not input message include cooperation and display error message "Pesan harus minimal 10 huruf" in the response body
