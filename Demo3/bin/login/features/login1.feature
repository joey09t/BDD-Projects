Feature: Login Action Test
 This feature will Test a LogIn and LogOut functionality 

  
  Scenario: Successful login with valid credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Username and password
    But The user credentials are wrong
    Then Message displayed wrong username and password
    
 