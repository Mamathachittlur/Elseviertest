package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.MyStoreLandingPage;
import pageobjects.MyStoreOrderPage;

public class shoppingSteps {

    MyStoreLandingPage myStoreLandingPage = new MyStoreLandingPage();

    @Given("^I navigate to automation practice landing page$")
    public void navigateToAutomationPracticePage()
    {
        myStoreLandingPage.loadPage();
        myStoreLandingPage.getExpectedUrl();
    }
    @When("^I add summer dresses to the cart$")
    public void addDressToCart() throws InterruptedException {
        myStoreLandingPage.addSummerDressToCart();

    }

    @Then("^I click on cart to view my order summary$")
    public void clickOnCartButton()
    {
        myStoreLandingPage.clickOnCartButton();
    }

    @And("^I click on proceed to checkout on cart summary page$")
    public void proceedToCheckOutInSummaryPage()
    {
        MyStoreOrderPage myStoreOrderPage = new MyStoreOrderPage();
        myStoreOrderPage.clickOnProceedToCheckOutButton();
    }
}
