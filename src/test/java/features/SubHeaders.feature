Feature: SubHeaders
  As a User
  I should be able to see all the available sub headers and their functionalities

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:Validate AllAlerts tab in home page
    When I should login into the home page and click on AllAlerts in sub menu
    And I click on select all to validate
    Then I should see the all alerts results

  @smoke
  Scenario:Validate New Editions tab in home page
    When I should login into the home page and click on New Editions in sub menu
    And I click on select all to validate
    Then I should see the new editions results

  @smoke
  Scenario:Validate outlet logo under New Editions tab in home page
    When I should login into the home page and click on New Editions in sub menu
    And I choose outlet and click on outlet logo
    Then I should see navigate to the outlet profile

  @smoke
  Scenario:Validate New Editions tab in home page
    When I should login into the home page and click on New Editions in sub menu
    And I click on search all alerts button
    Then I should navigate to the alerts tab in advanced search

  @smoke
  Scenario:Validate selecting alerts one by one in alerts tab in home page
    When I should login into the home page and click on AllAlerts in sub menu
    And I choose alert to select and click on it
    Then I should see the alert been selected

  @functional59
  Scenario: validate quick find by keyword in new editions tab
    When I should login into the home page and click on New Editions in sub menu
    And I click on quick find by keyword text field and enter text as "Health"
    Then I should see the results for the search
