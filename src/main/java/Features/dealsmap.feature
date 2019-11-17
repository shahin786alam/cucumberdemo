Feature: deal data creation 
# ctrl+shift+f  (for proper aliement)
Scenario: free crm create a new deal scenario 

	Given users is already on login page 
	When title of login page is free crm 
	Then user enter username and password 
		|username | password |
		|khamerbari |shahin786 |
	Then user click on logins button 
	Then user is on homes page 
	Then user moves to new deals page 
	Then user enters deal details 
		|title|amount|probability|comission|
		|test deal |1000 |40 |6 |
		|test dea2 |2000 |50 |10 |
	Then user close the browser 
