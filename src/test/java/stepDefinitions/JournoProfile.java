package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.JournoProfilePage;
import pageObjects.SearchPage;

public class JournoProfile extends BaseStep {
    public JournoProfilePage journoProfilePage = new JournoProfilePage(webDriver);
    public SearchPage search = new SearchPage(webDriver);
    public HomePage homePage = new HomePage(webDriver);

    @When("^I click on add to favourites button in journo profile page$")
    public void i_click_on_add_to_favourites_button_in_journo_profile_page() throws InterruptedException {
        pauseFor(5);
        journoProfilePage.setClickFavouriteBtn();
    }

    @When("^I click on home button$")
    public void i_click_on_home_button() throws InterruptedException {
        wait(60);
        homePage.setGoBackBtn();
    }

    @When("^I click on favourite journalist tab$")
    public void i_click_on_favourite_journalist_tab() throws InterruptedException {
        wait(60);
        homePage.setClickFavouriteJournoTab();
    }

    @When("^I should see the journo added to favourites$")
    public void i_should_see_the_journo_added_to_favourites() throws InterruptedException {
        wait(60);
        homePage.validateJournoAddedToFavourites();
    }

    @When("^I click on Quick Search tab$")
    public void i_click_on_Quick_Search_tab() throws InterruptedException {
        wait(60);
        search.setClkQuickSearch();
    }

    @Then("^I un click on add to favourites button$")
    public void i_un_click_on_add_to_favourites_button() throws InterruptedException {
        pauseFor(5);
        journoProfilePage.setUnCheckFavouriteJournoBtn();
    }

    @When("^I click on GDPR note button in journo profile page$")
    public void i_click_on_GDPR_note_button_in_journo_profile_page() throws InterruptedException {
        pauseFor(10);
        journoProfilePage.setClickGDPRNote();
    }

    @When("^I enter subject in GDPR note as \"([^\"]*)\"$")
    public void i_enter_subject_in_GDPR_note_as(String GDPRSubject) throws InterruptedException {
        wait(60);
        journoProfilePage.enterSubjectInGDPRNote(GDPRSubject);
    }

    @When("^I click on GDPR approved radio button$")
    public void i_click_on_GDPR_approved_radio_button() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickGDPRRadioBtn();
    }

    @When("^I click on save button in GDPR note$")
    public void i_click_on_save_button_in_GDPR_note() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickSaveBtnInGDPR();
    }

    @Then("^I should see the GDPR note as approved$")
    public void i_should_see_the_GDPR_note_as_approved() throws InterruptedException {
        wait(60);
        journoProfilePage.validateGDPRNote();
    }

    @When("^I click GDPR status to Unknown$")
    public void i_click_GDPR_status_to_Unknown() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickGDPRStatusUnknown();
    }

    @Then("^I should see the GDPR note as unknown$")
    public void i_should_see_the_GDPR_note_as_unknown() throws InterruptedException {
        wait(60);
        journoProfilePage.setValidateGDPRUnknown();
    }

    @When("^I click on add to streams button in journo profile page$")
    public void i_click_on_add_to_streams_button_in_journo_profile_page() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickAddToStreamsBtn();
    }
    @When("^I click on stream name to add journo$")
    public void i_click_on_stream_name_to_add_journo() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickStreamNameToAddJourno();
    }
    @When("^I click on save button in add to streams$")
    public void i_click_on_save_button_in_add_to_streams() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickSaveBtnInStream();
    }

    @When("^I should see the journo added to stream$")
    public void i_should_see_the_journo_added_to_stream() throws InterruptedException {
        wait(60);
        journoProfilePage.setValidateJournoAddedToStream();
    }

    @When("^I click remove journo from streams$")
    public void i_click_remove_journo_from_streams() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickRemoveFromStream();
    }

    @Then("^I should see journo removed from streams$")
    public void i_should_see_journo_removed_from_streams() throws InterruptedException {
        wait(60);
        journoProfilePage.validateJournoRemovedFromStream();
    }
    @When("^I click on notes and activity tab in journo profile page$")
    public void i_click_on_notes_and_activity_tab_in_journo_profile_page() throws InterruptedException {
        pauseFor(5);
        journoProfilePage.setClickNotesAndActivityTab();
    }

    @When("^I click on add activity button$")
    public void i_click_on_add_activity_button() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickAddActivityBtn();
    }

    @When("^I enter subject as \"([^\"]*)\"$")
    public void i_enter_subject_as(String subject) throws InterruptedException {
        wait(60);
        journoProfilePage.enterSubject(subject);
    }
    @When("^I click on save button in notes and activity$")
    public void i_click_on_save_button_in_notes_and_activity() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickSaveBtnInNotesAndActivity();
    }
    @When("^I should see the activity created for the journo$")
    public void i_should_see_the_activity_created_for_the_journo() throws InterruptedException {
        pauseFor(5);
        journoProfilePage.validateActivityCreatedForJourno();
    }

    @Then("^I delete the activity created for the journo$")
    public void i_delete_the_activity_created_for_the_journo() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickDeleteActivity();
    }
    @When("^I click on add notes button$")
    public void i_click_on_add_notes_button() throws InterruptedException {
       wait(60);
       journoProfilePage.setClickNotesBtn();
    }

    @When("^I should see the notes created for the journo$")
    public void i_should_see_the_notes_created_for_the_journo() throws InterruptedException {
        pauseFor(5);
        journoProfilePage.validateNotesCreatedForJourno();
    }

    @Then("^I delete the notes created for the journo$")
    public void i_delete_the_notes_created_for_the_journo() throws InterruptedException {
        wait(120);
        journoProfilePage.setClickDeleteNotes();
    }
    @When("^I click on from date in calender$")
    public void i_click_on_from_date_in_calender() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickCalender();
    }

    @When("^I choose a date to filter coverage results$")
    public void i_choose_a_date_to_filter_coverage_results() throws InterruptedException {
       wait(60);
      journoProfilePage.setChooseDateToFilterCoverage();
    }

    @Then("^I should see the results for the selected time period$")
    public void i_should_see_the_results_for_the_selected_time_period() throws InterruptedException {
       wait(60);
       journoProfilePage.validateResultsForSelectedDates();
    }

    @When("^I choose sector and click on it$")
    public void i_choose_sector_and_click_on_it() throws InterruptedException {
       wait(60);
       journoProfilePage.chooseAndClickSector();
    }

    @Then("^I should navigate to the advanced search Journalist page$")
    public void i_should_navigate_to_the_advanced_search_Journalist_page() throws InterruptedException {
       wait(60);
       journoProfilePage.validateAdvancedSearchSectorSearch();
    }
    @When("^I click view in tab button to see expanded view$")
    public void i_click_view_in_tab_button_to_see_expanded_view() throws InterruptedException {
        wait(60);
        journoProfilePage.setClickViewInTabBtn();
    }

    @Then("^I should see the selected item in expanded view$")
    public void i_should_see_the_selected_item_in_expanded_view() throws InterruptedException {
        wait(60);
        journoProfilePage.validateItemInExpandedView();
    }
    @When("^I click filter button to hide filters$")
    public void i_click_filter_button_to_hide_filters() throws InterruptedException {
        wait(60);
        journoProfilePage.clickFiltersBtn();
    }

    @Then("^I should hide filters in journo profile page$")
    public void i_should_hide_filters_in_journo_profile_page() throws InterruptedException {
        wait(60);
        journoProfilePage.validateHideFilters();
    }
    @When("^I choose and click Barclays plc link to see the coverage article for the selected item$")
    public void i_choose_and_click_Barclays_plc_link_to_see_the_coverage_article_for_the_selected_item() throws InterruptedException {
       wait(60);
       journoProfilePage.setClickCompanyLinkInChartView();
    }

    @Then("^I see the articles for the coverage section$")
    public void i_see_the_articles_for_the_coverage_section() throws InterruptedException {
       wait(60);
       journoProfilePage.validateCompanyCoverageResults();
    }
}
