Feature: As a User
         I should be able to create press releases and send campaigns

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username as "raji.anand@roxhillmedia.com"
    And I enter password as "Rajianand123"
    And I click on login button
    Then I should be able to login successfully

    @CreateNewPressRelease
    Scenario: Validate new press release functionality
    When I should be in the home page and click on Distribution tab
    And I click on create new press release button
    And I enter press release name as "SmokeTest" and I click on create button
    And I click header block to enter text
    And I enter header as "Raji is a QA" and I click ok
    And I click body block to enter text
    And I enter body as "The press release can be added in the body template"
    Then I should able to see the created press release

    @CreateNewCampaign
        Scenario: Validate new campaign functionality
        When I should be in the home page and click on Distribution tab
        And I click on campaign tab
        And I click on create new campaign button
        And I enter campaign name as "SmokeSuite" and I click on create button
        And I click on copy from list option
        And I enter list name to copy as "raji test"
        And I click on Ok button
        And I enter From email as
        And I select press release name to send campaign
        And I click on send button in Campaign page
        Then I should able to see the campaign created

     @DeleteCampaign
     Scenario: Validate delete campaign functionality
       When I should be in the home page and click on Distribution tab
       And I click on campaign tab
       And I click on search icon on campaign tab
       And I enter campaign name as "SmokeSuite" and I click on the name
       And I click on the menu to select delete option
       And I click on delete button and I click on confirm delete button
       And I click on search icon on campaign tab
       And I enter campaign name as "SmokeSuite"
       Then I should able to see the campaign deleted

  @DeletePressRelease
  Scenario: Validate delete press release functionality
    When I should be in the home page and click on Distribution tab
    And I click on search icon on press release tab
    And I enter press release name as "smokeTest" and I click on the name
    And I click on the menu to select delete option
    And I click on delete button and I click on confirm delete button
    And I click on search icon on press release tab
    And I enter press release name as "smokeTest"
    Then I should able to see the press release deleted