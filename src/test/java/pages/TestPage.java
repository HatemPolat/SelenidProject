package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class TestPage {


public SelenideElement username=$(By.id("exampleInputEmail1"));

public SelenideElement password=$(By.id("exampleInputPassword1"));

public SelenideElement SubmitButton=$(By.xpath("//*[@type='submit']"));

public SelenideElement LogoutButton=$(By.partialLinkText("Logout"));
//--------------------------------------------------------------------------------------------------
  //lOCATING CHECKBOX
    public  SelenideElement checkbox1=$(By.id("box1"));
    public SelenideElement checkbox2=$(By.id("box2"));
    public SelenideElement CheckBoxes=$(By.xpath("//*[text()='Checkboxes']"));



}



