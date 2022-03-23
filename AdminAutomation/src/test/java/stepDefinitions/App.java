package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AppPage;

public class App extends BaseStep{
    public AppPage appPage=new AppPage(webDriver);
    @When("^I should login into the home page and click on App tab$")
    public void i_should_login_into_the_home_page_and_click_on_App_tab() throws InterruptedException {
      wait(30);
      appPage.clickAppTab();
    }

    @When("^I click on users from the list$")
    public void i_click_on_users_from_the_list() throws InterruptedException {
        wait(30);
        appPage.clickOnUsers();
    }

    @When("^I choose status enabled from the list and Click on it$")
    public void i_choose_status_enabled_from_the_list_and_Click_on_it() throws InterruptedException {
        wait(30);
        appPage.chooseStatus();
    }
    @When("^I click user search field and enter user name as \"([^\"]*)\"$")
    public void i_click_user_search_field_and_enter_user_name_as(String userName) throws InterruptedException {
        wait(30);
        appPage.enterUserName(userName);
    }
    @When("^I click on user name from the list$")
    public void i_click_on_user_name_from_the_list() throws InterruptedException {
         wait(30);
         appPage.clkUserNameFromTheList();
    }

    @Then("^I should navigate to the user profile page$")
    public void i_should_navigate_to_the_user_profile_page() throws InterruptedException {
         wait(30);
         appPage.validateUserProfile();
    }
    @When("^I click on customers from the list$")
    public void i_click_on_customers_from_the_list() throws InterruptedException {
         wait(30);
         appPage.clkCustomer();
    }

    @When("^I choose type as subscribed and status as no from the list and Click on it$")
    public void i_choose_type_as_subscribed_and_status_as_no_from_the_list_and_Click_on_it() throws InterruptedException {
         wait(30);
         appPage.chooseCustomerType();
         wait(30);
         appPage.chooseCustomerOverdueInvoiceNotification();
    }

    @When("^I click customer search field and enter customer name as \"([^\"]*)\"$")
    public void i_click_customer_search_field_and_enter_customer_name_as(String customerName) throws InterruptedException {
         wait(30);
         appPage.enterCustomerName(customerName);
    }

    @When("^I choose customer name from the list and click on edit button$")
    public void i_choose_customer_name_from_the_list_and_click_on_edit_button() throws InterruptedException {
         wait(30);
         appPage.clkEditCustomerBtn();
    }

    @Then("^I should navigate to the customer profile page$")
    public void i_should_navigate_to_the_customer_profile_page() throws InterruptedException {
         wait(30);
         appPage.validateCustomer();
    }
    @When("^I click on add new button$")
    public void i_click_on_add_new_button() throws InterruptedException {
       wait(30);
       appPage.setClkAddNewBtn();
    }

    @When("^I enter customer name as \"([^\"]*)\"$")
    public void i_enter_customer_name_as(String newCustomerName) throws InterruptedException {
        wait(30);
        appPage.setEnterCustomerName(newCustomerName);
    }

    @When("^I enter domain as \"([^\"]*)\"$")
    public void i_enter_domain_as(String newDomainName) throws InterruptedException {
        wait(30);
        appPage.setEnterDomainName(newDomainName);
    }

    @When("^I click on save button$")
    public void i_click_on_save_button() throws InterruptedException {
       wait(30);
       appPage.setClkSaveBtn();
    }

    @When("^I click on App tab and click on customers from the list$")
    public void i_click_on_App_tab_and_click_on_customers_from_the_list() throws InterruptedException {
        pauseFor(5);
        appPage.clickAppTab();
        wait(30);
        appPage.clkCustomer();
    }

    @Then("^I click on delete button and click confirm delete button$")
    public void i_click_on_delete_button_and_click_confirm_delete_button() throws InterruptedException {
        wait(30);
        appPage.setClkDeleteBtn();
        wait(30);
        appPage.setClkConfirmDeleteBtn();
    }
    @When("^I click on all alerts from the list$")
    public void i_click_on_all_alerts_from_the_list() throws InterruptedException {
        wait(30);
        appPage.setClkAllAlerts();
    }

    @When("^I click on add new button and click on new story user alert$")
    public void i_click_on_add_new_button_and_click_on_new_story_user_alert() throws InterruptedException {
       appPage.setClkNewStoryUserAlert();
    }

    @When("^I enter new story user alert name as \"([^\"]*)\"$")
    public void i_enter_new_story_user_alert_name_as(String storyAlertName) throws InterruptedException {
       wait(30);
       appPage.setEnterNewStoryUserAlertName(storyAlertName);
    }

    @When("^I choose working tag as alert when written$")
    public void i_choose_working_tag_as_alert_when_written() throws InterruptedException {
       wait(30);
       appPage.setChooseWorkingSetTag();
    }

    @When("^I uncheck enabled check box$")
    public void i_uncheck_enabled_check_box() throws InterruptedException {
       wait(30);
       appPage.setUncheckEnabled();
    }

    @When("^I click on save button in user alert$")
    public void i_click_on_save_button_in_user_alert() throws InterruptedException {
        wait(30);
        appPage.setClkSaveBtnInUserAlert();
    }

    @When("^I choose type as new story user alert$")
    public void i_choose_type_as_new_story_user_alert() throws InterruptedException {
       wait(30);
       appPage.setChooseTypeAsNewStoryUserAlert();
    }

    @When("^I click on edit button in user alert$")
    public void i_click_on_edit_button_in_user_alert() throws InterruptedException {
       wait(30);
       appPage.setClkEditBtn();
    }

    @When("^I edit the user alert name as \"([^\"]*)\"$")
    public void i_edit_the_user_alert_name_as(String editAlertName) throws InterruptedException {
        wait(30);
        appPage.setEditUserAlertName(editAlertName);
    }
    @When("^I click on add new button and click on URL check author user alert$")
    public void i_click_on_add_new_button_and_click_on_URL_check_author_user_alert() throws InterruptedException {
        wait(30);
        appPage.setClkAddURLCheckAuthorUserAlert();
    }

    @When("^I enter URL check author user alert name as \"([^\"]*)\"$")
    public void i_enter_URL_check_author_user_alert_name_as(String URLAuthorUserAlertName) throws InterruptedException {
       wait(30);
       appPage.setEnterURLAuthorUserAlertName(URLAuthorUserAlertName);
    }

    @When("^I choose author and enter author as \"([^\"]*)\"$")
    public void i_choose_author_and_enter_author_as(String author) throws InterruptedException {
        wait(30);
        appPage.setChooseAndEnterAuthor(author);
    }

    @When("^I choose type as URL check author user alert$")
    public void i_choose_type_as_URL_check_author_user_alert() throws InterruptedException {
        wait(30);
        appPage.setChooseTypeAsURLAuthorUserAlert();
    }

    @When("^I choose and click enabled option as No$")
    public void i_choose_and_click_enabled_option_as_No() throws InterruptedException {
        wait(30);
        appPage.setClickEnabledDropDownAsNo();
    }

    @When("^I click on page number as last$")
    public void i_click_on_page_number_as_last() throws InterruptedException {
        wait(30);
        appPage.setClickPageNumber();
    }

    @When("^I click on Automation URL check author to edit$")
    public void i_click_on_Automation_URL_check_author_to_edit() throws InterruptedException {
          wait(30);
          appPage.setClickAutomationUrlCheckAuthorToEdit();
    }

    @When("^I edit the author user alert name as \"([^\"]*)\"$")
    public void i_edit_the_author_user_alert_name_as(String editAuthorName) throws InterruptedException {
           wait(30);
           appPage.setEditAuthorAlertName(editAuthorName);
    }
}
