Feature: JournoProfile
  As a User
  I should be able to see all the header tabs and all information about the journalist on both left hand and right hand side

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "qa@roxhillmedia.com"
    And I enter password as "qaautomation123"
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:1Validate all information and header tabs are displays in Journo profile
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I should see all the available information about the journalist
    Then I should see all the header tabs in journalist profile page

  @smoke
  Scenario: validate ACL Journalist only visible to ACL customers
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "David Deane"
    And I choose Journalist from the list and Click on it
    Then I should see all the available information about the ACL journalist

  @functional
  Scenario: validate adding Journalist and removing journo from the list in journo profile page
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on In lists button
    And I click on search list icon and I enter list name in the search field as "AutomationList" to add journo
    And I click on the list from the list options
    And I should see the added list on the right hand side pan
    And I click on remove cross mark on the list name
    Then I should see the list removed from the journo page