Feature: JournoProfile
  As a User
  I should be able to see all the header tabs and all information about the journalist on both left hand and right hand side

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "qa@roxhillmedia.com"
    And I enter password as "qaautomation123"
    And I click on login button
    Then I should be able to login successfully

  @JournoDisplay
  Scenario: Validate all information displays in Journo profile
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    Then I should see all the available information about the journalist

  @JournoHeaderTabsDisplay
  Scenario: Validate all header tabs are displays in Journo profile
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    Then I should see all the header tabs in journalist profile page

  @ACLVisibleJournalist
  Scenario: validate ACL Journalist only visible to ACL customers
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "David Deane"
    And I choose Journalist from the list and Click on it
    Then I should see all the available information about the ACL journalist