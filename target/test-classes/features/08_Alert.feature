@allerts
Feature:
  Scenario: TC01 Alerts
    Given    I navigate to "https://testcenter.techproeducation.com/index.php?page=javascript-alerts"
    And      kullanici alert promt buttununa tiklar
    And      kullanici alerte "Hello" metnini yazar
    And      kullanici sonucun "Hello" icerdigini dogrular
