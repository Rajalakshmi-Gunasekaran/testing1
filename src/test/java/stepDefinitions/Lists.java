package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.*;

public class Lists extends BaseStep {
    public LeftPanListsPage leftPanListsPage;
    public RightPanListPage rightPanListPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public SearchPage searchPage;
    @When("^I should login into the home page and click on lists$")
    public void i_should_login_into_the_home_page_and_click_on_lists() {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        leftPanListsPage =new LeftPanListsPage(webDriver);
        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(2);
        leftPanListsPage.clickListsBtn();
    }
    @When("^I click on create folder$")
    public void i_click_on_create_folder(){
        wait(2);
         leftPanListsPage.clickCreateFolder();
         wait(10);
    }
    @When("^I enter folder name as \"(.*?)\" and click on create button$")
    public void i_enter_folder_name_as_and_click_on_create_button(String folderName){
        leftPanListsPage.EnterFolderName(folderName);
        wait(2);
        leftPanListsPage.clickCreate();
                    }
    @Then("^I should see the created folder$")
    public void i_should_see_the_created_folder() {
        wait(3);
        refreshPage();
        wait(30);
leftPanListsPage.validateFolderCreated();
    }

    @When("^I click on create list$")
    public void i_click_on_create_list(){
        leftPanListsPage.createList();
            }

    @When("^I enter list name as \"(.*?)\" and click on create button$")
    public void i_enter_list_name_as_and_click_on_create_button(String listName) {
        wait(30);
        leftPanListsPage.enterListName(listName);
        leftPanListsPage.clickCreateList();
        wait(60);
    }
    @Then("^I should see the created list$")
    public void i_should_see_the_created_list() {
        wait(60);
        String validateList= leftPanListsPage.validateListCreated();
        Assert.assertEquals(Constents.CREATED_LIST_NAME,validateList);
    }
    @When("^I choose Journalist from the list and Click on add to list$")
    public void i_choose_Journalist_from_the_list_and_Click_on_add_to_list() {
        wait(30);
       leftPanListsPage.addingToList();
    }

    @When("^I enter list name as \"(.*?)\" and click Ok$")
    public void i_enter_list_name_as_and_click_Ok(String listName) {
leftPanListsPage.enterListName(listName);
    }

    @When("^I close the quick search window$")
    public void i_close_the_quick_search_window() {

    }

    @When("^I click on Lists$")
    public void i_click_on_Lists() {

    }
    @When("^I click on search icon$")
    public void i_click_on_search_icon() {
        wait(20);
        leftPanListsPage.searchIcon();
        wait(30);
    }
    @Then("^I should able to see the journalist added to the list$")
    public void i_should_able_to_see_the_journalist_added_to_the_list() {

    }
    @When("^I choose and click journalist from the list$")
    public void i_choose_and_click_journalist_from_the_list() {
        wait(60);
       leftPanListsPage.chooseJournalist();
    }

    @When("^I click on remove from list button$")
    public void i_click_on_remove_from_list_button() {
        wait(60);
        leftPanListsPage.removeJournalist();
    }

    @When("^I click tick mark to make sure deletion$")
    public void i_click_tick_mark_to_make_sure_deletion() {
        wait(20);
        leftPanListsPage.confirmDeletion();
        wait(40);
    }
    @When("^I enter list name as \"(.*?)\"and click on the list name from the list$")
    public void i_enter_list_name_as_and_click_on_the_list_name_from_the_list(String listName) {
        wait(30);
        leftPanListsPage.searchListTxt(listName);
        wait(60);
        leftPanListsPage.setGetListName();
        wait(60);
    }
    @Then("^I should able to see the journalist deleted successfully on the list page$")
    public void i_should_able_to_see_the_journalist_deleted_successfully_on_the_list_page() {
        wait(60);
        String removedJourno=leftPanListsPage.validateJournalistRemoval();
        Assert.assertEquals(Constents.DELETED_JOURNO_MSG,removedJourno);
    }
    @When("^I enter folder name as \"(.*?)\"and click on the folder name from the list$")
    public void i_enter_folder_name_as_and_click_on_the_folder_name_from_the_list(String folderName) {
        wait(20);
        leftPanListsPage.enterFolderName(folderName);
        wait(20);
        leftPanListsPage.setClickFolderName();
    }
    @When("^I click on menu list and click on delete button$")
    public void i_click_on_menu_list_and_click_on_delete_button() {
        wait(20);
        leftPanListsPage.menuList();
            }
    @When("^I confirm deletion$")
    public void i_confirm_deletion() {
        wait(20);
        leftPanListsPage.confirmDeleteFolder();
        wait(40);
    }
    @Then("^I should see the list deleted$")
    public void i_should_see_the_list_deleted() {

    }
    @Then("^I should see the folder deleted$")
    public void i_should_see_the_folder_deleted() {

    }
    @Then("^I should see the GDPR rejected status is unchecked by default$")
    public void i_should_see_the_GDPR_rejected_status_is_unchecked_by_default() {
        wait(60);
        boolean bool=rightPanListPage.validateGDPRCheckbox();
        Assert.assertFalse(bool);
    }
}

