package Practice05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P02 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() throws InterruptedException {

        //http://webdriveruniversity.com/Popup-Alerts/index.html adresine git
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");


        //javascript alertinin Click me butonuna tıkla
        driver.findElement(By.xpath("//span[@id='button1']")).click();

        //Açılır metni al
        String actualText= driver.switchTo().alert().getText();

        //Açılır metnin "I am an alert box!" olduğunu doğrula.
        String expectedText= "I am an alert box!";

        Assert.assertEquals(expectedText, actualText);

        //Açılır metne tamam de ve sekmeyi kapat
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.close();
    }
}
