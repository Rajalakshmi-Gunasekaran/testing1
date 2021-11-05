package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ReadyMadeListPage;

public class ReadyMadeList extends BaseStep{
   public ReadyMadeListPage readyMadeListPage=new ReadyMadeListPage(webDriver);

   @When("^I click on ready made list tab from the left hand side$")
   public void i_click_on_ready_made_list_tab_from_the_left_hand_side() throws InterruptedException {
      wait(10);
      readyMadeListPage.clickReadyMadeListTab();
   }

   @When("^I choose and click on list$")
   public void i_choose_and_click_on_list() throws InterruptedException {
      wait(30);
      readyMadeListPage.clickOnListsInRML();
   }

   @Then("^I should see the Journalist list for the selected outlet in ready made lists$")
   public void i_should_see_the_Journalist_list_for_the_selected_outlet_in_ready_made_lists() throws InterruptedException {
      wait(30);
      readyMadeListPage.validateReadyMadeListFilteredByOutlet();
   }
   @When("^I choose folder and click on it$")
   public void i_choose_folder_and_click_on_it() throws InterruptedException {
     wait(30);
     readyMadeListPage.clickFolderInReadyMadeList();
   }

   @When("^I choose and click on list inside selected folder$")
   public void i_choose_and_click_on_list_inside_selected_folder() throws InterruptedException {
      wait(30);
      readyMadeListPage.clickOnListInsideFolder();
   }

   @When("^I Click on job title and enter job title as \"([^\"]*)\"$")
   public void i_Click_on_job_title_and_enter_job_title_as(String jobTitle) throws InterruptedException {
      wait(30);
      readyMadeListPage.enterJobTitleInRML(jobTitle);
   }

   @Then("^I should see the Journalist list for the selected job title in ready made lists$")
   public void i_should_see_the_Journalist_list_for_the_selected_job_title_in_ready_made_lists() throws InterruptedException {
      wait(30);
      readyMadeListPage.validateSelectedJobTitleInReadyMadeList();
   }
   @When("^I click on collapsible chevron$")
   public void i_click_on_collapsible_chevron() throws InterruptedException {
      pauseFor(5);
      readyMadeListPage.clickCollapsibleChevron();
   }

   @Then("^I should see the ready made list home page$")
   public void i_should_see_the_ready_made_list_home_page() throws InterruptedException {
     wait(30);
     readyMadeListPage.validateRMLHomePage();
   }
   @When("^I choose RML and click on it$")
   public void i_choose_RML_and_click_on_it() throws InterruptedException {
     wait(30);
     readyMadeListPage.chooseRMLList();
   }

   @When("^I click on Download all button$")
   public void i_click_on_Download_all_button() throws InterruptedException {
     wait(30);
     readyMadeListPage.clickDownloadBtn();
   }

   @When("^I click desk from left hand side column selection$")
   public void i_click_desk_from_left_hand_side_column_selection() throws InterruptedException {
     wait(30);
     readyMadeListPage.clickAddDeskColumn();
   }

   @When("^I click desk from right hand side to remove it$")
   public void i_click_desk_from_right_hand_side_to_remove_it() throws InterruptedException {
      wait(30);
      readyMadeListPage.clickAddDeskColumn();
   }

   @Then("^I should click cancel button$")
   public void i_should_click_cancel_button() throws InterruptedException {
     wait(30);
     readyMadeListPage.clickCancelBtn();
   }
}
