
@tag
Feature: Add to Cart
  This feature will test functionality of adding different products to the user basket from different flow

    Background: User is Logged in
  Scenario: Search a product and add the first result/to User basket 
    Given User searched for Lenovo laptop
  
  	When Add the first laptop that appears in the search result to the basket
  	Then User basket should display 1 item
  