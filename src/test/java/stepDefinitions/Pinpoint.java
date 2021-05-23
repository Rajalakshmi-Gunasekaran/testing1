package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PinpointPage;

public class Pinpoint extends BaseStep
{
    public LoginPage loginPage;
    public HomePage homePage;
    public PinpointPage pinpointPage;

    @When("^I should login into the home page and click on pinpoint$")
    public void i_should_login_into_the_home_page_and_click_on_pinpoint()
    {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        pinpointPage=new PinpointPage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(10);
        pinpointPage.clickPinpointTab();
    }

    @When("^I enter search text as \"(.*?)\"$")
    public void i_enter_search_text_as(String pinpointSearchTxt)
    {
        wait(10);
        pinpointPage.EnterTextPinpoint(pinpointSearchTxt);
    }

    @Then("^I should able to see the results in graph view$")
    public void i_should_able_to_see_the_results_in_graph_view()
    {
        wait(10);
        pinpointPage.validatePinpointPage();
    }
}
