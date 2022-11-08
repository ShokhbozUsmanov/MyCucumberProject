Feature: User should be able to login

  Background:
    Given user is on the login page of web table app

  @webTableApp
  Scenario: Login scenario with 1 param
    When user enters username "Test"
    And user enter password "Tester"
    And user clicks to login button
    Then user should see url contains orders

