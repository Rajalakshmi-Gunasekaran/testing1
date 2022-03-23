Feature: Search
  As a User
  I should be able to login and search for Journalists using Quick search

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:1Validate search by Journalist name
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    Then I should navigate to the Journalist profile page

  @smoke
  Scenario:2Validate search by Outlet name
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    Then I should navigate to the Outlet profile page

  @smoke
  Scenario:3Validate search by Desk name
    When I should login into the home page and click on Quick search tab
    And I enter Desk name as "BBC children"
    And I choose Desk from the list and Click on it
    Then I should navigate to the Desk profile page

  @smoke
  Scenario:4Validate search by Company name
    When I should login into the home page and click on Quick search tab
    And I enter Company name as "Apple"
    And I choose Company from the list and Click on it
    Then I should navigate to the Company profile page


   @functional52
   Scenario:Validate adding journo to the list from quick search
     When I should login into the home page and click on Quick search tab
     And I enter Journalist name as "simon english"
     And I click on add to list short link
     And I enter quick search list name as "QuickSearchList" and I click on Ok to create new list from quick search
     And I close the quick search bar
     And I click on lists tab in home page
     And I should see the Journalist added to the list
     Then I delete the list and confirm deletion

   @1
   Scenario:3Validate chosen desk selected and all journo displayed for that particular desk
     When I should login into the home page and click on Quick search tab
     And I enter Desk name as "Finance"
     And I choose finance Desk for choice from the list and Click on it
     Then I should navigate to the Desk profile page and see the chosen desk is selected
