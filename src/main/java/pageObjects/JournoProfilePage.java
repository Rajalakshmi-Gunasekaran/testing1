package pageObjects;

import cucumber.api.java.cs.A;
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
    @FindBy(id = "doughnut-chart")
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


    public void validateAllHeaderTabs() {
        Assert.assertTrue(validateLiveContent.isDisplayed());
    }

    public void validateCoverageTab() {
        clkcoverage.click();
        Assert.assertTrue(validateCoverage.isDisplayed());
    }

    public void validateHeadlinesTab() {
        clkHeadline.click();
        Assert.assertTrue(validateHeadlines.isDisplayed());
    }

    public void validateTwitterTab() {
        clkTwitter.click();
        Assert.assertTrue(validateTwitter.isDisplayed());
    }

    public void validateACLJournalist() {
        Assert.assertTrue(validateACLJournalist.isDisplayed());
    }
}
