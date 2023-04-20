package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class TestPageCenter {


public SelenideElement username=$(By.id("exampleInputEmail1"));

public SelenideElement password=$(By.id("exampleInputPassword1"));

public SelenideElement SubmitButton=$(By.xpath("//*[@type='submit']"));

public SelenideElement LogoutButton=$(By.partialLinkText("Logout"));
//--------------------------------------------------------------------------------------------------
  //lOCATING CHECKBOX
    public  SelenideElement checkbox1=$(By.id("box1"));
    public SelenideElement  checkbox2=$(By.id("box2"));
    public SelenideElement  CheckBoxes=$(By.xpath("//*[text()='Checkboxes']"));
    public SelenideElement  red=$(By.id("red"));
    public SelenideElement  yellow=$(By.id("yellow"));
    public SelenideElement  basketball=$(By.id("basketball"));
    public SelenideElement  hockey=$(By.id("hockey"));



}



