package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestPage;

public class TestStepDefinitions {

    TestPage testPage= new TestPage();

    @Given("I enter UserName")
    public void i_enter_user_name() {
        testPage.username.setValue("techproed");
            }
    @Given("I enter Password")
    public void i_enter_password() {
        testPage.password.setValue("SuperSecretPassword");



    }
    @Given("I enter submit Button")
    public void i_enter_submit_button() {
        testPage.SubmitButton.click();
    }

    @And("i enter logout")
    public void iEnterLogout() {
        testPage.LogoutButton.click();
    }
}
