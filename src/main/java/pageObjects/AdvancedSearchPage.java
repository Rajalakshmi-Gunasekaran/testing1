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
    @FindBy(xpath = "//div[@class=\"d-flex flex-column align-items-center pt-2\"]/div[contains(text(),\"Tweets\")]")
    public WebElement twitterRadioBtn;
    @FindBy(xpath = "//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Tweets\")]")
    public WebElement twitterTab;
    @FindBy(xpath ="//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Articles\")]")
    public WebElement articlesTab;
    @FindBy(xpath ="//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Outlets\")]")
    public WebElement outletsTab;
    @FindBy(xpath = "//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Journalist alerts\")]")
    public WebElement journalistAlertsTab;
    @FindBy(xpath = "//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Forward Features\")]")
    public WebElement forwardFeaturesTab;
    @FindBy(xpath = "//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Media Requests\")]")
    public WebElement mediaRequestTab;
    @FindBy(xpath = "//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Instagram\")]")
    public WebElement instagramTab;
    @FindBy(xpath = "//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"Activities\")]")
    public WebElement activitiesTab;
    @FindBy(xpath = "//div[@class=\"label mr-3 text-left\"]/div[contains(text(),\"PR opportunities\")]")
    public WebElement PROpportunitiesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/input")
    public WebElement basedInCountry;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[2]/input")
    public WebElement anyTownOrPostcode;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListNameFromAdvancedSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/span/button")
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
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/a")
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

    public void clickAdvancedSearch()throws InterruptedException {
        Thread.sleep(3000);
        AdvancedSearchTab.click();
    }

    public void enterOutletType(String outletTypeName) throws InterruptedException{
        Thread.sleep(3000);
        outletType.sendKeys(outletTypeName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        outletType.sendKeys(Keys.ENTER);
    }

    public void enterOutletName(String outletName)throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(enterOutletName,driver);
        enterOutletName.sendKeys(outletName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterOutletName.sendKeys(Keys.ENTER);
    }

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

    public void clickCountryGroupBy() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickCountry,driver);
        clickCountry.click();
    }
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

    public void chooseInfo()throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(chooseInfoView,driver);
        chooseInfoView.click();
    }

    public void validateJournalistInfo()throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(validateInfoView.isDisplayed());
    }

    public void setClickAddJournoToListBtn()throws InterruptedException {
        Thread.sleep(3000);
        clickAddJournoToListBtn.click();
    }

    public void enterListNameToCreateAdvancedSearchList(String advancedSearchList)throws InterruptedException {
        Thread.sleep(3000);
        enterListNameFromAdvancedSearch.sendKeys(advancedSearchList);
        Thread.sleep(3000);
        enterListNameFromAdvancedSearch.sendKeys(Keys.ENTER);
    }
    public void clickOkToCopyListFromAdvancedSearch()throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickOkToCreateAdvancedSearch,driver);
        clickOkToCreateAdvancedSearch.click();
        Thread.sleep(3000);
    }
    public void setClickOutletTab()throws InterruptedException {
        Thread.sleep(3000);
        clickOutletTab.click();
    }
    public void enterSectorName(String sector) throws InterruptedException{
        Thread.sleep(3000);
        enterSector.sendKeys(sector);
        Thread.sleep(3000);
        enterSector.sendKeys(Keys.ENTER);
    }

    public void setClickFrequency() throws InterruptedException{
        Thread.sleep(3000);
        clickFrequency.click();
        Thread.sleep(3000);
        chooseFrequency.click();
    }

    public void enterPostCode(String postcode) throws InterruptedException{
        Thread.sleep(3000);
        enterPostCode.sendKeys(postcode);
    }

    public void seValidateOutletSearch() throws InterruptedException{
        Thread.sleep(3000);
        validateOutletSearchResults.isDisplayed();
    }

    public void setClickBasedInCountry() throws InterruptedException{
        Thread.sleep(3000);
        clickBasedInCountry.click();
        Thread.sleep(3000);
        chooseCountryUnitedKingdom.click();
    }

    public void setEnterLocality(String locality) throws InterruptedException{
        Thread.sleep(3000);
        clickLocality.sendKeys(locality);
        Thread.sleep(3000);
        chooseLocality.click();
    }

    public void enterKeyword(String keyword) throws InterruptedException{
        Thread.sleep(3000);
        enterKeyword.sendKeys(keyword);
    }

    public void setChooseOutletHits() throws InterruptedException{
        Thread.sleep(3000);
        clickOutletHitsInOutletsTile.click();
    }

    public void validateTweetsForOutlets() throws InterruptedException{
        Thread.sleep(3000);
        validateOutletTweetResults.isDisplayed();
    }

    public void setClickArticleTab() throws InterruptedException{
        Thread.sleep(3000);
        clickArticlesTab.click();
    }

    public void enterCompany(String company) throws InterruptedException{
        Thread.sleep(3000);
        enterCompanyName.sendKeys(company);
        Thread.sleep(3000);
        enterCompanyName.sendKeys(Keys.ENTER);
    }

    public void setValidateArticleSearchResults() throws InterruptedException{
        Thread.sleep(3000);
        validateArticleSearchResults.isDisplayed();
    }

    public void setJournoAlertsTab() throws InterruptedException{
        Thread.sleep(3000);
        clickJournalistAlertsTab.click();
    }

    public void setEnterOutlet(String outlet) throws InterruptedException{
        Thread.sleep(3000);
        enterOutlet.sendKeys(outlet);
        Thread.sleep(3000);
        enterOutlet.sendKeys(Keys.ENTER);
    }

    public void validateJournoAlertsResults() throws InterruptedException{
        Thread.sleep(3000);
        validateJournalistAlertsResults.isDisplayed();
    }

    public void setClickForwardFeaturesTab() throws InterruptedException{
        Thread.sleep(3000);
        clickForwardFeatures.click();
    }

    public void setEnterOutletName(String outletName) throws InterruptedException{
        Thread.sleep(3000);
        enterOutletToSearchForwardFeatures.sendKeys(outletName);
        Thread.sleep(3000);
        enterOutletToSearchForwardFeatures.sendKeys(Keys.ENTER);
    }

    public void validateForwardFeaturesResults() throws InterruptedException{
        Thread.sleep(3000);
        validateForwardFeaturesResults.isDisplayed();
    }
    public void setActivityTab() throws InterruptedException{
        Thread.sleep(3000);
        clickActivityTab.click();
    }

    public void validateActivityForOutletSearch() throws InterruptedException{
        Thread.sleep(3000);
        validateActivityResultsForOutlet.isDisplayed();
    }

    public void setMediaRequestTab() throws InterruptedException{
        Thread.sleep(3000);
        clickMediaRequestTab.click();
    }

    public void validateMediaRequestResults() throws InterruptedException{
        Thread.sleep(3000);
        validateMediaRequestsForOutlet.isDisplayed();
    }

    public void setClickPROpportunitiesTab() throws InterruptedException{
        Thread.sleep(3000);
        clickPROpportunities.click();
    }

    public void enterSection(String section) throws InterruptedException{
        Thread.sleep(3000);
        enterSection.sendKeys(section);
        Thread.sleep(3000);
        enterSection.sendKeys(Keys.ENTER);
    }

    public void validatePROpportunitiesResults() throws InterruptedException{
        Thread.sleep(3000);
        validatePROpportunities.isDisplayed();
    }

    public void setClickTweetsTab() throws InterruptedException{
        Thread.sleep(3000);
        clickTweetTab.click();
    }

    public void enterKeywordForTweetSearch(String keyword)throws InterruptedException {
        Thread.sleep(3000);
        enterKeywordForTweetSearch.sendKeys(keyword);
        Thread.sleep(3000);
        enterKeywordForTweetSearch.sendKeys(Keys.ENTER);
    }

    public void clickExcludeRetweet() throws InterruptedException{
        Thread.sleep(3000);
        clickReTweet.click();
    }

    public void validateTweetResults() throws InterruptedException{
        Thread.sleep(3000);
        selectAll.click();
        Thread.sleep(3000);
        validateTweetKeywordSearch.isDisplayed();
    }

    public void setClickInstagramTab() throws InterruptedException{
        Thread.sleep(3000);
        clickInstagramTab.click();
    }

    public void chooseTypeOfPublisher() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeOfPublisher.click();
    }

    public void enterOutletTypeForInstaSearch(String outletType) throws InterruptedException{
        Thread.sleep(3000);
        enterOutletType.sendKeys(outletType);
    }
    public void validateInstagramResults() throws InterruptedException{
        Thread.sleep(3000);
        selectAll.click();
        Thread.sleep(3000);
        validateInstagramResults.isDisplayed();
    }

    public void setClickClearAll() throws InterruptedException {
        Thread.sleep(3000);
         clickClearAllFilters.click();
    }

    public void validateClearAllFiltersResult() throws InterruptedException{
        Thread.sleep(3000);
        validateClearAllFilterResults.isDisplayed();
    }
}
