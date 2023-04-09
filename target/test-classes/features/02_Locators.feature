@locators
Feature: locators feature
  Scenario: T01_locators

    Given  I navigate to "https://testcenter.techproeducation.com/index.php?page=form-authentication"
    And    I enter UserName
    And    I enter Password
    And    I enter submit Button
    And    i enter logout
    Then  I hold the browser open
