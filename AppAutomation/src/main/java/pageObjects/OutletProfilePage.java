package pageObjects;

import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutletProfilePage extends CommonFunctions{
    WebDriver driver;
    public OutletProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class=\"dept-type dept-type-desk\"]")
    public WebElement validateDesk;
    @FindBy(css = ".contact-details")
    public WebElement validateContact;
    @FindBy(css = ".short-note.my-2")
    public WebElement validateRoxhillSays;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div/div[4]/div[1]")
    public WebElement validateSectors;
    @FindBy(xpath = "//a[contains(text(),\"About\")]")
    public WebElement clickIAbout;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div")
    public WebElement validateIAbout;
    @FindBy(xpath = "//a[contains(text(),\"Twitter\")]")
    public WebElement clickTwitterTab;
    @FindBy(xpath = "//span[contains(text(),\"Select all\")]")
    public WebElement clickSelectAll;
    @FindBy(xpath = "//span[contains(text(),\"50\")]")
    public WebElement validateTwitterTab;
    @FindBy(xpath = "//a[contains(text(),\"Journalists\")]")
    public WebElement clickJournalistTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div")
    public WebElement validateJournalistTab;
    @FindBy(xpath = "//a[contains(text(),\" Headlines \")]")
    public WebElement clickHeadlinesTab;
    @FindBy(xpath = "//span[contains(text(),\"50\")]")
    public WebElement validateHeadlinesTab;
    @FindBy(xpath = "//a[contains(text(),\" Activities \")]")
    public WebElement clickActivitiesTab;
    @FindBy(xpath = "//strong[contains(text(),\"Simon English\")]")
    public WebElement validateActivitiesTab;
    @FindBy(xpath = "//a[contains(text(),\" Alerts \")]")
    public WebElement clickAlertsTab;
    @FindBy(xpath = "//div[@class=\"position-relative fill-height flex-column-reverse\"]")
    public WebElement validateAlertsTab;
    @FindBy(xpath = "//div[@class=\"tile-list pt-3 px-1\"]")
    public WebElement validatePROpportunityTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement clickSelectAllInGroupBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div")
    public WebElement validateJournoSelectedInGroup;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/button[2]")
    public WebElement clickDeSelectAllInGroupBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div")
    public WebElement validateJournoDeSelectedInGroup;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/button[3]")
    public WebElement clickHideBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]")
    public WebElement validateHideJourno;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[1]/div[2]/button[3]")
    public WebElement clickUnHideJournoBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]")
    public WebElement validateUnHideJourno;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div")
    public WebElement chooseJournoToAddActivity;
    @FindBy(xpath = "//i[@class=\"icon-flag\"]")
    public WebElement clickAddActivityForAllBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[3]/div/div/div[2]/form/div/div/div[2]/input")
    public WebElement enterSubjectFieldInActivity;
    @FindBy(xpath = "//button[@class=\"waiting-button btn btn-sm btn-primary ml-2\"]")
    public WebElement clickSaveActivity;
    @FindBy(xpath = "//a[contains(text(),\" Activities \")]")
    public WebElement clickOnActivitiesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/h5")
    public WebElement validateActivityCreatedForJourno;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/span")
    public WebElement deleteActivity;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/span/div/div[2]/div[1]")
    public WebElement confirmDeleteActivity;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/nav[2]/form/input")
    public WebElement enterSearchByNameTextField;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div")
    public WebElement validateSearchByNameResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[3]/ul/li[3]/i")
    public WebElement clickSectorLink;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/ul")
    public WebElement validateSectorLinkResult;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[3]/ul/li[4]/i")
    public WebElement clickCoverageLink;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div")
    public WebElement validateCoverageLinkResult;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[3]/ul/li[5]/i")
    public WebElement clickTweetLink;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/ul")
    public WebElement validateTweetLinkResult;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/ul/li[6]")
    public WebElement clickInstagramLink;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/ul/li[1]")
    public WebElement validateInstagramResult;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[3]/button/span/span")
    public WebElement clickAddToFavouriteBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/a")
    public WebElement clickHomeBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[6]")
    public WebElement clickOutletFavouritesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div[1]/div")
    public WebElement validateOutletFavourites;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/ul/li[2]/div/span/span")
    public WebElement chooseDesk;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[1]")
    public WebElement validateJournoForChosenDesk;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/nav/button")
    public WebElement clickClearAllDesk;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div[1]")
    public WebElement validateAllJournosAfterClearAllDesk;
    @FindBy(xpath = "//div[@class=\"dropdown b-dropdown btn-dropdown no-arrow btn-group\"]")
    public WebElement clickGroupBy;
    @FindBy(xpath = "//a[contains(text(),\"Un-group\")]")
    public WebElement clickUnGroupOption;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div/div[2]")
    public WebElement validateGroupBy;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/nav[2]/div[5]/span/button/span/i")
    public WebElement clickSortOption;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div/div[2]")
    public WebElement validateSortDirectionJourno;
    @FindBy(xpath = "//a[contains(text(),\" Alerts \")]")
    public WebElement clickAlertsTabs;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[2]/form/input")
    public WebElement enterQuickFindByKeyword;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]")
    public WebElement validateQuickFindByKeywordResult;
    @FindBy(xpath = "//div[@class=\"contact-details\"]")
    public WebElement validateContactDetailsInOutletPage;
    @FindBy(xpath = "//div[contains(text(),\" Home Interest \")]")
    public WebElement clickHomeInterestSection;
    @FindBy(xpath = "//a[contains(text(),\" PR opportunities \")]")
    public WebElement clickPROpportunityTab;
    @FindBy(xpath = "//div[@class=\"propportunity-tile h-100\"]")
    public WebElement validatePROpportunitySectionSearch;
    @FindBy(xpath = "//ul[@class=\"list-unstyled m-0\"]")
    public WebElement clickJournoLink;
    @FindBy(xpath = "//div[contains(text(),\"Evening Standard\")]")
    public WebElement validateJournoProfileFromOutletPage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/nav[2]/div[2]/span[2]/button")
    public WebElement clickListViewBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div")
    public WebElement validateResultsInListview;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/nav[2]/ul/li[5]/a/i")
    public WebElement clickRightArrowToSelectPageNumber;
    @FindBy(xpath = "//li[@class=\"page-item\"]/a[contains(text(),\"3\")]")
    public WebElement clickPageNumber;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div[1]")
    public WebElement validatePageNumberListingJourno;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div[2]/ul/li[4]/div/span/span/span/i")
    public WebElement validateDeskProfileCheckBoxTicked;


    /*validate Desk display*/
    public void validateDeskDisplay() {
        Assert.assertTrue(validateDesk.isDisplayed());
    }
    /*validate journo display*/
    public void validateJournoDisplay() {
        Assert.assertTrue(validateContact.isDisplayed());
        Assert.assertTrue(validateRoxhillSays.isDisplayed());
        Assert.assertTrue(validateSectors.isDisplayed());
    }
    /*validate I about tab in outlet profile*/
    public void validateIAboutTabsINOutlet() throws InterruptedException{
        Thread.sleep(6000);
        clickIAbout.click();
        Thread.sleep(6000);
        Assert.assertTrue(validateIAbout.isDisplayed());
    }
    /*validate Twitter tab in outlet profile*/
    public void validateTwitterTabINOutlet() throws InterruptedException{
        Thread.sleep(6000);
        clickTwitterTab.click();
        Thread.sleep(3000);
        clickSelectAll.click();
        Thread.sleep(6000);
        Assert.assertTrue(validateTwitterTab.isDisplayed());
    }
    /*validate journo tab in outlet profile*/
    public void validateJournalistTabsINOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clickJournalistTab.click();
        Thread.sleep(6000);
        clickSelectAll.click();
        Thread.sleep(3000);
        Assert.assertTrue(validateJournalistTab.isDisplayed());
    }
    /*validate Header lines tab in outlet profile*/
    public void validateHeadlinesTabsINOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clickHeadlinesTab.click();
        Thread.sleep(3000);
        clickSelectAll.click();
        Thread.sleep(3000);
        Assert.assertTrue(validateHeadlinesTab.isDisplayed());
    }
    /*validate Activities tab in outlet profile*/
    public void validateActivitiesTabsINOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clickActivitiesTab.click();
        Thread.sleep(3000);
        clickSelectAll.click();
        Thread.sleep(3000);
        Assert.assertTrue(validateActivitiesTab.isDisplayed());
    }
    /*validate Alerts tab in outlet profile*/
    public void validateAlertsTabsINOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clickAlertsTabs.click();
        Thread.sleep(3000);
        Assert.assertTrue(validateAlertsTab.isDisplayed());
    }
    /*validate PR Opportunity tab in outlet profile*/
    public void validatePROpportunityTabINOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clickPROpportunityTab.click();
        Thread.sleep(3000);
        Assert.assertTrue(validatePROpportunityTab.isDisplayed());
    }
    //choose journo in journalist tab to add activity
    public void chooseJournoToAddActivity() throws InterruptedException{
        Thread.sleep(6000);
        chooseJournoToAddActivity.click();
    }
    // click add activity
    public void setClickAddActivity() throws InterruptedException{
        Thread.sleep(6000);
        clickAddActivityForAllBtn.click();
    }
    //enter subject for activity
    public void setEnterSubjectForActivity(String enterSubject) throws InterruptedException{
        Thread.sleep(6000);
        enterSubjectFieldInActivity.sendKeys(enterSubject);
    }
    //click save button in activity page
    public void setClickSaveBtn()throws InterruptedException {
        Thread.sleep(6000);
        clickSaveActivity.click();
    }
     //click activity tab
    public void setClickActivityTab() throws InterruptedException{
        Thread.sleep(6000);
        clickOnActivitiesTab.click();
    }
    // validate activity for the journo
    public void validateActivityForJourno() throws InterruptedException{
        Thread.sleep(6000);
        validateActivityCreatedForJourno.isDisplayed();
    }
    // click delete activity created for journo
    public void setClickDeleteActivity() throws InterruptedException{
        Thread.sleep(3000);
        deleteActivity.click();
        Thread.sleep(3000);
        confirmDeleteActivity.click();
    }
    //choose desk by clicking list of desks check box in left hand side pan in outlet profile
    public void chooseDeskForJournos()throws InterruptedException {
        Thread.sleep(3000);
        chooseDesk.click();
    }
    // User should see the journo for the selected desk
    public void validateJournoForChosenDesk() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoForChosenDesk.isDisplayed();
    }
    // click clear all button in desks outlet profile
    public void setClickClearAll() throws InterruptedException{
        Thread.sleep(3000);
        clickClearAllDesk.click();
    }
    // validate all journo for all desks
    public void validateAllJournosForAllDesks() throws InterruptedException{
        Thread.sleep(6000);
        validateAllJournosAfterClearAllDesk.isDisplayed();
    }
     // click hide button to hide journo
    public void setClickHide() throws InterruptedException{
        Thread.sleep(3000);
        clickHideBtn.click();
    }
    // validate hide journo tile for the chosen
    public void validateHideJourno()throws InterruptedException {
        Thread.sleep(3000);
        validateHideJourno.isDisplayed();
    }
     // click un hide button to see the hidden journo again
    public void setClickUnhide() throws InterruptedException{
        Thread.sleep(3000);
        clickUnHideJournoBtn.click();
    }
    // validate the hide journo can see again using un hide button
    public void validateUnHideJourno() throws InterruptedException{
        Thread.sleep(3000);
        validateUnHideJourno.isDisplayed();
    }
    //click select all in group button on the right hand side button
    public void setClickSelectInGroup()throws InterruptedException {
        Thread.sleep(3000);
        clickSelectAllInGroupBtn.click();
    }
    //validate the journo selected in group
    public void validateJournoSelectInGroup()throws InterruptedException {
        Thread.sleep(3000);
        validateJournoSelectedInGroup.isDisplayed();
    }
    //click de select all in group button to ungroup
    public void setClickDeselectJourno()throws InterruptedException {
        Thread.sleep(3000);
        clickDeSelectAllInGroupBtn.click();
    }
    //validate journo ungrouped after clicking de select all in group button
    public void validateJournoDeselect() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoDeSelectedInGroup.isDisplayed();
    }
    //click add to favourites button in the right hand side
    public void setClickAddToFavouritesBtn() throws InterruptedException{
        Thread.sleep(6000);
        clickAddToFavouriteBtn.click();
    }
    //click home button to go back to home
    public void setClickHomeBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickHomeBtn.click();
    }
    //click favourites outlet tab in home page to see the recently added outlet
    public void setClickFavouritesOutletTab()throws InterruptedException {
        Thread.sleep(6000);
        clickOutletFavouritesTab.click();
    }
    //validate the recently added outlet to favourites
    public void validateOutletAddedToFavourites() throws InterruptedException{
        Thread.sleep(6000);
        validateOutletFavourites.isDisplayed();
    }
    //click sector button in journo tile inside info
    public void setClickOnSectorInJournoTile() throws InterruptedException{
        Thread.sleep(3000);
        clickSectorLink.click();
    }
    //validate the sectors listed for that journo
    public void validateSectorResultsInJournoTile()throws InterruptedException {
        Thread.sleep(3000);
        validateSectorLinkResult.isDisplayed();
    }
    //click coverage button inside journo tile
    public void setClickCoverage() throws InterruptedException{
        Thread.sleep(3000);
        clickCoverageLink.click();
    }
    //validate the coverage tab opens in the right hand for this journo
    public void setValidateCoverageLinkResult() throws InterruptedException{
    Thread.sleep(3000);
    validateCoverageLinkResult.isDisplayed();
    }
    //click tweet button inside journo tile
    public void setClickTweetInJournotile() throws InterruptedException{
        Thread.sleep(3000);
        clickTweetLink.click();
    }
    //validate the listed no of tweets, follower, following info for that journo
    public void setValidateTweetLinkResult() throws InterruptedException{
    Thread.sleep(3000);
    validateTweetLinkResult.isDisplayed();
    }
    //click instagram button inside journo tile
    public void setClickInstagramInJournoTile() throws InterruptedException{
        Thread.sleep(3000);
        clickInstagramLink.click();
    }
    //validate the instagram posts, follower and following info for that journo
    public void setValidateInstagramResults() throws InterruptedException{
        Thread.sleep(3000);
        validateInstagramResult.isDisplayed();
    }
    //click alerts tab to see the alerts for the outlet
    public void setClickAlertsTab() throws InterruptedException{
        Thread.sleep(3000);
        clickAlertsTabs.click();
    }
    //enter quick find by keyword to search for the particular alert
    public void setEnterQuickFindByKeyword(String keyword) throws InterruptedException{
        Thread.sleep(3000);
        enterQuickFindByKeyword.sendKeys(keyword);
    }
    //validate the result for the keyword search as per the result
    public void validateKeywordSearchResult() throws InterruptedException{
    Thread.sleep(3000);
    validateQuickFindByKeywordResult.isDisplayed();
    }
    //enter journo name to search journo
    public void setEnterSearchByNameJournoSearch(String searchName) throws InterruptedException{
        Thread.sleep(3000);
        enterSearchByNameTextField.sendKeys(searchName);
    }
    //validate the result for the searched name
    public void validateSearchByNameJournoResult()throws InterruptedException {
        Thread.sleep(3000);
        validateSearchByNameResults.isDisplayed();
    }
     //click group by button to group the journo display
    public void setClickGroupByButton()throws InterruptedException {
        Thread.sleep(3000);
        clickGroupBy.click();
    }
    //click un group option to ungroup the journo display
    public void setClickUnGroupOption() throws InterruptedException{
        Thread.sleep(3000);
        clickUnGroupOption.click();
    }
    //validate the journos are un grouped
    public void validateUnGroupresults() throws InterruptedException{
        Thread.sleep(3000);
        validateGroupBy.isDisplayed();
    }
    //click sort direction button arrow to sort the journo listed
    public void setClickSortDirection() throws InterruptedException{
        Thread.sleep(3000);
        clickSortOption.click();
    }
     //validate journos are sorted by direction arrows
    public void validateJournoSortDirection() throws InterruptedException{
        Thread.sleep(3000);
        validateSortDirectionJourno.isDisplayed();
    }
    //validate contact details are available for the journo
    public void validateContactDetails() throws InterruptedException{
        Thread.sleep(3000);
        validateContactDetailsInOutletPage.isDisplayed();
    }
    //choose and click journo link
    public void chooseAndClickJournoLink()throws InterruptedException {
        Thread.sleep(3000);
        clickJournoLink.click();
    }
    //validate journo link navigates to journo page
    public void validateJournoLinkRedirectsToJournoPage()throws InterruptedException {
        Thread.sleep(3000);
        validateJournoProfileFromOutletPage.isDisplayed();
    }
     //click PR Opportunity tab
    public void setClickPROpportunityTab() throws InterruptedException{
        Thread.sleep(3000);
        clickPROpportunityTab.click();
    }
    //click section home interest
    public void setClickSectionHomeInterest() throws InterruptedException{
        Thread.sleep(3000);
        clickHomeInterestSection.click();
    }
    //validate section filter results
    public void validateSectionFilterSearchResult() throws InterruptedException{
        Thread.sleep(3000);
        validatePROpportunitySectionSearch.isDisplayed();
    }
    //click list view button
    public void setClickListViewBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickListViewBtn.click();
    }
    //validate results in list view
    public void setValidateResultsInListView() throws InterruptedException{
        Thread.sleep(3000);
        validateResultsInListview.isDisplayed();
    }
    //changing page numbers by right hand side arrows
    public void setClickRightSideArrowToChangePageNumber() throws InterruptedException{
        Thread.sleep(3000);
        clickRightArrowToSelectPageNumber.click();
    }
    //clicking page numbers
    public void setClickPageNumber() throws InterruptedException{
        Thread.sleep(3000);
        clickPageNumber.click();
    }
    //validate page numbers
    public void validateJournoByPageNumber() throws InterruptedException{
        Thread.sleep(3000);
        validatePageNumberListingJourno.isDisplayed();
    }
    //validating chosen desk by checking BBC children check box is selected
    public void validateDeskProfileChosenDeskCheckBoxTicked() throws InterruptedException{
        Thread.sleep(3000);
        validateDeskProfileCheckBoxTicked.isDisplayed();
    }
}
