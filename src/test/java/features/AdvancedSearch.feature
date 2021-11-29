Feature:AdvancedSearch
  As a User
  I should be able to login and search for Journalists using advanced search filters

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:1Validate search functionality using outlet filter
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    Then I should see the Journalist list for the selected outlet

  @smoke
  Scenario:2Validate Group-By functionality using outlet filter
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    And I click on Group-By icon
    And I choose country as Group-By
    Then I should able to see the journalist list grouped by country

  @smoke
  Scenario:3Validate change Info view functionality using outlet filter
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    And I click on change info icon
    And I choose info as Roxhill says
    Then I should able to see the journalist list view by Roxhill says inside the tile

  @functional1
  Scenario:Validate adding journo to the list from advanced search
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    And I click on add journalist to list button
    And I enter list name from the advanced search journalist tab as "AdvancedSearchList" and click ok
    And I click on list tab in home page
    And I click on search icon in the list page to look for advancedSearch list
    And I enter list name in lists as "AdvancedSearchList" and click on it to validate the lists
    And I validate journo added to the list from advanced search
    Then I should delete the list

  @functional2
  Scenario:Validate outlet search using outlet type, sector, frequency and coverage area any town or post code filter
    When I should login into the home page and click on search tab
    And I click on outlets tab from the left hand side pan
    And I click on outlet type and enter outlet type as "Blogs"
    And I Click on sector and enter sector name as "Fashion"
    And I click on frequency and choose frequency as weekly
    And I click on any town or post code text field and enter post code as "IG7"
    Then I should see the outlets listed for the search criteria

  @functional3
  Scenario:Validate outlet search tweet hits filtered by country, region and keyword filter
    When I should login into the home page and click on search tab
    And I click on outlets tab from the left hand side pan
    And I Click on based in country and choose country as United Kingdom
    And I click on based in localities and enter locality as "Regions-UK"
    And I enter keyword as "Brexit AND Covid"
    And I choose outlet to see the hits
    Then I should see the tweets for the relevant search

  @functional4
  Scenario:Validate article search by filtering sector and company
    When I should login into the home page and click on search tab
    And I click on articles tab from the left hand side pan
    And I Click on sector and enter sector name as "Financial services"
    And I enter company as "Next Plc"
    Then I should see the articles for the relevant search

  @functional5
  Scenario:Validate journalist alerts search by filtering outlet
    When I should login into the home page and click on search tab
    And I click on journalist alerts tab from the left hand side pan
    And I Click on outlet and enter outlet name as "Evening Standard"
    Then I should see the journalist alerts for the relevant search

  @functional6
  Scenario:Validate forward features search by filtering outlet
    When I should login into the home page and click on search tab
    And I click on forward features tab from the left hand side pan
    And I Click on outlet in forward features tab and enter outlet name as "FMCG Magazine"
    Then I should see the forward features for the relevant search

  @functional7
  Scenario:Validate Activities search by filtering outlet
    When I should login into the home page and click on search tab
    And I click on Activities tab from the left hand side pan
    And I Click on outlet and enter outlet name as "Evening Standard"
    Then I should see the activities for the relevant search

  @functional8
  Scenario:Validate Media requests search by outlet
    When I should login into the home page and click on search tab
    And I click on media requests tab from the left hand side pan
    And I click on outlet type and enter outlet type as "National"
    Then I should see the media requests results for the relevant search

  @functional9
  Scenario:Validate PR Opportunities search by outlet type, outlet and section
    When I should login into the home page and click on search tab
    And I click on PR opportunities tab from the left hand side pan
    And I click on outlet type and enter outlet type as "Magazine"
    And I Click on outlet and enter outlet name as "CityAM The Magazine"
    And I enter section as "Food & Drink"
    Then I should see the PR Opportunities results for the relevant search

  @functional10
  Scenario:Validate tweet search by keywords and exclude retweets
    When I should login into the home page and click on search tab
    And I click on tweets tab from the left hand side pan
    And I enter keywords as "Covid"
    And I Click on exclude retweets checkbox
    Then I should see the tweets results for the relevant search

  @functional11
  Scenario:Validate Instagram search by type of publisher, outlet type and sector
    When I should login into the home page and click on search tab
    And I click on Instagram tab from the left hand side pan
    And I click type of publisher and choose journalists only
    And I click on outlet type and enter "Blogs"
    Then I should see the Instagram results for the relevant search

  @functional12
  Scenario:Validate clear all filters button in search
    When I should login into the home page and click on search tab
    And I click on outlets tab from the left hand side pan
    And I click on outlet type and enter outlet type as "Blogs"
    And I Click on sector and enter sector name as "Fashion"
    And I click on frequency and choose frequency as weekly
    And I click on any town or post code text field and enter post code as "IG7"
    And I should see the outlets listed for the search criteria
    And I click on clear all button at the top
    Then I should see the search filters are cleared and the result pane is empty

  @functional73
  Scenario: Validate search all outlet's journalist button in outlet tab
    When I should login into the home page and click on search tab
    And I click on outlets tab from the left hand side pan
    And I click on outlet type and enter outlet type as "Freelance"
    And I Click on based in country and choose country as United Kingdom
    And I choose outlet from the result and click on it
    And I click on search all outlet's journalist button
    And I click yes leave button to handle pop up window
    Then I automatically navigate to the journalist tab to see the journos for the selected outlet
