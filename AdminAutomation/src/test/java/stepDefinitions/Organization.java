package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.OrganizationsPage;

public class Organization extends BaseStep{
       public OrganizationsPage organizationsPage=new OrganizationsPage(webDriver);

    @When("^I should login into the home page and click on Organization tab$")
    public void i_should_login_into_the_home_page_and_click_on_Organization_tab() throws InterruptedException {
       wait(30);
       organizationsPage.setClickOrganizationTab();
    }
    @When("^I click add new button in companies page$")
    public void i_click_add_new_button_in_companies_page() throws InterruptedException {
       wait(30);
       organizationsPage.setClickAddNewBtnToCreateCompany();
    }
    @When("^I enter company name as \"([^\"]*)\"$")
    public void i_enter_company_name_as(String companyName) throws InterruptedException {
       wait(30);
       organizationsPage.setEnterCompanyNameToCreate(companyName);
    }

    @When("^I click save button to create company$")
    public void i_click_save_button_to_create_company() throws InterruptedException {
        wait(30);
        organizationsPage.setClickSaveBtn();
    }
    @When("^I click on companies link$")
    public void i_click_on_companies_link() throws InterruptedException {
        wait(30);
        organizationsPage.setClickCompaniesLink();
    }

    @Then("^I should delete the newly created company$")
    public void i_should_delete_the_newly_created_company() throws InterruptedException {
        wait(30);
        organizationsPage.setClickDeleteCompany();
    }
    @When("^I click on no logo from the list$")
    public void i_click_on_no_logo_from_the_list() throws InterruptedException {
        wait(30);
        organizationsPage.setClickNoLogoOptions();
    }

    @When("^I choose and click on no logo company link$")
    public void i_choose_and_click_on_no_logo_company_link() throws InterruptedException {
       wait(30);
       organizationsPage.setClickNoLogoCompanyLink();
    }
    @Then("^I should navigate to the profile page for the selected link$")
    public void i_should_navigate_to_the_profile_page_for_the_selected_link() throws InterruptedException {
       wait(30);
       organizationsPage.setValidateProfileForChosenItemWithoutLogo();
    }
    @When("^I click on Pr Agencies from the list$")
    public void i_click_on_Pr_Agencies_from_the_list() throws InterruptedException {
        wait(30);
        organizationsPage.setClickPRAgenciesOptions();
    }

    @When("^I choose and click on Pr agencies link$")
    public void i_choose_and_click_on_Pr_agencies_link() throws InterruptedException {
        wait(30);
        organizationsPage.setClickPRAgenciesLink();
    }
    @When("^I click Customer tab to navigate to respective page$")
    public void i_click_Customer_tab_to_navigate_to_respective_page() throws InterruptedException {
       wait(30);
       organizationsPage.setClickCustomerTab();
       wait(30);
       organizationsPage.setValidateNavigateToCustomerPage();
    }

    @When("^I click Logo tab to navigate to respective page$")
    public void i_click_Logo_tab_to_navigate_to_respective_page() throws InterruptedException {
        wait(30);
        organizationsPage.setClickLogoTab();
        wait(30);
        organizationsPage.setValidateNavigateToLogoPage();
    }

    @When("^I click Divisions tab to navigate to respective page$")
    public void i_click_Divisions_tab_to_navigate_to_respective_page() throws InterruptedException {
       wait(30);
       organizationsPage.setClickDivisionsTab();
       wait(30);
       organizationsPage.setValidateNavigateToDivisionsPage();
    }

    @When("^I click Persons tab to navigate to respective page$")
    public void i_click_Persons_tab_to_navigate_to_respective_page() throws InterruptedException {
        wait(30);
        organizationsPage.setClickPersonsTab();
        wait(30);
        organizationsPage.setValidateNavigateToPersonsPage();
    }

    @When("^I click Aliases tab to navigate to respective page$")
    public void i_click_Aliases_tab_to_navigate_to_respective_page() throws InterruptedException {
        wait(30);
        organizationsPage.setClickAliasesTab();
        wait(30);
        organizationsPage.setValidateNavigateToAliasesPage();
    }

    @When("^I click Tickets tab to navigate to respective page$")
    public void i_click_Tickets_tab_to_navigate_to_respective_page() throws InterruptedException {
       wait(30);
       organizationsPage.setClickTicketsTab();
       wait(30);
       organizationsPage.setValidateNavigateToTicketsPage();
    }

    @When("^I click Logs tab to navigate to respective page$")
    public void i_click_Logs_tab_to_navigate_to_respective_page() throws InterruptedException {
      wait(30);
      organizationsPage.setClickLogsTab();
      wait(30);
      organizationsPage.setValidateNavigateToLogsPage();
    }

    @When("^I click ACL tab to navigate to respective page$")
    public void i_click_ACL_tab_to_navigate_to_respective_page() throws InterruptedException {
      wait(30);
      organizationsPage.setClickACLTab();
      wait(30);
      organizationsPage.setValidateNavigateToACLPage();
    }

    @Then("^I click Working sets to navigate to respective page$")
    public void i_click_Working_sets_to_navigate_to_respective_page() throws InterruptedException {
        wait(30);
        organizationsPage.setClickWorkingSetsTab();
        wait(30);
        organizationsPage.setValidateNavigateToWorkingSetsPage();
    }
    @When("^I click on media outlets from the list$")
    public void i_click_on_media_outlets_from_the_list() throws InterruptedException {
        wait(30);
        organizationsPage.setClickMediaOutletsOptions();
    }

    @When("^I enter search media outlets as \"([^\"]*)\"$")
    public void i_enter_search_media_outlets_as(String mediaOutlet) throws InterruptedException {
      wait(30);
      organizationsPage.setEnterMediaOutletAsSearchText(mediaOutlet);
    }

    @When("^I click chosen media outlet from the list$")
    public void i_click_chosen_media_outlet_from_the_list() throws InterruptedException {
       wait(30);
       organizationsPage.setClickChosenMediaOutlet();
    }

    @Then("^I should navigate to the media outlet profile page$")
    public void i_should_navigate_to_the_media_outlet_profile_page() throws InterruptedException {
        wait(30);
        organizationsPage.setValidateNavigateToMediaOutletPage();
    }
    @When("^I click on companies from the list$")
    public void i_click_on_companies_from_the_list() throws InterruptedException {
        wait(30);
        organizationsPage.setClickCompaniesOptions();
    }

    @When("^I enter search company name as \"([^\"]*)\"$")
    public void i_enter_search_company_name_as(String companyName) throws InterruptedException {
        wait(30);
        organizationsPage.setEnterCompanySearchNameAs(companyName);
    }

    @When("^I click chosen company from the list$")
    public void i_click_chosen_company_from_the_list() throws InterruptedException {
       wait(30);
       organizationsPage.setClickChosenCompany();
    }

    @When("^I click add new button in media outlet page$")
    public void i_click_add_new_button_in_media_outlet_page() throws InterruptedException {
        wait(30);
        organizationsPage.setClickAddNewBtnToCreateMediaOutlet();
    }

    @When("^I enter media outlet name as \"([^\"]*)\"$")
    public void i_enter_media_outlet_name_as(String mediaOutlet) throws InterruptedException {
       wait(30);
       organizationsPage.setEnterMediaOutletNameToCreate(mediaOutlet);
    }
    @When("^I click and choose media outlet types as wilderness$")
    public void i_click_and_choose_media_outlet_types_as_wilderness() throws InterruptedException {
        wait(30);
        organizationsPage.setChooseMediaOutletType();
    }

    @When("^I click save button to create media outlet$")
    public void i_click_save_button_to_create_media_outlet() throws InterruptedException {
        wait(30);
        organizationsPage.setClickSaveBtn();
    }

    @When("^I click on media outlet link$")
    public void i_click_on_media_outlet_link() throws InterruptedException {
        wait(30);
        organizationsPage.setClickMediaOutletLink();
    }

    @When("^I enter search media outlet name as \"([^\"]*)\"$")
    public void i_enter_search_media_outlet_name_as(String mediaOutlet) throws InterruptedException {
       wait(30);
       organizationsPage.setEnterMediaOutletNameToSearch(mediaOutlet);
    }

    @Then("^I should delete the newly created media outlet$")
    public void i_should_delete_the_newly_created_media_outlet() throws InterruptedException {
       wait(30);
       organizationsPage.setClickDeleteMediaOutlet();
    }

    @When("^I click add new button in PR Agencies page$")
    public void i_click_add_new_button_in_PR_Agencies_page() throws InterruptedException {
        wait(30);
        organizationsPage.setClickAddNewBtnToCreatePRAgencies();
    }

    @When("^I enter PR Agencies name as \"([^\"]*)\"$")
    public void i_enter_PR_Agencies_name_as(String PRAgenciesName) throws InterruptedException {
        wait(30);
        organizationsPage.setEnterPRAgenciesNameToCreate(PRAgenciesName);
    }

    @When("^I click save button to create PR agencies$")
    public void i_click_save_button_to_create_PR_agencies() throws InterruptedException {
      wait(30);
      organizationsPage.setClickSaveBtn();
    }

    @When("^I should navigate to the PR Agencies profile page$")
    public void i_should_navigate_to_the_PR_Agencies_profile_page() throws InterruptedException {
        wait(30);
        organizationsPage.setNavigateToPRAgenciesProfilePage();
    }

    @When("^I enter PR agencies search text in search field as \"([^\"]*)\"$")
    public void i_enter_PR_agencies_search_text_in_search_field_as(String PRAgencyName) throws InterruptedException {
        wait(30);
        organizationsPage.setEnterPRAgenciesSearchText(PRAgencyName);
    }

    @Then("^I should delete the newly created PR Agencies$")
    public void i_should_delete_the_newly_created_PR_Agencies() throws InterruptedException {
        wait(30);
        organizationsPage.setClickDeletePRAgencies();
    }
    @When("^I click media outlet and I should navigate to the media outlet profile page$")
    public void i_click_media_outlet_and_I_should_navigate_to_the_media_outlet_profile_page() throws InterruptedException {
       wait(30);
       organizationsPage.setClkMediaOutletToGoToProfilePage();
    }

    @When("^I click on duplicates tab$")
    public void i_click_on_duplicates_tab() throws InterruptedException {
        wait(30);
        organizationsPage.setClkDuplicateTab();
    }

    @When("^I enter search ID in text field as \"([^\"]*)\" and click search icon$")
    public void i_enter_search_ID_in_text_field_as_and_click_search_icon(String outletID) throws InterruptedException {
        wait(30);
        organizationsPage.setEnterMediaOutletIDInSearchIDFld(outletID);
    }

    @When("^I click merge button to merge outlet$")
    public void i_click_merge_button_to_merge_outlet() throws InterruptedException {
        wait(30);
        organizationsPage.setClkMergeBtn();
    }

    @Then("^I should see the journalist merged$")
    public void i_should_see_the_journalist_merged() throws InterruptedException {
       wait(30);
       organizationsPage.validateJournoMerged();
    }
}
