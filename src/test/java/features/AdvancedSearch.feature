Feature:AdvancedSearch
  As a User
  I should be able to login and search for Journalists using advanced search filters

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "qa@roxhillmedia.com"
    And I enter password as "qaautomation123"
    And I click on login button
    Then I should be able to login successfully

  @SearchJournalistUsingOutletFilter
  Scenario:1Validate search functionality using outlet filter
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    Then I should see the Journalist list for the selected outlet

  @Group-ByJournalistList
  Scenario:2Validate Group-By functionality using outlet filter
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    And I click on Group-By icon
    And I choose country as Group-By
    Then I should able to see the journalist list grouped by country

  @ChangeInfoViewInJournalistList
  Scenario:3Validate change Info view functionality using outlet filter
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    And I click on change info icon
    And I choose info as Roxhill says
    Then I should able to see the journalist list view by Roxhill says inside the tile
