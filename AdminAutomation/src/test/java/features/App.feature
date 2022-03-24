Feature: App
  As a User
  I should be able to login and search for user and customer

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:Validate user search by name and filter by status
    When I should login into the home page and click on App tab
    And I click on users from the list
    And I choose status enabled from the list and Click on it
    And I click user search field and enter user name as "Raji Anand"
    And I click on user name from the list
    Then I should navigate to the user profile page

  @smoke1
  Scenario:Validate customer search by name and filter by status
    When I should login into the home page and click on App tab
    And I click on customers from the list
    And I choose type as subscribed and status as no from the list and Click on it
    And I click customer search field and enter customer name as "Testing"
    And I choose customer name from the list and click on edit button
    Then I should navigate to the customer profile page

  @smoke2
  Scenario:Validate creating new customer and delete customer
    When I should login into the home page and click on App tab
    And I click on customers from the list
    And I click on add new button
    And I enter customer name as "Automation"
    And I enter domain as "automation.com"
    And I click on save button
    And I click on App tab and click on customers from the list
    And I click customer search field and enter customer name as "Automation"
    Then I click on delete button and click confirm delete button

  @smoke3
  Scenario:Validate creating new user alerts, edit user alert and delete user alert
    When I should login into the home page and click on App tab
    And I click on all alerts from the list
    And I click on add new button and click on new story user alert
    And I enter new story user alert name as "Automation"
    And I choose working tag as alert when written
    And I uncheck enabled check box
    And I click on save button in user alert
    And I choose type as new story user alert
    And I click on edit button in user alert
    And I edit the user alert name as "Automation1"
    And I click on save button in user alert
    Then I click on delete button and click confirm delete button

  @smoke4
  Scenario:Validate creating URL check author user alerts, edit user alert and delete user alert
    When I should login into the home page and click on App tab
    And I click on all alerts from the list
    And I click on add new button and click on URL check author user alert
    And I enter URL check author user alert name as "Automation"
    And I choose author and enter author as "Raji Anand"
    And I uncheck enabled check box
    And I click on save button in user alert
    And I choose type as URL check author user alert
    And I choose and click enabled option as No
    And I click on page number as last
    And I click on Automation URL check author to edit
    And I edit the author user alert name as "Automation1"
    And I click on save button in user alert
    Then I click on delete button and click confirm delete button