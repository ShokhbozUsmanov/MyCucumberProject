@smoke @Regression
Feature: Library app login feature
  User Story: hello
  Background: For the scenario in the future file, user is expected to be on login page
    Given user is on the library login page

  @smoke @librarian @employee
  Scenario: Login as a librarian
    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

    @student
  Scenario: Login as a student
    Given user is on the library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard

    @admin @employee @smoke
  Scenario: Login as a admin
    Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard



