Feature: Search
  As a User
  I should be able to login and search for Journalists,outlet, company and PR using search field

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:1Validate search by Journalist name
    When I should login into the home page and click on first search tab
    And I enter Journalist name as "Matt simon"
    And I choose Journalist from the list and Click on it
    Then I should navigate to the Journalist profile page

  @smoke
  Scenario:2Validate search by Outlet name
    When I should login into the home page and click on first search tab
    And I enter Outlet name as "BBC Two"
    And I choose Outlet from the list and Click on it
    Then I should navigate to the Outlet profile page

  @smoke
  Scenario:2Validate search by Company name
    When I should login into the home page and click on second search tab
    And I enter Company name as "Apple"
    And I choose company from the list and Click on it
    Then I should navigate to the company profile page

  @smoke
  Scenario:2Validate search by PR name
    When I should login into the home page and click on second search tab
    And I enter PR name as "3c PR"
    And I choose PR from the list and Click on it
    Then I should navigate to the PR profile page