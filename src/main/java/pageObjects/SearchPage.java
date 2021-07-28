package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SearchPage {
    public WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div/div/input")
    public WebElement clkQuickSearch;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/nav/div[2]/div/div/input")
    public WebElement quickSearch;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/ul/li[1]/div[2]/div[1]/div[1]/a")
    public WebElement JournalistName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/img")
    public WebElement validateJournoProfile;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div/div/ul/li[1]/a")
    public WebElement DeskName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div[2]/ul/li[4]/div/div")
    public WebElement validateDeskProfile;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div/ul/li[1]/div[2]/div[1]/a")
    public WebElement OutletName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[2]/div/div")
    public WebElement validateOutletProfile;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div/div/ul/li[1]/div[2]/div[1]/a")
    public WebElement CompanyName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[1]/div/div[2]/div[1]/div")
    public WebElement validateCompanyProfile;

    //click quick search on home page
    public void setClkQuickSearch() {
        clkQuickSearch.click();
    }

    //enter journo name on text area
    public void enterSearchJourno(String Journo) {
        quickSearch.sendKeys(Journo);
    }

    //select the journalist from the list and click on it
    public void chooseJournalist() {
        JournalistName.click();
    }

    //go to journo profile page and validate to see whether land on the right page or not
    public void goToJournoProfile() {

        Assert.assertTrue(validateJournoProfile.isDisplayed());
    }

    //enter desk name on text area
    public void enterSearchDesk(String Desk) {
        quickSearch.sendKeys(Desk);
    }

    //select the journalist from the list and click on it
    public void chooseDesk() {
        DeskName.click();
    }

    //go to desk profile page and validate to see whether land on the right page or not
    public void goToDeskProfile() {

        Assert.assertTrue(validateDeskProfile.isDisplayed());
    }

    //enter outlet name on text area
    public void enterSearchOutlet(String Outlet) {
        quickSearch.sendKeys(Outlet);
    }

    //select the outlet from the list and click on it
    public void chooseOutlet() {
        OutletName.click();
    }

    //go to outlet profile page and validate to see whether land on the right page or not
    public void goToOutletProfile() {

        Assert.assertTrue(validateOutletProfile.isDisplayed());
    }

    //enter company name on text area
    public void enterSearchCompany(String Company) {
        quickSearch.sendKeys(Company);
    }

    //select the company from the list and click on it
    public void chooseCompany() {
        CompanyName.click();
    }

    //go to company profile page and validate to see whether land on the right page or not
    public void goToCompanyProfile() {

        Assert.assertTrue(validateCompanyProfile.isDisplayed());
    }

}

