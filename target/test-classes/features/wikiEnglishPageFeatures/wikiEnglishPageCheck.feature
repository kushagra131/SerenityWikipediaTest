Feature: 
	User opens the browser, 
	goes to Wikipedia Home Page, 
	clicks on English and 
	checks whether the next page is in English

@First
Scenario: Check English Page section language
	
	Given User goes to Wikipedia Home Page
	When User clicks on 'English'
	Then User should be able to see 'Welcome to Wikipedia'

@Second
Scenario: Check Espanol Page section language
	
	Given User goes to Wikipedia Home Page
	When User clicks on 'Espanol'
	Then User should not see 'Welcome to Wikipedia'
	