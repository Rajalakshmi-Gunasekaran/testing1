package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

public class Search extends BaseStep {
    public SearchPage search;
    public HomePage homePage;
    public LoginPage loginPage;
    public OutletProfilePage outletProfilePage;
    public JournoProfilePage journoProfilePage;
    @When("^I should login into the home page and click on Quick search tab$")
    public void i_should_login_into_the_home_page_and_click_on_Quick_search_tab() {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        search = new SearchPage(webDriver);
        outletProfilePage=new OutletProfilePage(webDriver);
        journoProfilePage=new JournoProfilePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(2);
        search.setClkQuickSearch();
    }
    @When("^I enter Journalist name as \"(.*?)\"$")
    public void i_enter_Journalist_name_as(String journoName) {
        search.enterSearchJourno(journoName);
        wait(10);
    }
    @When("^I choose Journalist from the list and Click on it$")
    public void i_choose_Journalist_from_the_list_and_Click_on_it() {
        wait(30);
        search.chooseJournalist();
    }
    @Then("^I should navigate to the Journalist profile page$")
    public void i_should_navigate_to_the_Journalist_profile_page() {
        search.goToJournoProfile();
    }
    @When("^I enter Desk name as \"(.*?)\"$")
    public void i_enter_Desk_name_as(String deskName) {
        search.enterSearchDesk(deskName);
        wait(10);
    }
    @When("^I choose Desk from the list and Click on it$")
    public void i_choose_Desk_from_the_list_and_Click_on_it() {
        search.chooseDesk();
        wait(30);
    }
    @Then("^I should navigate to the Desk profile page$")
    public void i_should_navigate_to_the_Desk_profile_page() {
search.goToDeskProfile();
    }
    @When("^I enter Outlet name as \"(.*?)\"$")
    public void i_enter_Outlet_name_as(String outletName){
    search.enterSearchOutlet(outletName);
    wait(10);
    }
    @When("^I choose Outlet from the list and Click on it$")
    public void i_choose_Outlet_from_the_list_and_Click_on_it() {
    search.chooseOutlet();
    wait(30);
    }
    @Then("^I should navigate to the Outlet profile page$")
    public void i_should_navigate_to_the_Outlet_profile_page() {
search.goToOutletProfile();
    }
    @When("^I enter Company name as \"(.*?)\"$")
    public void i_enter_Company_name_as(String company){
    search.enterSearchCompany(company);
    wait(10);
          }
    @When("^I choose Company from the list and Click on it$")
    public void i_choose_Company_from_the_list_and_Click_on_it(){
        search.chooseCompany();
        wait(30);
     }
    @Then("^I should navigate to the Company profile page$")
    public void i_should_navigate_to_the_Company_profile_page(){
search.goToCompanyProfile();
    }
    @Then("^I should see all the available desks for that particular Outlet$")
    public void i_should_see_all_the_available_desks_for_that_particular_Outlet() {
        wait(60);
       outletProfilePage.validateDeskDisplay();
    }
    @Then("^I should see all the available information about the journalist$")
    public void i_should_see_all_the_available_information_about_the_journalist() {
        wait(60);
        outletProfilePage.validateJournoDisplay();
    }
    @Then("^I should see all the header tabs in journalist profile page$")
    public void i_should_see_all_the_header_tabs_in_journalist_profile_page(){
        wait(60);
        journoProfilePage.validateAllHeaderTabs();
        wait(60);
        journoProfilePage.validateCoverageTab();
        wait(30);
        journoProfilePage.validateHeadlinesTab();
        wait(30);
        journoProfilePage.validateTwitterTab();
    }
    @Then("^I should see all the available tabs for that particular outlet$")
    public void i_should_see_all_the_available_tabs_for_that_particular_outlet() {
        wait(60);
        //outletProfilePage.validate
    }
}