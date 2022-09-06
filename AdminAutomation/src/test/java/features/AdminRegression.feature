Feature: AdminRegression
  As a User
  I should be able to login and perform merging operations

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @regression
  Scenario: Validate journalist duplicate merging
    When I should login into the home page and click on people tab
    And I click on journalist from the options
    And I enter journalist name as "Testing Journalist" in search field and Click on it
    And I click on duplicates tab in journo profile page
    And I enter merging journalist ID as "3059311" in the search text field and click search icon
    And I click merge button next to duplicate journo for merging
    And I click Journalist tab breadcrumbs and enter journalist name as "Test Test" in search field to check merging
    Then I should see the duplicate journo merged into original

  @regression1
  Scenario: Validate journalist job title merging
    When I should login into the home page and click on people tab
    And I click on journalist job titles from the options
#    And I click on add new button to create new journalist job title
#    And I enter job title name as "TestingTest"
#    And I click on save to create new job title
    And I enter journalist job titles as "Testing" in search field and Click on it
    And I click on merge tab in journalists job title page
    And I enter merging journalists job title ID as "159727" in the search text field and click search icon
    And I click merge button next to journo job title for merging
    And I click Journalist job title tab breadcrumbs and enter journalist job title as "TestingTest" in search field to check merging
    Then I should see the job title merged into original