package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.ListsPage;
import pageObjects.LoginPage;
import pageObjects.PinpointPage;

public class Pinpoint extends BaseStep {
    public LoginPage loginPage;
    public HomePage homePage;
    public PinpointPage pinpointPage;
    public ListsPage listsPage;

    @When("^I should login into the home page and click on pinpoint$")
    public void i_should_login_into_the_home_page_and_click_on_pinpoint() {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        pinpointPage = new PinpointPage(webDriver);
        listsPage = new ListsPage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
        pinpointPage.clickPinpointTab();
    }

    @When("^I enter search text as \"(.*?)\"$")
    public void i_enter_search_text_as(String pinpointSearchTxt) {
        wait(10);
        pinpointPage.EnterTextPinpoint(pinpointSearchTxt);
    }

    @Then("^I should able to see the results in graph view$")
    public void i_should_able_to_see_the_results_in_graph_view() {
        wait(10);
        pinpointPage.validatePinpointPage();
    }

    @When("^I choose country as france$")
    public void i_choose_country_as_france() throws InterruptedException {
        pauseFor(5);
        pinpointPage.clickFranceFromCountry();
    }

    @When("^I click on add journo to list button on journo tab in pinpoint$")
    public void i_click_on_add_journo_to_list_button_on_journo_tab_in_pinpoint() throws InterruptedException {
        pauseFor(5);
        pinpointPage.setClickAddJournalistToListBtn();
    }

    @When("^I enter list name in search text field to add journo from pinpoint as \"([^\"]*)\"$")
    public void i_enter_list_name_in_search_text_field_to_add_journo_from_pinpoint_as(String createListNamePinpoint) throws InterruptedException {
        pauseFor(5);
        pinpointPage.setEnterListNameInSearchTextField(createListNamePinpoint);
    }

    @When("^I click create new list to add journo from pinpoint$")
    public void i_click_create_new_list_to_add_journo_from_pinpoint() throws InterruptedException {
        pauseFor(5);
        pinpointPage.clickCreateListInPinpoint();
    }

    @When("^I click on Ok button to create list in pinpoint$")
    public void i_click_on_Ok_button_to_create_list_in_pinpoint() throws InterruptedException {
        pauseFor(5);
        pinpointPage.clickOkToCreateListInPinpoint();
    }

    @When("^I click on list tab in homepage$")
    public void i_click_on_list_tab_in_homepage() throws InterruptedException {
        pauseFor(5);
        listsPage.clickListsBtn();
    }

    @When("^I should able to see the journo added to list$")
    public void i_should_able_to_see_the_journo_added_to_list() throws InterruptedException {
        pauseFor(5);
        listsPage.validateJournoAddedToPinpointList();
    }

    @Then("^I should delete and confirm delete list$")
    public void i_should_delete_and_confirm_delete_list() throws InterruptedException {
        pauseFor(5);
        listsPage.setDeleteListBtn();
    }

    @When("^I click on more search text and enter second search item as \"([^\"]*)\"$")
    public void i_click_on_more_search_text_and_enter_second_search_item_as(String searchText2) throws InterruptedException {
        wait(30);
        pinpointPage.setClickPlusSignToAddSecondSearchText();
        wait(30);
        pinpointPage.setEnterSecondSearchTextField(searchText2);
    }

    @When("^I click on more search text and enter third search item as \"([^\"]*)\"$")
    public void i_click_on_more_search_text_and_enter_third_search_item_as(String searchText) throws InterruptedException {
        wait(30);
        pinpointPage.setClickPlusSignToAddThirdSearchText();
        wait(30);
        pinpointPage.setEnterThirdSearchTextField(searchText);
    }

    @When("^I click on tweet radio button option$")
    public void i_click_on_tweet_radio_button_option() throws InterruptedException {
        wait(30);
        pinpointPage.clickOnTweetOption();
    }
    @Then("^I should able to see the results for tweet search and more results$")
    public void i_should_able_to_see_the_results_for_tweet_search_and_more_results() throws InterruptedException {
       pauseFor(5);
       pinpointPage.setValidateTweetAndMoreSearch();
    }
    @When("^I click on outlet search icon$")
    public void i_click_on_outlet_search_icon() throws InterruptedException {
       wait(30);
       pinpointPage.clickOutletSearchIcon();
    }

    @Then("^I should navigate to the advanced search outlet tab$")
    public void i_should_navigate_to_the_advanced_search_outlet_tab() throws InterruptedException {
        wait(30);
        pinpointPage.validateNavigateToAdvancedSearchOutletTab();
    }
    @When("^I click on journalist search icon$")
    public void i_click_on_journalist_search_icon() throws InterruptedException {
        pauseFor(5);
        pinpointPage.setClickJournoSearchIcon();
    }

    @Then("^I should navigate to the advanced search journo tab$")
    public void i_should_navigate_to_the_advanced_search_journo_tab() throws InterruptedException {
        wait(30);
        pinpointPage.setValidateNavigateToAdvancedSearchJournoTab();
    }
}
