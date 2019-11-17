Feature: deal data creation

Scenario: free crm create a new deal scenario

Given users is already on login page
When title of login page is free crm
Then user enter username and password
|khamerbari |shahin786 |
Then user click on logins button
Then user is on homes page
Then user moves to new deals page
Then user enters deal details
|test deal |1000 |40 |6 |
Then user close the browser

