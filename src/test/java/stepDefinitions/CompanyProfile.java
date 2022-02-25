package stepDefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CompanyProfilePage;
import pageObjects.HomePage;
import pageObjects.JournoProfilePage;
import pageObjects.SearchPage;

public class CompanyProfile extends BaseStep{
    public JournoProfilePage journoProfilePage = new JournoProfilePage(webDriver);
    public SearchPage search = new SearchPage(webDriver);
    public HomePage homePage = new HomePage(webDriver);
    public CompanyProfilePage companyProfilePage=new CompanyProfilePage(webDriver);

    @When("^I choose company from the list and Click on it$")
    public void i_choose_company_from_the_list_and_Click_on_it() throws InterruptedException {
         pauseFor(2);
         companyProfilePage.setChooseAndClickCompany();
    }

    @When("^I should see all the available information about the company$")
    public void i_should_see_all_the_available_information_about_the_company() throws InterruptedException {
         pauseFor(2);
         companyProfilePage.setValidateCompanyLogo();
         companyProfilePage.setValidateCompanyContact();
         companyProfilePage.setValidateCompanyDesc();
         companyProfilePage.setValidateCompanySector();
    }

    @Then("^I should see all the header tabs in company profile page$")
    public void i_should_see_all_the_header_tabs_in_company_profile_page() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setValidateCoverageTab();
        companyProfilePage.setClickHeadlinesTabs();
        companyProfilePage.setValidateHeadlinesTab();
    }
    @When("^I change time frame by choosing and clicking time frame options$")
    public void i_change_time_frame_by_choosing_and_clicking_time_frame_options() throws InterruptedException {
      pauseFor(2);
      companyProfilePage.setChangeTimeframe();
    }

    @Then("^I should see the results for the filtered time frame$")
    public void i_should_see_the_results_for_the_filtered_time_frame() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setValidateFilteredResultsTopicCoverage();
    }
    @When("^I click add to streams button to add into streams$")
    public void i_click_add_to_streams_button_to_add_into_streams() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setClickAddToStreams();
    }

    @When("^I enter stream name as \"([^\"]*)\" to create and click ok$")
    public void i_enter_stream_name_as_to_create_and_click_ok(String streamName) throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setEnterStreamName(streamName);
    }

    @When("^I click on streams$")
    public void i_click_on_streams() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickOnStreamsTab();
    }

    @When("^I choose and click on companyStreams$")
    public void i_choose_and_click_on_companyStreams() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setChooseAndClickCompanyStream();
    }

    @Then("^I should delete companyStreams$")
    public void i_should_delete_companyStreams() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setDeleteStream();
    }
    @When("^I click on view all button$")
    public void i_click_on_view_all_button() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setClickViewAllBtn();
    }

    @Then("^I should able to see all topics over the period$")
    public void i_should_able_to_see_all_topics_over_the_period() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setValidateViewAllTopics();
    }
    @When("^I choose and click topic headline to see articles$")
    public void i_choose_and_click_topic_headline_to_see_articles() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setChooseAndClickTopic();
    }

    @When("^I click back button to go back to topic chart view$")
    public void i_click_back_button_to_go_back_to_topic_chart_view() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickBackBtn();
    }

    @Then("^I should see the topic chart view again$")
    public void i_should_see_the_topic_chart_view_again() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setValidateBackToTopicChart();
    }
    @When("^I choose and click journo name to see the articles$")
    public void i_choose_and_click_journo_name_to_see_the_articles() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setChooseAndClickJourno();
    }

    @When("^I click back button to go back to the journo chart$")
    public void i_click_back_button_to_go_back_to_the_journo_chart() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setClickBackBtnInRightHandSideJourno();
    }

    @Then("^I should be back in the journo chart view$")
    public void i_should_be_back_in_the_journo_chart_view() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setValidateJournoChartView();
    }
    @When("^I click on header tab in company profile$")
    public void i_click_on_header_tab_in_company_profile() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickHeadlinesTabs();
    }

    @When("^I click on journo name link$")
    public void i_click_on_journo_name_link() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickJournoLink();
    }

    @Then("^I should navigate to the journo profile page$")
    public void i_should_navigate_to_the_journo_profile_page() throws InterruptedException {
         pauseFor(2);
         companyProfilePage.setValidateNavigateToJournoProfile();
    }
    @When("^I choose and click a journo to add to streams$")
    public void i_choose_and_click_a_journo_to_add_to_streams() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setChooseAndClickJournoInHeadlines();
    }

    @When("^I click add journo to streams button$")
    public void i_click_add_journo_to_streams_button() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickAddJournoToStream();
    }
    @When("^I enter stream name as \"([^\"]*)\" in add journo pop up and click ok$")
    public void i_enter_stream_name_as_in_add_journo_pop_up_and_click_ok(String streamName) throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setEnterStreamNameToAddJourno(streamName);

    }
    @When("^I choose and click a journo to add to lists$")
    public void i_choose_and_click_a_journo_to_add_to_lists() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setChooseAndClickJournoInHeadlines();
    }

    @When("^I click add journo to lists button$")
    public void i_click_add_journo_to_lists_button() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickAddJournoToList();
    }
    @When("^I enter list name in headline tab company profile to create list as \"([^\"]*)\"$")
    public void i_enter_list_name_in_headline_tab_company_profile_to_create_list_as(String listNameToCreate) throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setEnterListNameToAddJournoFromHeadlinesTab(listNameToCreate);
    }

    @When("^click ok button to create list from company profile$")
    public void click_ok_button_to_create_list_from_company_profile() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setClickOkBtn();
    }

    @When("^I click on lists tab$")
    public void i_click_on_lists_tab() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickOnListsTab();
    }

    @When("^I choose and click on companyLists$")
    public void i_choose_and_click_on_companyLists() throws InterruptedException {
        pauseFor(2);
        companyProfilePage.setClickCompanyListInListsPage();
    }

    @Then("^I should delete companyLists$")
    public void i_should_delete_companyLists() throws InterruptedException {
       pauseFor(2);
       companyProfilePage.setDeleteList();
    }
}
