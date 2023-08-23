@Register
Feature: Malabar Gold Registration 
@ValidRegistration
Scenario: User Register Malabar Website
   Given Launch Url "https://www.malabargoldanddiamonds.com/"
   When user click on the profile 
   When user click on the signUP
   When User Select the salutation as "Ms" in the dropdown Using "text"
   When user enters the FirstName as "Ram" and Lastname as "Raj"
   When user enters the Email as "Raj@Ram.com" and MobileNumber as "6365678764"
   When user enters the password as "Ram@raj12345" and confirmPassword as "Ram@raj12345"
   When user click on Register
   Then User should be Register successfully and Navigated to HomePage
   
