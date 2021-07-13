Feature: As a User
         I should be able to create and delete list

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "raji.anand@roxhillmedia.com"
    And I enter password as "Rajianand123"
    And I click on login button
    Then I should be able to login successfully

  @CreateFolder
  Scenario: Validate creating folder
    When I should login into the home page and click on lists
    And I click on create folder
    And I enter folder name as "AA" and click on create button
    Then I should see the created folder

  @CreateList
  Scenario: Validate creating list
    When I should login into the home page and click on lists
    And I click on create list
    And I enter list name as "SmokeSuiteList" and click on create button
    Then I should see the created list

  @AddingJournalistToTheList
  Scenario: Validate adding journalist to the list
    When I should login into the home page and click on search tab
    And I click on outlet type and enter outlet type as "National"
    And I Click on outlet name and enter outlet name as "BBC Two"
    And I click on Add Journalist to list button
    And I enter list name as "SmokeSuiteList" and click Ok
    When I should login into the home page and click on lists
    Then I should able to see the journalist added to the list

  @RemovingJournalistFromTheList
    Scenario: Validate removing journalist from the list
      When I should login into the home page and click on lists
      And I click on search icon in the list page and I enter list name as "SmokeSuiteList"
      And click on the list name from the list
      And I click select all to remove all journalist from the list
      And I click on remove from list button
      And I click tick mark to make sure deletion
      Then I should able to see the journalist deleted successfully on the list page

  @GDPRDefaultStatus
    Scenario: Validate GDPR status rejected is unchecked by default
    When I should login into the home page and click on lists
    And I click on search icon in the list page and I enter list name as "SmokeSuiteList"
    And I click on the list name from the list
    Then I should see the GDPR rejected status is unchecked by default

  @DeletingList
    Scenario: Validate delete List functionality
    When I should login into the home page and click on lists
    And I click on search icon in the list page and I enter list name as "SmokeSuiteList"
    And click on the list name from the list
    And I click on menu list and click on delete button
    And I confirm deletion
    Then I should see the list deleted

  @DeletingFolder
  Scenario: Validate delete folder functionality
    When I should login into the home page and click on lists
    And I click on search icon in the list page and I enter folder name as "AA"
    And I click on the folder name from the list
    And I click on menu list and click on delete button
    And I confirm deletion
    Then I should see the folder deleted