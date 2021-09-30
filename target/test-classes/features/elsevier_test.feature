@Elseviertest
Feature: Verify summer dress can be added to cart

  Scenario: Add summer dress to cart and checkout

    Given I navigate to automation practice landing page
    When  I add summer dresses to the cart
    Then  I click on cart to view my order summary
    And I click on proceed to checkout on cart summary page
