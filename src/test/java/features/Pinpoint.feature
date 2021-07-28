Feature: Pinpoint
  As a User
  I should be able to see the trends using pinpoint functionality

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "qa@roxhillmedia.com"
    And I enter password as "qaautomation123"
    And I click on login button
    Then I should be able to login successfully

  @Pinpoint
  Scenario: Validate pinpoint functionality
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    Then I should able to see the results in graph view