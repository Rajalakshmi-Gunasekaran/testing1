package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.StoriesPage;

public class Stories extends BaseStep{
    public StoriesPage storiesPage=new StoriesPage(webDriver);
    @When("^I should login into the home page and click on articles tab$")
    public void i_should_login_into_the_home_page_and_click_on_articles_tab() throws InterruptedException {
        wait(30);
        storiesPage.setClickArticlesTab();
    }

    @When("^I click on stories and click lists options from the list$")
    public void i_click_on_stories_and_click_lists_opions_from_the_list() throws InterruptedException {
        wait(30);
        storiesPage.setClickStoriesTab();
        wait(30);
        storiesPage.setClickListsOption();
    }

    @When("^I click on add new button in stories page$")
    public void i_click_on_add_new_button_in_stories_page() throws InterruptedException {
        wait(30);
        storiesPage.setClickAddNewButton();
    }
    @When("^I choose story type as journalist alert$")
    public void i_choose_story_type_as_journalist_alert() throws InterruptedException {
        wait(30);
        storiesPage.setChooseStoryType();
    }

    @When("^I enter heading as \"([^\"]*)\"$")
    public void i_enter_heading_as(String heading) throws InterruptedException {
        wait(30);
        storiesPage.setEnterHeading(heading);
    }

    @When("^I enter body as \"([^\"]*)\"$")
    public void i_enter_body_as(String body) throws InterruptedException {
        wait(30);
        storiesPage.setEnterBody(body);
    }

    @When("^I click on save and process button$")
    public void i_click_on_save_and_process_button() throws InterruptedException {
        wait(30);
        storiesPage.setClickSaveAndProcessBtn();
    }

    @When("^I enter journalist in search journo field in journalist alert story to add journo as \"([^\"]*)\"$")
    public void i_enter_journalist_in_search_journo_field_in_journalist_alert_story_to_add_journo_as(String journoName) throws InterruptedException{
        wait(30);
        storiesPage.setEnterJournoNameToAddToStory(journoName);
    }


    @When("^I click heading search field and enter \"([^\"]*)\"$")
    public void i_click_heading_search_field_and_enter(String heading) throws InterruptedException {
        wait(30);
        storiesPage.setEnterHeadingSearchField(heading);
    }

    @Then("^I see the searched stories and click on delete button$")
    public void i_see_the_searched_stories_and_click_on_delete_button() throws InterruptedException {
        wait(30);
        storiesPage.setClickDeleteIcon();
    }

    @When("^I click Create button$")
    public void i_click_Create_button() throws InterruptedException {
        wait(60);
        storiesPage.setClickCreateButton();
    }

    @When("^I choose story type as media requests$")
    public void i_choose_story_type_as_media_requests() throws InterruptedException {
        wait(30);
        storiesPage.setChooseStoryTypeAsMediaRequest();
    }

    @When("^I enter journalist in search journo field in media request story to add journo as \"([^\"]*)\"$")
    public void i_enter_journalist_in_search_journo_field_in_media_request_story_to_add_journo_as(String journoName) throws InterruptedException {
        wait(30);
        storiesPage.setEnterJournoNameToAddToStory(journoName);
    }

    @When("^I click on stories and click media requests options from the list$")
    public void i_click_on_stories_and_click_media_requests_options_from_the_list() throws InterruptedException {
         wait(30);
         storiesPage.setClickStoriesTab();
         wait(30);
         storiesPage.setClickMediaRequestsOption();
    }
    @When("^I choose story type as forward features$")
    public void i_choose_story_type_as_forward_features() throws InterruptedException {
        wait(30);
        storiesPage.setChooseTypeAsForwardFeatures();
    }

    @When("^I enter journalist in search journo field in forward features story to add journo as \"([^\"]*)\"$")
    public void i_enter_journalist_in_search_journo_field_in_forward_features_story_to_add_journo_as(String journo) throws InterruptedException {
        wait(30);
        storiesPage.setEnterJournoFieldForwardFeaturesToAddJournoTag(journo);
    }

    @When("^I click on stories and click forward features options from the list$")
    public void i_click_on_stories_and_click_forward_features_options_from_the_list() throws InterruptedException {
        wait(30);
        storiesPage.setClickForwardFeaturesOptions();
    }
    @When("^I click on stories and click highlights from the options$")
    public void i_click_on_stories_and_click_highlights_from_the_options() throws InterruptedException {
       wait(30);
       storiesPage.setClickStoriesTab();
       wait(30);
       storiesPage.setClickHighlights();
    }

    @When("^I click on add new button in highlights page$")
    public void i_click_on_add_new_button_in_highlights_page() throws InterruptedException {
       wait(30);
       storiesPage.setClickAddNewBtnInHighlights();
    }

    @When("^I enter title as \"([^\"]*)\"$")
    public void i_enter_title_as(String highlightsTitle) throws InterruptedException {
        wait(30);
        storiesPage.setEnterHighlightTitle(highlightsTitle);
    }

    @When("^I choose dates to visibility of highlights$")
    public void i_choose_dates_to_visibility_of_highlights() throws InterruptedException {
       wait(30);
       storiesPage.setChooseAndClickHighlightsStartVisibleDates();
       wait(30);
       storiesPage.setChooseAndClickHighlightsEndVisibleDates();
    }

    @When("^I click save button in highlights$")
    public void i_click_save_button_in_highlights() throws InterruptedException {
        wait(30);
        storiesPage.setClickSaveBtnInHighlights();
    }
    @When("^I click highlights from the options$")
    public void i_click_highlights_from_the_options() throws InterruptedException {
       wait(30);
       storiesPage.setClickHighlightsOptionsFromHomePage();
    }

    @When("^I click on actions and click delete options from the list$")
    public void i_click_on_actions_and_click_delete_options_from_the_list() throws InterruptedException {
        wait(30);
       storiesPage.setClickDeleteOptionInActionsMenu();
    }

    @Then("^I should see the deleted highlight$")
    public void i_should_see_the_deleted_highlight() throws InterruptedException {
       wait(30);
       storiesPage.setValidateDeletedHighlights();
    }
    @When("^I choose story type as article for creating new story$")
    public void i_choose_story_type_as_article_for_creating_new_story() throws InterruptedException
    {
      wait(30);
      storiesPage.setChooseTypeAsArticles();
    }

    @When("^I choose and click type as article$")
    public void i_choose_and_click_type_as_article() throws InterruptedException {
      wait(30);
      storiesPage.setClickTypeAsArticleInStoryPage();
    }
    @When("^I choose story type as tweet for creating new story$")
    public void i_choose_story_type_as_tweet_for_creating_new_story() throws InterruptedException {
        wait(30);
        storiesPage.setChooseTypeAsTweet();
    }

    @When("^I choose and click type as Tweet$")
    public void i_choose_and_click_type_as_Tweet() throws InterruptedException {
        wait(30);
        storiesPage.setClickTypeAsTweetInStoryPage();
    }
    @When("^I choose story type as Instagram for creating new story$")
    public void i_choose_story_type_as_Instagram_for_creating_new_story() throws InterruptedException {
        wait(30);
        storiesPage.setChooseTypeAsInstagram();
    }

    @When("^I choose and click type as Instagram$")
    public void i_choose_and_click_type_as_Instagram() throws InterruptedException {
        wait(30);
        storiesPage.setClickTypeAsInstagramStoryPage();
    }
    @When("^I choose story type as Broadcast for creating new story$")
    public void i_choose_story_type_as_Broadcast_for_creating_new_story() throws InterruptedException {
        wait(30);
        storiesPage.setChooseTypeAsBroadcast();
    }

    @When("^I choose and click type as Broadcast$")
    public void i_choose_and_click_type_as_Broadcast() throws InterruptedException {
       wait(30);
       storiesPage.setClickTypeAsBroadcastStoryPage();
    }
}
