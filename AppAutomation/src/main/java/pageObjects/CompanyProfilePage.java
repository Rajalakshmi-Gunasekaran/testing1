package pageObjects;

import cucumber.api.java.ca.I;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.ThreadLocalRandom;

public class CompanyProfilePage extends CommonFunctions{
    public WebDriver driver;
    public Actions action;

    public CompanyProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div/div/ul/li[1]/div[2]/div[1]/a/span")
    public WebElement chooseAndClickCompany;
    @FindBy(xpath ="//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div[1]" )
    public WebElement validateCompanyLogo;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div[3]/blockquote/em")
    public WebElement validateCompanyDesc;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div[2]")
    public WebElement validateCompanyContact;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div[4]/ul/li/div/p[1]")
    public WebElement validateCompanySector;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[2]")
    public WebElement clickHeadlinesTabs;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]")
    public WebElement validateHeadlinesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]")
    public WebElement validateCoverageTab;
    @FindBy(xpath = "//a[contains(text(),\" Smartphones News & Reviews \")]")
    public WebElement chooseAndClickTopic;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div")
    public WebElement validateTopicResults;
    @FindBy(xpath = "//button[contains(text(),\" Back \")]")
    public WebElement clkBackBtn;
    @FindBy(xpath = "//*[@id=\"companyCoverageTimeframeSelect\"]")
    public WebElement clickTimeFrame;
    @FindBy(xpath = "//*[@id=\"companyCoverageTimeframeSelect\"]/option[2]")
    public WebElement chooseTimeFrame;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/canvas")
    public WebElement validateTopicCoverageForSelectedTimeframe;
    @FindBy(xpath = "//span[contains(text(),\" Add to streams \")]")
    public WebElement clkAddToStreamsBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[3]/div/div/div/div/div[3]/div[2]/form/div[2]/div/div/input")
    public WebElement enterStreamName;
    @FindBy(xpath = "//button[contains(text(),\" Ok\")]")
    public WebElement clkOkBtn;
    @FindBy(xpath = "//span[contains(text(),\"Streams\")]")
    public WebElement clkStreamsTab;
    @FindBy(xpath = "//strong[contains(text(),\"companyStreams\")]")
    public WebElement clkOnCompanyStreams;
    @FindBy(xpath = "//span[contains(text(),\"Delete\")]")
    public WebElement clkDeleteBtnInStreams;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span/div/div[2]/div[1]")
    public WebElement clkConfirmDeleteBtnInStreams;
    @FindBy(xpath = "//button[contains(text(),\" View all \")]")
    public WebElement clkViewAllBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/canvas")
    public WebElement validateViewAllTopic;
    @FindBy(xpath = "//a[contains(text(),\" Sean Keach \")]")
    public WebElement clkJourno;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]")
    public WebElement validateJournoArticles;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/button")
    public WebElement clkBackBtnInRightsidePan;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/canvas")
    public WebElement validateJournoChartView;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div/h6/a")
    public WebElement journoNameLink;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div")
    public WebElement validateNavigateToJournoProfile;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/p/small")
    public WebElement chooseAndClkJournoForStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[2]/div[3]/span/button/span/i")
    public WebElement clkAddJournoToStreamBtnInHeadlinesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[2]/div[3]/div/div/div/div[3]/div[2]/form/div[2]/div/div/input")
    public WebElement enterNameToAddJournoToStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[2]/div[3]/div/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clkOkToCreateStreamFromHeadlines;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[2]/div[4]/span/button")
    public WebElement clkAddJournoToListBtn;
    @FindBy(xpath = "//input[@class=\"form-control empty\"]")
    public WebElement enterListNameFromHeadlinesTab;
    @FindBy(xpath = " //button[contains(text(),\"Ok \")]")
    public WebElement clkOkBtnToCreateListFromHeadlinesTab;
    @FindBy(xpath = "//span[contains(text(),\"Lists\")]")
    public WebElement clkListsTab;
    @FindBy(xpath = "//a[contains(text(),\" companyLists \")]")
    public WebElement chooseAndClkOnCompanyList;
    @FindBy(xpath = "//span[contains(text(),\" Delete list \")]")
    public WebElement clkDeleteBtnInLists;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div[1]/div[1]/nav/div[4]/span/div/div[2]/div[1]")
    public WebElement clkConfirmDeleteBtnInLists;


     public void setValidateCompanyLogo()throws InterruptedException
     {
         Thread.sleep(3000);
         validateCompanyLogo.isDisplayed();
     }
    public void setValidateCompanyDesc()throws InterruptedException
    {
        Thread.sleep(3000);
        validateCompanyDesc.isDisplayed();
    }
    public void setValidateCompanyContact()throws InterruptedException{
        Thread.sleep(3000);
        validateCompanyContact.isDisplayed();
    }
    public void setValidateCompanySector()throws InterruptedException{
        Thread.sleep(3000);
        validateCompanySector.isDisplayed();
    }
    public void setChooseAndClickCompany()throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickCompany.click();
    }

    public void setClickHeadlinesTabs()throws InterruptedException{
        Thread.sleep(3000);
        clickHeadlinesTabs.click();
    }
    public void setValidateHeadlinesTab()throws InterruptedException{
        Thread.sleep(3000);
        validateHeadlinesTab.isDisplayed();
    }
    public void setValidateCoverageTab() throws InterruptedException{
        Thread.sleep(3000);
        validateCoverageTab.isDisplayed();
    }

    public void setChooseAndClickTopic() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickTopic.click();
        Thread.sleep(3000);
        validateTopicResults.isDisplayed();
    }
    public void setClickBackBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkBackBtn.click();
    }
    public void setValidateBackToTopicChart() throws InterruptedException{
        Thread.sleep(3000);
        validateCoverageTab.isDisplayed();
    }

    public void setChangeTimeframe() throws InterruptedException{
        Thread.sleep(3000);
        clickTimeFrame.click();
        Thread.sleep(3000);
        chooseTimeFrame.click();
    }

    public void setValidateFilteredResultsTopicCoverage() throws InterruptedException{
        Thread.sleep(3000);
        validateTopicCoverageForSelectedTimeframe.isDisplayed();
    }

    public void setClickAddToStreams() throws InterruptedException{
        Thread.sleep(3000);
        clkAddToStreamsBtn.click();
    }

    public void setEnterStreamName(String streamName) throws InterruptedException{
        Thread.sleep(3000);
        enterStreamName.sendKeys(streamName);
        enterStreamName.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        clkOkBtn.click();
    }

    public void setClickOnStreamsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkStreamsTab.click();
    }

    public void setChooseAndClickCompanyStream() throws InterruptedException{
        Thread.sleep(3000);
        clkOnCompanyStreams.click();
    }

    public void setDeleteStream() throws InterruptedException{
        Thread.sleep(3000);
        clkDeleteBtnInStreams.click();
        Thread.sleep(3000);
        clkConfirmDeleteBtnInStreams.click();
    }

    public void setClickViewAllBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkViewAllBtn.click();
    }

    public void setValidateViewAllTopics()throws InterruptedException {
        Thread.sleep(3000);
        validateViewAllTopic.isDisplayed();
    }

    public void setChooseAndClickJourno() throws InterruptedException{
        Thread.sleep(3000);
        clkJourno.click();
        Thread.sleep(3000);
        validateJournoArticles.isDisplayed();
    }

    public void setClickBackBtnInRightHandSideJourno() throws InterruptedException {
        Thread.sleep(3000);
        clkBackBtnInRightsidePan.click();
    }

    public void setValidateJournoChartView() throws InterruptedException{
       Thread.sleep(3000);
       validateJournoChartView.isDisplayed();
    }

    public void setClickJournoLink() throws InterruptedException{
         Thread.sleep(3000);
          journoNameLink.click();
    }

    public void setValidateNavigateToJournoProfile() throws InterruptedException{
         Thread.sleep(3000);
         validateNavigateToJournoProfile.isDisplayed();
    }

    public void setChooseAndClickJournoInHeadlines() throws InterruptedException{
         Thread.sleep(3000);
         chooseAndClkJournoForStream.click();
    }

    public void setClickAddJournoToStream()throws InterruptedException {
         Thread.sleep(3000);
         clkAddJournoToStreamBtnInHeadlinesTab.click();
    }

    public void setEnterStreamNameToAddJourno(String streamName) throws InterruptedException{
         Thread.sleep(3000);
         enterNameToAddJournoToStream.sendKeys(streamName);
         enterNameToAddJournoToStream.sendKeys(Keys.ENTER);
         Thread.sleep(3000);
         clkOkToCreateStreamFromHeadlines.click();
    }

    public void setClickAddJournoToList() throws InterruptedException{
         Thread.sleep(2);
         clkAddJournoToListBtn.click();
    }
    public void setEnterListNameToAddJournoFromHeadlinesTab(String listName)throws InterruptedException {
         Thread.sleep(3000);
         enterListNameFromHeadlinesTab.sendKeys(listName);
         enterListNameFromHeadlinesTab.sendKeys(Keys.ENTER);
    }

    public void setClickOkBtn() throws InterruptedException{
         Thread.sleep(3000);
         clkOkBtnToCreateListFromHeadlinesTab.click();
    }

    public void setClickOnListsTab() throws InterruptedException{
         Thread.sleep(3000);
         clkListsTab.click();
    }

    public void setClickCompanyListInListsPage() throws InterruptedException{
         Thread.sleep(3000);
         chooseAndClkOnCompanyList.click();
    }

    public void setDeleteList() throws InterruptedException{
         Thread.sleep(3000);
         clkDeleteBtnInLists.click();
         Thread.sleep(3000);
         clkConfirmDeleteBtnInLists.click();
    }


}