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
    And I choose story type and I click Create button
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
    And I choose story type as media requests and I click Create button
    And I enter heading as "Testing stories"
    And I enter body as "Testing purposes"
    And I click on save and process button
    And I enter journalist in search journo field in media request story to add journo as "Anton Shapkarov"
    And I click on stories and click media requests options from the list
    And I click heading search field and enter "Testing Stories"
    Then I see the searched stories and click on delete button

  @smoke
  Scenario:Validate searching forward features stories
    When I should login into the home page and click on articles tab
    And I click on forward features options from the list
    And I choose stories from the list and Click on it
    Then I should navigate to the stories page

  @smoke
  Scenario:Validate searching guidance needed stories
    When I should login into the home page and click on articles tab
    And I click on guidance needed options from the list
    And I choose stories from the list and Click on it
    Then I should navigate to the stories page
