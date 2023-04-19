package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestPageCenter;

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
}
