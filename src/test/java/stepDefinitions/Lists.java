package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.*;

public class Lists extends BaseStep {
    public LeftPanListsPage leftPanListsPage;
    public RightPanListPage rightPanListPage;
    public LoginPage loginPage;
    public AdvancedSearchPage advancedSearchPage;
    @When("^I should login into the home page and click on lists$")
    public void i_should_login_into_the_home_page_and_click_on_lists()
    {
        loginPage = new LoginPage(webDriver);
        leftPanListsPage =new LeftPanListsPage(webDriver);
        rightPanListPage=new RightPanListPage(webDriver);
        advancedSearchPage=new AdvancedSearchPage(webDriver);

        webDriver.get("https://app-alt.roxhillmedia.com/");
        wait(20);
        leftPanListsPage.clickListsBtn();
    }
    @When("^I click on create folder$")
    public void i_click_on_create_folder()
    {
        wait(20);
        leftPanListsPage.clickCreateFolder();
        wait(10);
    }
    @When("^I enter folder name as \"(.*?)\" and click on create button$")
    public void i_enter_folder_name_as_and_click_on_create_button(String folderName)
    {
        leftPanListsPage.EnterFolderName(folderName);
        wait(20);
        leftPanListsPage.clickCreate();
    }
    @Then("^I should see the created folder$")
    public void i_should_see_the_created_folder()
    {
        wait(30);
        refreshPage();
        wait(30);
        leftPanListsPage.validateFolderCreated();
    }

    @When("^I click on create list$")
    public void i_click_on_create_list()
    {
        leftPanListsPage.createList();
    }

    @When("^I enter list name as \"(.*?)\" and click on create button$")
    public void i_enter_list_name_as_and_click_on_create_button(String listName)
    {
        wait(30);
        leftPanListsPage.enterListName(listName);
        leftPanListsPage.clickCreateList();
        wait(30);
    }

    @Then("^I should see the created list$")
    public void i_should_see_the_created_list()
    {
        pauseFor(5);
        leftPanListsPage.validateListCreated();
    }

    @When("^I enter list name as \"(.*?)\"$")
    public void i_enter_list_name_as(String listname)
    {
        pauseFor(5);
        leftPanListsPage.enterListNameToValidate(listname);
    }

    @When("^I click on search icon in the list page and I enter folder name as \"(.*?)\"$")
    public void i_click_on_search_icon_in_the_list_page_and_I_enter_folder_name_as(String folderName)
    {
       pauseFor(5);
       leftPanListsPage.enterFolderName(folderName);
    }

    @When("^I click on the folder name from the list$")
    public void i_click_on_the_folder_name_from_the_list()
    {
pauseFor(5);
leftPanListsPage.tickCheckBoxToSelectListName();
    }

    @When("^I click on the list name from the list$")
    public void i_click_on_the_list_name_from_the_list()
    {
       pauseFor(5);
       leftPanListsPage.setGetListName();
    }

    @When("^I click on Lists$")
    public void i_click_on_Lists()
    {
        pauseFor(5);
        leftPanListsPage.clickListsBtn();
    }

    @When("^I click select all to remove all journalist from the list$")
    public void i_click_select_all_to_remove_all_journalist_from_the_list()
    {
         pauseFor(5);
         rightPanListPage.chooseJournalist();
    }

    @When("^I click on remove from list button$")
    public void i_click_on_remove_from_list_button()
    {
        pauseFor(5);
        rightPanListPage.removeJournalist();
    }

    @When("^I click tick mark to make sure deletion$")
    public void i_click_tick_mark_to_make_sure_deletion()
    {
        wait(20);
        leftPanListsPage.confirmDeletion();
        wait(30);
    }

    @When("^I enter list name as \"(.*?)\"and click on the list name from the list$")
    public void i_enter_list_name_as_and_click_on_the_list_name_from_the_list(String listName)
    {
        wait(30);
        leftPanListsPage.searchListTxt(listName);
        pauseFor(5);
        leftPanListsPage.setGetListName();
        wait(5);
    }
    @When("^I click on check box of the list name to select$")
    public void i_click_on_check_box_of_the_list_name_to_select()
    {
        pauseFor(5);
        leftPanListsPage.tickCheckBoxToSelectListName();
    }
    @Then("^I should able to see the journalist deleted successfully on the list page$")
    public void i_should_able_to_see_the_journalist_deleted_successfully_on_the_list_page()
    {
        wait(30);
        String removedJourno=rightPanListPage.validateJournalistRemoval();
        Assert.assertEquals(Contents.DELETED_JOURNO_MSG,removedJourno);
    }

    @When("^I enter folder name as \"(.*?)\"and click on the folder name from the list$")
    public void i_enter_folder_name_as_and_click_on_the_folder_name_from_the_list(String folderName)
    {
        wait(20);
        leftPanListsPage.enterFolderName(folderName);
        wait(20);
        leftPanListsPage.setClickFolderName();
    }

    @When("^I click on menu list and click on delete button$")
    public void i_click_on_menu_list_and_click_on_delete_button()
    {
        pauseFor(5);
        leftPanListsPage.menuList();
        pauseFor(5);
        leftPanListsPage.deleteListButton();

    }
    //click on delete button in list page to delete list
    @When("^I click on delete button$")
    public void i_click_on_delete_button()
    {
          pauseFor(5);
          rightPanListPage.setClickDelete();
    }

    @When("^I confirm deletion$")
    public void i_confirm_deletion()
    {
           wait(20);
           leftPanListsPage.confirmDeleteFolder();
    }
    @When("^I click on search icon in the list page and I enter list name as \"(.*?)\"$")
    public void i_click_on_search_icon_in_the_list_page_and_I_enter_list_name_as(String list)
    {
        pauseFor(5);
        leftPanListsPage.enterListNameToDelete(list);

    }

    @When("^click on the list name from the list$")
    public void click_on_the_list_name_from_the_list()
    {
pauseFor(5);
leftPanListsPage.tickCheckBoxToSelectListName();
    }


    @Then("^I should see the list deleted$")
    public void i_should_see_the_list_deleted()
    {
           pauseFor(5);
           leftPanListsPage.validateListDeleted();

    }

    @Then("^I should see the folder deleted$")
    public void i_should_see_the_folder_deleted()
    {
            wait(5);
            leftPanListsPage.validateDeletionFolder();
    }

    @Then("^I should see the GDPR rejected status is unchecked by default$")
    public void i_should_see_the_GDPR_rejected_status_is_unchecked_by_default()
    {
            wait(30);
            Assert.assertFalse(rightPanListPage.validateGDPRCheckbox());
    }
    @Then("^I should able to see the journalist added to the list$")
    public void i_should_able_to_see_the_journalist_added_to_the_list()
    {
            pauseFor(10);
            rightPanListPage.setValidateJournoAddedToList();
    }
    }

