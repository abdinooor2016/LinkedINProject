Feature: Returning Customers

  Background: 
    Given I am on the Home page

  Scenario: As a Returning user I want to Login successfully
    When I enter my user email address
    And I enter my user password
    And I click Signin button
    Then I am logged in
