package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Contents;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class Login extends BaseStep
{
    public LoginPage loginPage=new LoginPage(webDriver);
    public HomePage homePage=new HomePage(webDriver);

    @Given("^I navigate to application login url$")
    public void i_navigate_to_application_login_url()
    {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
    }

    @When("^I enter Username as \"(.*?)\"$")
    public void i_enter_Username_as(String UserName)
    {
        loginPage.setUserName(UserName);
    }

    @When("^I enter password as \"(.*?)\"$")
    public void i_enter_password_as(String Password)
    {
        loginPage.setPassword(Password);
    }

    @When("^I click on login button$")
    public void i_click_on_login_button()
    {
        loginPage.clickLgnBtn();
    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully()
    {
        String loginSuccessMsg=homePage.getLoginToastMsg();
        Assert.assertEquals(Contents.LGN_SUCCESSFUL_MSG,loginSuccessMsg);
    }
    @When("^I click on userprofile$")
    public void i_click_on_userprofile()
    {
        homePage.userProfile();
        wait(10);
    }

    @When("^I choose logout and click on it$")
    public void i_choose_logout_and_click_on_it()
    {
        homePage.logOut();
        wait(10);
    }

    @Then("^I should logout from the application$")
    public void i_should_logout_from_the_application()
    {

    }

}
