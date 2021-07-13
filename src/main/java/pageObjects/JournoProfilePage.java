package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class JournoProfilePage {
    public WebDriver driver;
    public JournoProfilePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css= ".pr-2.icon-time-slot")
    public WebElement validateLiveContent;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[3]")
    public WebElement clkcoverage;
    @FindBy(id= "doughnut-chart")
    public WebElement validateCoverage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[4]")
    public WebElement clkHeadline;
    @FindBy(css= ".slider-piecewises.position-absolute")
    public WebElement validateHeadlines;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[1]/div/nav/div[5]")
    public WebElement clkTwitter;
    @FindBy(css= ".icon-hair-cross")
    public WebElement selectTwitter;
    @FindBy(xpath="//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/nav/div[3]/div[1]/button[2]/span/span")
    public WebElement validateTwitter;

    public void validateAllHeaderTabs() {
        Assert.assertTrue(validateLiveContent.isDisplayed());
    }
    public void validateCoverageTab(){
        clkcoverage.click();
        Assert.assertTrue(validateCoverage.isDisplayed());
    }
    public void validateHeadlinesTab(){
        clkHeadline.click();
        Assert.assertTrue(validateHeadlines.isDisplayed());
    }
    public void validateTwitterTab(){
        clkTwitter.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        selectTwitter.click();
        Assert.assertTrue(validateTwitter.isDisplayed());
    }
}
