#Author
Feature: feature to test login functionality 

   
   Scenario: check login is sucessful with cvalid credentials 

	Given uer is on the login page 
	When user enter username and password 
	And clicks on loginbutton 
	Then user naviagte to the homepage 
	

	
		
#	Scenario Outline: check login is sucessful with cvalid credentials 

#	Given uer is on the login page 
#	When user enter <username> and <password> 
#	And clicks on loginbutton 
#	Then user naviagte to the homepage 
	
#	Examples:
#	|username|paswword|
#	|user1|pass1|
#	|user2|pass2|
	
