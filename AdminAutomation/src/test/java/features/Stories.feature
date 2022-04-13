Feature: Stories
  As a User
  I should be able to login and create stories for Journalist alert,broadcast, tweets,
  broadcast, articles, blog, forward feature, media request

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @UserJourney
  Scenario:Validate creating Journalist alerts stories
    When I click on stories and click lists options from the list
    And I click on add new button in stories page
    And I choose story type as journalist alert
    And I click Create button
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I enter journalist in search journo field in journalist alert story to add journo as "Anton Shapkarov"
    And I click on stories and click lists options from the list
    And I click heading search field and enter "Testing Stories"
    Then I see the searched stories and click on delete button

  @UserJourney1
  Scenario:Validate creating Media request stories
    When I click on stories and click lists options from the list
    And I click on add new button in stories page
    And I choose story type as media requests
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I enter journalist in search journo field in media request story to add journo as "Anton Shapkarov"
    And I click on stories and click media requests options from the list
    And I click heading search field and enter "Testing Stories"
    Then I see the searched stories and click on delete button

  @UserJourney2
  Scenario:Validate creating Forward features stories
    When I click on stories and click lists options from the list
    And I click on add new button in stories page
    And I choose story type as forward features
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I enter journalist in search journo field in forward features story to add journo as "Anton Shapkarov"
    And I click on stories and click forward features options from the list
    And I click heading search field and enter "Testing Stories"
    Then I see the searched stories and click on delete button

  @UserJourney3
  Scenario: Validate creating and deleting highlights
    When I click on stories and click highlights from the options
    And I click on add new button in highlights page
    And I choose dates to visibility of highlights
    And I enter title as "Testing highlights"
    And I click save button in highlights
    And I click highlights from the options
    And I click on actions and click delete options from the list
    Then I should see the deleted highlight

  @UserJourney4
  Scenario: Validating tagged articles in done state
    When I click on stories and click lists options from the list
    And I click on add new button in stories page
    And I choose story type as article for creating new story
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I click on stories and click lists options from the list
    And I click heading search field and enter "Testing Stories"
    And I choose and click type as article
    Then I see the searched stories and click on delete button

  @UserJourney5
  Scenario: Validate create and delete Tweet stories
    When I click on stories and click lists options from the list
    And I click on add new button in stories page
    And I choose story type as tweet for creating new story
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I click on stories and click lists options from the list
    And I click heading search field and enter "Testing Stories"
    And I choose and click type as Tweet
    Then I see the searched stories and click on delete button

  @UserJourney6
  Scenario: Validate create and delete Instagram stories
    When I click on stories and click lists options from the list
    And I click on add new button in stories page
    And I choose story type as Instagram for creating new story
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I click on stories and click lists options from the list
    And I click heading search field and enter "Testing Stories"
    And I choose and click type as Instagram
    Then I see the searched stories and click on delete button

  @UserJourney7
  Scenario: Validate create and delete Broadcast stories
    When I click on stories and click lists options from the list
    And I click on add new button in stories page
    And I choose story type as Broadcast for creating new story
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I click on stories and click lists options from the list
    And I click heading search field and enter "Testing Stories"
    And I choose and click type as Broadcast
    Then I see the searched stories and click on delete button