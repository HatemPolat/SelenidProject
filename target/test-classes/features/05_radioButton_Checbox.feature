
@Checkbox
Feature: radioButton and Checkbox
  Scenario: TC01_ Checkboxs
    Given  I navigate to "https://testcenter.techproeducation.com/index.php?page=form-authentication"
    And    I enter UserName
    And    I enter Password
    And    I enter submit Button
    And    I enter  checkboxes menu
    And    I click on "Checkbox 1" if not already selected
