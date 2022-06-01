Feature: Analytical Dashboard
  As a User
  I should be able to login and search for user and customer usage dashboard

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @scenario123
    Scenario: Validate all columns filtered by customer name in analytical dashboard
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I click on filter button and I enter customer name as "Roxhill Media"
    And I click close filter
    Then I should see all columns filtered by customer Roxhill media

  @suspiciousActivity
  Scenario:Validate suspicious activity page
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I should see the suspicious activity column
    And I click on view all link
    Then I should navigate to the suspicious activity page

  @customerUsage
  Scenario:Validate customer usage page
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I should see the customer usage column
    And I click on view all link in customer column
    And I should navigate to the customer page
    And I click on customer search field and enter customer name as "Roxhill Media"
    And I click on user search field and enter user name as "Raji Anand"
    Then I should see the results as per filter

  @CustomerHealth
  Scenario: Validate customer health page
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I should see the customer health column
    And I click on view all link in customer health page
    And I should navigate to the customer health page
    And I click and enter Roxhill user portfolio as "Karina May"
    Then I should see the customer health records filtered by roxhill user portfolio

  @MostViewedJournalist
  Scenario: Validate most viewed journalist page
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I should see the most viewed journalist column
    And I click on view all link in most viewed journalist page
    Then I should navigate to the most viewed journalist page

  @EmailVerificationStatus
  Scenario: Validate email verification status page
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I hover over on customers and users and I click on email authentication status
    And I click on domain search field and enter domain name as "roxhillmedia.com"
    Then I should see email verification status for the chosen customer


  @Distribution
  Scenario: Validate bounce backs page
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I hover over on Distribution and I click on Bounce backs
    And I should see the journalist email verification page
    And I click on status to choose unresolved option
    And I click on filter button in email verification page
    And I  enter outlet type as "National"
    And I choose country as united kingdom
    Then I should see the bounce back status for the filtered emails

  @MostVisited
  Scenario: Validate most visited page
    When I should login into the home page and click on Analytics tab
    And I click on analytics dashboard options from the list
    And I hover over on journalists and outlets and I click on most visited options
    And I should navigate to the most visited page
    And I select date to filter using time range
    Then I should see the graph for the filtered period of time
