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
    public void i_click_on_stories_and_click_lists_options_from_the_list() throws InterruptedException {
        wait(30);
        storiesPage.setClickStoriesTab();
    }

    @When("^I click on add new button in stories page$")
    public void i_click_on_add_new_button_in_stories_page() throws InterruptedException {
       wait(30);
       storiesPage.setClickAddNewButton();
    }


    @When("^I choose story type and I click Create button$")
    public void i_choose_story_type_and_I_click_Create_button() throws InterruptedException {
       wait(30);
       storiesPage.setChooseStoryType();
       wait(30);
       storiesPage.setClickCreateButton();
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
    @When("^I choose story type as media requests and I click Create button$")
    public void i_choose_story_type_as_media_requests_and_I_click_Create_button() throws Throwable {
        wait(30);
        storiesPage.setChooseStoryTypeAsMediaRequest();
    }

    @When("^I enter journalist in search journo field in media request story to add journo as \"([^\"]*)\"$")
    public void i_enter_journalist_in_search_journo_field_in_media_request_story_to_add_journo_as(String arg1) throws Throwable {
     wait(30);
    }

    @When("^I click on stories and click media requests options from the list$")
    public void i_click_on_stories_and_click_media_requests_options_from_the_list() throws Throwable {

    }
}
