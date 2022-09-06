package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AnalyticsPage;

public class Analytics extends BaseStep{
    public AnalyticsPage analyticsPage=new AnalyticsPage(webDriver);
    @When("^I should login into the home page and click on Analytics tab$")
    public void i_should_login_into_the_home_page_and_click_on_Analytics_tab() throws InterruptedException {
        wait(30);
        analyticsPage.setClickAnalyticsTab();
    }

    @When("^I click on analytics dashboard options from the list$")
    public void i_click_on_analytics_dashboard_options_from_the_list() throws InterruptedException {
        wait(30);
        analyticsPage.setClickAnalyticsDashboardOptions();
    }

    @When("^I should see the suspicious activity column$")
    public void i_should_see_the_suspicious_activity_column() throws InterruptedException {
        wait(30);
        analyticsPage.validateSuspiciousActivityColumn();
    }

    @When("^I click on view all link$")
    public void i_click_on_view_all_link() throws InterruptedException {
        wait(30);
        analyticsPage.setClickViewAllLink();
    }

    @Then("^I should navigate to the suspicious activity page$")
    public void i_should_navigate_to_the_suspicious_activity_page() throws InterruptedException {
        wait(30);
        analyticsPage.validateSuspiciousActivityPage();
    }

    @When("^I click on filter button and I enter customer name as \"([^\"]*)\"$")
    public void i_click_on_filter_button_and_I_enter_customer_name_as(String customerName) throws InterruptedException {
        wait(30);
        analyticsPage.setClkFilterBtn();
        wait(30);
        analyticsPage.setEnterCustomer(customerName);
    }

    @When("^I click close filter to see results for the filtered customer$")
    public void i_click_close_filter_to_see_results_for_the_filtered_customer() throws InterruptedException {
        wait(30);
        analyticsPage.setClkCloseFilter();
        wait(30);
        analyticsPage.validateSuspiciousActivityForFilteredCustomer();
    }
    @When("^I click close filter$")
    public void i_click_close_filter() throws InterruptedException {
        wait(30);
        analyticsPage.setClkCloseFilter();
    }

    @Then("^I should see all columns filtered by customer Roxhill media$")
    public void i_should_see_all_columns_filtered_by_customer_Roxhill_media() throws InterruptedException {
        wait(30);
        analyticsPage.setValidateColumnsFilteredByCustomer();
    }
    @When("^I should see the customer usage column$")
    public void i_should_see_the_customer_usage_column() throws InterruptedException {
       wait(30);
       analyticsPage.setValidateCustomerUsageColumn();
    }

    @Then("^I should navigate to the customer page$")
    public void i_should_navigate_to_the_customer_page() throws InterruptedException{
        wait(30);
        analyticsPage.setNavigateToCustomerPage();
    }
    @When("^I click on view all link in customer column$")
    public void i_click_on_view_all_link_in_customer_column() throws InterruptedException {
        wait(30);
        analyticsPage.setClkViewAllLinkInCustomerColumn();
    }

    @When("^I should see the customer health column$")
    public void i_should_see_the_customer_health_column() throws InterruptedException {
        wait(30);
        analyticsPage.setValidateCustomerHealth();
    }
    @When("^I click on view all link in customer health page$")
    public void i_click_on_view_all_link_in_customer_health_page() throws InterruptedException {
        wait(30);
        analyticsPage.setClickViewAllLinkInCustomerHealth();
    }

    @Then("^I should navigate to the customer health page$")
    public void i_should_navigate_to_the_customer_health_page() throws InterruptedException {
       wait(30);
       analyticsPage.setValidateCustomerHealthPage();
    }
    @When("^I should see the most viewed journalist column$")
    public void i_should_see_the_most_viewed_journalist_column() throws InterruptedException {
       wait(30);
       analyticsPage.setValidateMostViewedJournalistColumn();
    }

    @When("^I click on view all link in most viewed journalist page$")
    public void i_click_on_view_all_link_in_most_viewed_journalist_page() throws InterruptedException {
       wait(30);
       analyticsPage.setClkViewAllLinkInMostViewedJournalistPage();
    }

    @Then("^I should navigate to the most viewed journalist page$")
    public void i_should_navigate_to_the_most_viewed_journalist_page() throws InterruptedException {
        wait(30);
        analyticsPage.setValidateMostViewedJournalistPage();
    }
    @When("^I hover over on Distribution and I click on Bounce backs$")
    public void i_hover_over_on_Distribution_and_I_click_on_Bounce_backs() throws InterruptedException {
       wait(30);
       analyticsPage.setClkBounceBack();
    }

    @When("^I should see the journalist email verification page$")
    public void i_should_see_the_journalist_email_verification_page() throws InterruptedException {
       wait(30);
       analyticsPage.setValidateEmailVerificationPage();
    }

    @When("^I click on status to choose unresolved option$")
    public void i_click_on_status_to_choose_unresolved_option() throws InterruptedException {
       wait(30);
       analyticsPage.setChooseStatusAsResolved();
    }

    @When("^I click on filter button in email verification page$")
    public void i_click_on_filter_button_in_email_verification_page() throws InterruptedException {
        wait(30);
        analyticsPage.setClickFilterBtnInEmailVerificationPage();
    }

    @When("^I  enter outlet type as \"([^\"]*)\"$")
    public void i_enter_outlet_type_as(String outletTypeName) throws InterruptedException {
        wait(30);
        analyticsPage.setEnterOutletTypeInFilter(outletTypeName);
    }

    @When("^I choose country as united kingdom$")
    public void i_choose_country_as_united_kingdom() throws InterruptedException {
        wait(30);
        analyticsPage.setChooseCountryAsUnitedKingdom();
    }

    @Then("^I should see the bounce back status for the filtered emails$")
    public void i_should_see_the_bounce_back_status_for_the_filtered_emails() throws InterruptedException {
       wait(30);
       analyticsPage.setValidateBounceBackStatus();
    }

    @When("^I click on customer search field and enter customer name as \"([^\"]*)\"$")
    public void i_click_on_customer_search_field_and_enter_customer_name_as(String customerName) throws InterruptedException {
       wait(30);
       analyticsPage.clkCustomerNameInUsagePage();
        wait(30);
       analyticsPage.setEnterCustomerNameInUsagePage(customerName);
    }

    @When("^I click on user search field and enter user name as \"([^\"]*)\"$")
    public void i_click_on_user_search_field_and_enter_user_name_as(String userName) throws InterruptedException {
        wait(30);
        analyticsPage.clkUserNameInUsagePage();
       wait(30);
       analyticsPage.setEnterUserNameInUsagePage(userName);
    }

    @Then("^I should see the results as per filter$")
    public void i_should_see_the_results_as_per_filter() throws InterruptedException {
       wait(30);
       analyticsPage.setValidateFilteredUsage();
    }
    @When("^I click and enter Roxhill user portfolio as \"([^\"]*)\"$")
    public void i_click_and_enter_Roxhill_user_portfolio_as(String userPortfolio) throws InterruptedException {
        wait(30);
        analyticsPage.setClkRoxhillUserPortfolio();
        wait(30);
        analyticsPage.setEnterUserPortfolioName(userPortfolio);
    }

    @Then("^I should see the customer health records filtered by roxhill user portfolio$")
    public void i_should_see_the_customer_health_records_filtered_by_roxhill_user_portfolio() throws InterruptedException {
        wait(30);
        analyticsPage.setValidateResultsForFilteredCustomerHealth();
    }
    @When("^I hover over on customers and users and I click on email authentication status$")
    public void i_hover_over_on_customers_and_users_and_I_click_on_email_authentication_status() throws InterruptedException {
         wait(30);
         analyticsPage.setClkEmailAuthenticationStatus();
    }

    @When("^I click on domain search field and enter domain name as \"([^\"]*)\"$")
    public void i_click_on_domain_search_field_and_enter_domain_name_as(String domainName) throws InterruptedException {
         wait(30);
         analyticsPage.setClkDomainSearchFld();
         wait(30);
         analyticsPage.setEnterDomainName(domainName);
    }

    @Then("^I should see email verification status for the chosen customer$")
    public void i_should_see_email_verification_status_for_the_chosen_customer() throws InterruptedException {
        wait(30);
        analyticsPage.setValidateEmailVerificationStatus();
    }
    @When("^I hover over on journalists and outlets and I click on most visited options$")
    public void i_hover_over_on_journalists_and_outlets_and_I_click_on_most_visited_options() throws InterruptedException {
        wait(30);
        analyticsPage.setClkMostVisitedOptions();
    }

    @When("^I should navigate to the most visited page$")
    public void i_should_navigate_to_the_most_visited_page() throws InterruptedException {
        wait(30);
        analyticsPage.setValidateMostVisitedPage();
    }

    @When("^I select date to filter using time range$")
    public void i_select_date_to_filter_using_time_range() throws InterruptedException {
       wait(30);
       analyticsPage.setSelectDate();
    }

    @Then("^I should see the graph for the filtered period of time$")
    public void i_should_see_the_graph_for_the_filtered_period_of_time() throws InterruptedException {
        wait(30);
        analyticsPage.validateMostVisitedForFilteredTimePeriod();
    }

    @When("^I hover over on journalists and outlets and I click on user interest per journalist options$")
    public void i_hover_over_on_journalists_and_outlets_and_I_click_on_user_interest_per_journalist_options() throws InterruptedException {
       wait(30);
       analyticsPage.setClickUserInterestPerJournalist();
    }

    @When("^I click journalist text field and enter journalist name as \"([^\"]*)\"$")
    public void i_click_journalist_text_field_and_enter_journalist_name_as(String JournoName) throws InterruptedException {
        wait(30);
        analyticsPage.setEnterJournoName(JournoName);
    }

    @Then("^I should see user interactions for that filtered journalist$")
    public void i_should_see_user_interactions_for_that_filtered_journalist() throws InterruptedException {
       wait(30);
       analyticsPage.setValidateUserInterestResultsForFilteredJourno();
    }
    @When("^I hover over on journalists and outlets and I click on popular journalist per sector options$")
    public void i_hover_over_on_journalists_and_outlets_and_I_click_on_popular_journalist_per_sector_options() throws InterruptedException {
       wait(30);
       analyticsPage.setClkPopularJournalistPerSector();
    }

    @When("^I click sector text field and enter sector name as \"([^\"]*)\"$")
    public void i_click_sector_text_field_and_enter_sector_name_as(String sectorName) throws InterruptedException {
        wait(30);
        analyticsPage.setEnterSectorToFilter(sectorName);
    }

    @Then("^I should see popular journalist per sector for the filtered sector$")
    public void i_should_see_popular_journalist_per_sector_for_the_filtered_sector() throws InterruptedException {
        wait(30);
        analyticsPage.setValidatePopularJournalistPerSector();
    }
}
