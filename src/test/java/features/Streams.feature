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
    And I enter stream name as A
    And I click on create button
    And I click on articles from the options
    And I click on keywords
    And I enter keyword as "COVID-19"
    And I click on save button
    Then I should able to see the  streams results