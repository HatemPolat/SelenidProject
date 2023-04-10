@assertions2

Feature:Assertions2
  Scenario:  TC01_Verify for tesla
    Given    I navigate to "https://www.google.com"
    And      I search for "Tesla"
    And     verify the result should contain "Tesla"
    Then      verify the result should contain "About" keyword
