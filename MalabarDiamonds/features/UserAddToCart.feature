Feature: Add To Cart in the Malabar Golds & Diamonds

Background: 
   Given User land to Malabar Golds & Diamonds page "https://www.malabargoldanddiamonds.com/"
 
   @AddToCart
   Scenario: Add To Cart Functionality of the Malabar Golds
    When user Login to valid credentials
    And user Enter Search Term as "Ring"
    And Verify User should be  Navigated to Search Result Page and product is displayed
    And  User can Select filter as ProductType 
    And  Display the Selected Product Name,Product Code,Product Price and Availability of the Product
    And  User click the Add To Cart Button
    Then Product Successfully added to cart & Verify AddToCart SuccessMessage is Displayed 
    
    
      