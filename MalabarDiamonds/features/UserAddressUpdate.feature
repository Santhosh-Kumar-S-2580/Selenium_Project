#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Update the Profile

Background: 
   Given User go  Malabar Golds & Diamonds page "https://www.malabargoldanddiamonds.com/"
   
    @updateAddress
    Scenario: User Update the Address
    When user Login with valid credentials
    When user click on the My Address tab
    #When User type the FirstName as ""
    #When User type the LastName as ""
    When User type the Address as "35,Ashok Nagar"
    When User type the Landmark as "Ashok Pillar"
    When User type the ZipCode as "654321"
    When User choose the country as "India" in the dropdown Using "text"
    When User choose the state as "Tamil Nadu" in the dropdown Using "text"
    When User type the City as "Chennai"
    When User type the Telephone as "0443547"
    When Click on SaveAddressButton
    Then User Address Updated SuccessFully
         
    
      
      
      
      
     
