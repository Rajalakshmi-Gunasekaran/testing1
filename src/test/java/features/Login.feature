Feature: Login
  As a User
  I should be able to send forgotten password link to my email

  @smoke
  Scenario: validate forgotten password link
    When I am on login page
    And I click on forgotten password link
    And I enter email id in the email text field as "qa@roxhillmedia.com"
    And I click send email button
    Then I validate with the forgotten password link sent message

  @functional
  Scenario:Validate user settings feature
    When I click on userprofile
    And I choose user settings and click on it
    And I navigate to the user settings page and choose preferred country as United Kingdom
    And I click save changes button
    Then I should navigate to the home page

