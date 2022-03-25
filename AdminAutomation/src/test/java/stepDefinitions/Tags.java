package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AppPage;
import pageObjects.TagsPage;

public class Tags extends BaseStep {
    public TagsPage tagsPage=new TagsPage(webDriver);

    @When("^I should login into the home page and click on tag tab$")
    public void i_should_login_into_the_home_page_and_click_on_tag_tab() throws InterruptedException {
        wait(30);
        tagsPage.setClickTagTab();
    }

    @When("^I click on story topics from the list$")
    public void i_click_on_story_topics_from_the_list() throws InterruptedException {
        wait(30);
        tagsPage.setClickStoryTopicTag();
    }

    @When("^I click on add button$")
    public void i_click_on_add_button() throws InterruptedException {
        wait(30);
        tagsPage.setClickAddNewTag();
    }

    @When("^I enter tag name in the name field as \"([^\"]*)\"$")
    public void i_enter_tag_name_in_the_name_field_as(String tagName) throws InterruptedException {
        wait(30);
        tagsPage.setEnterTagName(tagName);
    }

    @When("^I enter description in the description field as \"([^\"]*)\"$")
    public void i_enter_description_in_the_description_field_as(String tagDesc) throws InterruptedException {
        wait(30);
        tagsPage.setEnterDescription(tagDesc);
    }

    @When("^I click on hidden check box to hide it from front end$")
    public void i_click_on_hidden_check_box_to_hide_it_from_front_end() throws InterruptedException {
        wait(30);
        tagsPage.setClickHiddenCheckBox();
    }
    @When("^I click on save button to add new tag$")
    public void i_click_on_save_button_to_add_new_tag() throws InterruptedException {
        wait(30);
        tagsPage.setClickSaveButtonToAddNewTag();

    }

    @When("^I click on story topic tag on the top bar to navigate to tags home page$")
    public void i_click_on_story_topic_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickStoryTopicTagToNavigateToTagHome();
    }

    @Then("^I click cross mark to delete the tag$")
    public void i_click_cross_mark_to_delete_the_tag() throws InterruptedException {
        wait(30);
        tagsPage.setClickDeleteTag();
    }

    @When("^I click on products tag in the tags home page$")
    public void i_click_on_products_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickProductTagTab();
    }

    @When("^I click on product tag on the top bar to navigate to tags home page$")
    public void i_click_on_product_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickProductTagToNavigateToTagsHome();
    }

    @When("^I click on journo and outlet sectors tag in the tags home page$")
    public void i_click_on_journo_and_outlet_sectors_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickJournoAndOutletSectorsTagTab();
    }

    @When("^I click on journo and author sector tag on the top bar to navigate to tags home page$")
    public void i_click_on_journo_and_author_sector_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickJournoAndAuthorSectorTagToNavigateToTagsHome();
    }

    @When("^I click on media outlet types tag in the tags home page$")
    public void i_click_on_media_outlet_types_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickMediaPOutletTypesTagTab();
    }

    @When("^I click on media outlet types tag on the top bar to navigate to tags home page$")
    public void i_click_on_media_outlet_types_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickMediaOutletTypesNavigateToTagsHome();
    }

    @When("^I click on journo type tag in the tags home page$")
    public void i_click_on_journo_type_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickJournoTypeTagsTab();
    }

    @When("^I click on journo type tag on the top bar to navigate to tags home page$")
    public void i_click_on_journo_type_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickJournoTypesTagNavigateToTagsHome();
    }

    @When("^I click on company tags in the tags home page$")
    public void i_click_on_company_tags_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickCompanyTagsTab();
    }

    @When("^I click on company tags on the top bar to navigate to tags home page$")
    public void i_click_on_company_tags_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickCompanyToNavigateToTagsHomePage();

    }

    @When("^I click on company types tag in the tags home page$")
    public void i_click_on_company_types_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickCompanyTypesTagTab();
    }

    @When("^I click on company types tag on the top bar to navigate to tags home page$")
    public void i_click_on_company_types_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickCompanyTypesToNavigateToTagsHome();
    }

    @When("^I click on journo pinging emails tag in the tags home page$")
    public void i_click_on_journo_pinging_emails_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickJournoPingingEmailsTagTab();
    }

    @When("^I click on hidden tags on the top bar to navigate to tags home page$")
    public void i_click_on_hidden_tags_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickHiddenTagsToNavigateToTagsHomePage();
    }

    @When("^I click on marketing to PRs tag in the tags home page$")
    public void i_click_on_marketing_to_PRs_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickMarketingToPRsTagTab();
    }

    @When("^I click on marketing to PRs tag on the top bar to navigate to tags home page$")
    public void i_click_on_marketing_to_PRs_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickMarketingToPRsToNavigateToTagsHomePage();
    }

    @When("^I click on working set tags in the tags home page$")
    public void i_click_on_working_set_tags_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickWorkingSetTagTab();
    }

    @When("^I click on working set tags on the top bar to navigate to tags home page$")
    public void i_click_on_working_set_tags_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickWorkingSetNavigateToTagsHome();
    }

    @When("^I click on localities tag in the tags home page$")
    public void i_click_on_localities_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickLocalitiesTagTab();
    }

    @When("^I click on localities tag on the top bar to navigate to tags home page$")
    public void i_click_on_localities_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickLocalitiesNavigateToTagsHome();
    }

    @When("^I click on forward feature tag in the tags home page$")
    public void i_click_on_forward_feature_tag_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickForwardFeatureTagTab();
    }

    @When("^I click on forward feature tag on the top bar to navigate to tags home page$")
    public void i_click_on_forward_feature_tag_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickForwardFeatureNavigateToTagHome();
    }

    @When("^I click on content type tags in the tags home page$")
    public void i_click_on_content_type_tags_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickContentTypeTagsTab();
    }

    @When("^I click on content type tags on the top bar to navigate to tags home page$")
    public void i_click_on_content_type_tags_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickContentTypeNavigateToTagsHome();
    }

    @When("^I click on saved search tags in the tags home page$")
    public void i_click_on_saved_search_tags_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickSavedSearchTagsTab();
    }

    @When("^I click on saved search tags on the top bar to navigate to tags home page$")
    public void i_click_on_saved_search_tags_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickSavedSearchNavigateToTagsHome();
    }

    @When("^I click on PR opportunity tags in the tags home page$")
    public void i_click_on_PR_opportunity_tags_in_the_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickPROpportunityTagsTab();
    }

    @When("^I click on PR opportunity tags on the top bar to navigate to tags home page$")
    public void i_click_on_PR_opportunity_tags_on_the_top_bar_to_navigate_to_tags_home_page() throws InterruptedException {
        wait(30);
        tagsPage.setClickPROpportunityNavigateToTagsHome();
    }
}