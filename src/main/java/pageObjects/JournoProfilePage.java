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

public class JournoProfilePage {
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
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div[2]/ul/li/div")
    public WebElement clickRemoveFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/div")
    public WebElement validateJournoRemovalFromList;

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
}
