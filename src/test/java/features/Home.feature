Feature:Home
  As a User
  I should be able to login and logout from the application

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:1Validate GoBack functionality
    When I should login into the home page and click on PinpointTab
    And I click on GoBack button
    Then I should able to go back to the home page

  @smoke
  Scenario:2Validate WebinarAlerts functionality
    When I should login into the home page and click on Webinars tab in sub menu
    And I click on select all button to select all alerts
    Then I should able to see all the webinar alerts

  @smoke
  Scenario:3Validate quick links in HeadlineAlerts functionality
    When I should login into the home page and see HeadlineAlerts in sub menu
    And I click on sign up links in Headline alerts page
    Then I should able to navigate to the Roxhill main site

  @smoke
  Scenario:5Validate logout feature
    When I click on userprofile
    And I choose logout and click on it
    Then I should logout from the application

  @functional19
  Scenario:Validate user settings feature
    When I click on userprofile
    And I choose user settings and click on it
    And I navigate to the user settings page and choose preferred country as United Kingdom
    And I click save changes button
    Then I should navigate to the home page

  @functional20
  Scenario:Validate Roxhill highlights feature
    When I should login into the home page and click on home button
    Then I should see the roxhill highlights

  @functional61
  Scenario: Validate Roxhill end user license agreement available at the bottom of Help & feedback page
    When I am on login page and I click help and feedback functionality
    And I click on End User License Agreement link
    And I should see the Terms and conditions
    Then I click close button to close the EULA form

  
