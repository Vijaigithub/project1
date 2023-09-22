@smoke
Feature: To validate the login functionality of Adactinhotel application
	Scenario Outline: To validate the positive and negative combinations
	When To pass the data in "<username>"username txtbox
	And To pass the data in "<password>"password field
	And Clicks the login button
	Then User should be in Search hotel page

	Examples:
	|username|password|
	|barathkanna|12345678|
	|barathkanna|bkkkyhjh|
	|12kanna|12345678|
	|12kanna|bkkkyhjhsja|
	
