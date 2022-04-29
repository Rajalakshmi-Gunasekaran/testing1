Feature: ReadyMadeList
  As a User
  I should be able to login and search, create, edit and delete readyMade Journalists lists

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @SearchJournalistInReadyMadeList
  Scenario:1Validate search by Journalist name in ready made list
    When I should login into the home page and click on tag tab
    And I click on ready made lists options from the list
    And I click search journalist name field and enter Journalist name as "Jamie Ross"
    Then I should see the Journalist selected page

  @AddAndRemoveNewGroupInReadyMadeList
  Scenario: Adding and removing new group in ready made list
    When I should login into the home page and click on tag tab
    And I click on ready made lists options from the list
    And I click on Add list or group button to create new group in ready made list
    And I click group button on the right hand side options in adding new RML form
    And I enter group title as "AutomationTesting"
    And I click add group button to create new RML group
    And I see the group created at the bottom and I click on delete
    Then I should click ok to confirm delete the created group in RML page

  @AddAndRemoveNewReadyMadeList
  Scenario: Adding and removing new ready made list
    When I should login into the home page and click on tag tab
    And I click on ready made lists options from the list
    And I click on Add list or group button to create new ready made list
    And I enter list name as "Testing"
    And I choose and click group name as Test Matt
    And I click add list button to create new list under Test Matt group
    And I click on Test Matt ready made list group in RML page
    And I click add journalist button to add journo to the newly added list
    And I enter journo name as "Matt Simon" and click enter
    And I click add journalists button to add journo to the list
    And I click delete button next to the journo to delete and click ok to confirm deletion
    And I click delete button and click ok to confirm deletion of the list from the selected RML group
    Then I should see the list deleted from the RML group Test Matt

  @validatingNavigatingToJournoProfile
  Scenario: validating navigating to journo profile from ready made list
    When I should login into the home page and click on tag tab
    And I click on ready made lists options from the list
    And I choose and click on list to see all the journalist
    And I click journalist from the list to navigate to profile page
    Then I should validate journalist profile page
