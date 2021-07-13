package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.Constents;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StreamPage;

public class Streams extends BaseStep{
    public LoginPage loginPage;
    public HomePage homePage;
    public StreamPage streamPage;

    @When("^I should be in the home page and click on Streams$")
    public void i_should_be_in_the_home_page_and_click_on_Streams(){
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        streamPage = new StreamPage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(2);
        streamPage.clkStreams();
    }

    @When("^I click on AllJournoMoves streams from the list$")
    public void i_click_on_AllJournoMoves_streams_from_the_list(){
        wait(60);
        streamPage.clkAllJournoMoves();
       // wait(180);
        pauseFor(120);
        streamPage.clkSelectAll();
        wait(60);
    }

    @Then("^I should able to see the AllJournoMoves streams page$")
    public void i_should_able_to_see_the_AllJournoMoves_streams_page() {
        wait(60);
        String validateStreamPage=streamPage.validateAllJournoStream();
        wait(60);
        Assert.assertEquals(Constents.STREAM_VALIDATION_NUMBERS,validateStreamPage);
    }
}
