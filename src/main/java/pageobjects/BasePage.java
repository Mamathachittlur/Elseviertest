package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;

public abstract class BasePage extends LoadableComponent {

    WebDriver driver = Driver.getDriver();
    public abstract String getExpectedUrl();

    protected void load() {
        loadPage();
    }

    protected void isLoaded() throws Error {
        loadPage();
    }

    public void loadPage()
    {
        driver.get(getExpectedUrl());
        driver.manage().window().maximize();
    }

    protected void pauseFor(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {}
    }

    public void waitUntilDisplayed( final WebElement webElement ) throws TimeoutException
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void scrollDown( )
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");
    }

    public void hoverToElement(WebElement elem)
    {
        Actions action= new Actions(driver);
        action.moveToElement(elem).perform();
        pauseFor(1000);
    }
}
