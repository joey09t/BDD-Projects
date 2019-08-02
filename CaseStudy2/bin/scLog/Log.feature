

Feature: Login to the system
  As a user, I want to login into the system when I provide username and password

  Scenario Outline: Verify that can login gmail
    Given I launch "https://accounts.google.com" page
    When I fill in "Email" with "<Email>"
    And I fill in "Passwd" with "<Password>"
    And I click on "signIn" button
    Then I am on the "Home" page

    Scenarios:
      | Email  | Password | 
      | kms.admin@gmail.com |     kms@2013 | 
      | kms.user@gmail.com |     kms@1234 |
