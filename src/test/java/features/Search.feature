Feature: Search
  As a User
  I should be able to login and search for Journalists using Quick search

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "qa@roxhillmedia.com"
    And I enter password as "qaautomation123"
    And I click on login button
    Then I should be able to login successfully

  @SearchByJournalist
  Scenario: Validate search by Journalist name
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    Then I should navigate to the Journalist profile page

  @SearchByOutlet
  Scenario: Validate search by Outlet name
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    Then I should navigate to the Outlet profile page

  @SearchByDesk
  Scenario: Validate search by Desk name
    When I should login into the home page and click on Quick search tab
    And I enter Desk name as "BBC children"
    And I choose Desk from the list and Click on it
    Then I should navigate to the Desk profile page

  @SearchByCompany
  Scenario: Validate search by Company name
    When I should login into the home page and click on Quick search tab
    And I enter Company name as "Apple"
    And I choose Company from the list and Click on it
    Then I should navigate to the Company profile page
