package stepDefinitions;

import com.codeborne.selenide.conditions.webdriver.Title;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TechproStepDefinitions {
    @Given("I get the title of the current page verify if it contains {string}")
    public void i_get_the_title_of_the_current_page_verify_if_it_contains(String string) {
        //boolean isTrue=title().contains(string);

        Assert.assertTrue(title().contains(string));


    }

}
