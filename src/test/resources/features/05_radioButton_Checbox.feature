
@Checkbox
Feature: radioButton and Checkbox
  Scenario: TC01_ Checkboxs
    Given  I navigate to "https://testcenter.techproeducation.com/index.php?page=form-authentication"
    And    I enter UserName
    And    I enter Password
    And    I enter submit Button
    And    I enter  checkboxes menu
    And    I click on "Checkbox 1" if not already selected
    And    I click on "Checkbox 2" if not already selected
    Then   I hold the browser open


    @radio
    Scenario: Radio Buttons
      Given    I navigate to "https://testcenter.techproeducation.com/index.php?page=radio-buttons"

      And    I click on "Red" if not already selected
      And    I click on "Yellow" if not already selected
      @Football
      Scenario: Select your favorite sport
        Given    I navigate to "https://testcenter.techproeducation.com/index.php?page=radio-buttons"
        And      I

