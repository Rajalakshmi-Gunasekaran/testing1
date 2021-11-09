Feature: JournoProfile
  As a User
  I should be able to see all the header tabs and all information about the journalist on both left hand and right hand side

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:1Validate all information and header tabs are displays in Journo profile
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I should see all the available information about the journalist
    Then I should see all the header tabs in journalist profile page

  @smoke
  Scenario: validate ACL Journalist only visible to ACL customers
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "David Deane"
    And I choose Journalist from the list and Click on it
    Then I should see all the available information about the ACL journalist

  @functional
  Scenario: validate adding Journalist and removing journo from the list in journo profile page
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on In lists button
    And I click on search list icon and I enter list name in the search field as "AutomationList" to add journo
    And I click on the list from the list options
    And I should see the added list on the right hand side pan
    And I click on remove cross mark on the list name
    Then I should see the list removed from the journo page

  @functional
  Scenario: validate adding and removing Journalist to favourites
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on add to favourites button in journo profile page
    And I click on home button
    And I click on favourite journalist tab
    And I should see the journo added to favourites
    And I click on Quick Search tab
    And I choose Journalist from the list and Click on it
    Then I un click on add to favourites button

  @functional
  Scenario: validate editing GDPR note
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on GDPR note button in journo profile page
    And I enter subject in GDPR note as "Approved"
    And I click on GDPR approved radio button
    And I click on save button in GDPR note
    And I should see the GDPR note as approved
    And I click on GDPR note button in journo profile page
    And I click GDPR status to Unknown
    And I click on save button in GDPR note
    Then I should see the GDPR note as unknown

  @functional
  Scenario: validate adding and removing journo from stream in journo profile
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on add to streams button in journo profile page
    And I click on stream name to add journo
    And I click on save button in add to streams
    And I should see the journo added to stream
    And I click on add to streams button in journo profile page
    And I click remove journo from streams
    And I click on save button in add to streams
    Then I should see journo removed from streams

  @functional
  Scenario: validate adding and deleting activity for a journo
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on notes and activity tab in journo profile page
    And I click on add activity button
    And I enter subject as "Automation Testing"
    And I click on save button in notes and activity
    And I should see the activity created for the journo
    Then I delete the activity created for the journo

  @functional
  Scenario: validate adding and deleting notes for the journo
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on notes and activity tab in journo profile page
    And I click on add notes button
    And I enter subject as "Automation Testing"
    And I click on save button in notes and activity
    And I should see the notes created for the journo
    Then I delete the notes created for the journo

  @functional
  Scenario: validate changing dates in live content tab
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click on from date in calender
    And I choose a date to filter coverage results
    Then I should see the results for the selected time period

  @functional
  Scenario: validate navigating to advanced search sector filter from journo profile page
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I choose sector and click on it
    Then I should navigate to the advanced search Journalist page

  @functional
  Scenario: validate view in tab button in live content tab
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click view in tab button to see expanded view
    And I should see the selected item in expanded view
    And I click filter button to hide filters
    Then I should hide filters in journo profile page

  @functional
  Scenario:Validate company chart view expanded as a coverage article in Journo profile
    When I should login into the home page and click on Quick search tab
    And I enter Journalist name as "simon english"
    And I choose Journalist from the list and Click on it
    And I click view in tab button to see expanded view
    And I choose and click Barclays plc link to see the coverage article for the selected item
    Then I see the articles for the coverage section
