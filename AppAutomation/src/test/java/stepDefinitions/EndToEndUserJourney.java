package stepDefinitions;

import cucumber.api.java.en.When;
import pageObjects.DistributionPage;
import pageObjects.EndToEndUserStories;
import pageObjects.ListsPage;

public class EndToEndUserJourney extends BaseStep{
    public EndToEndUserStories endToEndUserStories=new EndToEndUserStories(webDriver);
    public DistributionPage distributionPage = new DistributionPage(webDriver);
    public ListsPage listsPage=new ListsPage(webDriver);

    @When("^I click create new list called AutoList$")
    public void i_click_create_new_list_called_AutoList() throws InterruptedException {
       wait(120);
       endToEndUserStories.setClickCreateAutoListInJournoProfile();
       Thread.sleep(3000);
    }
    @When("^I click save button to save lists in journo profile page$")
    public void i_click_save_button_to_save_lists_in_journo_profile_page() throws InterruptedException {
       wait(120);
       endToEndUserStories.setClickSaveBtnToSaveLists();
       Thread.sleep(3000);
    }

    @When("^I click on Distribution tab$")
    public void i_click_on_Distribution_tab() throws InterruptedException {
        wait(120);
        distributionPage.setClickDistributionTab();
    }

    @When("^I click save button to save press release$")
    public void i_click_save_button_to_save_press_release() throws InterruptedException {
       wait(120);
       distributionPage.setClickSaveBtnInCampaignPage();
    }
    @When("^click cancel to stop sending campaign$")
    public void click_cancel_to_stop_sending_campaign() throws Throwable {
      wait(120);
      distributionPage.setClkCancelBtn();
    }
    @When("^I click on lists tabs$")
    public void i_click_on_lists_tabs() throws InterruptedException {
        wait(120);
        listsPage.clickListsBtn();
    }
}
