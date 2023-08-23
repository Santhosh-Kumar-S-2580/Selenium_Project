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
      
      
Feature: Login to Malabar Golds & Diamonds

Background: 
   Given User in Malabar Golds & Diamonds page "https://www.malabargoldanddiamonds.com/"
 
   @InvalidCredentials
   Scenario Outline: Login with invalid credentials
    When user click the profile 
    When user press the Login button
    When User type the userName as "<username>" and Password as "<password>"
    When User press the Login 
    Then User able to see error message "<errorMessage>"
    
  Examples:
  | username                  | password    | errorMessage                      |
  | wakeye8520@chotunai.com   | awakeye@820 | Invalid login or password.        |
  | wakeye820@chotunai.com    | wakeye@8520 | Invalid login or password.        |
  | wakeye8208@chotunai.com   | wakeye@8207 | Invalid login or password.        |
