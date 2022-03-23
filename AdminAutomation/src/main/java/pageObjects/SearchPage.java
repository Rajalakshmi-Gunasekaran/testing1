package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SearchPage extends CommonFunctions{
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
    @FindBy(xpath = "//div[@class=\"journalist-main d-flex p-3\"]")
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
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/ul/li[1]/div[2]")
    public WebElement mouseHoverOverToAddList;
    @FindBy(xpath = "//button[contains(text(),\" Add to list \")]")
    public WebElement clickAddToListLink;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/ul/div/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterQuickSearchListNameToCreate;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/ul/div/div/div/div/div[3]/div[2]/form/div[3]/button/i")
    public WebElement clickOkToCreateQuickSearchList;
    @FindBy(xpath = "//i[@class=\"close-cross icon-cross p-3\"]")
    public WebElement clickCloseQuickSearchBar;


    //click quick search on home page
    public void setClkQuickSearch() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clkQuickSearch,driver);
        clkQuickSearch.click();
    }

    //enter journo name on text area
    public void enterSearchJourno(String Journo)throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(quickSearch,driver);
        quickSearch.sendKeys(Journo);
    }

    //select the journalist from the list and click on it
    public void chooseJournalist() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(JournalistName,driver);
        JournalistName.click();
    }

    //go to journo profile page and validate to see whether land on the right page or not
    public void goToJournoProfile() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(validateJournoProfile.isDisplayed());
    }

    //enter desk name on text area
    public void enterSearchDesk(String Desk) throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(quickSearch,driver);
        quickSearch.sendKeys(Desk);
    }

    //select the journalist from the list and click on it
    public void chooseDesk() throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(DeskName,driver);
        DeskName.click();
    }

    //go to desk profile page and validate to see whether land on the right page or not
    public void goToDeskProfile() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(validateDeskProfile.isDisplayed());
    }

    //enter outlet name on text area
    public void enterSearchOutlet(String Outlet) throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(quickSearch,driver);
        quickSearch.sendKeys(Outlet);
    }

    //select the outlet from the list and click on it
    public void chooseOutlet() throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(OutletName,driver);
        OutletName.click();
    }

    //go to outlet profile page and validate to see whether land on the right page or not
    public void goToOutletProfile() throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(validateOutletProfile,driver);
        Assert.assertTrue(validateOutletProfile.isDisplayed());
    }

    //enter company name on text area
    public void enterSearchCompany(String Company) throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(quickSearch,driver);
        quickSearch.sendKeys(Company);
    }

    //select the company from the list and click on it
    public void chooseCompany() throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(CompanyName,driver);
        CompanyName.click();
    }

    //go to company profile page and validate to see whether land on the right page or not
    public void goToCompanyProfile() throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(validateCompanyProfile,driver);
        Assert.assertTrue(validateCompanyProfile.isDisplayed());
    }
    //Creating object of an Actions class and Performing the mouse hover action on the target element.
    public void setClickAddToList()throws InterruptedException{
       Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.moveToElement(mouseHoverOverToAddList).perform();
        Thread.sleep(3000);
        clickAddToListLink.click();
    }
    public void setEnterQuickSearchListNameToCreate(String quickSearchListName)throws InterruptedException{
        Thread.sleep(3000);
        enterQuickSearchListNameToCreate.sendKeys(quickSearchListName);
        enterQuickSearchListNameToCreate.sendKeys(Keys.ENTER);

    }
    //click ok to create new list
    public void setClickOkToCreateQuickSearchList()throws InterruptedException{
        Thread.sleep(3000);
        clickOkToCreateQuickSearchList.click();
    }
    public void setCloseQuickSearchBar()throws InterruptedException {
        Thread.sleep(6000);
        clickCloseQuickSearchBar.click();
    }
}

