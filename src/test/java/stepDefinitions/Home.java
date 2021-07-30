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

    @When("^I should login into the home page and click on newsOnlineButton$")
    public void i_should_login_into_the_home_page_and_click_on_newsOnlineButton() {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(2);
        homePage.setNewsOnlineBtn();
    }

    @When("^I click on GoBack button$")
    public void i_click_on_GoBack_button() {
        homePage.setGoBackBtn();
    }

    @Then("^I should able to go back to the home page$")
    public void i_should_able_to_go_back_to_the_home_page() {
        homePage.setValidateGoBackBtn();
    }

    @When("^I should login into the home page and click on Webinars tab in sub menu$")
    public void i_should_login_into_the_home_page_and_click_on_Webinars_tab_in_sub_menu() {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
        homePage.clickWebinar();
    }

    @When("^I click on select all button to select all alerts$")
    public void i_click_on_select_all_button_to_select_all_alerts() {
        pauseFor(30);
        homePage.clickSelectAll();
    }

    @Then("^I should able to see all the webinar alerts$")
    public void i_should_able_to_see_all_the_webinar_alerts() {
        wait(10);
        homePage.setValidateWebinarAlert();
    }

    @When("^I should login into the home page and see HeadlineAlerts in sub menu$")
    public void i_should_login_into_the_home_page_and_see_HeadlineAlerts_in_sub_menu() {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
    }

    @When("^I click on sign up links in Headline alerts page$")
    public void i_click_on_sign_up_links_in_Headline_alerts_page() {
      //homePage.clickSignUpLink();
    }

    @Then("^I should able to navigate to the Roxhill main site$")
    public void i_should_able_to_navigate_to_the_Roxhill_main_site() {
        wait(30);
        homePage.validateQuickLinks();
    }

    @When("^I am on login page and I click help and feedback functionality$")
    public void i_am_on_login_page_and_I_click_help_and_feedback_functionality() {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(30);
        homePage.clickHelpAndFeedback();
    }

    @When("^I enter description in the text field as \"(.*?)\"$")
    public void i_enter_description_in_the_text_field_as(String desc) {
        wait(30);
        homePage.setEnterDesc(desc);
    }

    @When("^I click on send button$")
    public void i_click_on_send_button() {
        wait(30);
        homePage.setClickSendButton();
    }

    @Then("^I should able to send help and feedback email to the roxhill site$")
    public void i_should_able_to_send_help_and_feedback_email_to_the_roxhill_site() {
        wait(30);
        homePage.setValidateHelpAndFeedback();
    }

}
