package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.AdvancedSearchPage;
import pageObjects.LeftPanListsPage;

public class AdvancedSearch extends BaseStep {

    public AdvancedSearchPage advancedSearchPage;
    public LeftPanListsPage leftPanListsPage;

    /* Journalist search using advanced search filtering by outlet type and outlet */
    @When("^I should login into the home page and click on search tab$")
    public void i_should_login_into_the_home_page_and_click_on_search_tab() {
        advancedSearchPage = new AdvancedSearchPage(webDriver);
        leftPanListsPage = new LeftPanListsPage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
        advancedSearchPage.clickAdvancedSearch();
    }

    @When("^I click on outlet type and enter outlet type as \"(.*?)\"$")
    public void i_click_on_outlet_type_and_enter_outlet_type_as(String outletType) {
        pauseFor(5);
        advancedSearchPage.enterOutletType(outletType);
    }

    @When("^I Click on outlet name and enter outlet name as \"(.*?)\"$")
    public void i_Click_on_outlet_name_and_enter_outlet_name_as(String outletName) {

        pauseFor(5);
        advancedSearchPage.enterOutletName(outletName);
        pauseFor(5);
    }

    @Then("^I should see the Journalist list for the selected outlet$")
    public void i_should_see_the_Journalist_list_for_the_selected_outlet() {
        pauseFor(5);
        advancedSearchPage.setValidateOutletSearch();
    }

    /* Group By icon functionality in advanced search */
    @When("^I click on Group-By icon$")
    public void i_click_on_Group_By_icon() {
        pauseFor(5);
        advancedSearchPage.clickGroupByIcon();
    }

    @When("^I choose country as Group-By$")
    public void i_choose_country_as_Group_By() {
        pauseFor(5);
        advancedSearchPage.clickCountryGroupBy();
    }

    @Then("^I should able to see the journalist list grouped by country$")
    public void i_should_able_to_see_the_journalist_list_grouped_by_country() {
        pauseFor(5);
        advancedSearchPage.validateListGroupedByCountry();
    }

    /* Change Info view functionality in advanced search */
    @When("^I click on change info icon$")
    public void i_click_on_change_info_icon() {
        pauseFor(5);
        advancedSearchPage.clickChangeInfo();
    }

    @When("^I choose info as Roxhill says$")
    public void i_choose_info_as_Roxhill_says() {
        pauseFor(5);
        advancedSearchPage.chooseInfo();
    }

    @Then("^I should able to see the journalist list view by Roxhill says inside the tile$")
    public void i_should_able_to_see_the_journalist_list_view_by_Roxhill_says_inside_the_tile() {
        pauseFor(5);
        advancedSearchPage.validateJournalistInfo();
    }

    /* Adding Journalist to the list*/
    @When("^I click on Add Journalist to list button$")
    public void i_click_on_Add_Journalist_to_list_button() {
        pauseFor(5);
        advancedSearchPage.setClickCopyToList();
    }

    @When("^I enter list name as \"(.*?)\" and click Ok$")
    public void i_enter_list_name_as_and_click_Ok(String list) {
        pauseFor(5);
        advancedSearchPage.setEnterListName(list);
        pauseFor(5);
        advancedSearchPage.setClickOk();
    }

}