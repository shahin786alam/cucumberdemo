Feature: free crm create contacts

Scenario Outline: free crm create a new contact scenario

Given user is already on login page
When title of logine page is free crm
Then user enters "<username>" and "<password>"
Then user click in login button
Then user is home page
Then user moves to new contacts page
Then user enters contact details"<firstname>" and "<lastname>" And "<position>"
And user close the browser
 
 Examples:
  |username    |password   |firstname  |lastname |position    |
  |khamerbari  |shahin786  |shahin     |alam     |manager     |
  |khamerbari  |shahin786  |alef       |bro      |management  |