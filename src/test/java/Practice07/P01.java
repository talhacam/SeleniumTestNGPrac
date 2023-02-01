package Practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    // http://webdriveruniversity.com/To-Do-List/index.html git
    // todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenium çalış, uyu)
    //Tüm yapılacakların üzerini çiz
    //Tüm yapılacakları sil
    //Tüm yapılacakların silindiğini doğrula.


    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        WebUniversityPage webUniversityPage= new WebUniversityPage();

        /*
        webUniversityPage.todoBox.sendKeys("Kahvaltıyı hazırla", Keys.ENTER);
        webUniversityPage.todoBox.sendKeys("Bulaşıkları yıka", Keys.ENTER);
        webUniversityPage.todoBox.sendKeys("Bebekle ilgilen", Keys.ENTER);
        webUniversityPage.todoBox.sendKeys("Çocuğunun ödevine yardım et", Keys.ENTER);
        webUniversityPage.todoBox.sendKeys("Selenium çalış", Keys.ENTER);
        webUniversityPage.todoBox.sendKeys("Uyu", Keys.ENTER);
         */

        List<String> workList = new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla", "Bulaşıkları yıka","Bebekle ilgilen", "Çocuğunun ödevine yardım et", "Selenium çalış","Uyu"));
        Actions actions= new Actions(Driver.getDriver());

        for (String w: workList) {
            actions.click(webUniversityPage.todoBox).sendKeys(w).sendKeys(Keys.ENTER).perform();

        }
        List<WebElement> todos= webUniversityPage.todosWebElements;
        for (WebElement w: todos) {
            w.click();

        }

        List<WebElement> delete= webUniversityPage.deleteButtons;
        for (WebElement w: delete) {
            w.click();

        }

        Thread.sleep(3000);  //Driver çok hızlı olduğu için elementler silinmeden test sona eriyordu ve sonuç fail oluyordu. Thread.sleep ile sorun çözüldü.

        List<WebElement> newTodos= webUniversityPage.newTodosWebElements;
        Assert.assertEquals(0, newTodos.size());


    }

}