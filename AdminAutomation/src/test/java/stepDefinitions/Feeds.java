package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FeedsPage;

public class Feeds extends BaseStep{
    public FeedsPage feedsPage=new FeedsPage(webDriver);
    @When("^I should login into the home page and click on feeds tab$")
    public void i_should_login_into_the_home_page_and_click_on_feeds_tab() throws InterruptedException {
       wait(30);
       feedsPage.setClickFeedsTab();
    }

    @When("^I click on deleted journalist lists$")
    public void i_click_on_deleted_journalist_lists() throws InterruptedException{
       wait(30);
       feedsPage.setClickDeletedJournalistLists();
    }

    @When("^I click on page number as last in deleted journalist lists$")
    public void i_click_on_page_number_as_last_in_deleted_journalist_lists() throws InterruptedException {
        wait(30);
        feedsPage.setClickPageNumberAsLast();
    }

    @When("^I choose list and Click on it$")
    public void i_choose_list_and_Click_on_it() throws InterruptedException {
        wait(30);
        feedsPage.setClickListNameLink();
    }

    @When("^I should navigate to that list and click check box next to the journalist name$")
    public void i_should_navigate_to_that_list_and_click_check_box_next_to_the_journalist_name() throws InterruptedException {
       wait(30);
       feedsPage.setClickCheckBoxToSelectJournoForRemoval();
    }

    @When("^I click remove (\\d+) author from the list button$")
    public void i_click_remove_author_from_the_list_button(int arg1) throws InterruptedException {
        wait(30);
        feedsPage.setClickRemoveAuthorFromListBtn();
    }

    @When("^I should click unassign button to confirm removal$")
    public void i_should_click_unassign_button_to_confirm_removal() throws InterruptedException {
        wait(30);
        feedsPage.setClickUnAssignBtn();
    }

    @Then("^I should see the journalist removed from list message$")
    public void i_should_see_the_journalist_removed_from_list_message() throws InterruptedException {
       wait(30);
       feedsPage.setValidateJournalistRemoval();
    }
    @When("^I should navigate to that list and click journo name$")
    public void i_should_navigate_to_that_list_and_click_journo_name() throws InterruptedException {
        wait(30);
        feedsPage.setClickJournalistNameLink();
    }

    @Then("^I should navigate to the journo profile page$")
    public void i_should_navigate_to_the_journo_profile_page() throws InterruptedException {
        wait(30);
        feedsPage.setValidateJournoProfilePage();
    }
    @When("^I choose list and Click on user email$")
    public void i_choose_list_and_Click_on_user_email() throws InterruptedException {
       wait(30);
       feedsPage.setClickUserEmail();
    }

    @Then("^I should navigate to the User profile page$")
    public void i_should_navigate_to_the_User_profile_page() throws InterruptedException {
        wait(30);
        feedsPage.setNavigateToUserProfilePage();
    }
    @When("^I click on last page in scroll numbers$")
    public void i_click_on_last_page_in_scroll_numbers() throws Throwable {
        wait(30);
        feedsPage.setClickLastPageInScrollNumbers();
    }


    @When("^I choose list and Click on un delete button$")
    public void i_choose_list_and_Click_on_un_delete_button() throws InterruptedException {
        wait(30);
        feedsPage.setClickUnDeleteBtn();
    }

    @Then("^I should see the journalist list un deleted$")
    public void i_should_see_the_journalist_list_un_deleted() throws InterruptedException {
        wait(30);
        feedsPage.setValidateUnDeleteJournalistList();
    }
}
