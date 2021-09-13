Feature: OutletProfile
  As a User
  I should be able to see all the available desks and information for the outlet profile

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "qa@roxhillmedia.com"
    And I enter password as "qaautomation123"
    And I click on login button
    Then I should be able to login successfully


  @DisplayDesksInOutlet
  Scenario:1Validate all the desks are displayed in Outlets profile page
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    Then I should see all the available desks for that particular outlet

  @DisplayTabsInOutlet
  Scenario:2Validate all the tabs are displayed in Outlets profile page
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    Then I should see all the available tabs for that particular outlet