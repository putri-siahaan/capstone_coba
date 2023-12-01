Feature: User - Get All Data By Searching

  As a user
  I want to get all data with searching
  So that it will be easy for me to find what I want to search

  @GetDataBySearching
  @GetWisataSearching @TC_AA_User_96
  Scenario: Get Wisata Data by Searching the Title (TC_AA_User_96) - Verify success to get wisata data by title with input the title that has the results
    Given User input valid endpoint to get wisata data by searching the title
    When User request with HTTP method GET and input title that has the result in to the params and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get wisata data by title and display detail wisata  in the response body


  @TC_AA_User_97
  Scenario: Get Wisata Data by Searching the Title (TC_AA_User_97) - Verify failed to get wisata data by title because the title searched will not have results
    Given User input valid endpoint to get wisata data even though the title searched will not have results
    When User request with GET HTTP method and input title where the title that doesn't exis and click Send Button
    And User receive a response with status code 200 OK
    Then Validate failed to get wisata data because the search returned no results or empty data in the response body


  @TC_AA_User_98
  Scenario: Get Wisata Data by Searching the City (TC_AA_User_98) - Verify success to get wisata data by city with input the city that has the results
    Given User input valid endpoint to get wisata data by searching the city
    When User request with HTTP method GET and input the city that has the result in to the params and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get wisata data by searching the city and display detail wisata in the response body


  @TC_AA_User_99
  Scenario: Get Wisata Data by Searching the City (TC_AA_User_99) - Verify failed to get wisata data by city because the city searched will not have results
    Given User input valid endpoint to get wisata data even though the city searched will not have results
    When User request with GET HTTP method and input city where the title that doesn't exis and click Send Button
    And User receive a response with status code 200 OK
    Then Validate failed to get wisata data because the result of the search is empty in the response body


  @TC_AA_User_100
  Scenario: Get Wisata Data by Searching the Category Name (TC_AA_User_100) - Verify success to get category name with input name of category that has the results
    Given User input valid endpoint to get wisata data by searching the name of category
    When User request with HTTP method GET and input the name of category that has the result in to the params and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get wisata data by searching the name of category and display detail wisata in the response body


  @TC_AA_User_101
  Scenario: Get Wisata Data by Searching the Category Name (TC_AA_User_101) - Verify failed to get category name because search name of category will not have results
    Given User input valid endpoint to get wisata data even though the name of category searched will not have results
    When User request with GET HTTP method and input name of category where the name that doesn't exis and click Send Button
    And User receive a response with status code 200 OK
    Then Validate failed to get wisata data because the result of search name category is empty in the response body


  @GetPromoSearching @TC_AA_User_102
  Scenario: Get Promo Data by Searching Name of the promo (TC_AA_User_102) - Verify success to get data promo with input name of promo that has the results
    Given User input valid endpoint to get promo data by searching the name of promo
    When User request with HTTP method GET and input the name of promo that has the result in to the params and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get promo data by searching the name of promo and display detail promo in the response body


  @TC_AA_User_103
  Scenario: Get Promo Data by Searching Name of the Promo (TC_AA_User_103) - Verify success to get data promo even though search name of promo will not have results
    Given User input valid endpoint to get promo data even though the name of promo searched will not have results
    When User request with GET HTTP method and input name of promo where the name that doesn't exis and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get promo data where the result of search name promo is empty in the response body


  @GetCategoriesSearching @TC_AA_User_104
  Scenario: Get Category Data by Searching Name of the categories (TC_AA_User_104) - Verify success to get categories data with input category name that has the results
    Given User input valid endpoint to get category data by searching the name of categories
    When User request with HTTP method GET and input the name of categories that has the result in to the params and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get categories data by searching the name of categories and display detail category in the response body


  @TC_AA_User_105
  Scenario: Get Category Data by Searching Name of the categories (TC_AA_User_105) - Verify success to get data category even though search name of category will not have results
    Given User input valid endpoint to get category data even though the name of categories searched will not have results
    When User request with GET HTTP method and input name category where the name that doesn't exis and click Send Button
    And User receive a response with status code 200 OK
    Then Validate success to get category data where the result of search name category is empty in the response body
