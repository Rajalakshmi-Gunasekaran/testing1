package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

public class OutletProfile extends BaseStep{
    public LoginPage loginPage=new LoginPage(webDriver);
    public HomePage homePage=new HomePage(webDriver);
    public OutletProfilePage outletProfilePage=new OutletProfilePage(webDriver);
    
    @When("^I click on add to favourite button in outlet profile page$")
    public void i_click_on_add_to_favourite_button_in_outlet_profile_page() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickAddToFavouriteBtn();
    }

    @When("^I go back to home page$")
    public void i_go_back_to_home_page() throws InterruptedException {
       wait(30);
       homePage.setGoBackBtn();
    }

    @When("^I click on favourite outlets tab sub headers in home page$")
    public void i_click_on_favourite_outlets_tab_sub_headers_in_home_page() throws InterruptedException {
       wait(30);
       homePage.setClickFavouriteOutletTab();
    }

    @Then("^I should see outlet added to favourites from outlet profile page$")
    public void i_should_see_outlet_added_to_favourites_from_outlet_profile_page() throws InterruptedException {
        wait(30);
        homePage.validateFavouriteOutletResults();
    }
    @When("^I choose desk to see journos belong to that desk$")
    public void i_choose_desk_to_see_journos_belong_to_that_desk() throws InterruptedException {
       wait(30);
       outletProfilePage.setChooseDesks();
    }
    @When("^I should able too see the journos for the selected desks$")
    public void i_should_able_too_see_the_journos_for_the_selected_desks() throws InterruptedException {
        wait(30);
        outletProfilePage.validateAllJournoForChosenDesk();
    }
    @When("^I click clear all to clear desk selection$")
    public void i_click_clear_all_to_clear_desk_selection() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickClearAllBtn();
    }

    @Then("^I should see the results$")
    public void i_should_see_the_results() throws InterruptedException {
       pauseFor(5);
       outletProfilePage.validateClearAllDeskSelection();
    }
    @When("^I enter journo name as \"([^\"]*)\" in search field in journo tab in outlet profile page$")
    public void i_enter_journo_name_as_in_search_field_in_journo_tab_in_outlet_profile_page(String journoName) throws InterruptedException {
        wait(30);
        outletProfilePage.setEnterJournoNameToSearch(journoName);
    }

    @Then("^I should see the journo at the top tile by search name$")
    public void i_should_see_the_journo_at_the_top_tile_by_search_name() throws InterruptedException {
        wait(30);
        outletProfilePage.validateJournoSearchByTextField();
    }
    @When("^I select all in group journo tab in outlet profile page$")
    public void i_select_all_in_group_journo_tab_in_outlet_profile_page() throws InterruptedException {
        wait(30);
        outletProfilePage.setSelectAllInGroup();
    }

    @When("^I should see the journo selected in group$")
    public void i_should_see_the_journo_selected_in_group() throws InterruptedException {
       wait(30);
       outletProfilePage.validateJournoSelectedInGroup();
    }

    @When("^I click deselect all in group$")
    public void i_click_deselect_all_in_group() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickDeselectAllInGroup();
    }

    @Then("^I should see the journo deselected$")
    public void i_should_see_the_journo_deselected() throws InterruptedException {
        wait(30);
        outletProfilePage.validateJournoDeselected();
    }
    @When("^I hide journo in group journo tab in outlet profile page$")
    public void i_hide_journo_in_group_journo_tab_in_outlet_profile_page() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickHideButton();
    }

    @Then("^I should see the journo hide in group$")
    public void i_should_see_the_journo_hide_in_group() throws InterruptedException {
       wait(30);
       outletProfilePage.validateJournoHideInGroup();
    }
    @When("^I choose journo from journo tab in outlet profile page$")
    public void i_choose_journo_from_journo_tab_in_outlet_profile_page() throws InterruptedException {
       wait(30);
       outletProfilePage.setChooseJourno();
    }

    @When("^I click on add activity button$")
    public void i_click_on_add_activity_button() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickActivityBtn();
    }
    @When("^I enter subject in the activity page as \"([^\"]*)\"$")
    public void i_enter_subject_in_the_activity_page_as(String activitySubject) throws InterruptedException {
        wait(30);
        outletProfilePage.setEnterSubjectInActivity(activitySubject);
    }
    @When("^I click save to add activity$")
    public void i_click_save_to_add_activity() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickSaveActivity();
    }

    @When("^I click on activity tab in outlet profile page$")
    public void i_click_on_activity_tab_in_outlet_profile_page() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickActivityTab();
    }

    @When("^I should see the activity created for the selected journo$")
    public void i_should_see_the_activity_created_for_the_selected_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.validateJournoActivity();
    }

    @Then("^I delete the activity$")
    public void i_delete_the_activity() throws InterruptedException {
         wait(30);
         outletProfilePage.SetClickDeleteActivity();
    }
    @When("^I click coverage in journo tile in journalist tab$")
    public void i_click_coverage_in_journo_tile_in_journalist_tab() throws InterruptedException {
         wait(30);
         outletProfilePage.setClickCoverage();
    }

    @Then("^I should see the topic covered by the journo$")
    public void i_should_see_the_topic_covered_by_the_journo() throws InterruptedException {
         wait(30);
         outletProfilePage.validateCoverageOption();
    }
    @When("^I click sector in journo tile in journalist tab$")
    public void i_click_sector_in_journo_tile_in_journalist_tab() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickSector();
    }

    @Then("^I should see the sectors for the journo$")
    public void i_should_see_the_sectors_for_the_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.validateSectorResults();
    }
    @When("^I click tweet in journo tile in journalist tab$")
    public void i_click_tweet_in_journo_tile_in_journalist_tab() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickTweet();
    }

    @Then("^I should see the tweets for the selected journo$")
    public void i_should_see_the_tweets_for_the_selected_journo() throws InterruptedException {
        wait(30);
        outletProfilePage.setValidateTweetResults();
    }
    @When("^I click instagram in journo tile in journalist tab$")
    public void i_click_instagram_in_journo_tile_in_journalist_tab() throws InterruptedException {
        wait(30);
        outletProfilePage.setClickInstagram();
    }

    @Then("^I should see the instagram results for the journo$")
    public void i_should_see_the_instagram_results_for_the_journo() throws InterruptedException{
        wait(30);
        outletProfilePage.setValidateInstagramResults();
    }
    @When("^I click on alerts tab$")
    public void i_click_on_alerts_tab() throws InterruptedException {
       wait(30);
       outletProfilePage.setClickAlertTab();
    }

    @When("^I enter search term for the find by keyword text field as \"([^\"]*)\"$")
    public void i_enter_search_term_for_the_find_by_keyword_text_field_as(String keyword) throws InterruptedException {
       wait(30);
       outletProfilePage.enterSearchKeyword(keyword);
    }

    @Then("^I should see the results for the keyword search$")
    public void i_should_see_the_results_for_the_keyword_search() throws InterruptedException {
      wait(30);
      outletProfilePage.validateKeywordSearchResultsInAlerts();
    }
}
