package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.ReadyMadeListsPage;

public class ReadyMadeList extends BaseStep{
    public ReadyMadeListsPage readyMadeListsPage=new ReadyMadeListsPage(webDriver);
    @When("^I click on ready made lists options from the list$")
    public void i_click_on_ready_made_lists_options_from_the_list() throws InterruptedException {
       wait(30);
       readyMadeListsPage.setClickReadyMadeList();
    }

    @When("^I click search journalist name field and enter Journalist name as \"([^\"]*)\"$")
    public void i_click_search_journalist_name_field_and_enter_Journalist_name_as(String journoName) throws InterruptedException {
        wait(30);
        readyMadeListsPage.setEnterJournoName(journoName);
    }

    @Then("^I should see the Journalist selected page$")
    public void i_should_see_the_Journalist_selected_page() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setValidateJournalistInReadyMadeListSelected();
    }
    @When("^I click on Add list or group button to create new group in ready made list$")
    public void i_click_on_Add_list_or_group_button_to_create_new_group_in_ready_made_list() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setClickAddListOrGroupBtn();
    }

    @When("^I click group button on the right hand side options in adding new RML form$")
    public void i_click_group_button_on_the_right_hand_side_options_in_adding_new_RML_form() throws InterruptedException {
      wait(30);
      readyMadeListsPage.setClickGroupBtn();
    }

    @When("^I enter group title as \"([^\"]*)\"$")
    public void i_enter_group_title_as(String groupName) throws InterruptedException {
        wait(30);
        readyMadeListsPage.setEnterGroupTitle(groupName);
    }

    @When("^I click add group button to create new RML group$")
    public void i_click_add_group_button_to_create_new_RML_group() throws InterruptedException {
       wait(30);
       readyMadeListsPage.setClickAddGroupBtnToCreateNewRML();
    }

    @When("^I see the group created at the bottom and I click on delete$")
    public void i_see_the_group_created_at_the_bottom_and_I_click_on_delete() throws InterruptedException {
       wait(30);
       readyMadeListsPage.setDeleteGroup();
    }

    @Then("^I should click ok to confirm delete the created group in RML page$")
    public void i_should_click_ok_to_confirm_delete_the_created_group_in_RML_page() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setValidateRMLGroupDeleted();
    }
    @When("^I click on Add list or group button to create new ready made list$")
    public void i_click_on_Add_list_or_group_button_to_create_new_ready_made_list() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setClickAddListOrGroupBtn();
    }

    @When("^I enter list name as \"([^\"]*)\"$")
    public void i_enter_list_name_as(String listName) throws InterruptedException {
        wait(30);
        readyMadeListsPage.setEnterListName(listName);
    }

    @When("^I choose and click group name as Test Matt$")
    public void i_choose_and_click_group_name_as_Test_Matt() throws InterruptedException {
       wait(30);
       readyMadeListsPage.setChooseAndClickGroupName();
    }

    @When("^I click add list button to create new list under Test Matt group$")
    public void i_click_add_list_button_to_create_new_list_under_Test_Matt_group() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setClickAddListBtn();
    }

    @When("^I click on Test Matt ready made list group in RML page$")
    public void i_click_on_Test_Matt_ready_made_list_group_in_RML_page() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setClickTestMattRMLGroupToAddList();
    }

    @When("^I click add journalist button to add journo to the newly added list$")
    public void i_click_add_journalist_button_to_add_journo_to_the_newly_added_list() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setClickAddJournalistBtn();
    }

    @When("^I enter journo name as \"([^\"]*)\" and click enter$")
    public void i_enter_journo_name_as_and_click_enter(String journoName) throws InterruptedException {
        wait(30);
        readyMadeListsPage.setEnterJournoNameToAddToList(journoName);
    }

    @When("^I click add journalists button to add journo to the list$")
    public void i_click_add_journalists_button_to_add_journo_to_the_list() throws InterruptedException {
       wait(30);
       readyMadeListsPage.setClickAddJournalistBtnToAdd();
       wait(30);
       readyMadeListsPage.setClickListToSeeJournoAdded();
    }

    @When("^I click delete button next to the journo to delete and click ok to confirm deletion$")
    public void i_click_delete_button_next_to_the_journo_to_delete_and_click_ok_to_confirm_deletion() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setClickDeleteToRemoveJournoFromList();
    }

    @When("^I click delete button and click ok to confirm deletion of the list from the selected RML group$")
    public void i_click_delete_button_and_click_ok_to_confirm_deletion_of_the_list_from_the_selected_RML_group() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setClickDeleteListToRemoveListFromGroup();
    }

    @Then("^I should see the list deleted from the RML group Test Matt$")
    public void i_should_see_the_list_deleted_from_the_RML_group_Test_Matt() throws InterruptedException {
       wait(30);
       readyMadeListsPage.setValidateRMLListDeleted();
    }
    @When("^I choose and click on list to see all the journalist$")
    public void i_choose_and_click_on_list_to_see_all_the_journalist() throws InterruptedException {
        wait(30);
        readyMadeListsPage.setChooseAndClickList();
    }

    @When("^I click journalist from the list to navigate to profile page$")
    public void i_click_journalist_from_the_list_to_navigate_to_profile_page() throws InterruptedException {
         wait(30);
         readyMadeListsPage.setClickJournoLinkToNavigate();
    }

    @Then("^I should validate journalist profile page$")
    public void i_should_validate_journalist_profile_page() throws InterruptedException {
         wait(30);
         readyMadeListsPage.setValidateJournalistProfile();
    }
}
