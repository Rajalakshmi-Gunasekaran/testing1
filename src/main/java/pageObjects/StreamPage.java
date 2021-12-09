package pageObjects;

import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.cssSelector;

public class StreamPage extends CommonFunctions{
    public WebDriver driver;
    private Actions action;

    /*initialising web driver*/
    public StreamPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/ul/li[1]/a/span")
    public WebElement clkStreamLink;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[1]/a/div/span")
    public WebElement clickAllJournoMoves;
    @FindBy(css = ".d-inline-flex.align-items-center")
    public WebElement selectAll;
    @FindBy(xpath = "//span[@class='ml-1' and text()='50']")
    public WebElement selectedNumbers;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav/div[3]/button")
    public WebElement clickCreateStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div/input")
    public WebElement enterStreamName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreateButtonStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div[2]")
    public WebElement clickOnArticles;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[5]/div")
    public WebElement clickOutletType;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div/div/div/input")
    public WebElement clickOutlet;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/button[4]/i")
    public WebElement clickSaveButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[3]/nav/a[1]")
    public WebElement clickFeed;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/span")
    public WebElement validateStreamSetUp;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/nav/a")
    public WebElement clickEditStreamButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[4]/div/span")
    public WebElement clickTypeOfPublisher;
    @FindBy(id = "streamPublisherCriteriaJournalists")
    public WebElement chooseJournalist;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/i")
    public WebElement validateEditFunctionality;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[2]/span[2]/span/span/span/span/span/a/div")
    public WebElement chooseTestStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div/div/h5/i")
    public WebElement clickSearchStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/form/div/div/input")
    public WebElement enterStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span")
    public WebElement clickDeleteStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span/div/div[2]/div[1]/i")
    public WebElement clickConfirmDeletion;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/small")
    public WebElement validateDeletionStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div[1]/span/span/span/i")
    public WebElement clickJournoAlert;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div[6]/span/span/span/i")
    public WebElement clickForwardFeaturesAlert;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div[7]/span/span/span/i")
    public WebElement clickMediaRequestAlert;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[6]/div/span")
    public WebElement clickTopicTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div[3]/div/div/div[1]/div/div/input")
    public WebElement enterTopicSearchTerm;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]/div")
    public WebElement validateJournoAlerts;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/nav/div[2]/div[4]")
    public WebElement clickAddJournoToListBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/nav/div[2]/div[4]/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListNameToAddStreams;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/nav/div[2]/div[4]/div/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickOkBtnToCreateStreamList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div[3]")
    public WebElement clickTweetOption;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]")
    public WebElement validateTweetStreamsResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div[5]/div/div")
    public WebElement clickActivities;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[9]/div/span")
    public WebElement clickJournalists;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div[1]/div/div/input")
    public WebElement enterJournalistName;
    @FindBy(xpath = "//span[contains(text(),\"Simon English\")]")
    public WebElement chooseJournoFromDropDown;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div")
    public WebElement validateActivityStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div/div[2]/ul/li/div/a/strong")
    public WebElement validateActivityPreview;
    @FindBy(xpath = "//input[@class=\"search-input form-control form-control-sm\"]")
    public WebElement enterKeywordInQuickFindByKeyword;
    @FindBy(xpath = "//h5[contains(text(),\"testing\")]")
    public WebElement validateKeywordSearchInActivityStream;
    @FindBy(xpath = "//span[contains(text(),\"FunctionalTest\")]")
    public WebElement clickFunctionalTest;
    @FindBy(xpath = "//button[contains(text(),\" On homepage \")]")
    public WebElement clickOnHomePageChkBox;
    @FindBy(xpath = "//button[contains(text(),\" Save \")]")
    public WebElement clickSaveBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/button[2]/span")
    public WebElement clickDefaultHomepageBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[1]")
    public WebElement validateDefaultHomepageResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/button[2]/span/span")
    public WebElement clickUncheckDefaultHomepage;

    /*Validating All Journo moves functionality*/
    public void clkStreams()throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(clkStreamLink,driver);
        clkStreamLink.click();
    }
//click on all journo moves tab
    public void clickAllJournoMoves()throws InterruptedException{
        Thread.sleep(3000);
        clickAllJournoMoves.click();
    }
    /*click select all */
    public void clkSelectAll()throws InterruptedException
    {
        Thread.sleep(6000);
        selectAll.click();
    }
   /*validate all journo streams*/
    public String validateAllJournoStream()throws InterruptedException {
        Thread.sleep(6000);
        return selectedNumbers.getText();
    }
    /*Validating stream set up*/
    public void clkCreateStream() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clkStreamLink,driver);
        clickCreateStream.click();
    }
    /* enter stream name*/
    public void setEnterStreamName(String streamName) throws InterruptedException{
        Thread.sleep(3000);
        enterStreamName.sendKeys(streamName);
    }
    /* click create button to create stream*/
    public void setClickCreateButtonStream() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickCreateButtonStream,driver);
        clickCreateButtonStream.click();
    }
    /* click on articles*/
    public void setClickOnArticles() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickOnArticles,driver);
        clickOnArticles.click();
    }
    /*click outlet type*/
    public void setClickOutletType() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickOutletType,driver);
        clickOutletType.click();
    }
    /* choose outlet type*/
    public void chooseOutletType(String outlet) throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickOutlet,driver);
        clickOutlet.sendKeys(outlet, Keys.ENTER);
    }
    /* click save button*/
    public void setClickSaveButton() throws InterruptedException{
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", clickSaveButton);
        clickSaveButton.click();
    }
    /* validate stream set up*/
    public void setValidateStreamSetUp() throws InterruptedException{
        Thread.sleep(6000);
        clickFeed.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        Assert.assertTrue(validateStreamSetUp.isDisplayed());
    }
    /*Validating edit stream functionality*/
    public void chooseTestStream()
    {
        chooseTestStream.click();
    }
    /*click edit stream button*/
    public void setClickEditStreamButton() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickEditStreamButton,driver);
        clickEditStreamButton.click();
    }
/*click type of publisher*/
    public void setClickTypeOfPublisher() throws InterruptedException{
        Thread.sleep(6000);
        elementVisible(clickTypeOfPublisher,driver);
        clickTypeOfPublisher.click();
    }
/*choose journalist from the options*/
    public void setChooseJournalist() throws InterruptedException{
        Thread.sleep(6000);
        chooseJournalist.click();
    }
/*validate edit stream */
    public void validateEditStream()throws InterruptedException {
        Thread.sleep(6000);
        elementVisible(clickFeed,driver);
        clickFeed.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        Assert.assertTrue(validateEditFunctionality.isDisplayed());
    }
    /* Validating delete streams functionality*/
    public void setClickSearchStream() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickSearchStream,driver);
        clickSearchStream.click();
    }
    /* enter stream to delete*/
    public void setEnterStreamToDelete(String deleteStream) throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(enterStream,driver);
        enterStream.sendKeys(deleteStream);
    }
    /* click delete stream*/
    public void setClickDeleteStream() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickDeleteStream,driver);
        clickDeleteStream.click();
    }
    /* click confirm deletion*/
    public void setClickConfirmDeletion() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickConfirmDeletion,driver);
        clickConfirmDeletion.click();
    }
    /* validate stream delete*/
    public void setValidateStreamDeletion() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(validateDeletionStream,driver);
        Assert.assertTrue(validateDeletionStream.isDisplayed());
    }
    // click on journalist alerts, forward features and media requests
    public void setStreamForJournoAlerts()throws InterruptedException{
        Thread.sleep(3000);
        clickJournoAlert.click();
    }
    //click forward features to set up alerts
    public void setStreamForForwardFeaturesAlerts()throws InterruptedException{
        Thread.sleep(3000);
        clickForwardFeaturesAlert.click();
    }
    //click media request to set up alerts
    public void setStreamForMediaRequestsAlerts()throws InterruptedException{
        Thread.sleep(3000);
        clickMediaRequestAlert.click();
    }
    //click keyword tab
    public void setClickTopicTab()throws InterruptedException{
        Thread.sleep(3000);
        clickTopicTab.click();
    }
    //enter keyword search to search journalist alerts
    public void setEnterTopicSearchTerm(String keywordSearchTerm)throws InterruptedException{
        //Thread.sleep(3000);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterTopicSearchTerm.sendKeys(keywordSearchTerm);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterTopicSearchTerm.sendKeys(Keys.ENTER);
    }
    //validate journo alert stream
    public void validateJournoAlertStream() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoAlerts.isDisplayed();
    }
    //click on add journo to lists from streams
    public void clickAddJournoToListBtnFromStream()throws InterruptedException{
        Thread.sleep(6000);
       // elementClickable(clickAddJournoToListBtn,driver);
        clickAddJournoToListBtn.click();
    }
    //enter list name to add journos from streams
    public void setEnterListNameToAddStreams(String streamList)throws InterruptedException{
        Thread.sleep(6000);
        enterListNameToAddStreams.sendKeys(streamList);
        Thread.sleep(3000);
        enterListNameToAddStreams.sendKeys(Keys.ENTER);
    }
    //click ok to create list to add journos from stream
    public void setClickOkBtnToCreateStreamList()throws InterruptedException{
        Thread.sleep(6000);
        clickOkBtnToCreateStreamList.click();
    }
    //click on tweet option to set up stream
    public void clickOnTweetStream()throws InterruptedException{
        Thread.sleep(3000);
        clickTweetOption.click();
    }
    // validate tweet stream results
    public void validateTweetStreams() throws InterruptedException{
        Thread.sleep(3000);
        validateTweetStreamsResults.isDisplayed();
    }

    public void setClickActivities()throws InterruptedException {
        Thread.sleep(6000);
        clickActivities.click();
    }

    public void setClickJournalists() throws InterruptedException{
        Thread.sleep(6000);
        clickJournalists.click();
    }

    public void setEnterJournoName(String journoName) throws InterruptedException{
        Thread.sleep(6000);
        enterJournalistName.sendKeys(journoName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        chooseJournoFromDropDown.click();
    }

    public void validateActivitiesStream() throws InterruptedException{
        Thread.sleep(6000);
        validateActivityPreview.isDisplayed();
        Thread.sleep(6000);
        clickFeed.click();
        Thread.sleep(6000);
        validateActivityStream.isDisplayed();
    }
    public void setEnterKeywordInQuickFindByKeyword(String keyword) throws InterruptedException{
        Thread.sleep(3000);
        enterKeywordInQuickFindByKeyword.sendKeys(keyword);
    }

    public void validateKeywordSearchInActivityStream()throws InterruptedException {
        Thread.sleep(6000);
        validateKeywordSearchInActivityStream.click();
    }
    public void clickFunctionalTestStream() throws InterruptedException{
        Thread.sleep(3000);
        clickFunctionalTest.click();
    }

    public void ClickOnHomePageChkBox() throws InterruptedException{
        Thread.sleep(3000);
        clickOnHomePageChkBox.click();
    }

    public void clickSaveBtnInStream() throws InterruptedException{
        Thread.sleep(3000);
        clickSaveBtn.click();
    }

    public void clickDefaultHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clickDefaultHomepageBtn.click();
    }

    public void validateDefaultHomePage() throws InterruptedException{
        Thread.sleep(3000);
        validateDefaultHomepageResults.isDisplayed();
    }

    public void UncheckDefaultHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clickUncheckDefaultHomepage.click();
    }
}
