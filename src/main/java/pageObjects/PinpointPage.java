package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinpointPage {
    /*initialising web driver*/
    public PinpointPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "pinpoint-link-icon")
    public WebElement clkPinpoint;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[2]/div/div/div/div/input")
    public WebElement enterSearchTxt;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[3]/button")
    public WebElement validateViewMatches;
    /*clicking pinpoint tab from the header menu in home page*/
    public void clickPinpointTab()
    {
        clkPinpoint.click();
    }
    /*provide search text to produce the analytical view*/
    public void EnterTextPinpoint(String pinpointTxt)
    {
        enterSearchTxt.sendKeys(pinpointTxt);
        enterSearchTxt.sendKeys(Keys.ENTER);
    }
   /* validate the pinpoint page with*/
    public void validatePinpointPage()
    {
        Assert.assertTrue(validateViewMatches.isDisplayed());
    }
    }
