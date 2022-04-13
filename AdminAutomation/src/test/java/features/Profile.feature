Feature: Journalist profile
  As a User
  I should be able to login and search, create, edit and delete Journalists info in profile

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @AllTabsInJournalistProfile
  Scenario:1Validate navigate to all tabs available in journalist profile
    When I should login into the home page and click on first search tab
    And I enter Journalist name as "David Deane"
    And I choose Journalist from the list and Click on it
    And I click on credited stories tab and able to navigate to that page
    And I click on mentioned stories tab and able to navigate to that page
    And I click on data protection tab and able to navigate to that page
