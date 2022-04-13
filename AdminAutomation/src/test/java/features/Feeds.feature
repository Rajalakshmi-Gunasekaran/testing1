Feature: Feeds
  As a User
  I should be able to login and search for deleted journalist list

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @RemovalJournalistFromList
  Scenario:Validate removing journalist from the selected list
    When I should login into the home page and click on feeds tab
    And I click on deleted journalist lists
    And I click on page number as last in deleted journalist lists
    And I choose list and Click on it
    And I should navigate to that list and click check box next to the journalist name
    And I click remove 1 author from the list button
    And I should click unassign button to confirm removal
    Then I should see the journalist removed from list message

  @ValidatingJournalistLink
  Scenario:Validate journalist links navigates to journo profile page
    When I should login into the home page and click on feeds tab
    And I click on deleted journalist lists
    And I click on page number as last in deleted journalist lists
    And I choose list and Click on it
    And I should navigate to that list and click journo name
    Then I should navigate to the journo profile page

  @ValidatingUserEmailLink
  Scenario:Validate User Email links navigates to User profile page
    When I should login into the home page and click on feeds tab
    And I click on deleted journalist lists
    And I choose list and Click on user email
    Then I should navigate to the User profile page

  @ValidatingUnDeleteBtn
  Scenario: Validate un delete button undo the deleted journalist list
    When I should login into the home page and click on feeds tab
    And I click on deleted journalist lists
    And I click on last page in scroll numbers
    And I choose list and Click on un delete button
    Then I should see the journalist list un deleted

