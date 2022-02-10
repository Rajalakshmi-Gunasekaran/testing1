Feature: Streams
  As a User
  I should be able to login and create, edit and delete streams

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:Validate All journo moves
    When I should be in the home page and click on Streams
    And I click on AllJournoMoves streams from the list
    Then I should able to see AllJournoMoves streams page
  @smoke1
  Scenario:Validate stream set up, Edit streams and delete streams
    When I should be in the home page and click on Streams
    And I click on create new stream button
    And I enter stream name as "SmokeTest"
    And I click on create button
    And I click on articles from the options
    And I click on outletTypes
    And I enter outletType as "National"
    And I click on save button
    And I should able to see the  streams results
    And I click on SmokeTest streams from the list and I click on edit streams
    And I click type of publisher and I click type of publisher as Journalist
    And I click on save button
    And I should able to see the edited streams
    And I click on delete button
    And I click on confirm delete button
    And I click on search icon and enter stream name as "SmokeTest"
    Then I should see the stream deleted on left hand side

    @functional53
    Scenario: validate stream setup for journo alerts, forward features and media requests
      When I should be in the home page and click on Streams
      And I click on create new stream button
      And I enter stream name as "functional"
      And I click on create button
      And I click on journalists alerts,forward features and Media request alerts from the options
      And I click on topics and enter topic in the search as "Brexit"
      And I click on save button
      And I should able to see the  streams results for journo alerts,forward features and media request
      Then I delete the streams

    @functional54
    Scenario: validate adding journo to the lists from streams
      When I should be in the home page and click on Streams
      And I click on search icon and enter stream name as "All Journo Moves"
      And I click on AllJournoMoves streams from the list
      And I click on Add all journo to list button
      And I enter list name to copy journo from streams as "StreamList"
      And I click Ok to copy journo from streams
      And I click on list tab in homepage to see journo added from streams
      And I should able to see the journo added to list from streams
      Then I should delete and confirm delete stream list added from streams tab

    @functional55
      Scenario: validate stream set up for tweets
      When I should be in the home page and click on Streams
      And I click on create new stream button
      And I enter stream name as "Testing"
      And I click on create button
      And I click on tweets from the options
      And I click on outletTypes
      And I enter outletType as "freelance"
      And I click on save button
      And I should able to see the  streams results for tweet
      Then I delete the streams

  @functional56
  Scenario: validate stream set up for activities
    When I should be in the home page and click on Streams
    And I click on create new stream button
    And I enter stream name as "Testing"
    And I click on create button
    And I click on activities from the options
    And I click on journalists
    And I enter journalist as "Simon English"
    And I click on save button
    And I should able to see the streams results for activities
    Then I delete the streams

  @functional57
  Scenario: validate set up selected stream tab in home page
    When I should be in the home page and click on Streams
    And I click on FunctionalTest streams from the list
    And I click On Homepage checkbox
    And I click on save button to save the changes
    And I click on Home button to go back to the home page
    And I should see the FunctionalTest stream tab in sub headers
    And I click on streams tab header
    And I click on FunctionalTest streams from the list
    Then I uncheck the On homepage checkbox and save changes

  @functional58
  Scenario: validate set up selected stream tab in default home page
    When I should be in the home page and click on Streams
    And I click on FunctionalTest streams from the list
    And I click On Homepage checkbox
    And I click on Default Homepage
    And I click on save button to save the changes
    And I click on Home button to go back to the home page
    And I should see the FunctionalTest stream tab as default home page in sub headers
    And I click on streams tab header
    And I click on FunctionalTest streams from the list
    Then I uncheck the default homepage checkbox and save changes

  @functional76
  Scenario: validate keyword search result using quick find by keyword text field
    When I should be in the home page and click on Streams
    And I click on FunctionalTest streams from the list
    And I enter keyword in quick find by keyword text area as "Testing"
    Then I should see the search result for the chosen keyword