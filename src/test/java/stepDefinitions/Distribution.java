package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DistributionPage;

public class Distribution extends BaseStep {

    public DistributionPage distributionPage = new DistributionPage(webDriver);

    @When("^I should be in the home page and click on Distribution tab$")
    public void i_should_be_in_the_home_page_and_click_on_Distribution_tab() throws Exception {
        webDriver.get(readPropertyFile1("url1"));
        wait(30);
        distributionPage.setClickDistributionTab();
    }

    @When("^I click on create new press release button$")
    public void i_click_on_create_new_press_release_button() throws InterruptedException{
        distributionPage.setClickNewPressRelease();
        wait(30);
    }

    @When("^I enter press release name as \"(.*?)\" and I click on create button$")
    public void i_enter_press_release_name_as_and_I_click_on_create_button(String pressReleaseName) throws InterruptedException{
        wait(30);
        distributionPage.setEnterPressRelease(pressReleaseName);
        wait(30);
        distributionPage.setClickCreatePressRelease();
            }

    @When("^I click header block to enter text$")
    public void i_click_header_block_to_enter_text()throws InterruptedException {
        // pauseFor(2);
        distributionPage.setClickHeaderBlock();
       // pauseFor(2);
        distributionPage.clickSourceCode();
    }

    @When("^I enter header as \"([^\"]*)\" and I click ok$")
    public void i_enter_header_as_and_I_click_ok(String header)throws InterruptedException {
        //pauseFor(2);
        distributionPage.setHeaderBlock(header);
    }

    @When("^I click body block to enter text$")
    public void i_click_body_block_to_enter_text() throws InterruptedException{
        //pauseFor(2);
        distributionPage.setClickBodyBlock();
       // pauseFor(2);
        distributionPage.setClickSourceCodeBodyBlock();
    }

    @When("^I enter body as \"(.*?)\"$")
    public void i_enter_body_as(String body) throws InterruptedException{
        pauseFor(2);
        distributionPage.setBodyBlock(body);
    }

    @Then("^I should able to see the created press release$")
    public void i_should_able_to_see_the_created_press_release()throws InterruptedException {
        pauseFor(5);
        distributionPage.clickSaveButtonInPressRelease();
        pauseFor(5);
        distributionPage.validatePressReleaseCreated();
    }

    @When("^I click on create new campaign button$")
    public void i_click_on_create_new_campaign_button()throws InterruptedException {
        pauseFor(10);
        distributionPage.setClickCreateNewCampaign();
    }

    @When("^I enter campaign name as \"(.*?)\" and I click on create button$")
    public void i_enter_campaign_name_as_and_I_click_on_create_button(String campaignNameToCreate) throws InterruptedException{
        pauseFor(5);
        distributionPage.setEnterCampaignNameToCreate(campaignNameToCreate);
        pauseFor(5);
        distributionPage.clickCreateNewCampaign();
    }

    @When("^I click on copy from list option$")
    public void i_click_on_copy_from_list_option()throws InterruptedException {
        pauseFor(10);
        distributionPage.setClickCopyFromListBtn();
    }

    @When("^I enter list name to copy as \"(.*?)\"$")
    public void i_enter_list_name_to_copy_as(String list) throws InterruptedException{
        pauseFor(10);
        distributionPage.setEnterListNameToCopy(list);
    }

    @When("^I click on Ok button$")
    public void i_click_on_Ok_button()throws InterruptedException {
        pauseFor(5);
        distributionPage.setClickOkButton();
        pauseFor(2);
    }
    @When("^I enter From email as$")
    public void i_enter_From_email_as() throws InterruptedException{
        pauseFor(10);
        distributionPage.setEnterFromEmail();
    }
    @When("^I select press release name to send campaign$")
    public void i_select_press_release_name_to_send_campaign()throws InterruptedException {
        pauseFor(2);
        distributionPage.selectPressReleaseNameToSend();
    }

    @When("^I click on send button in Campaign page$")
    public void i_click_on_send_button_in_Campaign_page()throws InterruptedException
    {
        pauseFor(2);
        distributionPage.clickSendButtonInCampaignPage();
    }

    @Then("^I should able to see the campaign created$")
    public void i_should_able_to_see_the_campaign_created() throws InterruptedException{
        pauseFor(2);
        distributionPage.setValidateCampaignSending();
    }

    @When("^I click on search icon on press release tab$")
    public void i_click_on_search_icon_on_press_release_tab()throws InterruptedException {
        pauseFor(5);
        distributionPage.setClickSearchIcon();
    }

    @When("^I enter press release name as \"(.*?)\" and I click on the name$")
    public void i_enter_press_release_name_as_and_I_click_on_the_name(String pressReleaseName) throws InterruptedException{
        pauseFor(5);
        distributionPage.setEnterPressReleaseName(pressReleaseName);
    }

    @When("^I click on the menu to select delete option$")
    public void i_click_on_the_menu_to_select_delete_option()throws InterruptedException {
        pauseFor(5);
        distributionPage.setClickMenuCheckList();
    }

    @When("^I click on delete button and I click on confirm delete button$")
    public void i_click_on_delete_button_and_I_click_on_confirm_delete_button()throws InterruptedException {
        pauseFor(5);
        distributionPage.setClickDeleteButton();
        pauseFor(5);
        distributionPage.setConfirmDeletion();
    }

    @When("^I enter press release name as \"(.*?)\"$")
    public void i_enter_press_release_name_as(String name)throws InterruptedException {
        pauseFor(5);
        distributionPage.enterPressReleaseToValidate(name);
    }

    @Then("^I should able to see the press release deleted$")
    public void i_should_able_to_see_the_press_release_deleted() throws InterruptedException{
        pauseFor(5);
        distributionPage.setValidateDeletePressRelease();
    }

    @When("^I click on search icon on archive tab$")
    public void i_click_on_search_icon_on_archive_tab()throws InterruptedException {
        pauseFor(5);
        distributionPage.setSearchIconInArchive();
    }
    @When("^I enter press release name as \"([^\"]*)\" in archived and I click on the name$")
    public void i_enter_press_release_name_as_in_archived_and_I_click_on_the_name(String pressReleaseName) throws InterruptedException {
        pauseFor(5);
        distributionPage.setEnterPressReleaseNameToArchive(pressReleaseName);
    }
    @When("^I click on campaign tab$")
    public void i_click_on_campaign_tab()throws InterruptedException {
        wait(10);
        distributionPage.setClickCampaignTab();
    }

    @When("^I click on search icon on campaign tab$")
    public void i_click_on_search_icon_on_campaign_tab() throws InterruptedException{
        pauseFor(10);
        distributionPage.setClickSearchIcon();
    }

    @When("^I enter campaign name as \"(.*?)\" and I click on the name$")
    public void i_enter_campaign_name_as_and_I_click_on_the_name(String name) throws InterruptedException{
        pauseFor(10);
        distributionPage.setEnterCampaignName(name);
        pauseFor(10);
    }

    @When("^I enter campaign name as \"(.*?)\"$")
    public void i_enter_campaign_name_as(String name) throws InterruptedException{
        wait(30);
        distributionPage.enterCampaignName(name);
    }

    @Then("^I should able to see the campaign deleted$")
    public void i_should_able_to_see_the_campaign_deleted()throws InterruptedException{
        wait(30);
        distributionPage.setValidateCampaignDeleted();
    }

    @When("^I click on the menu to select archive option$")
    public void i_click_on_the_menu_to_select_archive_option() throws InterruptedException {
        wait(30);
        distributionPage.setClickMenuCheckList();
    }

    @When("^I click on archive press release$")
    public void i_click_on_archive_press_release() throws InterruptedException {
        wait(30);
        distributionPage.setClickArchiveMenu();
    }

    @When("^I click on archived press release tab$")
    public void i_click_on_archived_press_release_tab() throws InterruptedException {
        pauseFor(5);
        distributionPage.setArchiveTab();
    }

    @When("^I click on the menu to select unarchive option$")
    public void i_click_on_the_menu_to_select_unarchive_option() throws InterruptedException {
        wait(30);
        distributionPage.setClickMenuCheckList();
        wait(30);
        distributionPage.setUnArchivePressRelease();
    }

    @When("^I click on press release tab$")
    public void i_click_on_press_release_tab() throws InterruptedException {
         wait(30);
         distributionPage.setClickPressReleaseTab();
    }

    @Then("^I should see the unarchived press release$")
    public void i_should_see_the_unarchived_press_release() throws InterruptedException {
         wait(30);
         distributionPage.validateUnArchivePressRelease();
    }

    @When("^I click on archive campaign$")
    public void i_click_on_archive_campaign() throws InterruptedException {
        wait(30);
        distributionPage.clickArchiveCampaign();
    }

    @When("^I click on archived campaign tab$")
    public void i_click_on_archived_campaign_tab() throws InterruptedException {
        wait(30);
        distributionPage.setArchiveCampaignTab();
    }
    @When("^I enter campaign name to un archive as \"([^\"]*)\" and I click on the name$")
    public void i_enter_campaign_name_to_un_archive_as_and_I_click_on_the_name(String campaignUnArchive) throws InterruptedException {
        wait(30);
        distributionPage.setEnterCampaignNameToUnArchive(campaignUnArchive);
    }
    @Then("^I should see the unarchived campaign$")
    public void i_should_see_the_unarchived_campaign() throws InterruptedException {
        wait(30);
        distributionPage.setValidateUnArchiveCampaign();
    }
    @When("^I click on the name$")
    public void i_click_on_the_name() throws InterruptedException {
        wait(30);
        distributionPage.setClickCampaignNameToView();
    }
    @When("^I click on selected press release$")
    public void i_click_on_selected_press_release() throws InterruptedException {
        wait(30);
        distributionPage.setClickPressReleaseToEdit();
    }

    @When("^I edit content by adding block$")
    public void i_edit_content_by_adding_block() throws InterruptedException {
        wait(30);
        distributionPage.setClickChooseBlock();
        wait(30);
        distributionPage.setChooseBlock();
    }

    @Then("^I should see the edited press release$")
    public void i_should_see_the_edited_press_release() throws InterruptedException {
        wait(30);
       // distributionPage.setValidateEditPressRelease();
    }

    @Then("^I should see the campaign report$")
    public void i_should_see_the_campaign_report() throws InterruptedException {
       wait(30);
       distributionPage.setValidateViewCampaign();
    }
    @When("^I click on Blocks tab$")
    public void i_click_on_Blocks_tab() throws InterruptedException {
        wait(30);
        distributionPage.setClickBlocksTab();
    }

    @When("^I click on create new block button$")
    public void i_click_on_create_new_block_button() throws InterruptedException {
      wait(30);
      distributionPage.setClickCreateNewBlock();
    }

    @When("^I enter block name as \"([^\"]*)\" and I click on create button$")
    public void i_enter_block_name_as_and_I_click_on_create_button(String blockName) throws InterruptedException {
        wait(30);
        distributionPage.enterBlockNameToCreate(blockName);
    }

    @When("^I click on insert link from header section$")
    public void i_click_on_insert_link_from_header_section() throws InterruptedException {
        wait(30);
        distributionPage.clickInsertLink();
    }

    @When("^I enter URL as \"([^\"]*)\"$")
    public void i_enter_URL_as(String URLLink) throws InterruptedException {
        wait(30);
        distributionPage.enterURLToCreateLinkInHeader(URLLink);
    }


    @When("^I click on Ok button in the insert link dialog box$")
    public void i_click_on_Ok_button_in_the_insert_link_dialog_box() throws InterruptedException {
        wait(30);
        distributionPage.setClickOkBtnToInsertLink();
    }

    @When("^I click on save button in the block page$")
    public void i_click_on_save_button_in_the_block_page() throws InterruptedException {
      wait(30);
      distributionPage.setClickSaveBtn();
    }

    @When("^I click on duplicate button to make a copy of block$")
    public void i_click_on_duplicate_button_to_make_a_copy_of_block() throws InterruptedException {
        wait(30);
        distributionPage.setClickDuplicateBtn();
    }

    @Then("^I should delete the block$")
    public void i_should_delete_the_block() throws InterruptedException {
        wait(30);
        distributionPage.setClickDeleteButtonInBlock();
    }
    @When("^I choose block name from list$")
    public void i_choose_block_name_from_list() throws InterruptedException {
        wait(30);
        distributionPage.setChooseBlockNameToEdit();
    }

    @When("^I click on clear content button and confirm clear in block$")
    public void i_click_on_clear_content_button_and_confirm_clear_in_block() throws InterruptedException {
       wait(30);
       distributionPage.setClickClearContent();
    }
    @When("^I click on new press release button$")
    public void i_click_on_new_press_release_button() throws InterruptedException {
        wait(30);
        distributionPage.setClickPressReleaseBtn();
    }
    @When("^I enter new press release name as \"([^\"]*)\"$")
    public void i_enter_new_press_release_name_as(String newPressRelease) throws InterruptedException {
       wait(30);
       distributionPage.setEnterNewPressReleaseNameToCreate(newPressRelease);
    }

    @When("^I click on create button to create new press release$")
    public void i_click_on_create_button_to_create_new_press_release() throws InterruptedException {
       wait(30);
       distributionPage.setClickCreateNewPressReleaseBtn();
    }
    @When("^I click on new campaign button in right hand side campaign home page$")
    public void i_click_on_new_campaign_button_in_right_hand_side_campaign_home_page() throws InterruptedException {
        wait(30);
        distributionPage.setClickCampaignBtn();
    }
    @When("^I enter new campaign name as \"([^\"]*)\"$")
    public void i_enter_new_campaign_name_as(String campaignName) throws InterruptedException {
        wait(30);
        distributionPage.enterCampaignNameToCreateNewCampaign(campaignName);
    }

    @When("^I click on create button to create new campaign$")
    public void i_click_on_create_button_to_create_new_campaign() throws InterruptedException {
        wait(30);
        distributionPage.setClickCreateBtnToCreateNewCampaign();
    }
    @When("^I click on Add Recipient button$")
    public void i_click_on_Add_Recipient_button() throws InterruptedException {
       wait(30);
       distributionPage.setClickAddRecipientBtn();
    }

    @When("^I enter email address$")
    public void i_enter_email_address() throws InterruptedException {
        wait(30);
        distributionPage.enterEmailAddress();
    }

    @When("^I enter first name as \"([^\"]*)\"$")
    public void i_enter_first_name_as(String firstName) throws InterruptedException {
       wait(30);
       distributionPage.enterFirstName(firstName);
    }

    @When("^I enter last name as \"([^\"]*)\"$")
    public void i_enter_last_name_as(String lastName) throws InterruptedException {
        wait(30);
        distributionPage.enterLastName(lastName);
    }

    @When("^I click on add button$")
    public void i_click_on_add_button() throws InterruptedException {
        wait(30);
        distributionPage.setClickAddBtn();
    }
    @When("^I click on choose journalist by name$")
    public void i_click_on_choose_journalist_by_name() throws InterruptedException {
        wait(30);
        distributionPage.setClickJournalistByName();
    }

    @When("^I enter journalist name as \"([^\"]*)\" and I click on Ok button to add recipient$")
    public void i_enter_journalist_name_as_and_I_click_on_Ok_button_to_add_recipient(String journoName) throws InterruptedException {
        wait(30);
        distributionPage.setEnterJournoNameToAddRecipient(journoName);
        wait(30);
        distributionPage.clickOkButton();
    }
    @When("^I click on save button in the new campaign page$")
    public void i_click_on_save_button_in_the_new_campaign_page() throws InterruptedException {
       wait(30);
       distributionPage.setClickSaveBtnInCampaignPage();
    }
    @When("^I should delete the campaign$")
    public void i_should_delete_the_campaign() throws InterruptedException {
       wait(30);
       distributionPage.setDeleteCampaign();
    }
    @Then("^I should delete the press release$")
    public void i_should_delete_the_press_release() throws InterruptedException {
        wait(30);
        distributionPage.setClickDeletePressRelease();
    }
    @When("^I choose and click on press release$")
    public void i_choose_and_click_on_press_release() throws InterruptedException {
        wait(30);
        distributionPage.setChooseAndClickPressRelease();
    }

    @When("^I click on start campaign button$")
    public void i_click_on_start_campaign_button() throws InterruptedException {
        wait(30);
        distributionPage.setClickStartCampaignBtn();
    }
    @When("^I enter campaign name from press release as \"([^\"]*)\" and I click on create button$")
    public void i_enter_campaign_name_from_press_release_as_and_I_click_on_create_button(String pressRelease) throws InterruptedException{
        wait(30);
        distributionPage.setEnterCampaignNameFromPressRelease(pressRelease);
    }
    @When("^I choose and click on campaign$")
    public void i_choose_and_click_on_campaign() throws InterruptedException {
       wait(30);
       distributionPage.setChooseAndClickCampaign();
    }

    @When("^I click on view press release link$")
    public void i_click_on_view_press_release_link() throws InterruptedException {
        wait(30);
        distributionPage.setClickViewPressReleaseLink();
    }

    @Then("^I should see the press release$")
    public void i_should_see_the_press_release() throws InterruptedException {
        wait(30);
        distributionPage.setValidatePressRelease();
    }
}
