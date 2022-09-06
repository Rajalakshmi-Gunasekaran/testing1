package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PeoplePage;

public class People extends BaseStep{
    public PeoplePage peoplePage=new PeoplePage(webDriver);
    @When("^I should login into the home page and click on people tab$")
    public void i_should_login_into_the_home_page_and_click_on_people_tab() throws InterruptedException {
       wait(30);
       peoplePage.setClickPeopleTab();
    }

    @When("^I click on journalist from the options$")
    public void i_click_on_journalist_from_the_options() throws InterruptedException {
        wait(30);
        peoplePage.setClickJournalistOption();
    }

    @When("^I enter journalist name as \"([^\"]*)\" in search field and Click on it$")
    public void i_enter_journalist_name_as_in_search_field_and_Click_on_it(String journoName) throws InterruptedException {
       wait(30);
       peoplePage.setEnterJournoName(journoName);
       wait(30);
       peoplePage.setClkSearchedJournoFromList();
    }

    @When("^I click on duplicates tab in journo profile page$")
    public void i_click_on_duplicates_tab_in_journo_profile_page() throws InterruptedException {
       wait(30);
       peoplePage.setClkDuplicateTabInJournoProfile();
    }
    @When("^I enter merging journalist ID as \"([^\"]*)\" in the search text field and click search icon$")
    public void i_enter_merging_journalist_ID_as_in_the_search_text_field_and_click_search_icon(String MergingID) throws InterruptedException {
        wait(30);
        peoplePage.setEnterMergingJournoID(MergingID);
    }

    @When("^I click merge button next to duplicate journo for merging$")
    public void i_click_merge_button_next_to_duplicate_journo_for_merging() throws InterruptedException {
       wait(30);
       peoplePage.setClkMergeBtn();
    }
    @When("^I click Journalist tab breadcrumbs and enter journalist name as \"([^\"]*)\" in search field to check merging$")
    public void i_click_Journalist_tab_breadcrumbs_and_enter_journalist_name_as_in_search_field_to_check_merging(String mergedJournoName) throws InterruptedException {
        pauseFor(5);
        peoplePage.setClkJournoTabBreadCrumbInDuplicateTab();
        wait(30);
        peoplePage.setEnterJournoName(mergedJournoName);
    }

    @Then("^I should see the duplicate journo merged into original$")
    public void i_should_see_the_duplicate_journo_merged_into_original() throws InterruptedException {
        wait(30);
        peoplePage.setValidateDuplicateJournoMerged();
    }
    @When("^I click on journalist job titles from the options$")
    public void i_click_on_journalist_job_titles_from_the_options() throws InterruptedException {
       wait(30);
       peoplePage.setClkJobTitlesFromOptions();
    }

    @When("^I click on add new button to create new journalist job title$")
    public void i_click_on_add_new_button_to_create_new_journalist_job_title() throws InterruptedException {
        wait(30);
        peoplePage.setClkAddNewBtnToCreateJobTitle();
    }

    @When("^I enter job title name as \"([^\"]*)\"$")
    public void i_enter_job_title_name_as(String jobTitle) throws InterruptedException {
        wait(30);
        peoplePage.setEnterJobTitleName(jobTitle);
    }

    @When("^I click on save to create new job title$")
    public void i_click_on_save_to_create_new_job_title() throws InterruptedException {
        wait(30);
        peoplePage.setClkSaveBtnToCreateJobTitle();
    }
    @When("^I enter journalist job titles as \"([^\"]*)\" in search field and Click on it$")
    public void i_enter_journalist_job_titles_as_in_search_field_and_Click_on_it(String jobTitleName) throws InterruptedException {
       wait(30);
       peoplePage.setEnterJobTitleNameInSearchField(jobTitleName);
       wait(30);
       peoplePage.setClkSelectedJobTitleInJobTitlePage();
    }

    @When("^I click on merge tab in journalists job title page$")
    public void i_click_on_merge_tab_in_journalists_job_title_page() throws InterruptedException {
      wait(30);
      peoplePage.setClkMergeTabInJobTitlePage();
    }

    @When("^I enter merging journalists job title ID as \"([^\"]*)\" in the search text field and click search icon$")
    public void i_enter_merging_journalists_job_title_ID_as_in_the_search_text_field_and_click_search_icon(String jobTitleID) throws InterruptedException {
      wait(30);
      peoplePage.setEnterJobTitleID(jobTitleID);
    }
    @When("^I click merge button next to journo job title for merging$")
    public void i_click_merge_button_next_to_journo_job_title_for_merging() throws InterruptedException {
        wait(30);
        peoplePage.setClkMergeBtnInJobTitle();
    }

    @When("^I click Journalist job title tab breadcrumbs and enter journalist job title as \"([^\"]*)\" in search field to check merging$")
    public void i_click_Journalist_job_title_tab_breadcrumbs_and_enter_journalist_job_title_as_in_search_field_to_check_merging(String jobTitleName) throws InterruptedException {
        wait(30);
        peoplePage.setClkJournalistJobTitleToGoBack();
        wait(30);
        peoplePage.setEnterJobTitleNameInSearchField(jobTitleName);
    }

    @Then("^I should see the job title merged into original$")
    public void i_should_see_the_job_title_merged_into_original() throws InterruptedException {
        wait(30);
        peoplePage.setValidateJobTitleMergedIntoOriginal();
    }
}
