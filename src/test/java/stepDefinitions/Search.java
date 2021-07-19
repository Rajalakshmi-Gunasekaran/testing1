package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

public class Search extends BaseStep {
    public SearchPage search = new SearchPage(webDriver);
    public HomePage homePage= new HomePage(webDriver);
    public LoginPage loginPage= new LoginPage(webDriver);
    public OutletProfilePage outletProfilePage=new OutletProfilePage(webDriver);
    public JournoProfilePage journoProfilePage=new JournoProfilePage(webDriver);

    @When("^I should login into the home page and click on Quick search tab$")
    public void i_should_login_into_the_home_page_and_click_on_Quick_search_tab()
    {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
        search.setClkQuickSearch();
    }

    @When("^I enter Journalist name as \"(.*?)\"$")
    public void i_enter_Journalist_name_as(String journoName)
    {
        search.enterSearchJourno(journoName);
        wait(10);
    }

    @When("^I choose Journalist from the list and Click on it$")
    public void i_choose_Journalist_from_the_list_and_Click_on_it()
    {
        wait(30);
        search.chooseJournalist();
    }

    @Then("^I should navigate to the Journalist profile page$")
    public void i_should_navigate_to_the_Journalist_profile_page()
    {
        search.goToJournoProfile();
    }

    @When("^I enter Desk name as \"(.*?)\"$")
    public void i_enter_Desk_name_as(String deskName)
    {
        search.enterSearchDesk(deskName);
        wait(10);
    }

    @When("^I choose Desk from the list and Click on it$")
    public void i_choose_Desk_from_the_list_and_Click_on_it()
    {
        search.chooseDesk();
        wait(30);
    }

    @Then("^I should navigate to the Desk profile page$")
    public void i_should_navigate_to_the_Desk_profile_page() {
        search.goToDeskProfile();
    }

    @When("^I enter Outlet name as \"(.*?)\"$")
    public void i_enter_Outlet_name_as(String outletName)
    {
        search.enterSearchOutlet(outletName);
        wait(10);
    }

    @When("^I choose Outlet from the list and Click on it$")
    public void i_choose_Outlet_from_the_list_and_Click_on_it()
    {
        search.chooseOutlet();
        wait(30);
    }

    @Then("^I should navigate to the Outlet profile page$")
    public void i_should_navigate_to_the_Outlet_profile_page()
    {
        search.goToOutletProfile();
    }

    @When("^I enter Company name as \"(.*?)\"$")
    public void i_enter_Company_name_as(String company)
    {
        search.enterSearchCompany(company);
        wait(10);
    }

    @When("^I choose Company from the list and Click on it$")
    public void i_choose_Company_from_the_list_and_Click_on_it()
    {
        search.chooseCompany();
        wait(10);
    }

    @Then("^I should navigate to the Company profile page$")
    public void i_should_navigate_to_the_Company_profile_page()
    {
        search.goToCompanyProfile();
    }

    @Then("^I should see all the available information about the journalist$")
    public void i_should_see_all_the_available_information_about_the_journalist()
    {
        wait(10);
        outletProfilePage.validateJournoDisplay();
    }

    @Then("^I should see all the header tabs in journalist profile page$")
    public void i_should_see_all_the_header_tabs_in_journalist_profile_page()
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
    public void i_should_see_all_the_available_desks_for_that_particular_outlet() {
        wait(30);
        outletProfilePage.validateDeskDisplay();
    }
    @Then("^I should see all the available tabs for that particular outlet$")
    public void i_should_see_all_the_available_tabs_for_that_particular_outlet()
    {
       wait(30);
       outletProfilePage.validateAllTabsINOutlet();
    }
    @When("^I should login into the home page and click on Log in as button$")
    public void i_should_login_into_the_home_page_and_click_on_Log_in_as_button()
    {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
        journoProfilePage.clickLogInUserButton();
    }

    @When("^I enter user name as \"([^\"]*)\" and click ok$")
    public void i_enter_user_name_as_and_click_ok(String customerName)
    {
        pauseFor(5);
        journoProfilePage.setEnterUserNameToLogInAs(customerName);
        pauseFor(10);
       journoProfilePage.setClickOkBtnLogIn();
    }

    @When("^I click on Quick search tab$")
    public void i_click_on_Quick_search_tab()
    {
        pauseFor(5);
        search.setClkQuickSearch();
    }

    @Then("^I should see all the available information about the journalist and I log out as user$")
    public void i_should_see_all_the_available_information_about_the_journalist_and_I_log_out_as_user()
    {
        pauseFor(2);
        search.goToJournoProfile();
        pauseFor(2);
        journoProfilePage.setLogOutAsUser();
    }
}