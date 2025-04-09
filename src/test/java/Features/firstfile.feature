
Feature: Title of your feature

#Simple step definition example
 @smoke
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes
    
    
 #Scenario outline with RegEx Pattern
 @smoke @sanity
   Scenario Outline: Login to Asite web application
	Giver User launch home page 
	And User login to application using user_name and password
	Then user able to select product
	Examples:
	|user_name |password |
	|mahesh		 |12345    |
	|Arav      |54544    |

	
	#Before-Hooks->Background->Scenario->After-Hooks
	
	
	#DataTable with data driven testing
	@sanity
	 Scenario: Complete login form
    Given I am on landing page
    And fill the application form 
    |Name   | Sirname | Email         | Phone      |
    |Mahesh | Shelke  | test@test.com | 1234567991 |
    Then I save the application form
    