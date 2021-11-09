Feature:ReadyMadeList
  As a User
  I should be able to login and search for ready made lists using advanced search filters

  Background: Logged in to the application
    Given I navigate to application login url
    When I enter Username
    And I enter password
    And I click on login button
    Then I should be able to login successfully

  @smoke
  Scenario:Validate search ready made lists filtered by outlet
    When I should login into the home page and click on search tab
    And I click on ready made list tab from the left hand side
    And I choose and click on list
    And I Click on outlet name and enter outlet name as "BBC Two"
    Then I should see the Journalist list for the selected outlet in ready made lists

  @functional
  Scenario:Validate search ready made lists inside folders and filtered by job title
    When I should login into the home page and click on search tab
    And I click on ready made list tab from the left hand side
    And I choose folder and click on it
    And I choose and click on list inside selected folder
    And I Click on job title and enter job title as "Business"
    Then I should see the Journalist list for the selected job title in ready made lists

  @functional
  Scenario:Validate ready made lists home page and go back using collapsible chevron
    When I should login into the home page and click on search tab
    And I click on ready made list tab from the left hand side
    And I click on collapsible chevron
    Then I should see the ready made list home page

  @functional
  Scenario:Validate Download all button in ready made lists
    When I should login into the home page and click on search tab
    And I click on ready made list tab from the left hand side
    And I choose RML and click on it
    And I click on Download all button
    And I click desk from left hand side column selection
    And I click desk from right hand side to remove it
    Then I should click cancel button


