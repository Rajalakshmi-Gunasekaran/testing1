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

  @functional48
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

  @functional63
  Scenario: Validate applying filters country, Sector and outlet type in pinpoint to search for related journo
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    And I choose country as UnitedKingdom
    And I choose sector as politics
    And I choose outlet type as Television
    Then I should see the results for the filtered search

  @functional64
   Scenario: Validate graph results in pinpoint by choosing segment toggle button
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    And I click segment toggle bar on outlet type
    And I disable the national outlet type
    Then I should see the results in graph view for other outlet types

  @functional65
  Scenario: Validate stack view results in pinpoint by choosing segment toggle button
    When I should login into the home page and click on pinpoint
    And I enter search text as "Brexit"
    And I click segment toggle bar on country
    And I disable the country united kingdom
    And I click stack button
    Then I should see the results in stack view for other countries