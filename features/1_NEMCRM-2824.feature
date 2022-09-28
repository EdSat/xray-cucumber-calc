@NEMCRM-2850
@NEMCRM-2823
Feature: As a user, I can calculate the sum of two numbers
	#As a user, I can calculate the sum of two numbers

	#Simple integer addition
	@NEMCRM-2850
	@NEMCRM-2824
	Scenario: simple integer addition
		Given I have entered 1 into the calculator
		And I have entered 2 into the calculator
		When I press add
		Then the result should be 3 on the screen