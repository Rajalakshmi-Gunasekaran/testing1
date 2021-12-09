package stepDefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.Constants;
import pageObjects.HomePage;
import pageObjects.ListsPage;
import pageObjects.StreamPage;

public class Streams extends BaseStep
    {
    public StreamPage streamPage = new StreamPage(webDriver);
    public ListsPage listsPage=new ListsPage(webDriver);
    public HomePage homePage=new HomePage(webDriver);

    @When("^I should be in the home page and click on Streams$")
    public void i_should_be_in_the_home_page_and_click_on_Streams() throws Exception
    {
        webDriver.get(readPropertyFile1("url1"));
        pauseFor(2);
        streamPage.clkStreams();
    }

    @When("^I click on AllJournoMoves streams from the list$")
    public void i_click_on_AllJournoMoves_streams_from_the_list() throws InterruptedException
    {
        pauseFor(5);
        streamPage.clickAllJournoMoves();
    }

    @When("^I click on create new stream button$")
    public void i_click_on_create_new_stream_button() throws InterruptedException
    {
        wait(120);
        streamPage.clkCreateStream();
    }

    @When("^I enter stream name as \"(.*?)\"$")
    public void i_enter_stream_name_as(String name)throws InterruptedException
    {
        wait(120);
        streamPage.setEnterStreamName(name);
    }

    @When("^I click on create button$")
    public void i_click_on_create_button() throws InterruptedException
    {
        wait(120);
        streamPage.setClickCreateButtonStream();
        pauseFor(10);
    }

    @When("^I click on articles from the options$")
    public void i_click_on_articles_from_the_options()throws InterruptedException
    {
        wait(120);
        streamPage.setClickOnArticles();
        pauseFor(10);
    }

    @When("^I click on outletTypes$")
    public void i_click_on_outletTypes()throws InterruptedException
    {
        pauseFor(5);
        streamPage.setClickOutletType();
    }

    @When("^I enter outletType as \"(.*?)\"$")
    public void i_enter_outletType_as(String outletType)throws InterruptedException
    {
        pauseFor(5);
        streamPage.chooseOutletType(outletType);
    }

    @When("^I click on save button$")
    public void i_click_on_save_button() throws InterruptedException
    {
        pauseFor(5);
        streamPage.setClickSaveButton();
        pauseFor(10);
    }

    @Then("^I should able to see the  streams results$")
    public void i_should_able_to_see_the_streams_results() throws InterruptedException
    {
        pauseFor(10);
        streamPage.setValidateStreamSetUp();
    }

    @When("^I click on search icon and enter stream name as \"(.*?)\"$")
    public void i_click_on_search_icon_and_enter_stream_name_as(String streamName) throws InterruptedException
    {
        streamPage.setClickSearchStream();
        pauseFor(5);
        streamPage.setEnterStreamToDelete(streamName);
        wait(120);
    }

    @When("^I click on delete button$")
        public void i_click_on_delete_button() throws InterruptedException
    {
        wait(120);
       streamPage.setClickDeleteStream();
    }
    @When("^I click on confirm delete button$")
    public void i_click_on_confirm_delete_button() throws InterruptedException
    {
        streamPage.setClickConfirmDeletion();
        wait(120);
    }

    @Then("^I should see the stream deleted on left hand side$")
    public void i_should_see_the_stream_deleted_on_left_hand_side()throws InterruptedException
    {
        wait(120);
        streamPage.setValidateStreamDeletion();
    }

    @When("^I click on SmokeTest streams from the list and I click on edit streams$")
    public void i_click_on_SmokeTest_streams_from_the_list_and_I_click_on_edit_streams()throws InterruptedException
    {
        pauseFor(5);
        streamPage.setClickEditStreamButton();
    }

    @When("^I click type of publisher and I click type of publisher as Journalist$")
    public void i_click_type_of_publisher_and_I_click_type_of_publisher_as_Journalist()throws InterruptedException
    {
        pauseFor(5);
        streamPage.setClickTypeOfPublisher();
        pauseFor(10);
        streamPage.setChooseJournalist();
    }

    @Then("^I should able to see the edited streams$")
    public void i_should_able_to_see_the_edited_streams() throws InterruptedException
    {
        pauseFor(10);
        streamPage.validateEditStream();
    }
    @Then("^I should able to see AllJournoMoves streams page$")
    public void i_should_able_to_see_AllJournoMoves_streams_page() throws InterruptedException
    {
       pauseFor(10);
       streamPage.clkSelectAll();
       pauseFor(5);
       wait(120);
       String validateStreamPage = streamPage.validateAllJournoStream();
       wait(120);
       Assert.assertEquals(Constants.STREAM_VALIDATION_NUMBERS, validateStreamPage);
    }
    @When("^I click on journalists alerts,forward features and Media request alerts from the options$")
    public void i_click_on_journalists_alerts_forward_features_and_Media_request_alerts_from_the_options() throws InterruptedException
    {
       wait(120);
       streamPage.setStreamForJournoAlerts();
       wait(120);
       streamPage.setStreamForForwardFeaturesAlerts();
       wait(120);
       streamPage.setStreamForMediaRequestsAlerts();
    }

    @When("^I click on topics and enter topic in the search as \"([^\"]*)\"$")
    public void i_click_on_topics_and_enter_topic_in_the_search_as(String topicTerm) throws InterruptedException
    {
       wait(120);
       streamPage.setClickTopicTab();
       wait(120);
       streamPage.setEnterTopicSearchTerm(topicTerm);
    }
    @When("^I should able to see the  streams results for journo alerts,forward features and media request$")
     public void i_should_able_to_see_the_streams_results_for_journo_alerts_forward_features_and_media_request() throws InterruptedException {
        wait(120);
        streamPage.validateJournoAlertStream();
    }
    @Then("^I delete the streams$")
    public void i_delete_the_streams() throws InterruptedException
    {
       wait(120);
       streamPage.setClickDeleteStream();
       wait(120);
       streamPage.setClickConfirmDeletion();
    }

        @When("^I click on Add all journo to list button$")
        public void i_click_on_Add_all_journo_to_list_button() throws InterruptedException {
           pauseFor(10);
           streamPage.clickAddJournoToListBtnFromStream();
        }

        @When("^I enter list name to copy journo from streams as \"([^\"]*)\"$")
        public void i_enter_list_name_to_copy_journo_from_streams_as(String streamList) throws InterruptedException {
           wait(120);
           streamPage.setEnterListNameToAddStreams(streamList);
        }

        @When("^I click Ok to copy journo from streams$")
        public void i_click_Ok_to_copy_journo_from_streams() throws InterruptedException {
           wait(120);
           streamPage.setClickOkBtnToCreateStreamList();
           pauseFor(5);
        }
        @When("^I click on list tab in homepage to see journo added from streams$")
        public void i_click_on_list_tab_in_homepage_to_see_journo_added_from_streams() throws InterruptedException {
           pauseFor(5);
           listsPage.clickListsBtn();
        }

        @When("^I should able to see the journo added to list from streams$")
        public void i_should_able_to_see_the_journo_added_to_list_from_streams() throws InterruptedException {
        wait(120);
        listsPage.setValidateJournoAddedToStreamList();
        }

        @Then("^I should delete and confirm delete stream list added from streams tab$")
        public void i_should_delete_and_confirm_delete_stream_list_added_from_streams_tab() throws InterruptedException {
           wait(120);
           listsPage.setDeleteListBtn();
        }
        @When("^I click on tweets from the options$")
        public void i_click_on_tweets_from_the_options() throws InterruptedException {
           wait(120);
           streamPage.clickOnTweetStream();
        }
        @When("^I should able to see the  streams results for tweet$")
        public void i_should_able_to_see_the_streams_results_for_tweet() throws InterruptedException {
           wait(120);
           streamPage.validateTweetStreams();
        }
        @When("^I click on activities from the options$")
        public void i_click_on_activities_from_the_options() throws InterruptedException {
            wait(120);
            streamPage.setClickActivities();
        }

        @When("^I click on journalists$")
        public void i_click_on_journalists() throws InterruptedException {
           wait(120);
           streamPage.setClickJournalists();
        }

        @When("^I enter journalist as \"([^\"]*)\"$")
        public void i_enter_journalist_as(String journoName) throws InterruptedException {
           wait(120);
           streamPage.setEnterJournoName(journoName);
        }

        @When("^I should able to see the streams results for activities$")
        public void i_should_able_to_see_the_streams_results_for_activities() throws InterruptedException {
            wait(120);
            streamPage.validateActivitiesStream();
        }
        @When("^I enter keyword in quick find by keyword text area as \"([^\"]*)\"$")
        public void i_enter_keyword_in_quick_find_by_keyword_text_area_as(String keyword) throws InterruptedException {
            wait(120);
            streamPage.setEnterKeywordInQuickFindByKeyword(keyword);
        }

        @When("^I should see the search result for the chosen keyword$")
        public void i_should_see_the_search_result_for_the_chosen_keyword() throws InterruptedException {
           wait(120);
           streamPage.validateKeywordSearchInActivityStream();
        }

        @When("^I click on FunctionalTest streams from the list$")
        public void i_click_on_FunctionalTest_streams_from_the_list() throws InterruptedException {
            wait(120);
            streamPage.clickFunctionalTestStream();
        }

        @When("^I click On Homepage checkbox$")
        public void i_click_On_Homepage_checkbox() throws InterruptedException {
            wait(120);
            streamPage.ClickOnHomePageChkBox();
    }

        @When("^I click on save button to save the changes$")
        public void i_click_on_save_button_to_save_the_changes() throws InterruptedException {
           wait(120);
           streamPage.clickSaveBtnInStream();
        }

        @When("^I click on Home button to go back to the home page$")
        public void i_click_on_Home_button_to_go_back_to_the_home_page() throws InterruptedException {
           pauseFor(10);
           homePage.setGoBackBtn();
        }

        @When("^I should see the FunctionalTest stream tab in sub headers$")
        public void i_should_see_the_FunctionalTest_stream_tab_in_sub_headers() throws InterruptedException {
            wait(120);
            homePage.validateFunctionalTestStream();
        }

        @When("^I click on streams tab header$")
        public void i_click_on_streams_tab_header() throws InterruptedException {
            wait(120);
            streamPage.clkStreams();
        }

        @Then("^I uncheck the On homepage checkbox and save changes$")
        public void i_uncheck_the_On_homepage_checkbox_and_save_changes() throws InterruptedException {
            wait(120);
            streamPage.ClickOnHomePageChkBox();
            pauseFor(5);
            streamPage.clickSaveBtnInStream();
            pauseFor(5);
        }
        @When("^I click on Default Homepage$")
        public void i_click_on_Default_Homepage() throws InterruptedException {
           wait(120);
           streamPage.clickDefaultHomePage();
           pauseFor(5);
           streamPage.clickSaveBtnInStream();
           pauseFor(5);
        }

        @When("^I should see the FunctionalTest stream tab as default home page in sub headers$")
        public void i_should_see_the_FunctionalTest_stream_tab_as_default_home_page_in_sub_headers() throws InterruptedException {
           wait(120);
           streamPage.validateDefaultHomePage();
        }

        @Then("^I uncheck the default homepage checkbox and save changes$")
        public void i_uncheck_the_default_homepage_checkbox_and_save_changes() throws InterruptedException {
            wait(120);
            streamPage.UncheckDefaultHomePage();
            wait(120);
            streamPage.ClickOnHomePageChkBox();
            wait(120);
            streamPage.clickSaveBtnInStream();
            pauseFor(5);
        }
    }
