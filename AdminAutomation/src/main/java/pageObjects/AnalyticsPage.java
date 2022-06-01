package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AnalyticsPage extends CommonFunctions{
    public WebDriver driver;
    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),\"Analytics\")]")
    public WebElement clkAnalyticsTab;
    @FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/ul/li[1]/a")
    public WebElement clkAnalyticsDashboardOptions;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[3]/div[1]")
    public WebElement validateSuspiciousActivityClm;
    @FindBy(xpath = "//a[contains(text(),\"View all\")]")
    public WebElement clkViewAllLink;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]")
    public WebElement validateSuspiciousActivityPage;
    @FindBy(xpath = "//button[@class=\"flex items-center justify-center rounded-md h-10 w-10 text-xl bg-neutral hover:bg-neutral-dark\"]")
    public WebElement clkFilterBtn;
    @FindBy(id = "customer-select-input")
    public WebElement enterCustomerName;
    @FindBy(xpath = "//button[@class=\"flex items-center justify-center rounded-md h-10 w-10 text-xl bg-neutral hover:bg-neutral-dark relative z-30\"]")
    public WebElement clkCloseFilter;
    @FindBy(xpath = "")
    public WebElement validateSuspiciousActivityForFilteredCustomer;
    @FindBy(xpath = "//span[contains(text(),\"Roxhill Media\")]")
    public WebElement validateColumnsFilteredByCustomerName;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[3]/div[2]")
    public WebElement validateCustomerUsageColumn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div[1]/div[2]")
    public WebElement navigateToCustomerPage;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[3]/div[2]/div[1]/div[1]/a")
    public WebElement clkViewAllLinkInCustomerColumn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[5]/div[1]")
    public WebElement validateCampaignColumn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[5]/div[1]/div[1]/div[2]/div/div[1]/button")
    public WebElement clkFilterBtnInCampaign;
    @FindBy(xpath = "//*[@id=\"vs43__combobox\"]/div[2]/i")
    public WebElement clkCustomerNameInCampaignFilter;
    @FindBy(xpath = "//*[@id=\"vs43__combobox\"]/div[1]/span")
    public WebElement enterCustomerNameInCampaign;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[5]/div[1]")
    public WebElement validateCampaignsForChosenCustomer;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[4]")
    public WebElement validateCustomerHealth;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[4]/div[1]/div[1]/a")
    public WebElement clkViewAllLinkInCustomerHealth;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div[1]")
    public WebElement validateCustomerHealthPage;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[5]/div[2]")
    public WebElement validateMostViewedJournalistColumn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[5]/div[2]/div[1]/div[1]/a")
    public WebElement clkViewAllLinkInMostViewedJournalist;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]")
    public WebElement validateMostViewedJournalistPage;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div[5]/div/div")
    public WebElement hoverOverDistribution;
    @FindBy(xpath = "//a[@href=\"/bounceback\"]")
    public WebElement clkBounceBackOptions;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section")
    public WebElement validateEmailVerificationPage;
    @FindBy(xpath = "//*[@id=\"statusInput\"]")
    public WebElement clkActionInStatus;
    @FindBy(xpath = "//li[@class=\"vs__dropdown-option vs__dropdown-option--selected vs__dropdown-option--highlight\"]")
    public WebElement chooseStatusAsResolved;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div[1]/div[3]/div/div/button/i")
    public WebElement clkFilterBtnInEmailVerification;
    @FindBy(xpath = "//input[@placeholder=\"Select outlet type\"]")
    public WebElement enterOutletTypeInFilter;
    @FindBy(xpath = "//input[@placeholder=\"Select country\"]")
    public WebElement clkChooseCountry;
    @FindBy(xpath = "//li[contains(text(),\"United Kingdom\")]")
    public WebElement chooseCountryAsUnitedKingdom;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section")
    public WebElement validateBounceBackStatus;
    @FindBy(xpath = "//input[@placeholder=\"Filter by customer\"]")
    public WebElement enterCustomerNameInUsage;
    @FindBy(xpath ="//input[@placeholder=\"Filter by users\"]" )
    public WebElement enterUserNameInUsage;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]")
    public WebElement validateFilteredUsageResults;
    @FindBy(xpath = "//input[@placeholder=\"Filter by owner\"]")
    public WebElement enterUserPortFolioName;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div")
    public WebElement validateResultsForCustomerHealthPortfolioFilter;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div[1]/div/div")
    public WebElement hoverOverCustomersAndUsers;
    @FindBy(xpath = "//a[contains(text(),\"Email authentication status\")]")
    public WebElement clkEmailAuthenticationStatus;
    @FindBy(xpath = "//input[@placeholder=\"Filter by domain or email address\"]")
    public WebElement enterDomainSearchFld;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div/table/tbody/tr/td[1]/div/strong")
    public WebElement validateEmailVerification;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div[2]/div/div")
    public WebElement hoverOverJournalistAndOutletsTab;
    @FindBy(xpath = "//a[contains(text(),\"Most visited\")]")
    public WebElement clkMostVisitedOptions;
    @FindBy(xpath = "//input[@class=\"border-2 border-neutral rounded-md pl-3 pr-8 w-full\"]")
    public WebElement clkTimeRange;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/i[1]")
    public WebElement clkDateByMonthByLeftArrow;
    @FindBy(xpath = "//button[contains(text(),\"23\")]")
    public WebElement selectDate;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]")
    public WebElement validateMostVisitedPage;

    public void setClickAnalyticsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkAnalyticsTab.click();
    }

    public void setClickAnalyticsDashboardOptions()throws InterruptedException {
        Thread.sleep(3000);
        clkAnalyticsDashboardOptions.click();
    }

    public void validateSuspiciousActivityColumn() throws InterruptedException{
        Thread.sleep(3000);
        validateSuspiciousActivityClm.isDisplayed();
    }

    public void setClickViewAllLink()throws InterruptedException {
        Thread.sleep(3000);
        clkViewAllLink.click();
    }

    public void validateSuspiciousActivityPage() throws InterruptedException{
        Thread.sleep(3000);
        validateSuspiciousActivityPage.isDisplayed();
    }

    public void setClkFilterBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkFilterBtn.click();
    }

    public void setEnterCustomer(String customerName) throws InterruptedException{
        Thread.sleep(3000);
        enterCustomerName.sendKeys(customerName);
        enterCustomerName.sendKeys(Keys.ENTER);
    }

    public void setClkCloseFilter() throws InterruptedException{
        Thread.sleep(3000);
        clkCloseFilter.click();
    }

    public void validateSuspiciousActivityForFilteredCustomer() throws InterruptedException{
        Thread.sleep(3000);
        validateSuspiciousActivityForFilteredCustomer.isDisplayed();
    }

    public void setValidateColumnsFilteredByCustomer() throws InterruptedException{
        Thread.sleep(3000);
        validateColumnsFilteredByCustomerName.isDisplayed();
    }

    public void setValidateCustomerUsageColumn() throws InterruptedException{
        Thread.sleep(3000);
        validateCustomerUsageColumn.isDisplayed();
    }

    public void setNavigateToCustomerPage() throws InterruptedException{
        Thread.sleep(3000);
        navigateToCustomerPage.isDisplayed();
    }

    public void setClkViewAllLinkInCustomerColumn() throws InterruptedException{
        Thread.sleep(3000);
        clkViewAllLinkInCustomerColumn.click();
    }

    public void setValidateCampaignColumn() throws InterruptedException{
        Thread.sleep(3000);
        validateCampaignColumn.isDisplayed();
    }

    public void setClkFilterBtnInCampaignsColumn() throws InterruptedException{
        Thread.sleep(3000);
        clkFilterBtnInCampaign.click();
    }

    public void setValidateCampaignsForCustomer() throws InterruptedException{
        Thread.sleep(3000);
        validateCampaignsForChosenCustomer.isDisplayed();
    }

    public void setEnterCustomerInCampaign(String customerName) throws InterruptedException{
        Thread.sleep(3000);
        clkCustomerNameInCampaignFilter.click();
        Thread.sleep(3000);
        enterCustomerNameInCampaign.sendKeys(customerName);
        enterCustomerNameInCampaign.sendKeys(Keys.ENTER);
    }

    public void setValidateCustomerHealth() throws InterruptedException{
        Thread.sleep(3000);
        validateCustomerHealth.isDisplayed();
    }

    public void setValidateCustomerHealthPage()throws InterruptedException {
        Thread.sleep(3000);
        validateCustomerHealthPage.isDisplayed();
    }

    public void setClickViewAllLinkInCustomerHealth() throws InterruptedException{
        Thread.sleep(3000);
        clkViewAllLinkInCustomerHealth.click();
    }

    public void setValidateMostViewedJournalistColumn() throws InterruptedException{
        Thread.sleep(3000);
        validateMostViewedJournalistColumn.isDisplayed();
    }

    public void setClkViewAllLinkInMostViewedJournalistPage() throws InterruptedException{
       Thread.sleep(3000);
       clkViewAllLinkInMostViewedJournalist.click();
    }

    public void setValidateMostViewedJournalistPage() throws InterruptedException{
        Thread.sleep(3000);
        validateMostViewedJournalistPage.isDisplayed();
    }

    public void setClkBounceBack() throws InterruptedException{
        Thread.sleep(3000);
        hoverOverDistribution.click();
        Actions action = new Actions(driver);
        action.moveToElement(clkBounceBackOptions).perform();
        clkBounceBackOptions.click();

    }

    public void setValidateEmailVerificationPage() throws InterruptedException{
        Thread.sleep(3000);
        validateEmailVerificationPage.isDisplayed();
    }

    public void setChooseStatusAsResolved() throws InterruptedException{
        Thread.sleep(3000);
        clkActionInStatus.click();
        Thread.sleep(3000);
        chooseStatusAsResolved.click();
    }

    public void setClickFilterBtnInEmailVerificationPage() throws InterruptedException{
        Thread.sleep(3000);
        clkFilterBtnInEmailVerification.click();
    }

    public void setEnterOutletTypeInFilter(String outletTypeName) throws InterruptedException{
        Thread.sleep(3000);
        enterOutletTypeInFilter.sendKeys(outletTypeName);
        enterOutletTypeInFilter.sendKeys(Keys.ENTER);
    }

    public void setChooseCountryAsUnitedKingdom()throws InterruptedException {
        Thread.sleep(3000);
        clkChooseCountry.click();
        Thread.sleep(3000);
        chooseCountryAsUnitedKingdom.click();
    }

    public void setValidateBounceBackStatus() throws InterruptedException{
        Thread.sleep(3000);
        validateBounceBackStatus.isDisplayed();
    }

    public void clkCustomerNameInUsagePage() throws InterruptedException{
        Thread.sleep(3000);
        enterCustomerNameInUsage.click();
    }
    public void setEnterCustomerNameInUsagePage(String customerName) throws InterruptedException{
        enterCustomerNameInUsage.sendKeys(customerName,Keys.ENTER);
    }
    public void clkUserNameInUsagePage() throws InterruptedException{
        Thread.sleep(3000);
        enterUserNameInUsage.click();
    }
    public void setEnterUserNameInUsagePage(String userName)throws InterruptedException {
        Thread.sleep(3000);
        enterUserNameInUsage.sendKeys(userName,Keys.ENTER);
    }

    public void setValidateFilteredUsage() throws InterruptedException{
        Thread.sleep(3000);
        validateFilteredUsageResults.isDisplayed();
    }

    public void setClkRoxhillUserPortfolio() throws InterruptedException{
        Thread.sleep(3000);
        enterUserPortFolioName.click();
    }

    public void setEnterUserPortfolioName(String userPortfolio) throws InterruptedException{
        Thread.sleep(3000);
        enterUserPortFolioName.sendKeys(userPortfolio,Keys.ENTER);
    }

    public void setValidateResultsForFilteredCustomerHealth() throws InterruptedException{
        Thread.sleep(3000);
        validateResultsForCustomerHealthPortfolioFilter.isDisplayed();
    }

    public void setClkEmailAuthenticationStatus() throws InterruptedException {
        Thread.sleep(3000);
        hoverOverCustomersAndUsers.click();
        Actions action = new Actions(driver);
        action.moveToElement(clkEmailAuthenticationStatus).perform();
        clkEmailAuthenticationStatus.click();
    }

    public void setClkDomainSearchFld() throws InterruptedException{
        Thread.sleep(3000);
        enterDomainSearchFld.click();
    }

    public void setEnterDomainName(String domainName) throws InterruptedException{
        Thread.sleep(3000);
        enterDomainSearchFld.sendKeys(domainName);
    }

    public void setValidateEmailVerificationStatus() throws InterruptedException{
        Thread.sleep(3000);
        validateEmailVerification.isDisplayed();
    }

    public void setClkMostVisitedOptions() throws InterruptedException{
         Thread.sleep(3000);
        hoverOverJournalistAndOutletsTab.click();
        Actions action = new Actions(driver);
        action.moveToElement(clkMostVisitedOptions).perform();
        clkMostVisitedOptions.click();
    }

    public void setValidateMostVisitedPage() throws InterruptedException{
        Thread.sleep(3000);
        validateMostVisitedPage.isDisplayed();
    }

    public void setSelectDate() throws InterruptedException{
        Thread.sleep(3000);
        clkTimeRange.click();
        Thread.sleep(3000);
        clkDateByMonthByLeftArrow.click();
        Thread.sleep(3000);
        selectDate.click();
    }

    public void validateMostVisitedForFilteredTimePeriod()throws InterruptedException {
        Thread.sleep(3000);
        validateMostVisitedPage.isDisplayed();
    }
}
