Feature: EndToEndUserJourneys
  As a User
  I should be able to search journo, adding that to lists, creating press release and sending campaign

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @EndToEndUserJourney1
  Scenario:Validate end to end user journey of sending campaign
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I should navigate to the Journalist profile page
#    And I click on In lists button
#    And I click on search list icon and I enter list name in the search field as "AutoList" to add journo
#    And I click create new list called AutoList
#    And I click save button to save lists in journo profile page
#    And I click on Distribution tab
#    And I click on create new press release button
#    And I enter press release name as "AutoTest" and I click on create button
#    And I click header block to enter text
#    And I enter header as "Raji is a QA" and I click ok
#    And I click save button to save press release
#    And I click on start campaign button
#    And I enter campaign name from press release as "AutoList" and I click on create button
#    And I click on copy from list option
#    And I enter list name to copy as "AutoList"
#    And I click on Ok button
#    And I enter From email as
#    And I click on save button in the new campaign page
#    And I click on send button in Campaign page
#    And I should able to see the campaign created
#    And click cancel to stop sending campaign
#    And I should delete the campaign
#    And I click on press release tab
#    And I click on search icon on press release tab
#    And I enter press release name as "AutoTest" and I click on the name
#    And I click on the menu to select delete option
#    And I click on delete button and I click on confirm delete button
    And I click on lists tabs
    And I click on search icon in the list page
    And I enter list name in lists as "AutoList" and click on it
    Then I click on delete list and click on confirm deletion button
