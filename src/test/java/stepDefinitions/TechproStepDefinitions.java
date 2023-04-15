package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.webdriver.Title;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TestPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TechproStepDefinitions {
    TestPage testPage=new TestPage();
    @Given("I get the title of the current page verify if it contains {string}")
    public void i_get_the_title_of_the_current_page_verify_if_it_contains(String string) {
        //boolean isTrue=title().contains(string);

        Assert.assertTrue(title().contains(string));


    }
    @Given("I enter  checkboxes menu")
    public void i_enter_checkboxes_menu() {
       testPage.CheckBoxes.click();
    }
    @Given("I click on {string} if not already selected")
    public void i_click_on_if_not_already_selected(String string) {

        if(testPage.checkbox1.isSelected()){
            testPage.checkbox1.shouldNot(checked);
            testPage.checkbox1.click();
            testPage.checkbox1.shouldBe(checked);

        }

    }

}
