package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

public class Search extends BaseStep {
    public SearchPage search = new SearchPage(webDriver);
    public HomePage homePage = new HomePage(webDriver);
    public LoginPage loginPage = new LoginPage(webDriver);
    public OutletProfilePage outletProfilePage = new OutletProfilePage(webDriver);
    public JournoProfilePage journoProfilePage = new JournoProfilePage(webDriver);

    @When("^I should login into the home page and click on Quick search tab$")
    public void i_should_login_into_the_home_page_and_click_on_Quick_search_tab() throws InterruptedException
    {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
        search.setClkQuickSearch();
    }

    @When("^I enter Journalist name as \"(.*?)\"$")
    public void i_enter_Journalist_name_as(String journoName) throws InterruptedException
    {
        search.enterSearchJourno(journoName);
        wait(10);
    }

    @When("^I choose Journalist from the list and Click on it$")
    public void i_choose_Journalist_from_the_list_and_Click_on_it() throws InterruptedException
    {
        wait(30);
        search.chooseJournalist();
    }

    @Then("^I should navigate to the Journalist profile page$")
    public void i_should_navigate_to_the_Journalist_profile_page() throws InterruptedException
    {
        search.goToJournoProfile();
    }

    @When("^I enter Desk name as \"(.*?)\"$")
    public void i_enter_Desk_name_as(String deskName) throws InterruptedException
    {
        search.enterSearchDesk(deskName);
        wait(10);
    }

    @When("^I choose Desk from the list and Click on it$")
    public void i_choose_Desk_from_the_list_and_Click_on_it() throws InterruptedException
    {
        search.chooseDesk();
        wait(30);
    }

    @Then("^I should navigate to the Desk profile page$")
    public void i_should_navigate_to_the_Desk_profile_page() throws InterruptedException
    {
        search.goToDeskProfile();
    }

    @When("^I enter Outlet name as \"(.*?)\"$")
    public void i_enter_Outlet_name_as(String outletName) throws InterruptedException
    {
        search.enterSearchOutlet(outletName);
        wait(10);
    }

    @When("^I choose Outlet from the list and Click on it$")
    public void i_choose_Outlet_from_the_list_and_Click_on_it() throws InterruptedException
    {
        pauseFor(5);
        search.chooseOutlet();
        wait(30);
    }

    @Then("^I should navigate to the Outlet profile page$")
    public void i_should_navigate_to_the_Outlet_profile_page()throws InterruptedException
    {
        search.goToOutletProfile();
    }

    @When("^I enter Company name as \"(.*?)\"$")
    public void i_enter_Company_name_as(String company) throws InterruptedException
    {
        search.enterSearchCompany(company);
        wait(10);
    }

    @When("^I choose Company from the list and Click on it$")
    public void i_choose_Company_from_the_list_and_Click_on_it()throws InterruptedException
    {
        search.chooseCompany();
        wait(10);
    }

    @Then("^I should navigate to the Company profile page$")
    public void i_should_navigate_to_the_Company_profile_page()throws InterruptedException
    {
        search.goToCompanyProfile();
    }

    @Then("^I should see all the available information about the journalist$")
    public void i_should_see_all_the_available_information_about_the_journalist() throws InterruptedException
    {
        wait(10);
        outletProfilePage.validateJournoDisplay();
    }

    @Then("^I should see all the header tabs in journalist profile page$")
    public void i_should_see_all_the_header_tabs_in_journalist_profile_page() throws InterruptedException
    {
        wait(10);
        journoProfilePage.validateAllHeaderTabs();
        wait(10);
        journoProfilePage.validateCoverageTab();
        wait(20);
        journoProfilePage.validateHeadlinesTab();
        wait(20);
        journoProfilePage.validateTwitterTab();
    }

    @Then("^I should see all the available desks for that particular outlet$")
    public void i_should_see_all_the_available_desks_for_that_particular_outlet() throws InterruptedException
    {
        wait(30);
        outletProfilePage.validateDeskDisplay();
    }

    @Then("^I should see all the available tabs for that particular outlet$")
    public void i_should_see_all_the_available_tabs_for_that_particular_outlet() throws InterruptedException
    {
        wait(30);
        outletProfilePage.validateAllTabsINOutlet();
    }

    @Then("^I should see all the available information about the ACL journalist$")
    public void i_should_see_all_the_available_information_about_the_ACL_journalist() throws InterruptedException
    {
        wait(30);

    }
}