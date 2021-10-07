package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.Constants;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class Login extends BaseStep {
    public LoginPage loginPage = new LoginPage(webDriver);
    public HomePage homePage = new HomePage(webDriver);

    @Given("^I navigate to application login url$")
    public void i_navigate_to_application_login_url() {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
    }

    @When("^I enter Username as \"(.*?)\"$")
    public void i_enter_Username_as(String UserName) {
        loginPage.setUserName(UserName);
    }

    @When("^I enter password as \"(.*?)\"$")
    public void i_enter_password_as(String Password) {
        loginPage.setPassword(Password);
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() {
        loginPage.clickLgnBtn();
    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() {
        String loginSuccessMsg = homePage.getLoginToastMsg();
        Assert.assertEquals(Constants.LGN_SUCCESSFUL_MSG, loginSuccessMsg);
    }

    @When("^I click on userprofile$")
    public void i_click_on_userprofile() {
        homePage.userProfile();
        wait(10);
    }

    @When("^I choose logout and click on it$")
    public void i_choose_logout_and_click_on_it()throws InterruptedException {
        homePage.logOut();
        wait(10);
    }

    @Then("^I should logout from the application$")
    public void i_should_logout_from_the_application() {

    }

    @When("^I am on login page$")
    public void i_am_on_login_page() {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
    }

    @When("^I click on forgotten password link$")
    public void i_click_on_forgotten_password_link() {
        wait(30);
        loginPage.clickForgottenPassword();
    }

    @When("^I enter email id in the email text field as \"(.*?)\"$")
    public void i_enter_email_id_in_the_email_text_field_as(String email) {
        wait(30);
        loginPage.setEnterEmail(email);
    }

    @When("^I click send email button$")
    public void i_click_send_email_button() {
        wait(30);
        loginPage.setClickSendEmailButton();
    }

    @Then("^I validate with the forgotten password link sent message$")
    public void i_validate_with_the_forgotten_password_link_sent_message() {
        pauseFor(5);
        loginPage.setValidateForgotPassword();
    }
    @When("^I choose user settings and click on it$")
    public void i_choose_user_settings_and_click_on_it()  {
        wait(30);
        loginPage.ClickUserSettings();
    }

    @When("^I navigate to the user settings page and choose preferred country as United Kingdom$")
    public void i_navigate_to_the_user_settings_page_and_choose_preferred_country_as_United_Kingdom() {
        wait(30);
        loginPage.chooseCountry();
    }

    @When("^I click save changes button$")
    public void i_click_save_changes_button()  {
        wait(30);
        loginPage.saveChanges();
    }
    @Then("^I should navigate to the home page$")
    public void i_should_navigate_to_the_home_page() {
        wait(30);
        homePage.setValidateGoBackBtn();
    }
}
