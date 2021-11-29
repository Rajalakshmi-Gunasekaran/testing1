Feature: Distribution
  As a User
  I should be able to create press releases and send campaigns

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:AValidate new press release functionality
    When I should be in the home page and click on Distribution tab
    And I click on create new press release button
    And I enter press release name as "SmokeTest" and I click on create button
    And I click header block to enter text
    And I enter header as "Raji is a QA" and I click ok
    And I click body block to enter text
    And I enter body as "The press release can be added in the body template"
    Then I should able to see the created press release

   @functional13
     Scenario: validate edit press release functionality
     When I should be in the home page and click on Distribution tab
     And I click on search icon on press release tab
     And I enter press release name as "Functional Test"
     And I click on selected press release
     And I edit content by adding block
     Then I should see the edited press release

  @smoke
  Scenario:BValidate new campaign functionality
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

    @functional14
    Scenario: validate archive and unarchive press release
      When I should be in the home page and click on Distribution tab
    And I click on search icon on press release tab
    And I enter press release name as "smokeTest" and I click on the name
    And I click on the menu to select archive option
    And I click on archive press release
    And I click on archived press release tab
    And I click on search icon on archive tab
    And I enter press release name as "smokeTest" in archived and I click on the name
    And I click on the menu to select unarchive option
    And I click on press release tab
    And I click on search icon on press release tab
    And I enter press release name as "smokeTest"
    Then I should see the unarchived press release

@functional15
  Scenario: validate archive and unarchive campaign
    When I should be in the home page and click on Distribution tab
    And I click on campaign tab
    And I click on search icon on campaign tab
    And I enter campaign name as "SmokeSuite" and I click on the name
    And I click on the menu to select archive option
    And I click on archive campaign
    And I click on archived campaign tab
    And I click on search icon on archive tab
    And I enter campaign name to un archive as "SmokeSuite" and I click on the name
    And I click on the menu to select unarchive option
    And I click on campaign tab
    And I click on search icon on campaign tab
    And I enter campaign name as "SmokeSuite"
    Then I should see the unarchived campaign

  @smoke
  Scenario:CValidate delete campaign functionality
    When I should be in the home page and click on Distribution tab
    And I click on campaign tab
    And I click on search icon on campaign tab
    And I enter campaign name as "SmokeSuite" and I click on the name
    And I click on the menu to select delete option
    And I click on delete button and I click on confirm delete button
    And I click on search icon on campaign tab
    And I enter campaign name as "SmokeSuite"
    Then I should able to see the campaign deleted

  @smoke
  Scenario:DValidate delete press release functionality
    When I should be in the home page and click on Distribution tab
    And I click on search icon on press release tab
    And I enter press release name as "smokeTest" and I click on the name
    And I click on the menu to select delete option
    And I click on delete button and I click on confirm delete button
    And I click on search icon on press release tab
    And I enter press release name as "smokeTest"
    Then I should able to see the press release deleted

    @functional16
    Scenario: Validate view campaign functionality
      When I should be in the home page and click on Distribution tab
      And I click on campaign tab
      And I click on search icon on campaign tab
      And I enter campaign name as "functional testing"
      And I click on the name
      Then I should see the campaign report

    @functional17
    Scenario:BValidate creating, duplicating and deleting block
      When I should be in the home page and click on Distribution tab
      And I click on Blocks tab
      And I click on create new block button
      And I enter block name as "FunctionalTesting" and I click on create button
      And I click on insert link from header section
      And I enter URL as "RoxhillMedia.com"
      And I click on Ok button in the insert link dialog box
      And I click on save button in the block page
      And I click on duplicate button to make a copy of block
      Then I should delete the block

  @functional18
  Scenario:BValidate editing, clear contents and deleting block
    When I should be in the home page and click on Distribution tab
    And I click on Blocks tab
    And I choose block name from list
    And I click on clear content button and confirm clear in block
    And I click on save button in the block page
    Then I should delete the block

  @functional69
  Scenario: Validate creating new campaign using new campaign button and add recipients manually by add recipient button
    When I should be in the home page and click on Distribution tab
    And I click on campaign tab
    And I click on new campaign button in right hand side campaign home page
    And I enter new campaign name as "Automation"
    And I click on create button to create new campaign
    And I click on Add Recipient button
    And I enter email address
    And I enter first name as "QA"
    And I enter last name as "Test"
    And I click on add button
    And I enter From email as
    And I click on save button in the new campaign page
    Then I should delete the campaign

  @functional70
  Scenario: Validating creating and deleting press release from right hand side options
    When I should be in the home page and click on Distribution tab
    And I click on new press release button
    And I enter new press release name as "Testing"
    And I click on create button to create new press release
    Then I should delete the press release

  @functional71
  Scenario: Validate creating campaign from press release page using start campaign button
    When I should be in the home page and click on Distribution tab
    And I choose and click on press release
    And I click on start campaign button
    And I enter campaign name from press release as "Automation" and I click on create button
    And I click on choose journalist by name
    And I enter journalist name as "Matt Simon" and I click on Ok button to add recipient
    And I enter From email as
    And I click on save button in the new campaign page
    Then I should delete the campaign

  @functional72
  Scenario: Validate view press release from campaign page
    When I should be in the home page and click on Distribution tab
    And I click on campaign tab
    And I choose and click on campaign
    And I click on view press release link
    Then I should see the press release

