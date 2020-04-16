Feature: The user check multiple user ID and pwd in facebook

  Scenario Outline: The user pass user ID and pwd in facebook page
    Given The user enter the "https://www.facebook.com"
    When the user enter userID "<Username>"
    Then the user enter pwd "<Password>"
    And the user enter the login button

    Examples: 
      | Username | Password |
      | Boobalan |    12347 |
      | Shalini  |    78906 |
