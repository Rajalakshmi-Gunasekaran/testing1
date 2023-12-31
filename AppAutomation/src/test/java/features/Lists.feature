Feature: List
  As a User
  I should be able to create and delete list

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:1Validate creating and deleting folder
    When I should login into the home page and click on lists
    And I click on create folder
    And I enter folder name as "SmokeTest" and click on create button
    And I click on search icon in the list page
    And I enter folder name as "SmokeTest"
    And I click on the folder name from the list
    And I click on menu list and click on delete button
    And I confirm deletion
    And I click on search icon in the list page
    And I enter folder name as "SmokeTest"
    Then I should see the folder deleted

  @smoke
  Scenario:2Validate creating list, adding journalists to the list, default GDPR status, removing journo from the list and delete list
    When I should login into the home page and click on lists
    And I click on create list
    And I enter list name to create as "SmokeSuiteList" and click on create button
    And I click on search tab in the home page
    And I click on outlet type and enter outlettype as "National"
    And I Click on outlet name and enter outletname as "BBC Two"
    And I click on Add Journalist to list button
    And I enter list name to copy journo to the list as "SmokeSuiteList"
    And click Ok
    And I click on lists
    And I click on SmokeSuiteList to see the journo added from advanced search
    And I should see the GDPR rejected status is unchecked by default
    And I click select all to remove all journalist from the list
    And I click on remove from list button
    And I should able to see the journalist deleted successfully on the list page
    And I click on delete list and click on confirm deletion button
    And I click on search icon in the list page
    And I enter list name to validate list deleted as "SmokeSuiteList"
    Then I should see the list deleted

    @functional31
    Scenario: validate copying list from one to another functionality
      When I should login into the home page and click on lists
      And I click on create list
      And I enter list name to create as "functionalList" and click on create button
      And I click on search icon in the list page
      And I enter list name in lists as "AutomationList" and click on it
      And I click copy all to lists
      And I enter list name to copy as "functionalList" and click ok
      And I click on search icon in the list page
      And I enter list name in lists as "functionalList" and click on it
      And I click select all button to see the copied list
      And I see the list copied
      Then I click on delete and confirm delete button to delete the list

  @functional32
  Scenario: validate viewing list in list view
    When I should login into the home page and click on lists
    And I click on search icon in the list page
    And I enter list name in lists as "AutomationList" and click on it
    And I click on list view button
    Then I should see the list in list view

  @functional74
  Scenario: validate alerts tab for chosen list in list page
    When I should login into the home page and click on lists
    And I click on search icon in the list page
    And I enter list name in lists as "AutomationList" and click on it
    And I click on alerts tab for the chosen list in the lists page
    Then I should see the alerts for the journos in the list in lists page

  @functional75
  Scenario: validate activities tab for chosen list in list page
    When I should login into the home page and click on lists
    And I click on search icon in the list page
    And I enter list name in lists as "AutomationList" and click on it
    And I click on activities tab in lists page
    Then I should see the activities for the journos in the list in lists page