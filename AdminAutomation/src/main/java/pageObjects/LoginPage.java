package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonFunctions{
    @FindBy(id = "login_username")
    public WebElement UsrTxt;
    @FindBy(id = "login_password")
    public WebElement passTxt;
    @FindBy(id = "login_submit")
    public WebElement loginBtn;
    @FindBy(xpath = "//img[@class=\"logo\"]")
    public WebElement validateLoginToAdminPage;


    /* initialising web driver*/
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /* enter valid username*/
    public void setUserName()throws Exception {
        UsrTxt.sendKeys(readPropertyFile("UserName"));
    }

    /* enter valid password*/
    public void setPassword()throws Exception {
        passTxt.sendKeys(readPropertyFile("Password"));
    }

    /* logging to the application*/
    public void clickLgnBtn() {
        loginBtn.click();
    }
    /* validating login functionality*/
    public void setValidateLoginToAdminPage() throws InterruptedException
    {
        Thread.sleep(3000);
        validateLoginToAdminPage.isDisplayed();
        Thread.sleep(6000);
        validateLoginToAdminPage.click();
    }
}
