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
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
Feature: Add To Wishlist in the Malabar Golds & Diamonds

Background: 
   Given User should be land to Malabar Golds & Diamonds page "https://www.malabargoldanddiamonds.com/"
 
   @AddToWishList
   Scenario: Add To Wishlist Functionality of the Malabar Golds
    When user Login into valid credentials
    And user should be Enter the Search Term as "Ring"
    And Verify User must be  Navigated to Search Result Page and product is displayed
    And  User should Select filter as ProductType 
    And  User click the Wishlist Icon & Display the Wishlist SuccessMessage
    Then verify Product Successfully added to wishlist and display the wishlist count
