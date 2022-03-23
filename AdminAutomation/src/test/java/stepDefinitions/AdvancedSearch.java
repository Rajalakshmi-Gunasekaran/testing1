package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdvancedSearchPage;
import pageObjects.ListsPage;

public class AdvancedSearch extends BaseStep {

    public AdvancedSearchPage advancedSearchPage;
    public ListsPage listsPage;

    /* Journalist search using advanced search filtering by outlet type and outlet */
    @When("^I should login into the home page and click on search tab$")
    public void i_should_login_into_the_home_page_and_click_on_search_tab() throws Exception {
        advancedSearchPage = new AdvancedSearchPage(webDriver);
        listsPage = new ListsPage(webDriver);
        webDriver.get(readPropertyFile1("url2"));
        wait(60);
        advancedSearchPage.clickAdvancedSearch();
    }

    @When("^I click on outlet type and enter outlet type as \"(.*?)\"$")
    public void i_click_on_outlet_type_and_enter_outlet_type_as(String outletType)throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.enterOutletType(outletType);
    }

    @When("^I Click on outlet name and enter outlet name as \"(.*?)\"$")
    public void i_Click_on_outlet_name_and_enter_outlet_name_as(String outletName) throws InterruptedException{

        pauseFor(5);
        advancedSearchPage.enterOutletName(outletName);
        pauseFor(5);
    }

    @Then("^I should see the Journalist list for the selected outlet$")
    public void i_should_see_the_Journalist_list_for_the_selected_outlet() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.setValidateOutletSearch();
    }

    /* Group By icon functionality in advanced search */
    @When("^I click on Group-By icon$")
    public void i_click_on_Group_By_icon() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.clickGroupByIcon();
    }

    @When("^I choose country as Group-By$")
    public void i_choose_country_as_Group_By() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.clickCountryGroupBy();
    }

    @Then("^I should able to see the journalist list grouped by country$")
    public void i_should_able_to_see_the_journalist_list_grouped_by_country() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.validateListGroupedByCountry();
    }

    /* Change Info view functionality in advanced search */
    @When("^I click on change info icon$")
    public void i_click_on_change_info_icon() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.clickChangeInfo();
    }

    @When("^I choose info as Roxhill says$")
    public void i_choose_info_as_Roxhill_says()throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.chooseInfo();
    }

    @Then("^I should able to see the journalist list view by Roxhill says inside the tile$")
    public void i_should_able_to_see_the_journalist_list_view_by_Roxhill_says_inside_the_tile() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.validateJournalistInfo();
    }
    @When("^I click on add journalist to list button$")
    public void i_click_on_add_journalist_to_list_button() throws InterruptedException {
       pauseFor(5);
       advancedSearchPage.setClickAddJournoToListBtn();
    }

    @When("^I enter list name from the advanced search journalist tab as \"([^\"]*)\" and click ok$")
    public void i_enter_list_name_from_the_advanced_search_journalist_tab_as_and_click_ok(String advancedSearchList) throws InterruptedException {
        wait(60);
        advancedSearchPage.enterListNameToCreateAdvancedSearchList(advancedSearchList);
        pauseFor(5);
        advancedSearchPage.clickOkToCopyListFromAdvancedSearch();
        pauseFor(5);
    }

    @When("^I click on list tab in home page$")
    public void i_click_on_list_tab_in_home_page() throws InterruptedException {
        pauseFor(5);
        listsPage.clickListsBtn();
    }
    @When("^I click on search icon in the list page to look for advancedSearch list$")
    public void i_click_on_search_icon_in_the_list_page_to_look_for_advancedSearch_list() throws InterruptedException {
      wait(60);
      listsPage.searchIcon();
    }

    @When("^I enter list name in lists as \"([^\"]*)\" and click on it to validate the lists$")
    public void i_enter_list_name_in_lists_as_and_click_on_it_to_validate_the_lists(String listName) throws InterruptedException {
        pauseFor(5);
        listsPage.enterListNameToValidate(listName);
        wait(60);
        listsPage.setClickOnAdvancedSearchListToValidate();
    }

    @When("^I validate journo added to the list from advanced search$")
    public void i_validate_journo_added_to_the_list_from_advanced_search() throws InterruptedException {
        pauseFor(5);
        listsPage.validateJournoAddedToListFromAdvancedSearch();
    }

    @Then("^I should delete the list$")
    public void i_should_delete_the_list() throws InterruptedException {
        wait(60);
        listsPage.clickListsBtn();
    }
    @When("^I click on outlets tab from the left hand side pan$")
    public void i_click_on_outlets_tab_from_the_left_hand_side_pan() throws InterruptedException {
        wait(60);
       advancedSearchPage.setClickOutletTab();
    }
    @When("^I Click on sector and enter sector name as \"([^\"]*)\"$")
    public void i_Click_on_sector_and_enter_sector_name_as(String sector) throws InterruptedException {
        wait(60);
        advancedSearchPage.enterSectorName(sector);
    }

    @When("^I click on frequency and choose frequency as weekly$")
    public void i_click_on_frequency_and_choose_frequency_as_weekly() throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.setClickFrequency();
    }

    @When("^I click on any town or post code text field and enter post code as \"([^\"]*)\"$")
    public void i_click_on_any_town_or_post_code_text_field_and_enter_post_code_as(String postcode) throws InterruptedException {
       pauseFor(5);
       advancedSearchPage.enterPostCode(postcode);
    }

    @Then("^I should see the outlets listed for the search criteria$")
    public void i_should_see_the_outlets_listed_for_the_search_criteria() throws InterruptedException {
        wait(60);
        advancedSearchPage.seValidateOutletSearch();
    }
    @When("^I Click on based in country and choose country as United Kingdom$")
    public void i_Click_on_based_in_country_and_choose_country_as_United_Kingdom() throws InterruptedException {
       wait(60);
       advancedSearchPage.setClickBasedInCountry();
    }

    @When("^I click on based in localities and enter locality as \"([^\"]*)\"$")
    public void i_click_on_based_in_localities_and_enter_locality_as(String locality) throws InterruptedException {
        wait(60);
        advancedSearchPage.setEnterLocality(locality);
    }

    @When("^I enter keyword as \"([^\"]*)\"$")
    public void i_enter_keyword_as(String keyword) throws InterruptedException {
       wait(60);
       advancedSearchPage.enterKeyword(keyword);
    }

    @When("^I choose outlet to see the hits$")
    public void i_choose_outlet_to_see_the_hits() throws InterruptedException {
       wait(60);
       advancedSearchPage.setChooseOutletHits();
    }

    @Then("^I should see the tweets for the relevant search$")
    public void i_should_see_the_tweets_for_the_relevant_search() throws InterruptedException {
       wait(60);
       advancedSearchPage.validateTweetsForOutlets();
    }
    @When("^I click on articles tab from the left hand side pan$")
    public void i_click_on_articles_tab_from_the_left_hand_side_pan() throws InterruptedException {
        wait(60);
        advancedSearchPage.setClickArticleTab();
    }

    @When("^I enter company as \"([^\"]*)\"$")
    public void i_enter_company_as(String company) throws InterruptedException {
       wait(60);
       advancedSearchPage.enterCompany(company);
    }

    @Then("^I should see the articles for the relevant search$")
    public void i_should_see_the_articles_for_the_relevant_search() throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.setValidateArticleSearchResults();
    }
    @When("^I click on journalist alerts tab from the left hand side pan$")
    public void i_click_on_journalist_alerts_tab_from_the_left_hand_side_pan() throws InterruptedException {
        wait(60);
        advancedSearchPage.setJournoAlertsTab();
    }

    @When("^I Click on outlet and enter outlet name as \"([^\"]*)\"$")
    public void i_Click_on_outlet_and_enter_outlet_name_as(String outlet) throws InterruptedException {
       wait(60);
       advancedSearchPage.setEnterOutlet(outlet);
    }

    @Then("^I should see the journalist alerts for the relevant search$")
    public void i_should_see_the_journalist_alerts_for_the_relevant_search() throws InterruptedException {
        wait(60);
        advancedSearchPage.validateJournoAlertsResults();
    }
    @When("^I click on forward features tab from the left hand side pan$")
    public void i_click_on_forward_features_tab_from_the_left_hand_side_pan() throws InterruptedException {
         wait(60);
         advancedSearchPage.setClickForwardFeaturesTab();
    }

    @Then("^I should see the forward features for the relevant search$")
    public void i_should_see_the_forward_features_for_the_relevant_search() throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.validateForwardFeaturesResults();
    }
    @When("^I click on Activities tab from the left hand side pan$")
    public void i_click_on_Activities_tab_from_the_left_hand_side_pan() throws InterruptedException {
        wait(60);
        advancedSearchPage.setActivityTab();
    }

    @Then("^I should see the activities for the relevant search$")
    public void i_should_see_the_activities_for_the_relevant_search() throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.validateActivityForOutletSearch();
    }

    @When("^I click on media requests tab from the left hand side pan$")
    public void i_click_on_media_requests_tab_from_the_left_hand_side_pan() throws InterruptedException {
        wait(60);
        advancedSearchPage.setMediaRequestTab();
    }

    @Then("^I should see the media requests results for the relevant search$")
    public void i_should_see_the_media_requests_results_for_the_relevant_search() throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.validateMediaRequestResults();
    }
    @When("^I click on PR opportunities tab from the left hand side pan$")
    public void i_click_on_PR_opportunities_tab_from_the_left_hand_side_pan() throws InterruptedException {
        wait(60);
        advancedSearchPage.setClickPROpportunitiesTab();
    }

    @When("^I enter section as \"([^\"]*)\"$")
    public void i_enter_section_as(String section) throws InterruptedException {
        wait(60);
        advancedSearchPage.enterSection(section);
    }

    @Then("^I should see the PR Opportunities results for the relevant search$")
    public void i_should_see_the_PR_Opportunities_results_for_the_relevant_search() throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.validatePROpportunitiesResults();
    }
    @When("^I click on tweets tab from the left hand side pan$")
    public void i_click_on_tweets_tab_from_the_left_hand_side_pan() throws InterruptedException {
       wait(60);
       advancedSearchPage.setClickTweetsTab();
    }

    @When("^I enter keywords as \"([^\"]*)\"$")
    public void i_enter_keywords_as(String keyword) throws InterruptedException {
        wait(60);
        advancedSearchPage.enterKeywordForTweetSearch(keyword);
    }

    @When("^I Click on exclude retweets checkbox$")
    public void i_Click_on_exclude_retweets_checkbox() throws InterruptedException {
      wait(60);
      advancedSearchPage.clickExcludeRetweet();
    }

    @Then("^I should see the tweets results for the relevant search$")
    public void i_should_see_the_tweets_results_for_the_relevant_search() throws InterruptedException {
       pauseFor(5);
       advancedSearchPage.validateTweetResults();
    }
    @When("^I click on Instagram tab from the left hand side pan$")
    public void i_click_on_Instagram_tab_from_the_left_hand_side_pan() throws InterruptedException {
       wait(60);
       advancedSearchPage.setClickInstagramTab();
    }

    @When("^I click type of publisher and choose journalists only$")
    public void i_click_type_of_publisher_and_choose_journalists_only() throws InterruptedException {
        wait(60);
        advancedSearchPage.chooseTypeOfPublisher();
    }

    @When("^I click on outlet type and enter \"([^\"]*)\"$")
    public void i_click_on_outlet_type_and_enter(String outletType) throws InterruptedException {
       wait(60);
       advancedSearchPage.enterOutletTypeForInstaSearch(outletType);
    }

    @Then("^I should see the Instagram results for the relevant search$")
    public void i_should_see_the_Instagram_results_for_the_relevant_search() throws InterruptedException {
       pauseFor(5);
       advancedSearchPage.validateInstagramResults();
    }
    @When("^I click on clear all button at the top$")
    public void i_click_on_clear_all_button_at_the_top() throws Throwable {
       wait(60);
       advancedSearchPage.setClickClearAll();
    }

    @Then("^I should see the search filters are cleared and the result pane is empty$")
    public void i_should_see_the_search_filters_are_cleared_and_the_result_pane_is_empty() throws Throwable {
       pauseFor(5);
       advancedSearchPage.validateClearAllFiltersResult();
    }
    @When("^I choose outlet from the result and click on it$")
    public void i_choose_outlet_from_the_result_and_click_on_it() throws InterruptedException {
        wait(60);
        advancedSearchPage.setChooseAndClickOnOutlet();
    }

    @When("^I click on search all outlet's journalist button$")
    public void i_click_on_search_all_outlet_s_journalist_button() throws InterruptedException {
        wait(60);
        advancedSearchPage.setClickSearchAllOutletJournoBtn();
    }
    @When("^I click yes leave button to handle pop up window$")
    public void i_click_yes_leave_button_to_handle_pop_up_window() throws InterruptedException {
        wait(60);
        advancedSearchPage.setClickYesLeaveBtn();
    }
    @Then("^I automatically navigate to the journalist tab to see the journos for the selected outlet$")
    public void i_automatically_navigate_to_the_journalist_tab_to_see_the_journos_for_the_selected_outlet() throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.setValidateSearchAllOutletJournoBtn();
    }
}
