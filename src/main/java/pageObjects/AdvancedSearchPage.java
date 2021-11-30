package pageObjects;

import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AdvancedSearchPage extends CommonFunctions{
    public WebDriver driver;
    private Actions action;

    public AdvancedSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-link-icon")
    public WebElement AdvancedSearchTab;
    /*@FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/i")
    public WebElement clickOutletDropdown;*/
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/input")
    public WebElement outletType;
    @FindBy(xpath = "//span[contains(text(),\"BBC Two\")]")
    public WebElement clickChosenOutlet;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div/input")
    public WebElement enterOutletName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div[1]")
    public WebElement validateOutletSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div/div")
    public WebElement clickOutlet;
    @FindBy(xpath = "//div[@class=\"dropdown b-dropdown btn-dropdown no-arrow btn-group\"]")
    public WebElement clickGroupByButton;
    @FindBy(xpath = "//*[contains(text(),'Country')]")
    public WebElement clickCountry;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div[1]/h5")
    public WebElement validateGroupBy;
    @FindBy(xpath = "//div[@class=\"position-absolute top-0 left-0 w-100 h-100\"]")
    public WebElement clickChangeInfoView;
    @FindBy(xpath = "//div[@class=\"dropdown b-dropdown journalist-tab-switch btn-dropdown show btn-group\"]/ul/li/a/*[contains(text(),\"Roxhill says\")]")
    public WebElement chooseInfoView;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/p/em")
    public WebElement validateInfoView;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]//button")
    public WebElement clickCopyToList1;
    @FindBy(xpath= "//*[@id=\"__BVID__1423__BV_toggle_\"]")
    public WebElement clickActionsToClickCopyToList;
    @FindBy(xpath = "//span[contains(text(),\"Add 10 journalists to lists\")]")
    public WebElement clickCopyToList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickOk;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListNameFromAdvancedSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]")
    public WebElement clickAddJournoToListBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickOkToCreateAdvancedSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[2]/a/div")
    public WebElement clickOutletTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/input")
    public WebElement enterSector;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div/i")
    public WebElement clickFrequency;
    @FindBy(xpath = "//span[contains(text(),\"Weekly\")]")
    public WebElement chooseFrequency;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[2]/input")
    public WebElement enterPostCode;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div")
    public WebElement validateOutletSearchResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/div/input")
    public WebElement clickBasedInCountry;
    @FindBy(xpath = "//span[contains(text(),\"United Kingdom\")]")
    public WebElement chooseCountryUnitedKingdom;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div/input")
    public WebElement clickLocality;
    @FindBy(xpath = "//span[contains(text(),\"Regions - UK\")]")
    public WebElement chooseLocality;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[1]/button")
    public WebElement clickOutletHitsInOutletsTile;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[4]/div/div[2]/div[2]/div[2]/input")
    public WebElement enterKeyword;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]")
    public WebElement validateOutletTweetResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[3]/a/div")
    public WebElement clickArticlesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[2]/div/div/input")
    public WebElement enterCompanyName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div[3]/div/div")
    public WebElement validateArticleSearchResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[4]/a/div")
    public WebElement clickJournalistAlertsTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/input")
    public WebElement enterOutlet;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div[1]/div[2]")
    public WebElement validateJournalistAlertsResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[5]/a/div")
    public WebElement clickForwardFeatures;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/input")
    public WebElement enterOutletToSearchForwardFeatures;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/a/div")
    public WebElement validateForwardFeaturesResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[9]/a/div")
    public WebElement clickActivityTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[3]/div/div[2]/ul/li/div/a")
    public WebElement validateActivityResultsForOutlet;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[6]/a/div")
    public WebElement clickMediaRequestTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/nav/span")
    public WebElement validateMediaRequestsForOutlet;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[10]/a/div")
    public WebElement clickPROpportunities;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div/input")
    public WebElement enterSection;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[1]")
    public WebElement validatePROpportunities;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[7]/a/div")
    public WebElement clickTweetTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/input")
    public WebElement enterKeywordForTweetSearch;
    @FindBy(xpath = "//*[@id=\"tweetSearchFiltersExcludeRetweets\"]/span")
    public WebElement clickReTweet;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav/div[2]/div[1]/button[1]/span/span")
    public WebElement selectAll;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div[1]/a/i")
    public WebElement validateTweetKeywordSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/ul/li[8]/a")
    public WebElement clickInstagramTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/select")
    public WebElement clickTypeOfPublisher;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/select/option[2]")
    public WebElement chooseTypeOfPublisher;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/input")
    public WebElement enterOutletType;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav/div[2]/div[1]/button[2]/span/span")
    public WebElement validateInstagramResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/nav/button")
    public WebElement clickClearAllFilters;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div")
    public WebElement validateClearAllFilterResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div[1]")
    public WebElement chooseAndClickOutlet;
    @FindBy(xpath = "//i[@class=\"icon-feather\"]")
    public WebElement clickSearchAllOutletJournoBtn;
    @FindBy(xpath = "//button[contains(text(),\" Yes, leave \")]")
    public WebElement clickYesLeaveBtn;
    @FindBy(xpath = "//span[contains(text(),\" Film-News.co.uk\")]")
    public WebElement validateSearchAllOutletJourno;

    // click advanced search tab on headers
    public void clickAdvancedSearch()throws InterruptedException {
        Thread.sleep(3000);
        AdvancedSearchTab.click();
    }
     // enter outlet type nam eto filter out journos
    public void enterOutletType(String outletTypeName) throws InterruptedException{
        Thread.sleep(3000);
        outletType.sendKeys(outletTypeName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        outletType.sendKeys(Keys.ENTER);
    }
    // enter outlet name to filter journo
    public void enterOutletName(String outletName)throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(enterOutletName,driver);
        enterOutletName.sendKeys(outletName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterOutletName.sendKeys(Keys.ENTER);
        clickChosenOutlet.click();
    }
    // validate outlet search for outlet type and outlets
    public void setValidateOutletSearch() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(validateOutletSearch,driver);
        Assert.assertTrue(validateOutletSearch.isDisplayed());
    }
    /* add journalist to the list*/
    public void setClickCopyToList() throws InterruptedException{
        elementClickable(clickCopyToList1,driver);
        clickCopyToList1.click();
    }
    /*enter list name to add journalist*/
    public void setEnterListName(String listName) {
        enterListName.sendKeys(listName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterListName.sendKeys(Keys.ENTER);
    }
    /*click ok to add journalist to the list*/
    public void setClickOk() {
        clickOk.click();
    }
    /* To group by list by country*/
    public void clickGroupByIcon()throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(clickGroupByButton,driver);
        clickGroupByButton.click();
    }
    // click country group by
    public void clickCountryGroupBy() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickCountry,driver);
        clickCountry.click();
    }
    // validate list grouped by country
    public void validateListGroupedByCountry()throws InterruptedException {
        Thread.sleep(3000);
        //elementVisible(validateGroupBy,driver);
        Assert.assertTrue(validateGroupBy.isDisplayed());
    }

    /* validate change info functionality in journalist advanced search by outlet filters*/
    public void clickChangeInfo()throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(clickChangeInfoView,driver);
        clickChangeInfoView.click();
    }
    // choose info to view info inside tiles
    public void chooseInfo()throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(chooseInfoView,driver);
        chooseInfoView.click();
    }
    // validate journalist info inside tile
    public void validateJournalistInfo()throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(validateInfoView.isDisplayed());
    }
    // click add journo to list button
    public void setClickAddJournoToListBtn()throws InterruptedException {
        Thread.sleep(3000);
        clickAddJournoToListBtn.click();
    }
    // enter list name to create advanced search list
    public void enterListNameToCreateAdvancedSearchList(String advancedSearchList)throws InterruptedException {
        Thread.sleep(3000);
        enterListNameFromAdvancedSearch.sendKeys(advancedSearchList);
        Thread.sleep(3000);
        enterListNameFromAdvancedSearch.sendKeys(Keys.ENTER);
    }
    // click ok to copy list from advanced search
    public void clickOkToCopyListFromAdvancedSearch()throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickOkToCreateAdvancedSearch,driver);
        clickOkToCreateAdvancedSearch.click();
        Thread.sleep(3000);
    }
    // click outlet tab
    public void setClickOutletTab()throws InterruptedException {
        Thread.sleep(3000);
        clickOutletTab.click();
    }
    // enter sector name to filter outlet results
    public void enterSectorName(String sector) throws InterruptedException{
        Thread.sleep(3000);
        enterSector.sendKeys(sector);
        Thread.sleep(3000);
        enterSector.sendKeys(Keys.ENTER);
    }
    // click frequency filter to search for outlet
    public void setClickFrequency() throws InterruptedException{
        Thread.sleep(3000);
        clickFrequency.click();
        Thread.sleep(3000);
        chooseFrequency.click();
    }
    // enter post code to search for applied filter
    public void enterPostCode(String postcode) throws InterruptedException{
        Thread.sleep(3000);
        enterPostCode.sendKeys(postcode);
    }
    // validate outlet search for sector, frequency and post code
    public void seValidateOutletSearch() throws InterruptedException{
        Thread.sleep(3000);
        validateOutletSearchResults.isDisplayed();
    }
    // click based in country
    public void setClickBasedInCountry() throws InterruptedException{
        Thread.sleep(3000);
        clickBasedInCountry.click();
        Thread.sleep(3000);
        chooseCountryUnitedKingdom.click();
    }
    // enter locality to filter results for tweet
    public void setEnterLocality(String locality) throws InterruptedException{
        Thread.sleep(3000);
        clickLocality.sendKeys(locality);
        Thread.sleep(3000);
        chooseLocality.click();
    }
    // enter keyword filter to search for tweet
    public void enterKeyword(String keyword) throws InterruptedException{
        Thread.sleep(3000);
        enterKeyword.sendKeys(keyword);
    }
     // choose outlet hits to filter out to search for tweets
    public void setChooseOutletHits() throws InterruptedException{
        Thread.sleep(3000);
        clickOutletHitsInOutletsTile.click();
    }
    // validate tweets for outlets hits filter
    public void validateTweetsForOutlets() throws InterruptedException{
        Thread.sleep(3000);
        validateOutletTweetResults.isDisplayed();
    }
    // click alerts tab
    public void setClickArticleTab() throws InterruptedException{
        Thread.sleep(3000);
        clickArticlesTab.click();
    }
    // enter company name to filter articles results
    public void enterCompany(String company) throws InterruptedException{
        Thread.sleep(3000);
        enterCompanyName.sendKeys(company);
        Thread.sleep(3000);
        enterCompanyName.sendKeys(Keys.ENTER);
    }
    // validate articles search results for filtering out company
    public void setValidateArticleSearchResults() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(validateArticleSearchResults,driver);
        validateArticleSearchResults.isDisplayed();
    }
    // click journo alerts tab
    public void setJournoAlertsTab() throws InterruptedException{
        Thread.sleep(3000);
        clickJournalistAlertsTab.click();
    }
    // enter outlet name to choose outlet for filter journo alerts
    public void setEnterOutlet(String outlet) throws InterruptedException{
        Thread.sleep(3000);
        enterOutlet.sendKeys(outlet);
        Thread.sleep(3000);
        enterOutlet.sendKeys(Keys.ENTER);
    }
    // validate journo alerts results
    public void validateJournoAlertsResults() throws InterruptedException{
        Thread.sleep(3000);
        validateJournalistAlertsResults.isDisplayed();
    }
    // click forward features tab
    public void setClickForwardFeaturesTab() throws InterruptedException{
        Thread.sleep(3000);
        clickForwardFeatures.click();
    }
   // enter outlet name to choose outlet
    public void setEnterOutletName(String outletName) throws InterruptedException{
        Thread.sleep(3000);
        enterOutletToSearchForwardFeatures.sendKeys(outletName);
        Thread.sleep(3000);
        enterOutletToSearchForwardFeatures.sendKeys(Keys.ENTER);
    }
    //validate forward features results by search results
    public void validateForwardFeaturesResults() throws InterruptedException{
        Thread.sleep(3000);
        validateForwardFeaturesResults.isDisplayed();
    }
    // click activity tab
    public void setActivityTab() throws InterruptedException{
        Thread.sleep(3000);
        clickActivityTab.click();
    }
    // validate activity for outlet search
    public void validateActivityForOutletSearch() throws InterruptedException{
        Thread.sleep(3000);
        validateActivityResultsForOutlet.isDisplayed();
    }
    // click media request tab
    public void setMediaRequestTab() throws InterruptedException{
        Thread.sleep(3000);
        clickMediaRequestTab.click();
    }
    // validate media request results
    public void validateMediaRequestResults() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(validateMediaRequestsForOutlet,driver);
        validateMediaRequestsForOutlet.isDisplayed();
    }
    //click PR opportunity tab
    public void setClickPROpportunitiesTab() throws InterruptedException{
        Thread.sleep(3000);
        clickPROpportunities.click();
    }
    // enter section filter to validate PR opportunity
    public void enterSection(String section) throws InterruptedException{
        Thread.sleep(3000);
        enterSection.sendKeys(section);
        Thread.sleep(3000);
        enterSection.sendKeys(Keys.ENTER);
    }
    // validate PR opportunity results for the applied filters
    public void validatePROpportunitiesResults() throws InterruptedException{
        Thread.sleep(3000);
        validatePROpportunities.isDisplayed();
    }
    // click tweets tab
    public void setClickTweetsTab() throws InterruptedException{
        Thread.sleep(3000);
        clickTweetTab.click();
    }
    // enter keyword filter for tweet search
    public void enterKeywordForTweetSearch(String keyword)throws InterruptedException {
        Thread.sleep(3000);
        enterKeywordForTweetSearch.sendKeys(keyword);
        Thread.sleep(3000);
        enterKeywordForTweetSearch.sendKeys(Keys.ENTER);
    }
    // click exclude retweet checkbox to exclude the search result
    public void clickExcludeRetweet() throws InterruptedException{
        Thread.sleep(3000);
        clickReTweet.click();
    }
    // validate tweet results for the applied results
    public void validateTweetResults() throws InterruptedException{
        Thread.sleep(3000);
        selectAll.click();
        Thread.sleep(3000);
        validateTweetKeywordSearch.isDisplayed();
    }
   // click instagram tab in advanced search
    public void setClickInstagramTab() throws InterruptedException{
        Thread.sleep(3000);
        clickInstagramTab.click();
    }
    //choose type of publisher for instagram filters
    public void chooseTypeOfPublisher() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeOfPublisher.click();
    }
   //enter outlet type for insta search
    public void enterOutletTypeForInstaSearch(String outletType) throws InterruptedException{
        Thread.sleep(3000);
        enterOutletType.sendKeys(outletType);
    }
    //validate instagram results for the applied search
    public void validateInstagramResults() throws InterruptedException{
        Thread.sleep(3000);
        selectAll.click();
        Thread.sleep(3000);
        validateInstagramResults.isDisplayed();
    }
   //click clear all button
    public void setClickClearAll() throws InterruptedException {
        Thread.sleep(3000);
         clickClearAllFilters.click();
    }
    //validate clear all filters functionality
    public void validateClearAllFiltersResult() throws InterruptedException{
        Thread.sleep(3000);
        validateClearAllFilterResults.isDisplayed();
    }
    // choose outlet outlet from the list and click on it
    public void setChooseAndClickOnOutlet() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickOutlet.click();
    }
    //click search all outlet journo button
    public void setClickSearchAllOutletJournoBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickSearchAllOutletJournoBtn.click();
    }
    // click yes leave button to handle pop up to leave the page
    public void setClickYesLeaveBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickYesLeaveBtn.click();
    }
    //validate search all outlet journo button search result
    public void setValidateSearchAllOutletJournoBtn() throws InterruptedException{
        Thread.sleep(3000);
        validateSearchAllOutletJourno.isDisplayed();
    }
}
