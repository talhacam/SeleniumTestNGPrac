package Practice05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {

    //Go to the URL https://www.techlistic.com/p/selenium-practice-form.html
    //fill the form


    @Test
    public void test01() {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Talha");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cam");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("31.01.2023");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();


        //Choose your continent----> Antartica
        WebElement dropDownContinent = driver.findElement(By.xpath("//select[@id='continents']"));
        Select select = new Select(dropDownContinent);
        select.selectByVisibleText("Antartica");

        //driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica"); Bu da olurdu.



        //Choose your command ---> Browser Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();

        //Click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        driver.close();







    }
}
