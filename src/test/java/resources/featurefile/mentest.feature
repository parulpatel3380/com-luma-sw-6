Feature: MenTest
  As a user I want to verfiy men page
  @regression @sanity
  Scenario: I should Add Product Successfully to the shopping cart
    Given I am on homepage
    When I mouse hover on men menu
    And I mouse hover on Bottoms
    And I click on Pants
    And I mouse hover on Cronus Yoga Pant
    And I click on size
    And I click on color black
    And I click on Add to Cart
    And Message displayed on page is "You added Cronus Yoga Pant to your shopping cart."
    And I click on Shopping Cart
    And The text displayed on page "Shopping Cart"
    And the product name displayed "Cronus Yoga Pant"
    And Product size is displayed "32"
    And Product color is displayed "Black"
    Then I should be able product to shopping cart successfully