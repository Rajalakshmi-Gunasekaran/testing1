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