Feature: check login functionality

  Scenario Outline: Check login is sucessful with valid credentials

     Given Browser open 
     And user is on the login page
     When user enters <username> and <password>
     And user clicks on login button
     Then user is navigate to the home page 
     Examples:
     |username|password|
     |Ezmet|12345|
     |Mars|12345|	