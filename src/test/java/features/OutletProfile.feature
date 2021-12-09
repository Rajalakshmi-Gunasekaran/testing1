Feature: OutletProfile
  As a User
  I should be able to see all the available desks and information for the outlet profile

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully


  @smoke
  Scenario:1Validate all the desks are displayed in Outlets profile page
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    Then I should see all the available desks for that particular outlet

  @smoke1
  Scenario:2Validate all the tabs are displayed in Outlets profile page
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    Then I should see all the available tabs for that particular outlet

  @functional33
  Scenario:Validate select and deselect all in group in journo tab
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on select in group button
    And I should see the journo selected in group
    And I click on deselect in group button
    Then I should see journos are deselected in group

  @functional34
  Scenario:Validate hide and un hide all in group in journo tab
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on hide in group button
    And I should see the journo hide in group
    And I click on un hide in group button
    Then I should see journos are un hide in group

  @functional35
  Scenario:Validate select and clear desk
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I choose desk and click on it
    And I should see the journo for the selected desks
    And I click on clear all button
    Then I should see journos for all the desks

  @functional36
  Scenario:Validate adding activity for a journo
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I choose journo to add activity
    And I click on add activity for the journo
    And I enter subject for an activity as "Automation Testing"
    And I click on save button to add activity
    And I click on activities tab
    And I should see the activity added for the journo
    Then I delete and confirm delete activity

  @functional37
  Scenario:Validate sector displayed in journo tile
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on sector for the chosen journo
    Then I should see all the available sector for that particular journo

  @functional38
  Scenario:Validate coverage displayed in journo tile
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on coverage for the chosen journo
    Then I should see all the available topic coverage for that particular journo

  @functional39
  Scenario:Validate tweets displayed in journo tile
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on tweets for the chosen journo
    Then I should see all the available tweets for that particular journo

  @functional40
  Scenario:Validate Instagram displayed in journo tile
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on instagram for the chosen journo
    Then I should see all the available Instagram results for that particular journo

  @functional41
  Scenario:Validate add to favourites button to add journo to favourites list
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on add to favourites button
    And I click on home button to go back to home page
    And I click on favourite outlets tab
    And I should see the outlet added to favourite outlets tab
    And I click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    Then I should uncheck favourite button in outlet profile page

  @functional42
  Scenario:Validate search by journo name in journalist tab
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I enter journo name to search as "Ojo"
    Then I should see the searched journo at the top

  @functional43
  Scenario:Validate quick find by keyword search in alerts tab
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on alerts tab
    And I enter quick find by keyword as "retire"
    Then I should see the result for the search keyword

  @functional44
  Scenario:Validate group by and sort direction in journalist tab
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on group by button
    And I click on Un-group option from the list
    And I should see the results for un grouping
    And I click on sort direction button
    Then I should see the results for sorting direction

  @functional45
  Scenario:Validate contact details in alerts tab
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on alerts tab
    Then I should see the contact details for selected outlet

  @functional46
  Scenario:Validate journalist link in alerts tab navigates to journalist profile page
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on alerts tab
    And I choose and click on journalist link in alerts tile
    Then I should navigate to the respective journo page

  @functional47
  Scenario:Validate PR opportunity results filtered by section search
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on PR opportunity tab
    And I choose and click on sections as Home Interest
    Then I should validate results for the section search

  @functional66
  Scenario:Validate journos in List view
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on list view button to see the journos
    Then I should see the results in list view

  @functional67
  Scenario:Validate choosing page numbers to see all journos
    When I should login into the home page and click on Quick search tab
    And I enter Outlet name as "evening standard"
    And I choose Outlet from the list and Click on it
    And I click on right arrow to move page numbers
    And I choose and click on page numbers to see journos in different page
    Then I should navigate to the respective page as per the search



