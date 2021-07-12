package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AdvancedSearchPage {
    public WebDriver driver;
    private Actions action;

    public AdvancedSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-link-icon")
    public WebElement AdvancedSearchTab;
    /*@FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/i")
    public WebElement clickOutletDropdown;*/
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/input")
    public WebElement outletType;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div/input")
    public WebElement enterOutletName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div[1]")
    public WebElement validateOutletSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div/div")
    public WebElement clickOutlet;
    @FindBy(xpath = "//div[@class=\"dropdown b-dropdown btn-dropdown no-arrow btn-group\"]")
    public WebElement clickGroupByButton;
    @FindBy(xpath = "//*[contains(text(),'Country')]")
    public WebElement clickCountry;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div[1]/h5")
    public WebElement validateGroupBy;
    @FindBy(xpath = "//div[@class=\"position-absolute top-0 left-0 w-100 h-100\"]")
    public WebElement clickChangeInfoView;
    @FindBy(xpath = "//div[@class=\"dropdown b-dropdown journalist-tab-switch btn-dropdown show btn-group\"]/ul/li/a/*[contains(text(),\"Roxhill says\")]")
    public WebElement chooseInfoView;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/p/em")
    public WebElement validateInfoView;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/span/button/span/i")
    public WebElement clickCopyToList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickOk;

    public void clickAdvancedSearch()
    {
        AdvancedSearchTab.click();
    }

    public void enterOutletType(String outletTypeName)
    {
        outletType.sendKeys(outletTypeName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        outletType.sendKeys(Keys.ENTER);
    }

    public void enterOutletName(String outletName)
    {
        enterOutletName.sendKeys(outletName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterOutletName.sendKeys(Keys.ENTER);
    }

    public void setValidateOutletSearch()
    {

        validateOutletSearch.isDisplayed();
    }

/* add journalist to the list*/
    public void setClickCopyToList()
    {
        clickCopyToList.click();
    }

    /*enter list name to add journalist*/
    public void setEnterListName(String listName)
    {
        enterListName.sendKeys(listName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterListName.sendKeys(Keys.ENTER);
    }

    /*click ok to add journalist to the list*/
    public void setClickOk()
    {
        clickOk.click();
    }

    /* To group by list by country*/
    public void clickGroupByIcon()
    {
        clickGroupByButton.click();
    }

    public void clickCountryGroupBy()
    {
        clickCountry.click();
    }

    public void validateListGroupedByCountry() {
        validateGroupBy.isDisplayed();
    }

    /* validate change info functionality in journalist advanced search by outlet filters*/
    public void clickChangeInfo()
    {
        clickChangeInfoView.click();
    }

    public void chooseInfo()
    {
        chooseInfoView.click();
    }

    public void validateJournalistInfo()
    {
        validateInfoView.isDisplayed();
    }
}
