package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeMethodAfterMethod {
    protected WebDriver driver;
    protected Actions actions;
    protected String tarih;


    @BeforeMethod (groups = "gp1")
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions = new Actions(driver);

        LocalDateTime date= LocalDateTime.now();
        DateTimeFormatter formater= DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih= date.format(formater);
    }
    @AfterMethod (groups = "gp1")
    public void tearDown(){
        //driver.quit();
    }
}
