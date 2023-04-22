@frame
Feature: Iframe
  Scenario: TC01 Ifarme learning
    Given    I navigate to "https://testcenter.techproeducation.com/index.php?page=iframe"
    And      User switch to frame 1
    And     User click to back to techproeducation
    And     switch to window 2
    Then  I hold the browser open
