Feature: Place Order in the Malabar Golds & Diamonds

Background: 
   Given User landing into Malabar Golds & Diamonds page "https://www.malabargoldanddiamonds.com/"
 
   @AddToCart
   Scenario: Place an Order Functionality of the Malabar Golds
    When user can able to Enter Search Term as "Ring"
    And To Verify User should Navigated to Search Result Page and product is displayed
    And  User can Select the filter as ProductType 
    And  Display the Selected Product Name,Product Code,Product Price and Availability of the Product in the console
    And  User click the BuyNow button 
    And  User should be navigated to shopping cart page & click on the Place Order Button
    And Navigated to checkout page
    And Login with Valid Crendentials
    When User can enters username as "Raj@Ram.com" and password as "Ram@raj12345"
    And User can enter the shipping Details
    When User can choose the salutation as "Mr" in the dropdown Using "text"
    When User can enter the FirstName as "Anbu"
    When User can enter the LastName as "Arasu"
    When User can type the Address as "45,AnnaNagar"
    When User can type the Landmark as "AshokPillar CheckPost"
    When User can type the Telephone as "9876554321"
    When User can type the ZipCode as "657432"
    When User can type the City as "Chennai"
    When User can choose the state as "Assam" in the dropdown Using "text"
    When User can choose the country as "India" in the dropdown Using "text"
    And click Terms and condition checkbox 
    And click ContinueCheckout Button
    And user can Navigated to Payment selection Page & click the placeorder button
    Then User Navigated to Payment gateway page & Orderplaced successfully
    
    
    
  
    
    
    