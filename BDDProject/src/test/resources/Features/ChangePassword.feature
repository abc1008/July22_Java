Feature: to test Change Password functionality.

Scenario: verify if user can change the password.
	Given User clicks on password button
	When User enters password and confirm password
	And clicks on continue button
	Then password should be changed successfully. 