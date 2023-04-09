@navigations

Feature: Navigations

  Scenario: navigations test
    Given I navigate to "https://www.google.com"
    And I navigate to "http://www.amazon.com"
    And I wait for 5 seconds
    And I navigate back
    And  I navigate forward
    And I navigate refresh the Page
    # Then  I hold the browser open
