Feature: HRM Login Page Feature

  Scenario: To verify user is able to Login to HRM application
    Given Launch HRM application
    When user input username as "admin"
    And user input password as "admin123"
    And click on login button
    Then HRM Home Page should be displayed
    And Home page title should be "OrangeHRM"
    
 	Scenario: To verify user is able to Login and Loginout from HRM application
    Given Launch HRM application
    When user input username as "admin"
    And user input password as "admin123"
    And click on login button
    And user click logout button
    Then user should be on Login page
