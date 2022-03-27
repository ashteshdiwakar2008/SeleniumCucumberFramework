@tag
Feature: HRM Home Page Features

Background:
		Given Launch HRM application
    When user input username as "admin"
    And user input password as "admin123"
    And click on login button

  Scenario: To verify user is able to see Quick Launch section on Dashboard
    Then Quick Launch section should be displayed
    And user click logout button
    
 	Scenario: To verify user is able to see Quick Launch section on Dashboard
    Then Employee Distribution By Subunit section should be displayed
    And user click logout button
    
  Scenario: To verify user is able to see Quick Launch section on Dashboard
  	Then Pending leave request section should be displayed
  	And user click logout button
