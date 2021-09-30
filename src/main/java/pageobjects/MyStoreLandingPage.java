package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static testdata.TestData.getBaseUrl;

public class MyStoreLandingPage extends BasePage {

    private WebElement cartButton;


    public String getExpectedUrl() {
        return getBaseUrl();
    }

    public void addSummerDressToCart()
    {
        pauseFor(1000);
        List<WebElement> products = driver.findElements(By.xpath("//*[@id='homefeatured']/li"));

        for (int i = 0; i < products.size(); i++) {
            scrollDown();
            hoverToElement(products.get(i));
            int productId = i+1;
            WebElement addToCartButton   = driver.findElement(By.xpath("//*[@id='homefeatured']/li"+"["+productId+"]"+"/div/div[2]/div[2]/a[1]"));
            waitUntilDisplayed(addToCartButton);
            addToCartButton.click();
            WebElement continueShoppingButton = driver.findElement(By.cssSelector("span[title='Close window']"));
            waitUntilDisplayed(continueShoppingButton);
            continueShoppingButton.click();
        }
    }

    public void clickOnCartButton()
    {
        cartButton = driver.findElement(By.cssSelector("a[title='View my shopping cart']"));
        waitUntilDisplayed(cartButton);
        cartButton.click();
        pauseFor(1000);
    }

}
