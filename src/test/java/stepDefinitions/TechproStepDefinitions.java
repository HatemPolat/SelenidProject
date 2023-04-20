package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TestPageCenter;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TechproStepDefinitions {
    TestPageCenter testPageCenter =new TestPageCenter();
    @Given("I get the title of the current page verify if it contains {string}")
    public void i_get_the_title_of_the_current_page_verify_if_it_contains(String string) {
        //boolean isTrue=title().contains(string);

        Assert.assertTrue(title().contains(string));


    }
    @Given("I enter  checkboxes menu")
    public void i_enter_checkboxes_menu() {
       testPageCenter.CheckBoxes.click();
    }
    @Given("I click on {string} if not already selected")
    public void i_click_on_if_not_already_selected(String string) {

        if(string.equals("Checkbox 1")&& !testPageCenter.checkbox1.isSelected()){
            testPageCenter.checkbox1.click();
            testPageCenter.checkbox1.shouldBe(checked);
        } if (string.equals("Checkbox 2")&& !testPageCenter.checkbox2.isSelected()){
            testPageCenter.checkbox2.click();
            testPageCenter.checkbox2.shouldBe(checked);
        }
        if (string.equals("Red") && !testPageCenter.red.isSelected()){
            testPageCenter.red.shouldNotBe(checked);
            testPageCenter.red.click();
            testPageCenter.red.shouldBe(checked);

        }if (string.equals("Yellow") && !testPageCenter.red.isSelected()){
            testPageCenter.yellow.click();
            testPageCenter.yellow.shouldBe(checked);

        }if (string.equals("Basketball") && !testPageCenter.basketball.isSelected()){
            testPageCenter.basketball.click();
            testPageCenter.basketball.shouldBe(checked);

    }if (string.equals("Hockey") && !testPageCenter.hockey.isSelected()){
            testPageCenter.hockey.click();
            testPageCenter.hockey.shouldBe(checked);

}
    }}
