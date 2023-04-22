package pages;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.CssClass;
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

    //DropDownElements
    public SelenideElement  simpledropDown=$(By.id("dropdown"));
    public SelenideElement  year=$(By.id("year"));
    public SelenideElement  month=$(By.id("month"));
    public SelenideElement  day=$(By.id("day"));
    public SelenideElement  stateselection=$(By.id("state"));

    //Alerts

    public SelenideElement  alertjspromt=$(By.xpath("(//*[@class='btn btn-primary'])[3]"));
    public SelenideElement  sonuc=$("#result");

    //frame

    public  SelenideElement techproedulink=$(By.xpath("//a[@type='button']"));




}



