package stepDefinitions;

import io.cucumber.java.en.Given;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleStepDefinitions {
    @Given("I navigate to {string}")
    public void _navigate_to(String string) {
open(string);
sleep(10000);
    }

}
