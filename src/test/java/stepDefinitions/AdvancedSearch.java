package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdvancedSearchPage;
import pageObjects.ListsPage;

public class AdvancedSearch extends BaseStep {

    public AdvancedSearchPage advancedSearchPage;
    public ListsPage listsPage;

    /* Journalist search using advanced search filtering by outlet type and outlet */
    @When("^I should login into the home page and click on search tab$")
    public void i_should_login_into_the_home_page_and_click_on_search_tab() throws InterruptedException{
        advancedSearchPage = new AdvancedSearchPage(webDriver);
        listsPage = new ListsPage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
        advancedSearchPage.clickAdvancedSearch();
    }

    @When("^I click on outlet type and enter outlet type as \"(.*?)\"$")
    public void i_click_on_outlet_type_and_enter_outlet_type_as(String outletType)throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.enterOutletType(outletType);
    }

    @When("^I Click on outlet name and enter outlet name as \"(.*?)\"$")
    public void i_Click_on_outlet_name_and_enter_outlet_name_as(String outletName) throws InterruptedException{

        pauseFor(5);
        advancedSearchPage.enterOutletName(outletName);
        pauseFor(5);
    }

    @Then("^I should see the Journalist list for the selected outlet$")
    public void i_should_see_the_Journalist_list_for_the_selected_outlet() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.setValidateOutletSearch();
    }

    /* Group By icon functionality in advanced search */
    @When("^I click on Group-By icon$")
    public void i_click_on_Group_By_icon() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.clickGroupByIcon();
    }

    @When("^I choose country as Group-By$")
    public void i_choose_country_as_Group_By() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.clickCountryGroupBy();
    }

    @Then("^I should able to see the journalist list grouped by country$")
    public void i_should_able_to_see_the_journalist_list_grouped_by_country() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.validateListGroupedByCountry();
    }

    /* Change Info view functionality in advanced search */
    @When("^I click on change info icon$")
    public void i_click_on_change_info_icon() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.clickChangeInfo();
    }

    @When("^I choose info as Roxhill says$")
    public void i_choose_info_as_Roxhill_says()throws InterruptedException {
        pauseFor(5);
        advancedSearchPage.chooseInfo();
    }

    @Then("^I should able to see the journalist list view by Roxhill says inside the tile$")
    public void i_should_able_to_see_the_journalist_list_view_by_Roxhill_says_inside_the_tile() throws InterruptedException{
        pauseFor(5);
        advancedSearchPage.validateJournalistInfo();
    }
    @When("^I click on add journalist to list button$")
    public void i_click_on_add_journalist_to_list_button() throws InterruptedException {
       wait(30);
       advancedSearchPage.setClickAddJournoToListBtn();
    }

    @When("^I enter list name from the advanced search journalist tab as \"([^\"]*)\" and click ok$")
    public void i_enter_list_name_from_the_advanced_search_journalist_tab_as_and_click_ok(String advancedSearchList) throws InterruptedException {
        wait(30);
        advancedSearchPage.enterListNameToCreateAdvancedSearchList(advancedSearchList);
    }

    @When("^I click on list tab in home page$")
    public void i_click_on_list_tab_in_home_page() throws InterruptedException {
        pauseFor(5);
        listsPage.clickListsBtn();
    }

    @When("^I validate journo added to the list from advanced search$")
    public void i_validate_journo_added_to_the_list_from_advanced_search() throws InterruptedException {
        wait(30);
        listsPage.validateJournoAddedToListFromAdvancedSearch();
    }

    @Then("^I should delete the list$")
    public void i_should_delete_the_list() throws InterruptedException {
        wait(30);
        listsPage.clickListsBtn();
    }
}
