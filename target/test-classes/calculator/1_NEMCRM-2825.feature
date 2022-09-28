@NEMCRM-2850
@NEMCRM-2823
Feature: As a user, I can calculate the sum of two numbers
	#As a user, I can calculate the sum of two numbers

	#As a user, I can multiply two numbers
	@NEMCRM-2825
	Scenario: As a user, I can multiply two numbers
		Given I have entered 1000 into the calculator
		And I have entered 0 into the calculator
		When I press multiply
		Then the result should be 0 on the screen