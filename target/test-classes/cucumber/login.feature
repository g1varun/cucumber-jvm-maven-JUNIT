Feature: Test Login feature of mercury website.
	
	@smoketest
	Scenario: mercury login test
	Given user launch browser
  Then user opens application page
  Then user enters Credentials to LogIn
  Then close the browser