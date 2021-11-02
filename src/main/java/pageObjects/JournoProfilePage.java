package pageObjects;

import cucumber.api.java.cs.A;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class JournoProfilePage extends CommonFunctions {
    public WebDriver driver;
    public Actions action;

    public JournoProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".pr-2.icon-time-slot")
    public WebElement validateLiveContent;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[3]")
    public WebElement clkcoverage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]")
    public WebElement validateCoverage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[4]")
    public WebElement clkHeadline;
    @FindBy(css = ".slider-piecewises.position-absolute")
    public WebElement validateHeadlines;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[5]")
    public WebElement clkTwitter;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/nav/div[2]/a")
    public WebElement validateTwitter;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div/h3")
    public WebElement validateACLJournalist;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div")
    public WebElement clickOnAutomationList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[3]/button[2]")
    public WebElement clickOnSaveButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div[2]/ul/li[1]/div")
    public WebElement validateJournoAddedToList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[4]")
    public WebElement clickInListBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[1]/div/div[1]/input")
    public WebElement enterListNameToAdd;
    @FindBy(xpath = "//span[contains(text(),\"Remove all\")]")
    public WebElement clickRemoveFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div")
    public WebElement validateJournoRemovalFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[1]/span/span")
    public WebElement clickFavouriteJournoBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[1]/span/span")
    public WebElement unCheckFavouriteBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[2]/span")
    public WebElement clickGDPRNote;
    @FindBy(xpath = "//*[@id=\"addCustomerNoteFormSubject\"]")
    public WebElement enterSubjectForGDPR;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/form/div[3]/div/div[2]/span")
    public WebElement clickGDPRRadioBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[3]/button[2]")
    public WebElement clickSaveBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[2]")
    public WebElement validateGDPRNote;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/form/div[3]/div/div[1]")
    public WebElement clickGDPRUnknownRadioBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[2]/span")
    public WebElement ValidateGDPRUnknown;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[3]")
    public WebElement clickAddToStreams;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div")
    public WebElement clickStreamNameToAddJourno;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[3]/button[2]")
    public WebElement clickSaveBtnInStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[3]/span")
    public WebElement validateJournoAddedToStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div[2]/ul/li[1]/div")
    public WebElement clickRemoveJournoFromStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/nav/div[3]/button[3]/span")
    public WebElement validateJournoRemoval;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[8]")
    public WebElement clickNotesAndActivityTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/nav/div[2]/div[5]/button[2]")
    public WebElement clickAddActivityBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div/div[2]/form/div/div/div[2]/input")
    public WebElement enterSubject;
    @FindBy(xpath = "//button[@class=\"waiting-button btn btn-sm btn-primary ml-2\"]/i")
    public WebElement clickSaveButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[1]/div/div[1]/div/div[1]/div[1]/div")
    public WebElement validateActivity;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/nav/div[2]/div[5]/button[1]")
    public WebElement clickNotesBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[1]/div/div[1]/div[1]")
    public WebElement validateNotes;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[1]/div/div[1]/div/div[2]/div/span")
    public WebElement clickDeleteActivity;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[1]/div/div[1]/div/div[2]/div/span/div/div[2]/div[1]/i")
    public WebElement clickConfirmDelete;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[1]/div/div[1]/div[3]/div/span")
    public WebElement clickDeleteNotes;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[1]/div/div[1]/div[3]/div/span/div/div[2]/div[1]/i")
    public WebElement clickConfirmDeleteNotes;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/input")
    public WebElement clickCalender;
    @FindBy(xpath = "//button[@class=\"pika-next\"]")
    public WebElement chooseMonth;
    @FindBy(xpath = "//table[@class=\"pika-table\"]/tbody/tr[3]/td[1]")
    public WebElement chooseDate;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[4]/div/div[3]")
    public WebElement validateResultsForChosenDates;

    public void validateAllHeaderTabs() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(validateLiveContent.isDisplayed());
    }

    public void validateCoverageTab() throws InterruptedException{
        Thread.sleep(3000);
        clkcoverage.click();
        Thread.sleep(3000);
        Assert.assertTrue(validateCoverage.isDisplayed());
    }

    public void validateHeadlinesTab() throws InterruptedException {
        Thread.sleep(3000);
        clkHeadline.click();
        Thread.sleep(3000);
        Assert.assertTrue(validateHeadlines.isDisplayed());
    }

    public void validateTwitterTab() throws InterruptedException {
        Thread.sleep(3000);
        clkTwitter.click();
        Thread.sleep(3000);
        Assert.assertTrue(validateTwitter.isDisplayed());
    }

    public void validateACLJournalist() throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertTrue(validateACLJournalist.isDisplayed());
    }
    //click on In list button to add journo to lists
    public void setClickInListButton()throws InterruptedException{
        Thread.sleep(3000);
        clickInListBtn.click();
    }
    //enter list name to add journo
    public void setEnterListNameToAdd(String automationListName)throws InterruptedException{
        Thread.sleep(3000);
        enterListNameToAdd.sendKeys(automationListName);
    }
    //click on AutomationList to choose the list to add journo
    public void setClickOnAutomationList()throws InterruptedException{
        Thread.sleep(3000);
        clickOnAutomationList.click();
    }

    //validate journo added to list
    public void setValidateJournoAddedToList()throws InterruptedException{
        Thread.sleep(3000);
        validateJournoAddedToList.isDisplayed();
    }
    //click on remove journo from list
    public void setClickRemoveFromList()throws InterruptedException{
        Thread.sleep(3000);
        clickRemoveFromList.click();
    }
    //click on save button to add journo to the list
    public void setClickOnSaveButton()throws InterruptedException{
        Thread.sleep(3000);
        clickOnSaveButton.click();
    }
    //validate journo removed from list
    public void setValidateJournoRemovalFromList()throws InterruptedException{
        Thread.sleep(3000);
        validateJournoRemovalFromList.isDisplayed();
    }

    public void setClickFavouriteBtn()throws InterruptedException {
        Thread.sleep(3000);
        clickFavouriteJournoBtn.click();
    }
    public void setUnCheckFavouriteJournoBtn()throws InterruptedException{
      Thread.sleep(3000);
      unCheckFavouriteBtn.click();
    }

    public void setClickGDPRNote() throws InterruptedException{
        Thread.sleep(3000);
        clickGDPRNote.click();
    }

    public void enterSubjectInGDPRNote(String gdprSubject)throws InterruptedException {
        Thread.sleep(3000);
        enterSubjectForGDPR.sendKeys(gdprSubject);
    }

    public void setClickGDPRRadioBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickGDPRRadioBtn.click();
    }
    public void setClickSaveBtnInGDPR() throws InterruptedException{
        Thread.sleep(3000);
        clickSaveBtn.click();
    }
    public void validateGDPRNote() throws InterruptedException{
       Thread.sleep(3000);
       validateGDPRNote.isDisplayed();
    }

    public void setClickGDPRStatusUnknown() throws InterruptedException{
        Thread.sleep(3000);
        clickGDPRUnknownRadioBtn.click();
    }

    public void setValidateGDPRUnknown() throws InterruptedException{
        Thread.sleep(3000);
        ValidateGDPRUnknown.isDisplayed();
    }

    public void setClickAddToStreamsBtn()throws InterruptedException {
        Thread.sleep(3000);
        clickAddToStreams.click();
    }

    public void setClickStreamNameToAddJourno() throws InterruptedException{
        Thread.sleep(3000);
        clickStreamNameToAddJourno.click();
    }

    public void setClickSaveBtnInStream()throws InterruptedException {
        Thread.sleep(3000);
        clickSaveBtnInStream.click();
    }

    public void setValidateJournoAddedToStream() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoAddedToStream.isDisplayed();
    }

    public void setClickRemoveFromStream()throws InterruptedException {
        Thread.sleep(3000);
        clickRemoveJournoFromStream.click();
    }

    public void validateJournoRemovedFromStream() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoRemoval.isDisplayed();
    }

    public void setClickNotesAndActivityTab()throws InterruptedException {
        Thread.sleep(3000);
        clickNotesAndActivityTab.click();
    }

    public void setClickAddActivityBtn()throws InterruptedException {
        Thread.sleep(3000);
        clickAddActivityBtn.click();
    }

    public void enterSubject(String subject) throws InterruptedException{
        Thread.sleep(3000);
        enterSubject.sendKeys(subject);
    }
    public void setClickSaveBtnInNotesAndActivity() throws InterruptedException{
        Thread.sleep(3000);
        clickSaveButton.click();
    }
    public void validateActivityCreatedForJourno()throws InterruptedException {
        Thread.sleep(3000);
        validateActivity.isDisplayed();
    }

    public void setClickDeleteActivity() throws InterruptedException{
    Thread.sleep(3000);
    clickDeleteActivity.click();
    Thread.sleep(3000);
    clickConfirmDelete.click();
    }

    public void setClickNotesBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickNotesBtn.click();
    }

    public void validateNotesCreatedForJourno() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(validateNotes,driver);
        validateNotes.isDisplayed();
    }

    public void setClickDeleteNotes() throws InterruptedException{
        Thread.sleep(3000);
        clickDeleteNotes.click();
        Thread.sleep(3000);
        clickConfirmDeleteNotes.click();
    }

    public void setClickCalender() throws InterruptedException{
        Thread.sleep(3000);
        clickCalender.click();
    }

    public void setChooseDateToFilterCoverage() throws InterruptedException{
        Thread.sleep(3000);
        chooseMonth.click();
        chooseMonth.click();
        Thread.sleep(3000);
        chooseDate.click();
    }

    public void validateResultsForSelectedDates() throws InterruptedException{
        Thread.sleep(3000);
        validateResultsForChosenDates.isDisplayed();
    }
}
