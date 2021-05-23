package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="login_username")
    public WebElement UsrTxt;

    @FindBy(id="login_password")
    public WebElement passTxt;

    @FindBy(id="login_submit")
    public WebElement loginBtn;
   /* initialising web driver*/
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
   /* enter valid username*/
    public void setUserName(String UserName)
    {
        UsrTxt.sendKeys(UserName);
    }
    /*enter valid password*/
    public void setPassword(String Password)
    {
        passTxt.sendKeys(Password);
    }
    /*logging to the application*/
    public void clickLgnBtn()
    {
        loginBtn.click();
    }
}
