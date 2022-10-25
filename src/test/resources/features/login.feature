Feature: Library app login feature
  Scenario: Login as a librarian
    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard


