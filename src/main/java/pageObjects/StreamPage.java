package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.cssSelector;

public class StreamPage {
    public WebDriver driver;
    private Actions action;

    /*initialising web driver*/
    public StreamPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/ul/li[1]/a/span")
    public WebElement clkStreamLink;
    @FindBy(xpath = "//div[@class='name flex-grow-1 text-truncate mr-2'and text()='All Journo Moves']")
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
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/span[2]/span/span/span/span/span/a/div")
    public WebElement clickStreamFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span")
    public WebElement clickDeleteStream;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span/div/div[2]/div[1]/i")
    public WebElement clickConfirmDeletion;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/small")
    public WebElement validateDeletionStream;

    /*Validating All Journo moves functionality*/
    public void clkStreams() {
        clkStreamLink.click();
    }

    public void clkAllJournoMoves() {
        clickAllJournoMoves.click();
    }

    public void clkSelectAll() {
        selectAll.click();
    }

    public String validateAllJournoStream() {
        return selectedNumbers.getText();
    }

    /*Validating stream set up*/
    public void clkCreateStream() {
        clickCreateStream.click();
    }

    public void setEnterStreamName(String streamName) {
        enterStreamName.sendKeys(streamName);
    }

    public void setClickCreateButtonStream() {
        clickCreateButtonStream.click();
    }

    public void setClickOnArticles() {
        clickOnArticles.click();
    }

    public void setClickOutletType() {
        clickOutletType.click();
    }

    public void chooseOutletType(String outlet) {
        clickOutlet.sendKeys(outlet, Keys.ENTER);

    }

    public void setClickSaveButton() {
        clickSaveButton.click();
    }

    public void setValidateStreamSetUp() {
        clickFeed.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        Assert.assertTrue(validateStreamSetUp.isDisplayed());
    }

    /*Validating edit stream functionality*/
    public void chooseTestStream() {
        chooseTestStream.click();
    }

    public void setClickEditStreamButton() {
        clickEditStreamButton.click();
    }

    public void setClickTypeOfPublisher() {
        clickTypeOfPublisher.click();
    }

    public void setChooseJournalist() {
        chooseJournalist.click();
    }

    public void validateEditStream() {
        clickFeed.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        Assert.assertTrue(validateEditFunctionality.isDisplayed());
    }

    /* Validating delete streams functionality*/
    public void setClickSearchStream() {
        clickSearchStream.click();
    }

    public void setEnterStreamToDelete(String deleteStream) {
        enterStream.sendKeys(deleteStream);
    }

    public void setClickStreamFromList() {
        clickStreamFromList.click();
    }

    public void setClickDeleteStream() {
        clickDeleteStream.click();
    }

    public void setClickConfirmDeletion() {
        clickConfirmDeletion.click();
    }

    public void setValidateStreamDeletion() {
        Assert.assertTrue(validateDeletionStream.isDisplayed());
    }
}

