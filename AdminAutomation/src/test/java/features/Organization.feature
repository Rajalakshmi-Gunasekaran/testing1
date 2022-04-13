Feature: Organization
  As a User
  I should be able to login and create customers, media outlets and PR agencies

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:Validate create and delete company
    When I should login into the home page and click on Organization tab
    And I click on companies from the list
    And I click add new button in companies page
    And I enter company name
    And I click save button to create company
    Then I should navigate to the user profile page