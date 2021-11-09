Feature: Pinpoint
  As a User
  I should be able to see the trends using pinpoint functionality

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario: Validate pinpoint functionality
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    Then I should able to see the results in graph view

  @functional
  Scenario: validate adding journo to list from pinpoint
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    And I choose country as france
    And I click on add journo to list button on journo tab in pinpoint
    And I enter list name in search text field to add journo from pinpoint as "PinPointList"
    And I click create new list to add journo from pinpoint
    And I click on Ok button to create list in pinpoint
   And I click on list tab in homepage
    And I should able to see the journo added to list
    Then I should delete and confirm delete list

  @smoke
   Scenario: Validate tweet search by adding more search terms in pinpoint
     When I should login into the home page and click on pinpoint
     And I enter search text as "Apple"
     And I click on more search text and enter second search item as "Android"
     And I click on more search text and enter third search item as "Mobile"
     And I click on tweet radio button option
     Then I should able to see the results for tweet search and more results

  @smoke
  Scenario: Validate outlet search icon navigates to the advanced search outlet tab
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    And I click on outlet search icon
    Then I should navigate to the advanced search outlet tab

  @smoke
  Scenario: Validate journalist search icon navigates to the advanced search journo tab
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    And I click on journalist search icon
    Then I should navigate to the advanced search journo tab