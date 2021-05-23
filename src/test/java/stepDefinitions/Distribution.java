package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DistributionPage;

public class Distribution extends BaseStep{

    public DistributionPage distributionPage=new DistributionPage(webDriver);

    @When("^I should be in the home page and click on Distribution tab$")
    public void i_should_be_in_the_home_page_and_click_on_Distribution_tab() {
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(2);
        distributionPage.setClickDistributionTab();
    }

    @When("^I click on create new press release button$")
    public void i_click_on_create_new_press_release_button(){
        distributionPage.setClickNewPressRelease();
        wait(20);
    }


    @When("^I enter press release name as \"(.*?)\" and I click on create button$")
    public void i_enter_press_release_name_as_and_I_click_on_create_button(String pressReleaseName) {
        wait(20);
        distributionPage.setEnterPressRelease(pressReleaseName);
        wait(20);
        distributionPage.setClickCreatePressRelease();
    }

    @When("^I enter header as \"(.*?)\"$")
    public void i_enter_header_as(String header) {
        pauseFor(5);
        distributionPage.setClickHeaderBlock();
        distributionPage.setHeaderBlock(header);
    }

    @When("^I enter body as \"(.*?)\"$")
    public void i_enter_body_as(String body) {
        pauseFor(5);
        distributionPage.setBodyBlock(body);
    }


    @When("^I enter block as \"(.*?)\" for the footer$")
    public void i_enter_block_as_for_the_footer(String footer) {
        pauseFor(5);
        distributionPage.setBodyBlock(footer);
    }


    @Then("^I should able to see the created press release$")
    public void i_should_able_to_see_the_created_press_release() {

    }
    @When("^I click on search icon on press release tab$")
    public void i_click_on_search_icon_on_press_release_tab() {

    }

    @When("^I enter press release name as \"(.*?)\" and I click on the name$")
    public void i_enter_press_release_name_as_and_I_click_on_the_name(String arg1) {

    }

    @When("^I click on the menu to select delete option$")
    public void i_click_on_the_menu_to_select_delete_option() {

    }

    @When("^I click on delete button and I click on confirm delete button$")
    public void i_click_on_delete_button_and_I_click_on_confirm_delete_button(){

    }

    @When("^I enter press release name as \"(.*?)\"$")
    public void i_enter_press_release_name_as(String arg1) {

    }

    @Then("^I should able to see the press release deleted$")
    public void i_should_able_to_see_the_press_release_deleted() {

    }

}
