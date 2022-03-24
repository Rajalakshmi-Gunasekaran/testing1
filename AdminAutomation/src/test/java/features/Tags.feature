Feature: Tag
  As a User
  I should be able to login and create, edit and delete tag in admin under tags tab

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario: Validate adding, editing and deleting story topics tag
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on hidden check box to hide it from front end
    And I click on save button to add new tag
    And I click on story topic tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting product tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on products tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on hidden check box to hide it from front end
    And I click on save button to add new tag
    And I click on product tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting journo and outlet sectors tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on journo and outlet sectors tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on journo and author sector tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting media outlet types tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on media outlet types tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on media outlet types tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting journo type tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on journo type tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on journo type tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting company tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on company tags in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on company tags on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting company types tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on company types tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on company types tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting journo pinging emails tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on journo pinging emails tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on hidden tags on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting marketing to PRs tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on marketing to PRs tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on marketing to PRs tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting working set tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on working set tags in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on working set tags on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting localities tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on localities tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on localities tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting forward features tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on forward feature tag in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on forward feature tag on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting content type tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on content type tags in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on content type tags on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting saved search tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on saved search tags in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on saved search tags on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag

  @smoke
  Scenario: Validate adding, editing and deleting PR opportunity tags
    When I should login into the home page and click on tag tab
    And I click on story topics from the list
    And I click on PR opportunity tags in the tags home page
    And I click on add button
    And I enter tag name in the name field as "AA"
    And I enter description in the description field as "Testing purposes"
    And I click on save button to add new tag
    And I click on PR opportunity tags on the top bar to navigate to tags home page
    Then I click cross mark to delete the tag