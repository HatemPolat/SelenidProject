package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.JQueryPage;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.switchTo;

public class jqueryStrepDefinitions {
    JQueryPage jQueryPage=new JQueryPage();
    @And("kullanici source elementi target elementine surukler")
    public void kullaniciSourceElementiTargetElementineSurukler() {
        actions()
                .dragAndDrop(jQueryPage.draggable,jQueryPage.Droppable).build().perform();
    }

    @And("kullanici source elementini {int} by {int} a surukler surukler")
    public void kullaniciSourceElementiniByASuruklerSurukler(int arg0, int arg1) {
        actions()
                .dragAndDropBy(jQueryPage.draggable,arg0,arg1).build().perform();

    }

    @And("Verilen Koordinatlara {int} by {int} a suruklendigini dogrulayiniz.")
    public void verilenKoordinatlaraByASuruklendiginiDogrulayiniz(int arg0, int arg1) {
        String atr=jQueryPage.draggable.getAttribute("style");
        System.out.println("atr = " + atr);
        Assert.assertTrue(atr.contains(String.valueOf(arg0)) && atr.contains((String.valueOf(arg1))));
    }
}
