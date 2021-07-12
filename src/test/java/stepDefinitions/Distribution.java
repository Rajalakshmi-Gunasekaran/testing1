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
    public void i_should_able_to_see_the_created_press_release()
    {

    }
    @When("^I click on create new campaign button$")
    public void i_click_on_create_new_campaign_button()
    {
        pauseFor(10);
        distributionPage.setClickCreateNewCampaign();
    }

    @When("^I enter campaign name as \"(.*?)\" and I click on create button$")
    public void i_enter_campaign_name_as_and_I_click_on_create_button(String campaignNameToCreate) {
        pauseFor(10);
        distributionPage.setEnterCampaignNameToCreate(campaignNameToCreate);
        pauseFor(10);
        distributionPage.clickCreateNewCampaign();
    }

    @When("^I click on copy from list option$")
    public void i_click_on_copy_from_list_option()
    {
        pauseFor(10);
        distributionPage.setClickCopyFromListBtn();
    }

    @When("^I enter list name to copy as \"(.*?)\"$")
    public void i_enter_list_name_to_copy_as(String list)
    {
        pauseFor(10);
        distributionPage.setEnterListNameToCopy(list);
    }

    @When("^I click on Ok button$")
    public void i_click_on_Ok_button()
    {
       pauseFor(10);
       distributionPage.setClickOkButton();
    }
    @When("^I enter From email as$")
    public void i_enter_From_email_as() {
       pauseFor(10);
       distributionPage.setEnterFromEmail();
    }

    @Then("^I should able to see the campaign created$")
    public void i_should_able_to_see_the_campaign_created()
    {
        pauseFor(10);
        distributionPage.setValidateCampaignSending();
    }

    @When("^I click on search icon on press release tab$")
    public void i_click_on_search_icon_on_press_release_tab(){
        pauseFor(5);
        distributionPage.setClickSearchIcon();
    }
    @When("^I enter press release name as \"(.*?)\" and I click on the name$")
    public void i_enter_press_release_name_as_and_I_click_on_the_name(String pressReleaseName)
    {
        pauseFor(5);
        distributionPage.setEnterPressReleaseName(pressReleaseName);
    }

    @When("^I click on the menu to select delete option$")
    public void i_click_on_the_menu_to_select_delete_option()
    {
         pauseFor(5);
         distributionPage.setClickMenuCheckList();
    }

    @When("^I click on delete button and I click on confirm delete button$")
    public void i_click_on_delete_button_and_I_click_on_confirm_delete_button()
    {
        pauseFor(5);
        distributionPage.setClickDeleteButton();
        pauseFor(5);
        distributionPage.setConfirmDeletion();
    }

    @When("^I enter press release name as \"(.*?)\"$")
    public void i_enter_press_release_name_as(String name)  {
        pauseFor(5);
        distributionPage.enterPressReleaseToValidate(name);
    }
    @Then("^I should able to see the press release deleted$")
    public void i_should_able_to_see_the_press_release_deleted()
    {
          wait(5);
          distributionPage.setValidateDeletePressRelease();
    }
    @When("^I click on campaign tab$")
    public void i_click_on_campaign_tab()
    {
        wait(10);
        distributionPage.setClickCampaignTab();
    }

    @When("^I click on search icon on campaign tab$")
    public void i_click_on_search_icon_on_campaign_tab()
    {
       pauseFor(10);
       distributionPage.setClickSearchIcon();
    }

    @When("^I enter campaign name as \"(.*?)\" and I click on the name$")
    public void i_enter_campaign_name_as_and_I_click_on_the_name(String name)
    {
       pauseFor(10);
       distributionPage.setEnterCampaignName(name);
       pauseFor(10);
    }

    @When("^I enter campaign name as \"(.*?)\"$")
    public void i_enter_campaign_name_as(String name)
    {
        wait(10);
        distributionPage.enterCampaignName(name);
    }

    @Then("^I should able to see the campaign deleted$")
    public void i_should_able_to_see_the_campaign_deleted()
    {
     wait(10);
     distributionPage.setValidateCampaignDeleted();
    }
}
