Feature: Register New Customers

  Background: 
    Given I am on the Home page

  Scenario: As a user I create an Account on Linkedin
    When I enter all the user data in the Registration form
    And I click the Join now button
    And I enter post code
    And I enter Job Title
    And I enter company
    And I select what i am most interested in
    And I click continue
    Then I am registered
