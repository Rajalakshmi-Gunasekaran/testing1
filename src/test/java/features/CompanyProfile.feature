Feature: CompanyProfile
  As a User
  I should be able to see all the header tabs and all information about the company on both left hand and right hand side

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

    @1
  Scenario: Validate all information and header tabs are displays in Company profile
    When I should login into the home page and click on Quick search tab
    And I enter Company name as "Apple"
    And I choose company from the list and Click on it
    And I should see all the available information about the company
    Then I should see all the header tabs in company profile page

    @2
  Scenario: Validate changing timeframe from dropdown options
    When I should login into the home page and click on Quick search tab
    And I enter Company name as "Apple"
    And I choose company from the list and Click on it
    And I change time frame by choosing and clicking time frame options
    Then I should see the results for the filtered time frame

   @3
    Scenario: Validate adding company to the stream alerts
      When I should login into the home page and click on Quick search tab
      And I enter Company name as "Apple"
      And I choose company from the list and Click on it
      And I click add to streams button to add into streams
      And I enter stream name as "companyStreams" to create and click ok
      And I click on streams
      And I choose and click on companyStreams
      Then I should delete companyStreams

   @4
   Scenario: Validate View all button in company profile page
     When I should login into the home page and click on Quick search tab
     And I enter Company name as "Apple"
     And I choose company from the list and Click on it
     And I click on view all button
     Then I should able to see all topics over the period

   @5
   Scenario: Validate back button in topic content panel in coverage tab
     When I should login into the home page and click on Quick search tab
     And I enter Company name as "Apple"
     And I choose company from the list and Click on it
     And I choose and click topic headline to see articles
     And I click back button to go back to topic chart view
     Then I should be back in the topic chart view

   @6
   Scenario: Validate back button in topic content panel in coverage tab
     When I should login into the home page and click on Quick search tab
     And I enter Company name as "Apple"
     And I choose company from the list and Click on it
     And I choose and click journo name to see the articles
     And I click back button to go back to the journo chart
     Then I should be back in the journo chart view

  @7
  Scenario: Validate Journo links in headline tab navigate to journo profile
    When I should login into the home page and click on Quick search tab
    And I enter Company name as "Apple"
    And I choose company from the list and Click on it
    And I click on header tab in company profile
    And I click on journo name link
    Then I should navigate to the journo profile page

  @8
  Scenario: Validate add journo to streams in headline tab by adding journo to the stream
    When I should login into the home page and click on Quick search tab
    And I enter Company name as "Apple"
    And I choose company from the list and Click on it
    And I click on header tab in company profile
    And I choose and click a journo to add to streams
    And I click add journo to streams button
    And I enter stream name as "companyStreams" in add journo pop up and click ok
    And I click on streams
    And I choose and click on companyStreams
    Then I should delete companyStreams

    @9
    Scenario: Validate add to streams from headline tab by adding journo to the stream
      When I should login into the home page and click on Quick search tab
      And I enter Company name as "Apple"
      And I choose company from the list and Click on it
      And I click on header tab in company profile
      And I choose and click a journo to add to streams
      And I click add to streams button to add into streams
      And I enter stream name as "companyStreams" to create and click ok
      And I click on streams
      And I choose and click on companyStreams
      Then I should delete companyStreams

  @10
  Scenario: Validate add to lists from headline tab by adding journo to the list
    When I should login into the home page and click on Quick search tab
    And I enter Company name as "Apple"
    And I choose company from the list and Click on it
    And I click on header tab in company profile
    And I choose and click a journo to add to lists
    And I click add journo to lists button
    And I enter list name in headline tab company profile to create list as "companyLists"
    And click ok button to create list from company profile
    And I click on lists tab
    And I choose and click on companyLists
    Then I should delete companyLists