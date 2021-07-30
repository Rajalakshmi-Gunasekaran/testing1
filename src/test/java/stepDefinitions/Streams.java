package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.Contents;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StreamPage;

public class Streams extends BaseStep {
    public StreamPage streamPage = new StreamPage(webDriver);

    @When("^I should be in the home page and click on Streams$")
    public void i_should_be_in_the_home_page_and_click_on_Streams() {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        pauseFor(2);
        streamPage.clkStreams();

    }

    @When("^I click on AllJournoMoves streams from the list$")
    public void i_click_on_AllJournoMoves_streams_from_the_list() {
        wait(20);
        streamPage.clkAllJournoMoves();
        pauseFor(30);
        streamPage.clkSelectAll();
        wait(10);
    }

    @Then("^I should able to see the AllJournoMoves streams page$")
    public void i_should_able_to_see_the_AllJournoMoves_streams_page() {
        wait(30);
        String validateStreamPage = streamPage.validateAllJournoStream();
        wait(30);
        Assert.assertEquals(Contents.STREAM_VALIDATION_NUMBERS, validateStreamPage);
    }

    @When("^I click on create new stream button$")
    public void i_click_on_create_new_stream_button() {
        wait(20);
        streamPage.clkCreateStream();
    }

    @When("^I enter stream name as \"(.*?)\"$")
    public void i_enter_stream_name_as(String name) {
        wait(20);
        streamPage.setEnterStreamName(name);
    }

    @When("^I click on create button$")
    public void i_click_on_create_button() {
        wait(30);
        streamPage.setClickCreateButtonStream();
        pauseFor(10);
    }

    @When("^I click on articles from the options$")
    public void i_click_on_articles_from_the_options() {
        wait(10);
        streamPage.setClickOnArticles();
        pauseFor(10);
    }

    @When("^I click on outletTypes$")
    public void i_click_on_outletTypes() {
        pauseFor(5);
        streamPage.setClickOutletType();
    }

    @When("^I enter outletType as \"(.*?)\"$")
    public void i_enter_outletType_as(String outletType) {
        pauseFor(5);
        streamPage.chooseOutletType(outletType);
    }

    @When("^I click on save button$")
    public void i_click_on_save_button() {
        pauseFor(5);
        streamPage.setClickSaveButton();
        pauseFor(10);
    }

    @Then("^I should able to see the  streams results$")
    public void i_should_able_to_see_the_streams_results() {
        pauseFor(10);
        streamPage.setValidateStreamSetUp();
    }

    @When("^I click on search icon and enter stream name as \"(.*?)\"$")
    public void i_click_on_search_icon_and_enter_stream_name_as(String streamName) {
        streamPage.setClickSearchStream();
        pauseFor(5);
        streamPage.setEnterStreamToDelete(streamName);
        wait(20);
    }

    @When("^I click on SmokeTest streams from the list and I click on delete button$")
    public void i_click_on_SmokeTest_streams_from_the_list_and_I_click_on_delete_button() {
        pauseFor(5);
        streamPage.setClickDeleteStream();
    }

    @When("^I click on confirm delete button$")
    public void i_click_on_confirm_delete_button() {
        streamPage.setClickConfirmDeletion();
        wait(20);
    }

    @Then("^I should see the stream deleted on left hand side$")
    public void i_should_see_the_stream_deleted_on_left_hand_side() {
        streamPage.setValidateStreamDeletion();
    }

    @When("^I click on SmokeTest streams from the list and I click on edit streams$")
    public void i_click_on_SmokeTest_streams_from_the_list_and_I_click_on_edit_streams() {
        pauseFor(5);
        streamPage.setClickEditStreamButton();
    }

    @When("^I click type of publisher and I click type of publisher as Journalist$")
    public void i_click_type_of_publisher_and_I_click_type_of_publisher_as_Journalist() {
        pauseFor(5);
        streamPage.setClickTypeOfPublisher();
        pauseFor(10);
        streamPage.setChooseJournalist();
    }

    @Then("^I should able to see the edited streams$")
    public void i_should_able_to_see_the_edited_streams() {
        pauseFor(10);
        streamPage.validateEditStream();
    }
}
