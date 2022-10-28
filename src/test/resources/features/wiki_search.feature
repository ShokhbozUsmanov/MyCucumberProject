Feature: Wikipedia Search Functionality and verifications
Background: user is on the Wikipedia home page
  Scenario: Wikipedia Search Functionality and verifications
    # Given user is on the Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user click wiki search button
    Then user sees "Steve Jobs" is in the wiki title

    Scenario Outline: Wikipedia Search Functionality and verifications
     # Given user is on the Wikipedia home page
      When user types "<searchValue>" in the wiki search box
      And user click wiki search button
      Then user sees "<expectedTitle>" is in the wiki title
      Examples:
        | searchValue | expectedTitle |