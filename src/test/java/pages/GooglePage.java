package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GooglePage {

    public SelenideElement googleSearchbox=$(By.name("q"));
    public SelenideElement resultSection =$(By.id("result-stats"));






}
