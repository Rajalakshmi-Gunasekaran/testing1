Feature: App
  As a User
  I should be able to login and create, edit and delete tag in admin under tags tab

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke1
  Scenario: Validate