#This is regular or simple (not datadriven approach) one feature file can have multipul scenario
#Feature: Free CRM Login Feature
#Scenario: Free CRM Login Test Scenario
#Given User is already on Login page
#When title of login page is Free CRM
#Then user enter username and password 
##Then user enter password
#Then user click on login button
#Then user is on home page
#
#this is for datadriven But one data at a time
Feature: Free CRM Login Feature

#without Examples Keyword: i can write (scenario) only
Scenario: Free CRM Login Test Scenario
Given User is already on Login page
When title of login page is Free CRM
Then user enter "khamerbari" and "shahin786" 
Then user click on login button
Then user is on home page
And close the browser

#with Examples Keyword: multipule data pass at a time
Scenario Outline: Free CRM Login Test Scenario
Given User is already on Login page
When title of login page is Free CRM
Then user enter "<username>" and "<password>"
Then user click on login button
Then user is on home page
And close the browser

Examples:
  | username  | password  |
  |khamerbari |shahin786  |
  |khamerbari |shahin786  |
#  
#Scenario: user is able to a new contact
#Given user is already on home page
#When user mouse over on contacts link
#Then user click on new contacts link
#Then user enters firstname and lastname
#Then user click on save button
#Then verify new concat created or not
