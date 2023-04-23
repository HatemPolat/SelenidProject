package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class JQueryPage {

    public   SelenideElement draggable=$("#draggable");
    public   SelenideElement Droppable=$("#droppable");
    public   SelenideElement frame2=$(By.xpath("//*[@class='demo-frame']"));

}
