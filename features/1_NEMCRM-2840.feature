@NEMCRM-2850
@NEMCRM-2823
Feature: As a user, I can calculate the sum of two numbers
	#As a user, I can calculate the sum of two numbers

	#As a user, I can calculate the sum of two numbers
	@NEMCRM-2850
	@NEMCRM-2840
	Scenario: simple integer addition 2
		Given I have entered 3 into the calculator
		And I have entered 2 into the calculator
		When I press add
		Then the result should be 5 on the screen