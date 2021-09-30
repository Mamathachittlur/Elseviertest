package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static testdata.TestData.getBaseUrl;

public class MyStoreOrderPage extends BasePage{

      public String getExpectedUrl()
      {
        return getBaseUrl() + "/index.php?controller=order";
      }


    public void clickOnProceedToCheckOutButton()
    {
      //  scrollDown();
        WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]"));
        waitUntilDisplayed(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
    }
}
