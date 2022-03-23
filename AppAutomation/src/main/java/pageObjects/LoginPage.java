package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonFunctions{
    @FindBy(id = "login_username")
    public WebElement UsrTxt;
    @FindBy(id = "login_password")
    public WebElement passTxt;
    @FindBy(id = "login_submit")
    public WebElement loginBtn;
    @FindBy(xpath = "/html/body/div/div/div[2]/a")
    public WebElement forgottenPasswordLink;
    @FindBy(xpath = "//*[@id=\"password_reset_email_username\"]")
    public WebElement enterEmail;
    @FindBy(xpath = "//*[@id=\"password_reset_email_submit\"]")
    public WebElement clickSendEmailButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]")
    public WebElement validateForgotPassword;
    @FindBy(xpath = "//a[@class=\"mt-1 d-flex align-items-center\"][contains(text(),\"User Settings\")]")
    public WebElement clickSettingsBtn;
    @FindBy(xpath = "")
    public WebElement chooseCountryDropDownBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/section[2]/div/div[1]/form/div[2]/div")
    public WebElement clickChooseCountry;
    @FindBy(xpath = "//button[@class=\"waiting-button ml-2 btn btn-sm btn-success d-flex align-items-center text-uppercase\"]")
    public WebElement clickSaveChangesBtn;

    /* initialising web driver*/
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /* enter valid username*/
    public void setUserName()throws Exception {
        UsrTxt.sendKeys(readPropertyFile("UserName"));
    }

    /*enter valid password*/
    public void setPassword()throws Exception {
        passTxt.sendKeys(readPropertyFile("Password"));
    }

    /*logging to the application*/
    public void clickLgnBtn() {
        loginBtn.click();
    }

    public void clickForgottenPassword() {
        forgottenPasswordLink.click();
    }

    public void setEnterEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void setClickSendEmailButton() {
        clickSendEmailButton.click();
    }

    public void setValidateForgotPassword() {
        validateForgotPassword.isDisplayed();
    }
    public void ClickUserSettings() {
        clickSettingsBtn.click();
    }

    public void chooseCountry() {
        clickChooseCountry.click();
    }

    public void saveChanges() {
        clickSaveChangesBtn.click();
    }
}
