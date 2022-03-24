package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

import static stepDefinitions.BaseStep.webDriver;

public class Login extends BaseStep{
    public LoginPage loginPage=new LoginPage(webDriver);
    @Given("^I navigate to application login url$")
    public void i_navigate_to_application_login_url() throws Exception{
        webDriver.get(readPropertyFile1("url2"));
        wait(30);
    }

    @When("^I enter Username$")
    public void i_enter_Username() throws Exception {
        loginPage.setUserName();
    }

    @When("^I enter password$")
    public void i_enter_password() throws Exception{
        loginPage.setPassword();
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws InterruptedException {
        loginPage.clickLgnBtn();
    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() throws InterruptedException {
        wait(30);
        loginPage.setValidateLoginToAdminPage();
    }

}
