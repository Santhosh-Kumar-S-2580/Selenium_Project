Feature: Search products in the Malabar Golds & Diamonds

Background: 
   Given User move to Malabar Golds & Diamonds page "https://www.malabargoldanddiamonds.com/"
 
   @SearchProduct
   Scenario: Search Functionality of the Malabar Golds
    When user Enter  the Search Term as "Ring"
    When Verify User Navigated to Search Result Page and product is displayed
    When Display the search products Details in the console
    And  User Select filter as ProductType and ProductPrice
    Then Verify the product is displayed and Display the search products Details after Selecting the filter in the console
    
