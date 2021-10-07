package pageObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[2]/div")
    public WebElement userprofile;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[3]/div/div/div/div[3]/span")
    public WebElement logout;
    @FindBy(id = "pinpoint-link-icon")
    public WebElement clickPinPointTab;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/a")
    public WebElement goBackBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/nav/div[2]/span")
    public WebElement validateGoBackBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[3]")
    public WebElement clkWebinarTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button/span/span")
    public WebElement clkSelectAll;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button[2]/span/span")
    public WebElement validateWebinarAlert;
    /*@FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[3]/ul")
    public WebElement clkJournoLink;*/
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[3]")
    public WebElement validateJournoLink;
    @FindBy(id = "btn-help-and-feedback")
    public WebElement clickHelpAndFeedbackButton;
    @FindBy(xpath = "//*[@id=\"TICKET.content-48dcc618-c24c-4632-95b3-32d98b36f850\"]")
    public WebElement enterDesc;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[4]/div/div/div[3]/div/div/div/div[1]/nav/button")
    public WebElement clickSendButton;
    @FindBy(xpath = "//*[@id=\"hubspot-feedback-form\"]/div")
    public WebElement validateHelpAndFeedback;



    /* Initialising Web driver*/
    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    /*  validating login with user profile logo*/
    public String getLoginToastMsg() {
        return userprofile.getText();
    }

    /*clicking on user profile to log out*/
    public void userProfile() {
        userprofile.click();
    }

    /*logout from the application*/
    public void logOut()throws InterruptedException {
        Thread.sleep(3000);
        logout.click();
    }

   /*go to pin point tab in order to check go back button*/
    public void setPinpointTab()throws InterruptedException {
        Thread.sleep(3000);
        clickPinPointTab.click();
    }

    /*clicking go back button*/
    public void setGoBackBtn()throws InterruptedException {
        Thread.sleep(3000);
        goBackBtn.click();
    }

    /*validating go back button with highlight displayed on home page which is unique for home page*/
    public void setValidateGoBackBtn() {
        Assert.assertTrue(validateGoBackBtn.isDisplayed());
    }

    /* click on webinar alerts tab*/
    public void clickWebinar()throws InterruptedException {
        Thread.sleep(3000);
        clkWebinarTab.click();
    }

    public void clickSelectAll()throws InterruptedException {
        Thread.sleep(3000);
        clkSelectAll.click();
    }

    public void setValidateWebinarAlert() throws InterruptedException{
Thread.sleep(3000);
        validateWebinarAlert.isDisplayed();
    }

    /*validating whether the sign up link navigating to the Roxhill site*/
    public void validateQuickLinks()throws InterruptedException {
        Thread.sleep(3000);
        validateJournoLink.isDisplayed();
    }

    /*Validating help and feedback functionality*/
    public void clickHelpAndFeedback()throws InterruptedException {
        Thread.sleep(3000);
        clickHelpAndFeedbackButton.click();
    }

    public void setEnterDesc(String desc)throws InterruptedException {
        Thread.sleep(3000);
        enterDesc.sendKeys(desc);
    }

    public void setClickSendButton()throws InterruptedException {
        Thread.sleep(3000);
        clickSendButton.click();
    }

    public void setValidateHelpAndFeedback()throws InterruptedException {
        Thread.sleep(3000);
        validateHelpAndFeedback.isDisplayed();
    }
}
