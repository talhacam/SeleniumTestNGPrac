package Practice06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

public class P01 {
    // Go to Url http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country


    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtmlgoodiesPage= new DhtmlgoodiesPage();
        Actions actions= new Actions(Driver.getDriver());

        /*
        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.usa).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).perform();

         */


        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).
                dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).
                dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).
                dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.usa).
                dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).
                dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).
                dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).perform();

        Thread.sleep(3000);
        Driver.closeDriver();


    }
}
