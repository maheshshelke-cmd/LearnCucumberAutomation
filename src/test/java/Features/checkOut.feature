Feature: complete checkout process
 @checkout
 Scenario: search the product ,add to cart and proceed to checkout
    Given User is on the landing page
    And User serach the product with shortname tom and extracted actual name of the product
    And User select quantity as 3 and add product to cart
    Then User check tom products exist on checkout page
   	And User apply promotion and place the order

