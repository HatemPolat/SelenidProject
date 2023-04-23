


Feature: actions
  @draganddrop
  Scenario: TC01 actions  drag and drop

    Given  I navigate to "https://www.jqueryui.com/droppable"
    And User switch to frame 1
    And kullanici source elementi target elementine surukler
      Then  I hold the browser open
  @draganddropBy
  Scenario: TC02 drag and drop
    Given  I navigate to "https://www.jqueryui.com/droppable"
    And User switch to frame 1
    And kullanici source elementini 463 by -19 a surukler surukler
    And Verilen Koordinatlara 463 by -19 a suruklendigini dogrulayiniz.
