Feature: Search the products and check the 	the name
 @oneProduct
 Scenario: search the product , extract name and compre
    Given User is on the landing page
    And User serach the product with shortname tom and extracted actual name of the product
    Then User serach the same shortname tom on the offers page to check if product exist
    Then validate product name on offers page matched with landing page 

@allProduct
 Scenario Outline: search the product , extract name and compre
    Given User is on the landing page
    And User serach the product with shortname <Product Name> and extracted actual name of the product
    Then User serach the same shortname <Product Name> on the offers page to check if product exist
    Then validate product name on offers page matched with landing page 
    
    Examples:
    |Product Name|
    |str				 |
    |pot         |
    |Beet        |
  