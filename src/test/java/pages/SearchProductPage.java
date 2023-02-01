package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchProductPage {
    public SearchProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//i[@class='material-icons card_travel']")
    public WebElement productButton;

    @FindBy (xpath = "//*[text()='All Products']")
    public WebElement allProducts;

    @FindBy (xpath = "//*[@id='search_product']")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@id='submit_search']")
    public WebElement searchButton;

    @FindBy (xpath = "//*[text()='Searched Products']")
    public WebElement searchResults;

    @FindBy (xpath = "//i[@class='fa fa-plus-square']")
    public WebElement viewProduct;

    @FindBy (xpath = "(//h2)[3]")
    public WebElement blueTop;

}
