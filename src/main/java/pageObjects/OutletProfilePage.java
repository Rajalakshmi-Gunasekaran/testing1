package pageObjects;

import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutletProfilePage {
    public OutletProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/small")
    public WebElement validateDesk;
    @FindBy(css = ".contact-details")
    public WebElement validateContact;
    @FindBy(css = ".short-note.my-2")
    public WebElement validateRoxhillSays;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div/div[4]/div[1]")
    public WebElement validateSectors;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[1]")
    public WebElement validateIAbout;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[2]")
    public WebElement validateTwitterTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[3]")
    public WebElement validateJournalistTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[4]")
    public WebElement validateHeadlinesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[5]")
    public WebElement validateActivitiesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[6]")
    public WebElement validateAlertsTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[7]")
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
        @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/nav[1]/div[5]/span/button")
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
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[6]")
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
/*validate all tabs in outlet profile*/
    public void validateAllTabsINOutlet() {
        Assert.assertTrue(validateIAbout.isDisplayed());
        Assert.assertTrue(validateTwitterTab.isDisplayed());
        Assert.assertTrue(validateJournalistTab.isDisplayed());
        Assert.assertTrue(validateHeadlinesTab.isDisplayed());
        Assert.assertTrue(validateActivitiesTab.isDisplayed());
        Assert.assertTrue(validateAlertsTab.isDisplayed());
        Assert.assertTrue(validatePROpportunityTab.isDisplayed());
    }

    public void chooseJournoToAddActivity() throws InterruptedException{
        Thread.sleep(3000);
        chooseJournoToAddActivity.click();
    }

    public void setClickAddActivity() throws InterruptedException{
        Thread.sleep(3000);
        clickAddActivityForAllBtn.click();
    }
    public void setEnterSubjectForActivity(String enterSubject) throws InterruptedException{
        Thread.sleep(3000);
        enterSubjectFieldInActivity.sendKeys(enterSubject);
    }
    public void setClickSaveBtn()throws InterruptedException {
        Thread.sleep(3000);
        clickSaveActivity.click();
    }

    public void setClickActivityTab() throws InterruptedException{
        Thread.sleep(3000);
        clickOnActivitiesTab.click();
    }

    public void validateActivityForJourno() throws InterruptedException{
        Thread.sleep(3000);
        validateActivityCreatedForJourno.isDisplayed();
    }

    public void setClickDeleteActivity() throws InterruptedException{
        Thread.sleep(3000);
        deleteActivity.click();
        Thread.sleep(3000);
        confirmDeleteActivity.click();
    }

    public void chooseDeskForJournos()throws InterruptedException {
        Thread.sleep(3000);
        chooseDesk.click();
    }

    public void validateJournoForChosenDesk() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoForChosenDesk.isDisplayed();
    }

    public void setClickClearAll() throws InterruptedException{
        Thread.sleep(3000);
        clickClearAllDesk.click();
    }

    public void validateAllJournosForAllDesks() throws InterruptedException{
        Thread.sleep(3000);
        validateAllJournosAfterClearAllDesk.isDisplayed();
    }

    public void setClickHide() throws InterruptedException{
        Thread.sleep(3000);
        clickHideBtn.click();
    }

    public void validateHideJourno()throws InterruptedException {
        Thread.sleep(3000);
        validateHideJourno.isDisplayed();
    }

    public void setClickUnhide() throws InterruptedException{
        Thread.sleep(3000);
        clickUnHideJournoBtn.click();
    }

    public void validateUnHideJourno() throws InterruptedException{
        Thread.sleep(3000);
        validateUnHideJourno.isDisplayed();
    }

    public void setClickSelectInGroup()throws InterruptedException {
        Thread.sleep(3000);
        clickSelectAllInGroupBtn.click();
    }

    public void validateJournoSelectInGroup()throws InterruptedException {
        Thread.sleep(3000);
        validateJournoSelectedInGroup.isDisplayed();
    }

    public void setClickDesselectJourno()throws InterruptedException {
        Thread.sleep(3000);
        clickDeSelectAllInGroupBtn.click();
    }

    public void validateJournoDeselect() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoDeSelectedInGroup.isDisplayed();
    }

    public void setClickAddToFavouritesBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickAddToFavouriteBtn.click();
    }

    public void setClickHomeBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickHomeBtn.click();
    }

    public void setClickFavouritesOutletTab()throws InterruptedException {
        Thread.sleep(3000);
        clickOutletFavouritesTab.click();
    }

    public void validateOutletAddedToFavourites() throws InterruptedException{
        Thread.sleep(3000);
        validateOutletFavourites.isDisplayed();
    }

    public void setClickOnSectorInJournoTile() throws InterruptedException{
        Thread.sleep(3000);
        clickSectorLink.click();
    }

    public void validateSectorResultsInJournoTile()throws InterruptedException {
        Thread.sleep(3000);
        validateSectorLinkResult.isDisplayed();
    }

    public void setClickCoverage() throws InterruptedException{
        Thread.sleep(3000);
        clickCoverageLink.click();
    }

    public void setValidateCoverageLinkResult() throws InterruptedException{
    Thread.sleep(3000);
    validateCoverageLinkResult.isDisplayed();
    }

    public void setClickTweetInJournotile() throws InterruptedException{
        Thread.sleep(3000);
        clickTweetLink.click();
    }

    public void setValidateTweetLinkResult() throws InterruptedException{
    Thread.sleep(3000);
    validateTweetLinkResult.isDisplayed();
    }

    public void setClickInstagramInJournoTile() throws InterruptedException{
        Thread.sleep(3000);
        clickInstagramLink.click();
    }

    public void setValidateInstagramResults() throws InterruptedException{
        Thread.sleep(3000);
        validateInstagramResult.isDisplayed();
    }

    public void setClickAlertsTab() throws InterruptedException{
        Thread.sleep(3000);
        clickAlertsTabs.click();
    }

    public void setEnterQuickFindByKeyword(String keyword) throws InterruptedException{
        Thread.sleep(3000);
        enterQuickFindByKeyword.sendKeys(keyword);
    }

    public void validateKeywordSearchResult() throws InterruptedException{
    Thread.sleep(3000);
    validateQuickFindByKeywordResult.isDisplayed();
    }

    public void setEnterSearchByNameJournoSearch(String searchName) throws InterruptedException{
        Thread.sleep(3000);
        enterSearchByNameTextField.sendKeys(searchName);
    }

    public void validateSearchByNameJournoResult()throws InterruptedException {
        Thread.sleep(3000);
        validateSearchByNameResults.isDisplayed();
    }

    public void setClickGroupByButton()throws InterruptedException {
        Thread.sleep(3000);
        clickGroupBy.click();
    }

    public void setClickUnGroupOption() throws InterruptedException{
        Thread.sleep(3000);
        clickUnGroupOption.click();
    }

    public void validateUnGroupresults() throws InterruptedException{
        Thread.sleep(3000);
        validateGroupBy.isDisplayed();
    }

    public void setClickSortDirection() throws InterruptedException{
        Thread.sleep(3000);
        clickSortOption.click();
    }

    public void validateJournoSortDirection() throws InterruptedException{
        Thread.sleep(3000);
        validateSortDirectionJourno.isDisplayed();
    }

    public void validateContactDetails() throws InterruptedException{
        Thread.sleep(3000);
        validateContactDetailsInOutletPage.isDisplayed();
    }

    public void chooseAndClickJournoLink()throws InterruptedException {
        Thread.sleep(3000);
        clickJournoLink.click();
    }

    public void validateJournoLinkRedirectsToJournoPage()throws InterruptedException {
        Thread.sleep(3000);
        validateJournoProfileFromOutletPage.isDisplayed();
    }

    public void setClickPROpportunityTab() throws InterruptedException{
        Thread.sleep(3000);
        clickPROpportunityTab.click();
    }

    public void setClickSectionHomeInterest() throws InterruptedException{
        Thread.sleep(3000);
        clickHomeInterestSection.click();
    }

    public void validateSectionFilterSearchResult() throws InterruptedException{
        Thread.sleep(3000);
        validatePROpportunitySectionSearch.isDisplayed();
    }
}
