package stepDefinitions;

import cucumber.api.java.ca.I;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.AdvancedSearchPage;
import pageObjects.ListsPage;
import pageObjects.LoginPage;
import pageObjects.AdvancedSearchPage;

public class Lists extends BaseStep{
    ListsPage listsPage;
    AdvancedSearchPage advancedSearch;

    @When("^I should login into the home page and click on lists$")
    public void i_should_login_into_the_home_page_and_click_on_lists() throws Exception {
        listsPage = new ListsPage(webDriver);
        advancedSearch=new AdvancedSearchPage(webDriver);
        webDriver.get(readPropertyFile1("url1"));
        wait(20);
        listsPage.clickListsBtn();
    }

    @When("^I click on create folder$")
    public void i_click_on_create_folder() throws InterruptedException{
        pauseFor(5);
        listsPage.clickCreateFolder();
    }

    @When("^I enter folder name as \"([^\"]*)\" and click on create button$")
    public void i_enter_folder_name_as_and_click_on_create_button(String folderName)throws InterruptedException {
        wait(60);
        listsPage.EnterFolderName(folderName);
        wait(60);
        listsPage.clickCreate();
        wait(60);
    }

    @When("^I click on search icon in the list page$")
    public void i_click_on_search_icon_in_the_list_page() throws InterruptedException {
        pauseFor(5);
        listsPage.searchIcon();
        wait(60);
    }

    @When("^I enter folder name as \"([^\"]*)\"$")
    public void i_enter_folder_name_as(String folderNameToDelete) throws InterruptedException {
        wait(60);
        listsPage.searchFolderNameToDelete(folderNameToDelete);
    }

    @When("^I click on the folder name from the list$")
    public void i_click_on_the_folder_name_from_the_list() throws InterruptedException{
        wait(60);
        listsPage.tickCheckBoxToSelectListName();
    }

    @When("^I click on menu list and click on delete button$")
    public void i_click_on_menu_list_and_click_on_delete_button()throws InterruptedException {
        wait(60);
        listsPage.menuList();
        wait(60);
        listsPage.deleteListButton();
    }

    @When("^I confirm deletion$")
    public void i_confirm_deletion()throws InterruptedException
    {
        wait(60);
        listsPage.confirmDeleteFolder();
    }

    @Then("^I should see the folder deleted$")
    public void i_should_see_the_folder_deleted() throws InterruptedException {
        pauseFor(5);
        listsPage.validateDeletionFolder();
    }
    @When("^I click on create list$")
    public void i_click_on_create_list() throws InterruptedException {
        pauseFor(5);
        listsPage.createList();
    }

    @When("^I enter list name to create as \"([^\"]*)\" and click on create button$")
    public void i_enter_list_name_to_create_as_and_click_on_create_button(String listName) throws InterruptedException {
        pauseFor(5);
        listsPage.enterListName(listName);
        pauseFor(5);
        listsPage.clickCreateList();
    }

    @When("^I click on search tab in the home page$")
    public void i_click_on_search_tab_in_the_home_page() throws InterruptedException {
        wait(60);
        advancedSearch.clickAdvancedSearch();
    }
    @When("^I click on outlet type and enter outlettype as \"([^\"]*)\"$")
    public void i_click_on_outlet_type_and_enter_outlettype_as(String outletType) throws InterruptedException {
        pauseFor(5);
        advancedSearch.enterOutletType(outletType);
    }

    @When("^I Click on outlet name and enter outletname as \"([^\"]*)\"$")
    public void i_Click_on_outlet_name_and_enter_outletname_as(String outletName) throws InterruptedException {
        pauseFor(5);
        advancedSearch.enterOutletName(outletName);
    }
    @When("^I enter list name to copy journo to the list as \"([^\"]*)\"$")
    public void i_enter_list_name_to_copy_journo_to_the_list_as(String listName) throws InterruptedException {
        pauseFor(5);
        advancedSearch.setEnterListName(listName);
    }
    @When("^click Ok$")
    public void click_Ok() throws InterruptedException {
        pauseFor(5);
        advancedSearch.setClickOk();
    }
    /* Adding Journalist to the list*/
    @When("^I click on Add Journalist to list button$")
    public void i_click_on_Add_Journalist_to_list_button()throws InterruptedException {
        pauseFor(5);
        advancedSearch.setClickCopyToList();
    }

    @When("^I enter list name as \"(.*?)\" and click Ok$")
    public void i_enter_list_name_as_and_click_Ok(String list) throws InterruptedException{
        pauseFor(5);
        advancedSearch.setEnterListName(list);
        pauseFor(5);
        advancedSearch.setClickOk();
    }
    @When("^I click on lists$")
    public void i_click_on_lists() throws InterruptedException {
        pauseFor(10);
        listsPage.clickListsBtn();
    }
    @When("^I click on SmokeSuiteList to see the journo added from advanced search$")
    public void i_click_on_SmokeSuiteList_to_see_the_journo_added_from_advanced_search() throws InterruptedException {
        pauseFor(5);
        listsPage.clickSmokeSuiteListName();
    }

    @When("^I should see the GDPR rejected status is unchecked by default$")
    public void i_should_see_the_GDPR_rejected_status_is_unchecked_by_default() throws InterruptedException {
        pauseFor(5);
        listsPage.validateGDPRCheckbox();
    }

    @When("^I click select all to remove all journalist from the list$")
    public void i_click_select_all_to_remove_all_journalist_from_the_list()throws InterruptedException{
        pauseFor(5);
        listsPage.chooseJournalist();
       wait(60);
    }

    @When("^I click on remove from list button$")
    public void i_click_on_remove_from_list_button()throws InterruptedException {
        pauseFor(5);
        listsPage.removeJournalist();
        wait(60);
    }

    @When("^I click tick mark to make sure deletion$")
    public void i_click_tick_mark_to_make_sure_deletion()throws InterruptedException {
        pauseFor(5);
        listsPage.setClickDelete();
    }

    @When("^I should able to see the journalist deleted successfully on the list page$")
    public void i_should_able_to_see_the_journalist_deleted_successfully_on_the_list_page() throws InterruptedException {
        pauseFor(5);
        listsPage.validateJournalistRemoval();
    }

    @When("^I click on delete list and click on confirm deletion button$")
    public void i_click_on_delete_list_and_click_on_confirm_deletion_button() throws InterruptedException {
        pauseFor(5);
        listsPage.setClickDelete();
    }

    @When("^I enter list name as \"([^\"]*)\"")
    public void i_enter_list_name_as(String listName)throws InterruptedException  {
        pauseFor(5);
        listsPage.enterListName(listName);
    }
    @When("^I enter list name to validate list deleted as \"([^\"]*)\"$")
    public void i_enter_list_name_to_validate_list_deleted_as(String arg1) throws InterruptedException {
        pauseFor(5);
        listsPage.searchListTxt(arg1);
    }

    @Then("^I should see the list deleted$")
    public void i_should_see_the_list_deleted() throws InterruptedException {
        pauseFor(5);
        listsPage.validateListDeleted();
    }
    @When("^I enter list name in lists as \"([^\"]*)\" and click on it$")
    public void i_enter_list_name_in_lists_as_and_click_on_it(String selectListName) throws InterruptedException {
        pauseFor(5);
        listsPage.enterListNameToChoose(selectListName);
        wait(5);
        listsPage.setClickOkToChooseList();
    }
    @When("^I click copy all to lists$")
    public void i_click_copy_all_to_lists() throws InterruptedException {
        pauseFor(10);
        listsPage.setClickCopyAllToListsBtn();
    }
    @When("^I enter list name to copy as \"([^\"]*)\" and click ok$")
    public void i_enter_list_name_to_copy_as_and_click_ok(String listName) throws InterruptedException {
        pauseFor(5);
        listsPage.setEnterListNameToCopy(listName);
        pauseFor(5);
        listsPage.setClickOkToCopyList();
    }
    @When("^I click clear the search field$")
    public void i_click_clear_the_search_field() throws InterruptedException {
        pauseFor(5);
        listsPage.setClickClearField();
    }
    @When("^I click select all button to see the copied list$")
    public void i_click_select_all_button_to_see_the_copied_list() throws InterruptedException {
       pauseFor(5);
       listsPage.chooseJournalist();
    }

    @When("^I see the list copied$")
    public void i_see_the_list_copied() throws InterruptedException {
        pauseFor(10);
        listsPage.setValidateListCopied();
    }

    @Then("^I click on delete and confirm delete button to delete the list$")
    public void i_click_on_delete_and_confirm_delete_button_to_delete_the_list() throws InterruptedException {
        pauseFor(5);
        listsPage.setDeleteListBtn();
    }
    @When("^I click on list view button$")
    public void i_click_on_list_view_button() throws InterruptedException {
        wait(60);
        listsPage.setClickListViewBtn();
    }

    @Then("^I should see the list in list view$")
    public void i_should_see_the_list_in_list_view() throws InterruptedException {
       wait(60);
       listsPage.setValidateListView();
    }
    @When("^I click on activities tab in lists page$")
    public void i_click_on_activities_tab_in_lists_page() throws InterruptedException {
        wait(120);
        listsPage.setClickActivityTabInList();
    }

    @Then("^I should see the activities for the journos in the list in lists page$")
    public void i_should_see_the_activities_for_the_journos_in_the_list_in_lists_page() throws InterruptedException {
         wait(120);
         listsPage.setValidateActivityResultsForTheList();
    }
    @When("^I click on alerts tab for the chosen list in the lists page$")
    public void i_click_on_alerts_tab_for_the_chosen_list_in_the_lists_page() throws InterruptedException {
         wait(120);
         listsPage.setClickAlertsTabInList();
    }

    @Then("^I should see the alerts for the journos in the list in lists page$")
    public void i_should_see_the_alerts_for_the_journos_in_the_list_in_lists_page() throws InterruptedException {
        wait(120);
        listsPage.setValidateAlertsResultsForTheList();
    }
}


