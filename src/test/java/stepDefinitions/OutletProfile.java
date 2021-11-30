package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.OutletProfilePage;
import pageObjects.SearchPage;

public class OutletProfile extends BaseStep{
    public OutletProfilePage outletProfilePage=new OutletProfilePage(webDriver);
    public SearchPage search = new SearchPage(webDriver);

    @When("^I click on list view button to see the journos$")
    public void i_click_on_list_view_button_to_see_the_journos() throws InterruptedException {
        pauseFor(5);
        outletProfilePage.setClickListViewBtn();
    }

    @Then("^I should see the results in list view$")
    public void i_should_see_the_results_in_list_view() throws InterruptedException {
        pauseFor(5);
        outletProfilePage.setValidateResultsInListView();
    }
    @When("^I click on right arrow to move page numbers$")
    public void i_click_on_right_arrow_to_move_page_numbers() throws InterruptedException {
        pauseFor(5);
        outletProfilePage.setClickRightSideArrowToChangePageNumber();
    }
    @When("^I choose and click on page numbers to see journos in different page$")
    public void i_choose_and_click_on_page_numbers_to_see_journos_in_different_page() throws InterruptedException {
       pauseFor(5);
       outletProfilePage.setClickPageNumber();
    }

    @Then("^I should navigate to the respective page as per the search$")
    public void i_should_navigate_to_the_respective_page_as_per_the_search() throws InterruptedException{
        pauseFor(5);
        outletProfilePage.validateJournoByPageNumber();
    }
}
