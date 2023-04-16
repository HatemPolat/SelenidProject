package stepDefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefinitions {
    GooglePage googlePage=new GooglePage();
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

        // SITEYE GITMEK ICIN KULLANDIK
        //
        forward();
    }
    @Given("I navigate refresh the Page")
    public void i_navigate_refresh_the_page() {
   refresh();
    }
    @Then("I hold the browser open")
    public void i_hold_the_browser_open() {
        Configuration.holdBrowserOpen=true;
    }
    @Given("I search for {string}")
    public void i_search_for(String string) {
        googlePage.googleSearchbox.setValue(string).pressEnter();

    }@Then("verify the result should contain {string}")
    public void verify_the_result_should_contain(String string) {
      String pageSource =WebDriverRunner.source();
        //System.out.println(pageSource);
        Assert.assertTrue(pageSource.contains(string));
    }
    @Then("verify the result should contain {string} keyword")
    public void verify_the_result_should_contain_keyword(String string) {
   googlePage.resultSection.getText();
    }
    @Then("the firs result in the page sections should contains {string}")
    public void the_firs_result_in_the_page_sections_should_contains(String string) {

    }

}
