package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestPageCenter;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;
import  static  java.lang.Thread.sleep;


public class TestStepDefinitions {

    TestPageCenter testPageCenter = new TestPageCenter();

    @Given("I enter UserName")
    public void i_enter_user_name() {
        testPageCenter.username.setValue("techproed");
            }
    @Given("I enter Password")
    public void i_enter_password() {
        testPageCenter.password.setValue("SuperSecretPassword");



    }
    @Given("I enter submit Button")
    public void i_enter_submit_button() {
        testPageCenter.SubmitButton.click();
    }

    @And("i enter logout")
    public void iEnterLogout() {
        testPageCenter.LogoutButton.click();
    }

    @And("user select as years {int},as mounth {string},as day {int}")
    public void userSelectAsYearsAsMounthAsDay(int year, String month, int day) throws InterruptedException {
        testPageCenter.year.selectOption(String.valueOf(2000));

       // testPageCenter.month.selectOption(String.valueOf(month));
        testPageCenter.month.selectOption(month);
          testPageCenter.day.selectOption(String.valueOf(15));


    }

    @And("kullanici alert promt buttununa tiklar")
    public void kullaniciAlertPromtButtununaTiklar() {
       testPageCenter.alertjspromt.click();

    }

    @And("kullanici alerte {string} metnini yazar")
    public void kullaniciAlerteMetniniYazar(String arg0) throws InterruptedException {
        switchTo().alert().sendKeys(arg0);
  Thread.sleep(3000);
        switchTo().alert().accept();
        Thread.sleep(3000);


    }

    @And("kullanici sonucun {string} icerdigini dogrular")
    public void kullaniciSonucunIcerdiginiDogrular(String yazi) {
        testPageCenter.sonuc.shouldHave(Condition.text(yazi));

    }
}
