Feature: HRM Login Page Feature

  Scenario: To check user is able to Login to HRM application
    Given Launch HRM application
    When user input username
    And user input password
    And click on login button
    Then HRM Home Page should be displayed
