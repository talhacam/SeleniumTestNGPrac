package Practice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuTestPage;
import utilities.Driver;

import java.util.List;

public class P01_ClickStyles {

    // go to the https://testpages.herokuapp.com/styled/events/javascript-events.html
    // Click all the buttons and verify they are all clicked

    HerokuTestPage herokuTestPage;
    Actions actions= new Actions(Driver.getDriver());


    @Test
    public void test01() {
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        herokuTestPage = new HerokuTestPage();

        /*
        kodlarımızı yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        ayrı bir object creat etmek yerine bu objecti class seviyesinde instance olarak create edip test methodlarında
        buna değer atamak ve kullanmak daha uygun bir yöntemdir.
         */

        herokuTestPage.onblur.click();
        herokuTestPage.onclick.click();
        herokuTestPage.onclick.click();

        actions.contextClick(herokuTestPage.contextMenu).
                doubleClick(herokuTestPage.onDoubleClick).
                click(herokuTestPage.onFocus).
                click(herokuTestPage.keyDown).sendKeys(Keys.ENTER).
                click(herokuTestPage.keyUp).sendKeys(Keys.ENTER).
                click(herokuTestPage.keyPress).sendKeys(Keys.ENTER).
                moveToElement(herokuTestPage.mouseOver).     //Mousela sadece üzerine geldik tıklamadık
                moveToElement(herokuTestPage.mouseLeave).moveToElement(herokuTestPage.mouseOver). //Önce mousela üzerine gittik sonra mouse'u başka bir yere hareket ettirdik.
                click(herokuTestPage.mouseDown).perform();




    }

    @Test (dependsOnMethods = "test01")
    public void test02() {

        List <WebElement> clicked= herokuTestPage.eventTriggered;
        Assert.assertEquals (clicked.size(), 11);

    }
}
