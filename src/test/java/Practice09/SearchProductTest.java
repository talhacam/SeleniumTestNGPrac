package Practice09;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProductPage;
import utilities.Driver;

public class SearchProductTest {

    // https://www.automationexercise.com/ git
    // Anasayfanın görülür olduğunu doğrula
    // ürünler butonuna tıkla
    // Kullanıcının Tüm Ürünler sayfasına başarıyla gittiğini doğrula
    //Arama girişine ürün adını girin ve ara düğmesine tıklayın
    //Aranan ürünler'in görülür olduğunu doğrula
    // Aramayla ilgili ürünün (blue top) görünür olduğunu doğrula.

    SearchProductPage searchProductPage;

    @Test
    public void searchProductPage() {
        Driver.getDriver().get("https://www.automationexercise.com/");

        // Anasayfanın görülür olduğunu doğrula
        String homeUrl= "https://www.automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), homeUrl);

        // Products butonuna tıkla
        searchProductPage= new SearchProductPage();
        searchProductPage.productButton.click();

        // Kullanıcının All Products sayfasına başarıyla gittiğini doğrula
        Assert.assertTrue(searchProductPage.allProducts.isDisplayed());

        //Arama girişine "Blue top" girin ve ara düğmesine tıklayın.
        searchProductPage.searchBox.sendKeys("blue top");
        searchProductPage.searchButton.click();

        //Aranan ürünler'in görülür olduğunu doğrula
        Assert.assertTrue(searchProductPage.searchResults.isDisplayed());

        // Aramayla ilgili ürünün (blue top) görünür olduğunu doğrula.
        searchProductPage.viewProduct.click();
        Assert.assertTrue(searchProductPage.blueTop.isDisplayed());











    }
}
