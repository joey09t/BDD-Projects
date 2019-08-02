Feature: Log In and out
  As an Administrator 
  I want to restrict  access to certain portions of my site 
  In order to prevent users from changing the content

  Scenario: Logging In
      Given I am not logged in as administrator
    And I fill in the details
    When I complete action
   |Username|admin|
   |Password|secret|
   And I press "Log In"
    Then I should be on the administrative page
    And I should see "Log Out"

Scenario: Logging out
 Given I am not logged in as administrator
 When I click "Log Out"
 Then I should be on the administrative page
 And I should see "Log In"
 

