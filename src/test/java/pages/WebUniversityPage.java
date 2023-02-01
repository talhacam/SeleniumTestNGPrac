package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//input[@type='text']")
    public WebElement todoBox;

    @FindBy (xpath = "//li")
    public List<WebElement> todosWebElements;

    @FindBy (xpath = "//i[@class='fa fa-trash']")
    public List<WebElement> deleteButtons;

    @FindBy (xpath = "//li")
    public List<WebElement> newTodosWebElements;


}
