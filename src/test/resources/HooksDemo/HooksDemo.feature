Feature: feature to test login functionality 

   
   Scenario: check login is sucessful with cvalid credentials 

	Given uer is on the loginpage 
	When user enter username and password 
	And clicks on loginbutton 
	Then user naviagte to the homepage 
	