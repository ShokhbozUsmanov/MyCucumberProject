Feature: Wikipedia Search Functionality and verifications

  Scenario: Wikipedia Search Functionality and verifications
    Given user is on the Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user click wiki search button
    Then user sees "Steve Jobs" is in the wiki title