Feature: Organization
  As a User
  I should be able to login and create customers, media outlets and PR agencies

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @CreateCompany
  Scenario:Validate create and delete company
    When I should login into the home page and click on Organization tab
    And I click on companies from the list
    And I click add new button in companies page
    And I enter company name as "Automation Testing"
    And I click save button to create company
    And I should navigate to the company profile page
    And I click on companies link
    And I enter search company name as "Automation Testing"
    Then I should delete the newly created company

  @CreateMediaOutlet
  Scenario:Validate create and delete media outlet
    When I should login into the home page and click on Organization tab
    And I click on media outlets from the list
    And I click add new button in media outlet page
    And I enter media outlet name as "Automation Testing"
    And I click and choose media outlet types as wilderness
    And I click save button to create media outlet
    And I should navigate to the media outlet profile page
    And I click on media outlet link
    And I enter search media outlet name as "Automation Testing"
    Then I should delete the newly created media outlet

  @CreatePRAgencies
  Scenario:Validate create and delete PR Agencies
    When I should login into the home page and click on Organization tab
    And I click on Pr Agencies from the list
    And I click add new button in PR Agencies page
    And I enter PR Agencies name as "Automation Testing"
    And I click save button to create PR agencies
    And I should navigate to the PR Agencies profile page
    And I enter PR agencies search text in search field as "Automation Testing"
    Then I should delete the newly created PR Agencies

  @companyWithNoLogo
  Scenario: Validate company with no logo tab
    When I should login into the home page and click on Organization tab
    And I click on no logo from the list
    And I choose and click on no logo company link
    Then I should navigate to the profile page for the selected link

 @ValidatePrAgencies
  Scenario: Validate Pr Agencies tab
    When I should login into the home page and click on Organization tab
    And I click on Pr Agencies from the list
    And I choose and click on Pr agencies link
    And I should navigate to the profile page for the selected link
    And I click Customer tab to navigate to respective page
    And I click Logo tab to navigate to respective page
    And I click Divisions tab to navigate to respective page
    And I click Persons tab to navigate to respective page
    And I click Aliases tab to navigate to respective page
    And I click Tickets tab to navigate to respective page
    And I click Logs tab to navigate to respective page
    And I click ACL tab to navigate to respective page
    Then I click Working sets to navigate to respective page

  @ValidateMediaOutlets
  Scenario: Validate Media outlets tab
    When I should login into the home page and click on Organization tab
    And I click on media outlets from the list
    And I enter search media outlets as "Roxhill wilderness"
    And I click chosen media outlet from the list
    Then I should navigate to the media outlet profile page

  @ValidateCompanies
  Scenario: Validate companies tab
    When I should login into the home page and click on Organization tab
    And I click on companies from the list
    And I enter search company name as "Apple"
    And I click chosen company from the list
    Then I should navigate to the company profile page

  @MergeDuplicateOutlet
  Scenario: Validate merging duplicate outlet
    When I should login into the home page and click on Organization tab
    And I click on media outlets from the list
    And I enter search media outlets as "Automation Testing"
    And I click media outlet and I should navigate to the media outlet profile page
    And I click on duplicates tab
    And I enter search ID in text field as "208924" and click search icon
    And I click merge button to merge outlet
    Then I should see the journalist merged

