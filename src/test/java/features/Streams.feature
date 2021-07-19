Feature: Streams feature
  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "raji.anand@roxhillmedia.com"
    And I enter password as "Rajianand123"
    And I click on login button
    Then I should be able to login successfully

  @AllJournoMoves
    Scenario: Validate AllJournoMoves stream is displayed
      When I should be in the home page and click on Streams
      And I click on AllJournoMoves streams from the list
      Then I should able to see the AllJournoMoves streams page

  @StreamSetUpForArticles
  Scenario: Validate stream set up functionality
    When I should be in the home page and click on Streams
    And I click on create new stream button
    And I enter stream name as "SmokeTest"
    And I click on create button
    And I click on articles from the options
    And I click on outletTypes
    And I enter outletType as "National"
    And I click on save button
    Then I should able to see the  streams results

  @EditStreamSetUp
  Scenario: Validate Edit functionality in streams
    When I should be in the home page and click on Streams
    And I click on SmokeTest streams from the list and I click on edit streams
    And I click type of publisher and I click type of publisher as Journalist
    And I click on save button
    Then I should able to see the edited streams

  @DeleteStream
  Scenario: Validate Delete stream functionality
    When I should be in the home page and click on Streams
    And I click on SmokeTest streams from the list and I click on delete button
    And I click on confirm delete button
    And I click on search icon and enter stream name as "SmokeTest"
    Then I should see the stream deleted on left hand side