package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.SearchPage;

public class Search extends BaseStep{

    public SearchPage searchPage=new SearchPage(webDriver);

    @When("^I should login into the home page and click on first search tab$")
    public void i_should_login_into_the_home_page_and_click_on_first_search_tab() throws InterruptedException {
        wait(30);
        searchPage.setClkSearchTextField1();
    }

    @When("^I should login into the home page and click on second search tab$")
    public void i_should_login_into_the_home_page_and_click_on_second_search_tab() throws InterruptedException {
        wait(30);
        searchPage.setClkSearchTextField2();
    }

    @When("^I enter Journalist name as \"([^\"]*)\"$")
    public void i_enter_Journalist_name_as(String journoName) throws Exception {
        wait(30);
        searchPage.setEnterSearchTermInJournoName(journoName);
    }

    @When("^I choose Journalist from the list and Click on it$")
    public void i_choose_Journalist_from_the_list_and_Click_on_it() throws InterruptedException {
        wait(30);
         searchPage.setClkJournoFromTheList();
    }

    @Then("^I should navigate to the Journalist profile page$")
    public void i_should_navigate_to_the_Journalist_profile_page() throws InterruptedException {
        wait(30);
        searchPage.setValidateJournoPage();
    }
    @When("^I enter Outlet name as \"([^\"]*)\"$")
    public void i_enter_Outlet_name_as(String outletName) throws InterruptedException {
        wait(30);
        searchPage.setEnterSearchTermInOutletName(outletName);
    }

    @When("^I choose Outlet from the list and Click on it$")
    public void i_choose_Outlet_from_the_list_and_Click_on_it() throws InterruptedException {
         wait(30);
         searchPage.setClkOutletFromTheList();
    }

    @Then("^I should navigate to the Outlet profile page$")
    public void i_should_navigate_to_the_Outlet_profile_page() throws InterruptedException {
         wait(30);
         searchPage.setValidateOutletProfile();
    }

    @When("^I enter Company name as \"([^\"]*)\"$")
    public void i_enter_Company_name_as(String companyName) throws InterruptedException {
        wait(30);
        searchPage.setEnterCompanyName(companyName);
    }

    @When("^I choose company from the list and Click on it$")
    public void i_choose_company_from_the_list_and_Click_on_it() throws InterruptedException {
        wait(30);
        searchPage.setChooseAndClickCompanyName();
    }

    @Then("^I should navigate to the company profile page$")
    public void i_should_navigate_to_the_company_profile_page() throws InterruptedException {
       wait(30);
       searchPage.setValidateCompany();
    }
    @When("^I enter PR name as \"([^\"]*)\"$")
    public void i_enter_PR_name_as(String PRName) throws InterruptedException {
        wait(30);
        searchPage.setEnterPRName(PRName);
    }

    @When("^I choose PR from the list and Click on it$")
    public void i_choose_PR_from_the_list_and_Click_on_it() throws InterruptedException {
       wait(30);
       searchPage.setChooseAndClickPRName();
    }

    @Then("^I should navigate to the PR profile page$")
    public void i_should_navigate_to_the_PR_profile_page() throws InterruptedException {
        wait(30);
        searchPage.setValidatePRProfile();
    }
}
