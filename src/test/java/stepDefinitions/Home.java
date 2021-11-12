package stepDefinitions;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Home extends BaseStep {
    public HomePage homePage;
    public LoginPage loginPage;

    @When("^I should login into the home page and click on PinpointTab$")
    public void i_should_login_into_the_home_page_and_click_on_PinpointTab() throws InterruptedException{
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(2);
        homePage.setPinpointTab();
    }

    @When("^I click on GoBack button$")
    public void i_click_on_GoBack_button()throws InterruptedException
    {
        wait(30);
        homePage.setGoBackBtn();
    }

    @Then("^I should able to go back to the home page$")
    public void i_should_able_to_go_back_to_the_home_page()throws InterruptedException
    {
        wait(30);
        homePage.setValidateGoBackBtn();
    }

    @When("^I should login into the home page and click on Webinars tab in sub menu$")
    public void i_should_login_into_the_home_page_and_click_on_Webinars_tab_in_sub_menu()throws InterruptedException {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
        homePage.clickWebinar();
    }

    @When("^I click on select all button to select all alerts$")
    public void i_click_on_select_all_button_to_select_all_alerts() throws InterruptedException{
        pauseFor(30);
        homePage.clickSelectAll();
    }

    @Then("^I should able to see all the webinar alerts$")
    public void i_should_able_to_see_all_the_webinar_alerts() throws InterruptedException{
        wait(10);
        homePage.setValidateWebinarAlert();
    }

    @When("^I should login into the home page and see HeadlineAlerts in sub menu$")
    public void i_should_login_into_the_home_page_and_see_HeadlineAlerts_in_sub_menu() throws InterruptedException{
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
    }

    @When("^I click on sign up links in Headline alerts page$")
    public void i_click_on_sign_up_links_in_Headline_alerts_page() throws InterruptedException{
      //homePage.clickSignUpLink();
    }

    @Then("^I should able to navigate to the Roxhill main site$")
    public void i_should_able_to_navigate_to_the_Roxhill_main_site() throws InterruptedException{
        wait(30);
        homePage.validateQuickLinks();
    }

    @When("^I am on login page and I click help and feedback functionality$")
    public void i_am_on_login_page_and_I_click_help_and_feedback_functionality()throws InterruptedException {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
        homePage.clickHelpAndFeedback();
    }

    @When("^I enter description in the text field as \"(.*?)\"$")
    public void i_enter_description_in_the_text_field_as(String desc) throws InterruptedException{
        wait(30);
        homePage.setEnterDesc(desc);
    }

    @When("^I click on send button$")
    public void i_click_on_send_button() throws InterruptedException{
        wait(30);
        homePage.setClickSendButton();
    }

    @Then("^I should able to send help and feedback email to the roxhill site$")
    public void i_should_able_to_send_help_and_feedback_email_to_the_roxhill_site() throws InterruptedException{
        wait(30);
        homePage.setValidateHelpAndFeedback();
    }
    @When("^I should login into the home page and click on AllAlerts in sub menu$")
    public void i_should_login_into_the_home_page_and_click_on_AllAlerts_in_sub_menu() throws InterruptedException{
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
        homePage.setClickAllAlertsTab();
    }

    @When("^I click on select all to validate$")
    public void i_click_on_select_all_to_validate() throws InterruptedException{
       wait(30);
        homePage.setClickSelectAll();
    }

    @Then("^I should see the all alerts results$")
    public void i_should_see_the_all_alerts_results() throws InterruptedException{
        wait(30);
        homePage.setValidateAllAlertsResults();
    }

    @When("^I should login into the home page and click on New Editions in sub menu$")
    public void i_should_login_into_the_home_page_and_click_on_New_Editions_in_sub_menu() throws InterruptedException{
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
        homePage.setClickNewEditionsTab();
    }

    @Then("^I should see the new editions results$")
    public void i_should_see_the_new_editions_results() throws InterruptedException{
        wait(30);
         homePage.setValidateNewEditionResults();
    }

    @When("^I choose outlet and click on outlet logo$")
    public void i_choose_outlet_and_click_on_outlet_logo() throws InterruptedException{
        wait(30);
        homePage.setClickOutletLogo();
    }

    @Then("^I should see navigate to the outlet profile$")
    public void i_should_see_navigate_to_the_outlet_profile() throws InterruptedException{
        wait(30);
        homePage.setValidateOutletLogoNavigatesToOutletProfile();
    }

    @When("^I click on search all alerts button$")
    public void i_click_on_search_all_alerts_button() throws InterruptedException{
        wait(30);
        homePage.setClickSearchAllAlertsBtn();
    }

    @Then("^I should navigate to the alerts tab in advanced search$")
    public void i_should_navigate_to_the_alerts_tab_in_advanced_search() throws InterruptedException{
        wait(30);
        homePage.setValidateSearchAllAlertsNavigatesToAdvancedSearch();
    }

    @When("^I choose alert to select and click on it$")
    public void i_choose_alert_to_select_and_click_on_it() throws InterruptedException{
        wait(30);
        homePage.setClickAlertTile();
    }

    @Then("^I should see the alert been selected$")
    public void i_should_see_the_alert_been_selected() throws InterruptedException{
         wait(30);
         homePage.setValidateAlertsResults();
    }
    @When("^I click on quick find by keyword text field and enter text as \"([^\"]*)\"$")
    public void i_click_on_quick_find_by_keyword_text_field_and_enter_text_as(String keyword) throws InterruptedException {
          wait(30);
          homePage.setEnterQuickFindByKeyword(keyword);
    }

    @Then("^I should see the results for the search$")
    public void i_should_see_the_results_for_the_search() throws InterruptedException {
          wait(30);
          homePage.validateQuickByFindKeyword();
    }
    @When("^I should login into the home page and click on webinars in sub menu$")
    public void i_should_login_into_the_home_page_and_click_on_webinars_in_sub_menu() throws InterruptedException {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
          homePage.setClickWebinarTab();
    }

    @When("^I click sign up here link$")
    public void i_click_sign_up_here_link() throws InterruptedException {
           wait(30);
           homePage.setClickSignUpHere();
    }

    @Then("^I should see the results as per the search$")
    public void i_should_see_the_results_as_per_the_search() throws InterruptedException {
        wait(30);
        webDriver.get("https://roxhillmedia.com/events/");
        wait(30);
        homePage.setValidateSignUpHere();
    }
    @When("^I should login into the home page and click on home button$")
    public void i_should_login_into_the_home_page_and_click_on_home_button() throws InterruptedException {
        homePage = new HomePage(webDriver);
        wait(30);
        homePage.setGoBackBtn();
    }
    @Then("^I should see the roxhill highlights$")
    public void i_should_see_the_roxhill_highlights() throws InterruptedException {
        wait(30);
        homePage.validateRoxhillHighlghtResults();
    }
    @When("^I click on View Roxhill Help button$")
    public void i_click_on_View_Roxhill_Help_button() throws InterruptedException {
        wait(30);
        homePage.setClickViewRoxhillHelp();
    }

    @Then("^I should navigate to the roxhill help page$")
    public void i_should_navigate_to_the_roxhill_help_page() throws InterruptedException {
        wait(30);
        webDriver.get("https://roxhillmedia.com/help/");
        wait(30);
        homePage.validateNavigateToRoxhillHelpPage();
    }
    @When("^I click on End User License Agreement link$")
    public void i_click_on_End_User_License_Agreement_link() throws InterruptedException {
        wait(30);
        homePage.setClickEndUserLicenseAgreementLink();
    }

    @When("^I should see the Terms and conditions$")
    public void i_should_see_the_Terms_and_conditions() throws InterruptedException {
       wait(30);
       homePage.validateEULAFormPage();
    }

    @Then("^I click close button to close the EULA form$")
    public void i_click_close_button_to_close_the_EULA_form() throws InterruptedException {
       wait(30);
       homePage.setClickCloseBtnToCloseEULA();
    }
}
