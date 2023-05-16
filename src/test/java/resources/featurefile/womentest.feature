Feature: WomenTest
  As a user I want to verify sort By filter of women_jacket page.
  @smoke @regression
  Scenario Outline: Verify the sort By productName filter
    Given I am on homepage
    When I mouse hover on Women menu
    And  I mouse hover on Tops
    And  I click on Jackets
    And  I select sort By filter "<filter>"
    Then Products names displayed in Alphabetical Order
    Examples:
      | filter   |
      | Product Name |

  @sanity @regression
  Scenario: Verify the sort By price filter
    Given I am on homepage
    When I mouse hover on Women menu
    And  I mouse hover on Tops
    And  I click on Jackets
    And  I select sort By filter "Price"
    Then Products price displayed in Low to High order