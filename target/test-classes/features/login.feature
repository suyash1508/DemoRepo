Feature: Application login
#
#
#Scenario: Home page default login
#Given User is on landing page
#When User login into application with username and password
#Then Home page is opened 
#And Cards are displayed

Scenario: Amazon Login Page
 
Given user is on Amazon landing page 
And Sign in button is present on screen
When user clicks on Sign in button
Then user is displayed login screen
When user enters "naveen@gmail.com" in username field
And user enters "test@123" in password And user clicks Sign in button
Then user is on home page
And title of home page is "Amazon"
But Sign in button is not present
