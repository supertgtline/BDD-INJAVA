@login
Feature: Login to System

	@valid
	Scenario: Login with valid email and password
	# Pre-condition
	Given I open live guru application
	
	# Action: click/ sendkey/ select/ ...
	When Click to My Account page
	And Input to email textbox with ""
	And Input to password textbox with ""
	And click to Login button
	
	# Verify/ expected a
	Then Verify error message displayed at email textbox
	Then Verify error message displayed at password textbox