package pageObjects;

import org.junit.Assert;
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
    @FindBy(xpath="//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/nav/div[2]/a")
    public WebElement validateTwitter;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[1]/button[1]")
    public WebElement logInAsUserBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[3]/div/div/div[3]/div[2]/form/div[2]/div/div/input")
    public WebElement enterUserNameToLogInAs;
    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]//span[text() = 'srichmond@akingump.com']")
    public WebElement clickOnUsername;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[3]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickOkBtnLogIn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[1]/button[1]")
    public WebElement logOutAsUser;

    public void validateAllHeaderTabs()
    {
        Assert.assertTrue(validateLiveContent.isDisplayed());
    }
    public void validateCoverageTab()
    {
        clkcoverage.click();
        Assert.assertTrue(validateCoverage.isDisplayed());
    }
    public void validateHeadlinesTab()
    {
        clkHeadline.click();
        Assert.assertTrue(validateHeadlines.isDisplayed());
    }
    public void validateTwitterTab()
    {
        clkTwitter.click();
        Assert.assertTrue(validateTwitter.isDisplayed());
    }
    public void clickLogInUserButton(){
        logInAsUserBtn.click();
    }
    public void setEnterUserNameToLogInAs(String customerName)
    {
        enterUserNameToLogInAs.sendKeys(customerName);
        action.pause(Duration.ofSeconds(2));
        action.build().perform();
        clickOnUsername.click();
    }
   public void setClickOkBtnLogIn()
    {
        clickOkBtnLogIn.click();
    }
    public void setLogOutAsUser()
    {
        logOutAsUser.click();
    }
}
