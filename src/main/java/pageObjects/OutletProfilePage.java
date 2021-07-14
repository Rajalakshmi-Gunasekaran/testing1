package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutletProfilePage
{
    public OutletProfilePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/small")
    public WebElement validateDesk;
    @FindBy(css = ".contact-details")
    public WebElement validateContact;
    @FindBy(css = ".short-note.my-2")
    public WebElement validateRoxhillSays;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div/div[4]/div[1]")
    public WebElement validateSectors;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[1]")
    public WebElement validateIAbout;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[2]")
    public WebElement validateTwitterTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[3]")
    public WebElement validateJournalistTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[4]")
    public WebElement validateHeadlinesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[5]")
    public WebElement validateActivitiesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[6]")
    public WebElement validateAlertsTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[1]/nav/div[2]/nav/a[7]")
    public WebElement validatePROpportunityTab;

    public void validateDeskDisplay()
    {
        Assert.assertTrue(validateDesk.isDisplayed());
    }
    public void validateJournoDisplay()
    {
        Assert.assertTrue(validateContact.isDisplayed());
        Assert.assertTrue(validateRoxhillSays.isDisplayed());
        Assert.assertTrue(validateSectors.isDisplayed());
    }
    public void validateAllTabsINOutlet()
    {
        Assert.assertTrue(validateIAbout.isDisplayed());
        Assert.assertTrue(validateTwitterTab.isDisplayed());
        Assert.assertTrue(validateJournalistTab.isDisplayed());
        Assert.assertTrue(validateHeadlinesTab.isDisplayed());
        Assert.assertTrue(validateActivitiesTab.isDisplayed());
        Assert.assertTrue(validateAlertsTab.isDisplayed());
        Assert.assertTrue(validatePROpportunityTab.isDisplayed());
    }
}
