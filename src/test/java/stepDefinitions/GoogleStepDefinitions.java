package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefinitions {
    @Given("I navigate to {string}")
    public void _navigate_to(String string) {
open(string);
sleep(10000);
    }
    @Given("I wait for {int} seconds")
    public void i_wait_for_seconds(Integer int1) {
       sleep(int1*1000);
    }
    @Given("I navigate back")
    public void i_navigate_back() {
        back();

    }
    @Given("I navigate forward")
    public void i_navigate_forward() {
       forward();
    }
    @Given("I navigate refresh the Page")
    public void i_navigate_refresh_the_page() {
   refresh();
    }
    @Then("I hold the browser open")
    public void i_hold_the_browser_open() {

    }


}
