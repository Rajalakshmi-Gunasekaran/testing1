Feature: AdminRegression
  As a User
  I should be able to create, edit and delete journalists, PR professionals and job titles

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  Scenario: Validate journalist job title merging
    When I should login into the home page and click on people tab
    And I click on journalist from the options
    And I click on add new button to create new journalist
    And I enter journalist name as "TestingTest"
    And I click on save to create new journalist

  Scenario: Validate all tabs in PR professionals

