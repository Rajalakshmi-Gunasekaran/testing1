package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

public class Search extends BaseStep {
    public SearchPage search = new SearchPage(webDriver);
    public ListsPage listsPage = new ListsPage(webDriver);
    public OutletProfilePage outletProfilePage = new OutletProfilePage(webDriver);
    public JournoProfilePage journoProfilePage = new JournoProfilePage(webDriver);

    @When("^I should login into the home page and click on Quick search tab$")
    public void i_should_login_into_the_home_page_and_click_on_Quick_search_tab() throws Exception
    {
        webDriver.get(readPropertyFile1("url1"));
        wait(10);
        search.setClkQuickSearch();
    }

    @When("^I enter Journalist name as \"(.*?)\"$")
    public void i_enter_Journalist_name_as(String journoName) throws InterruptedException
    {
        search.enterSearchJourno(journoName);
        wait(10);
    }

    @When("^I choose Journalist from the list and Click on it$")
    public void i_choose_Journalist_from_the_list_and_Click_on_it() throws InterruptedException
    {
        wait(30);
        search.chooseJournalist();
    }

    @Then("^I should navigate to the Journalist profile page$")
    public void i_should_navigate_to_the_Journalist_profile_page() throws InterruptedException
    {
        search.goToJournoProfile();
    }

    @When("^I enter Desk name as \"(.*?)\"$")
    public void i_enter_Desk_name_as(String deskName) throws InterruptedException
    {
        search.enterSearchDesk(deskName);
        wait(10);
    }

    @When("^I choose Desk from the list and Click on it$")
    public void i_choose_Desk_from_the_list_and_Click_on_it() throws InterruptedException
    {
        search.chooseDesk();
        wait(30);
    }

    @Then("^I should navigate to the Desk profile page$")
    public void i_should_navigate_to_the_Desk_profile_page() throws InterruptedException
    {
        search.goToDeskProfile();
    }

    @When("^I enter Outlet name as \"(.*?)\"$")
    public void i_enter_Outlet_name_as(String outletName) throws InterruptedException
    {
        search.enterSearchOutlet(outletName);
        wait(10);
    }

    @When("^I choose Outlet from the list and Click on it$")
    public void i_choose_Outlet_from_the_list_and_Click_on_it() throws InterruptedException
    {
        pauseFor(5);
        search.chooseOutlet();
        wait(30);
    }

    @Then("^I should navigate to the Outlet profile page$")
    public void i_should_navigate_to_the_Outlet_profile_page()throws InterruptedException
    {
        search.goToOutletProfile();
    }

    @When("^I enter Company name as \"(.*?)\"$")
    public void i_enter_Company_name_as(String company) throws InterruptedException
    {
        search.enterSearchCompany(company);
        wait(10);
    }

    @When("^I choose Company from the list and Click on it$")
    public void i_choose_Company_from_the_list_and_Click_on_it()throws InterruptedException
    {
        search.chooseCompany();
        wait(10);
    }

    @Then("^I should navigate to the Company profile page$")
    public void i_should_navigate_to_the_Company_profile_page()throws InterruptedException
    {
        search.goToCompanyProfile();
    }

    @Then("^I should see all the available information about the journalist$")
    public void i_should_see_all_the_available_information_about_the_journalist() throws InterruptedException
    {
        wait(10);
        outletProfilePage.validateJournoDisplay();
    }

    @Then("^I should see all the header tabs in journalist profile page$")
    public void i_should_see_all_the_header_tabs_in_journalist_profile_page() throws InterruptedException
    {
        wait(10);
        journoProfilePage.validateAllHeaderTabs();
        wait(10);
        journoProfilePage.validateCoverageTab();
        wait(20);
        journoProfilePage.validateHeadlinesTab();
        wait(20);
        journoProfilePage.validateTwitterTab();
    }

    @Then("^I should see all the available desks for that particular outlet$")
    public void i_should_see_all_the_available_desks_for_that_particular_outlet() throws InterruptedException
    {
        wait(30);
        outletProfilePage.validateDeskDisplay();
    }

    @Then("^I should see all the available tabs for that particular outlet$")
    public void i_should_see_all_the_available_tabs_for_that_particular_outlet() throws InterruptedException
    {
        wait(30);
        outletProfilePage.validateAllTabsINOutlet();
    }

    @Then("^I should see all the available information about the ACL journalist$")
    public void i_should_see_all_the_available_information_about_the_ACL_journalist() throws InterruptedException
    {
        wait(30);

    }
    @When("^I click on In lists button$")
    public void i_click_on_In_lists_button() throws InterruptedException {
      wait(30);
      journoProfilePage.setClickInListButton();
    }

    @When("^I click on search list icon and I enter list name in the search field as \"([^\"]*)\" to add journo$")
    public void i_click_on_search_list_icon_and_I_enter_list_name_in_the_search_field_as_to_add_journo(String automationList) throws InterruptedException {
       wait(30);
       journoProfilePage.setEnterListNameToAdd(automationList);
    }

    @When("^I click on the list from the list options$")
    public void i_click_on_the_list_from_the_list_options() throws InterruptedException {
      wait(30);
      journoProfilePage.setClickOnAutomationList();
    }

    @When("^I should see the added list on the right hand side pan$")
    public void i_should_see_the_added_list_on_the_right_hand_side_pan() throws InterruptedException {
      wait(30);
      journoProfilePage.setValidateJournoAddedToList();
    }

    @When("^I click on remove cross mark on the list name$")
    public void i_click_on_remove_cross_mark_on_the_list_name() throws InterruptedException {
wait(30);
journoProfilePage.setClickRemoveFromList();
    }

    @Then("^I should see the list removed from the journo page$")
    public void i_should_see_the_list_removed_from_the_journo_page() throws InterruptedException {
wait(30);
journoProfilePage.setValidateJournoRemovalFromList();
    }
    @When("^I click on add to list short link$")
    public void i_click_on_add_to_list_short_link() throws InterruptedException {
        wait(30);
        search.setClickAddToList();
    }
    @When("^I enter quick search list name as \"([^\"]*)\" and I click on Ok to create new list from quick search$")
    public void i_enter_quick_search_list_name_as_and_I_click_on_Ok_to_create_new_list_from_quick_search(String listName) throws InterruptedException {
    wait(30);
    search.setEnterQuickSearchListNameToCreate(listName);
    wait(30);
    search.setClickOkToCreateQuickSearchList();
    }

    @When("^I close the quick search bar$")
    public void i_close_the_quick_search_bar() throws InterruptedException {
        pauseFor(5);
        search.setCloseQuickSearchBar();
    }

    @When("^I click on lists tab in home page$")
    public void i_click_on_lists_tab_in_home_page() throws InterruptedException {
        wait(30);
        listsPage.clickListsBtn();
    }

    @When("^I should see the Journalist added to the list$")
    public void i_should_see_the_Journalist_added_to_the_list() throws InterruptedException {
       wait(30);
       listsPage.validateJournoAddedToQuickSearchList();
    }

    @Then("^I delete the list and confirm deletion$")
    public void i_delete_the_list_and_confirm_deletion() throws InterruptedException {
       wait(30);
       listsPage.setDeleteListBtn();
    }
    @When("^I choose journo to add activity$")
    public void i_choose_journo_to_add_activity() throws InterruptedException {
        wait(30);
        outletProfilePage.chooseJournoToAddActivity();
    }

    @When("^I click on add activity for the journo$")
    public void i_click_on_add_activity_for_the_journo() throws InterruptedException {
        pauseFor(5);
        outletProfilePage.setClickAddActivity();
    }
    @When("^I enter subject for an activity as \"([^\"]*)\"$")
    public void i_enter_subject_for_an_activity_as(String enterSubject) throws InterruptedException {
        wait(30);
        outletProfilePage.setEnterSubjectForActivity(enterSubject);
    }

    @When("^I click on save button to add activity$")
    public void i_click_on_save_button_to_add_activity() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickSaveBtn();
    }

    @When("^I click on activities tab$")
    public void i_click_on_activities_tab() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickActivityTab();
    }

    @When("^I should see the activity added for the journo$")
    public void i_should_see_the_activity_added_for_the_journo() throws InterruptedException {
       wait(30);
       outletProfilePage.validateActivityForJourno();
    }

    @Then("^I delete and confirm delete activity$")
    public void i_delete_and_confirm_delete_activity() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickDeleteActivity();
    }
    @When("^I choose desk and click on it$")
    public void i_choose_desk_and_click_on_it() throws InterruptedException {
        wait(30);
        outletProfilePage.chooseDeskForJournos();
    }

    @When("^I should see the journo for the selected desks$")
    public void i_should_see_the_journo_for_the_selected_desks() throws InterruptedException {
       wait(30);
       outletProfilePage.validateJournoForChosenDesk();
    }

    @When("^I click on clear all button$")
    public void i_click_on_clear_all_button() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickClearAll();
    }

    @Then("^I should see journos for all the desks$")
    public void i_should_see_journos_for_all_the_desks() throws InterruptedException {
       wait(30);
       outletProfilePage.validateAllJournosForAllDesks();
    }
    @When("^I click on hide in group button$")
    public void i_click_on_hide_in_group_button() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickHide();
    }

    @When("^I should see the journo hide in group$")
    public void i_should_see_the_journo_hide_in_group() throws InterruptedException {
       wait(30);
       outletProfilePage.validateHideJourno();
    }

    @When("^I click on un hide in group button$")
    public void i_click_on_un_hide_in_group_button() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickUnhide();
    }

    @Then("^I should see journos are un hide in group$")
    public void i_should_see_journos_are_un_hide_in_group() throws InterruptedException {
       wait(30);
       outletProfilePage.validateUnHideJourno();
    }
    @When("^I click on select in group button$")
    public void i_click_on_select_in_group_button() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickSelectInGroup();
    }

    @When("^I should see the journo selected in group$")
    public void i_should_see_the_journo_selected_in_group() throws InterruptedException {
        wait(30);
        outletProfilePage.validateJournoSelectInGroup();
    }

    @When("^I click on deselect in group button$")
    public void i_click_on_deselect_in_group_button() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickDesselectJourno();
    }

    @Then("^I should see journos are deselected in group$")
    public void i_should_see_journos_are_deselected_in_group() throws InterruptedException {
       wait(30);
       outletProfilePage.validateJournoDeselect();
    }
    @When("^I click on add to favourites button$")
    public void i_click_on_add_to_favourites_button() throws InterruptedException {
        pauseFor(5);
        outletProfilePage.setClickAddToFavouritesBtn();
    }

    @When("^I click on home button to go back to home page$")
    public void i_click_on_home_button_to_go_back_to_home_page() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickHomeBtn();
    }

    @When("^I click on favourite outlets tab$")
    public void i_click_on_favourite_outlets_tab() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickFavouritesOutletTab();
    }

    @Then("^I should see the outlet added to favourite outlets tab$")
    public void i_should_see_the_outlet_added_to_favourite_outlets_tab() throws InterruptedException {
        pauseFor(5);
        outletProfilePage.validateOutletAddedToFavourites();
    }
    @When("^I click on Quick search tab$")
    public void i_click_on_Quick_search_tab() throws InterruptedException {
        wait(30);
        search.setClkQuickSearch();
    }

    @Then("^I should uncheck favourite button in outlet profile page$")
    public void i_should_uncheck_favourite_button_in_outlet_profile_page() throws InterruptedException {
     wait(30);
     outletProfilePage.setClickAddToFavouritesBtn();
    }
    @When("^I click on sector for the chosen journo$")
    public void i_click_on_sector_for_the_chosen_journo() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickOnSectorInJournoTile();
    }

    @Then("^I should see all the available sector for that particular journo$")
    public void i_should_see_all_the_available_sector_for_that_particular_journo() throws InterruptedException {
       wait(30);
       outletProfilePage.validateSectorResultsInJournoTile();
    }
    @When("^I click on coverage for the chosen journo$")
    public void i_click_on_coverage_for_the_chosen_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickCoverage();
    }

    @Then("^I should see all the available topic coverage for that particular journo$")
    public void i_should_see_all_the_available_topic_coverage_for_that_particular_journo() throws InterruptedException {
       wait(30);
       outletProfilePage.setValidateCoverageLinkResult();
    }
    @When("^I click on tweets for the chosen journo$")
    public void i_click_on_tweets_for_the_chosen_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickTweetInJournotile();
    }

    @Then("^I should see all the available tweets for that particular journo$")
    public void i_should_see_all_the_available_tweets_for_that_particular_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.setValidateTweetLinkResult();
    }
    @When("^I click on instagram for the chosen journo$")
    public void i_click_on_instagram_for_the_chosen_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickInstagramInJournoTile();
    }

    @Then("^I should see all the available Instagram results for that particular journo$")
    public void i_should_see_all_the_available_Instagram_results_for_that_particular_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.setValidateInstagramResults();
    }
    @When("^I click on alerts tab$")
    public void i_click_on_alerts_tab() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickAlertsTab();
    }

    @When("^I enter quick find by keyword as \"([^\"]*)\"$")
    public void i_enter_quick_find_by_keyword_as(String keyword) throws Throwable {
        wait(30);
        outletProfilePage.setEnterQuickFindByKeyword(keyword);
    }
    @Then("^I should see the result for the search keyword$")
    public void i_should_see_the_result_for_the_search_keyword() throws InterruptedException {
     wait(30);
     outletProfilePage.validateKeywordSearchResult();
    }
    @When("^I enter journo name to search as \"([^\"]*)\"$")
    public void i_enter_journo_name_to_search_as(String searchName) throws InterruptedException {
        wait(30);
        outletProfilePage.setEnterSearchByNameJournoSearch(searchName);
    }

    @Then("^I should see the searched journo at the top$")
    public void i_should_see_the_searched_journo_at_the_top() throws InterruptedException {
        wait(30);
        outletProfilePage.validateSearchByNameJournoResult();
    }
    @When("^I click on group by button$")
    public void i_click_on_group_by_button() throws InterruptedException {
      wait(30);
      outletProfilePage.setClickGroupByButton();
    }

    @When("^I click on Un-group option from the list$")
    public void i_click_on_Un_group_option_from_the_list() throws InterruptedException {
     wait(30);
     outletProfilePage.setClickUnGroupOption();
    }

    @When("^I should see the results for un grouping$")
    public void i_should_see_the_results_for_un_grouping() throws InterruptedException {
     wait(30);
     outletProfilePage.validateUnGroupresults();
    }

    @When("^I click on sort direction button$")
    public void i_click_on_sort_direction_button() throws InterruptedException {
     wait(30);
     outletProfilePage.setClickSortDirection();
    }

    @Then("^I should see the results for sorting direction$")
    public void i_should_see_the_results_for_sorting_direction() throws InterruptedException {
        wait(30);
        outletProfilePage.validateJournoSortDirection();
    }
    @Then("^I should see the contact details for selected outlet$")
    public void i_should_see_the_contact_details_for_selected_outlet() throws InterruptedException {
       wait(30);
       outletProfilePage.validateContactDetails();
    }
    @When("^I choose and click on journalist link in alerts tile$")
    public void i_choose_and_click_on_journalist_link_in_alerts_tile() throws InterruptedException {
        wait(30);
        outletProfilePage.chooseAndClickJournoLink();
    }

    @Then("^I should navigate to the respective journo page$")
    public void i_should_navigate_to_the_respective_journo_page() throws InterruptedException {
        wait(30);
        outletProfilePage.validateJournoLinkRedirectsToJournoPage();
    }
    @When("^I click on PR opportunity tab$")
    public void i_click_on_PR_opportunity_tab() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickPROpportunityTab();
    }

    @When("^I choose and click on sections as Home Interest$")
    public void i_choose_and_click_on_sections_as_Home_Interest() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickSectionHomeInterest();
    }

    @Then("^I should validate results for the section search$")
    public void i_should_validate_results_for_the_section_search() throws InterruptedException {
        wait(30);
        outletProfilePage.validateSectionFilterSearchResult();
    }
}