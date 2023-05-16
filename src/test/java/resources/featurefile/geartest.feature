Feature: GearTest
  As a user I want to verify Gear Page
  @sanity @regression
  Scenario: I should Add Product Successfully to shopping cart
    Given I am on homepage
    When I mouse hover on Gear MenU
    And I click on Bags
    And I click on Product Name Overnight duffle
    And message verify the text "Overnight Duffle"
    And I update the QTY "3"
    And I click on ADD to Cart Button
    And verify the text "You added Overnight Duffle to your shopping cart."
    And I click on Shopping Cart link
    And I verify text "Overnight Duffle"
    And I verify the quantity "3"
    And I  product price "$135.00"
    And I update the quantity "5"
    And I click on update shopping cart button
    And I verify the product Price "$225.00"
    Then I should be able to add product on cart successfully