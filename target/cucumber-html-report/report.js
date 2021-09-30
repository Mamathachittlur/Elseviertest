$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/elsevier_test.feature");
formatter.feature({
  "line": 2,
  "name": "Verify summer dress can be added to cart",
  "description": "",
  "id": "verify-summer-dress-can-be-added-to-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Elseviertest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Add summer dress to cart and checkout",
  "description": "",
  "id": "verify-summer-dress-can-be-added-to-cart;add-summer-dress-to-cart-and-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to automation practice landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add summer dresses to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on cart to view my order summary",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on proceed to checkout on cart summary page",
  "keyword": "And "
});
formatter.match({
  "location": "shoppingSteps.navigateToAutomationPracticePage()"
});
formatter.result({
  "duration": 4968489705,
  "status": "passed"
});
formatter.match({
  "location": "shoppingSteps.addDressToCart()"
});
formatter.result({
  "duration": 18724676376,
  "status": "passed"
});
formatter.match({
  "location": "shoppingSteps.clickOnCartButton()"
});
formatter.result({
  "duration": 3076934462,
  "status": "passed"
});
formatter.match({
  "location": "shoppingSteps.proceedToCheckOutInSummaryPage()"
});
formatter.result({
  "duration": 3778852500,
  "status": "passed"
});
formatter.after({
  "duration": 747758300,
  "status": "passed"
});
});