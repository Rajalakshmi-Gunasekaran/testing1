package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinpointPage extends CommonFunctions{
    public WebDriver driver;
    /*initialising web driver*/
    public PinpointPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "pinpoint-link-icon")
    public WebElement clkPinpoint;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[2]/div/div/div/div/input")
    public WebElement enterSearchTxt;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[3]/button")
    public WebElement validateViewMatches;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[3]/div/div[1]/div[2]/div/ul[2]/li[7]")
    public WebElement selectFranceInCountry;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[3]/div/div[5]/div[1]/div/div[2]/div/span/button/i")
    public WebElement clickAddJournalistToListBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[3]/div/div[5]/div[1]/div/div[2]/div/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListNameInSearchTextField;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[3]/div/div[5]/div[1]/div/div[2]/div/div/div/div/div[3]/div[2]/form/div[3]/button/i")
    public WebElement clickOkToSaveJournoToTheList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[2]/div/div/div/div/i")
    public WebElement clickPlusSignToAddSecondSearchText;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[2]/div/div/div/div/input")
    public WebElement enterSecondSearchText;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[2]/div/div/div/div/i")
    public WebElement clickPlusSignToAddThirdSearchText;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[2]/div/div/div/div/input")
    public WebElement enterThirdSearchText;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/div/div[1]/div[2]/div")
    public WebElement chooseTweetRadioBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/nav/div[3]/button")
    public WebElement validateTweetAndMoreSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[3]/div/div[4]/div[1]/div/div[2]/span[2]/button")
    public WebElement clickOutletSearchIcon;
    @FindBy(xpath = "//nav[@class=\"super-toolbar d-flex flex-row justify-content-start align-items-center py-0 branded\"]")
    public WebElement validateNavigateToAdvancedSearchOutletTab;
    @FindBy(xpath = "//*[@id=\"searchJournalistButton\"]/i")
    public WebElement clickJournoSearchIcon;
    @FindBy(xpath = "//nav[@class=\"super-toolbar d-flex flex-row justify-content-start align-items-center py-0 branded\"]")
    public WebElement validateNavigateToAdvancedSearchJournoTab;

    /*clicking pinpoint tab from the header menu in home page*/
    public void clickPinpointTab() {
        clkPinpoint.click();
    }

    /*provide search text to produce the analytical view*/
    public void EnterTextPinpoint(String pinpointTxt) {
        enterSearchTxt.sendKeys(pinpointTxt);
        enterSearchTxt.sendKeys(Keys.ENTER);
    }

    /* validate the pinpoint page with*/
    public void validatePinpointPage() {
        Assert.assertTrue(validateViewMatches.isDisplayed());
    }

    //click on france from country tab
    public void clickFranceFromCountry()throws InterruptedException{
        Thread.sleep(3000);
        selectFranceInCountry.click();
    }
    //click on add to list button in journo tab to add the journo to the list
    public void setClickAddJournalistToListBtn()throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickAddJournalistToListBtn,driver);
        clickAddJournalistToListBtn.click();
    }
    //enter list name to add journo from pinpoint
    public void setEnterListNameInSearchTextField(String listNameToAddJournoFromPinpoint)throws InterruptedException{
        Thread.sleep(3000);
        enterListNameInSearchTextField.sendKeys(listNameToAddJournoFromPinpoint);
    }
    //click create new list option to create new list in pinpoint
    public void clickCreateListInPinpoint()throws InterruptedException{
        Thread.sleep(3000);
        enterListNameInSearchTextField.sendKeys(Keys.ENTER);
    }
    //click ok to create list in pin point
    public void clickOkToCreateListInPinpoint()throws InterruptedException{
        Thread.sleep(3000);
        clickOkToSaveJournoToTheList.click();
    }
    //click on plus sign to add second search text
    public void setClickPlusSignToAddSecondSearchText()throws InterruptedException{
        Thread.sleep(3000);
        clickPlusSignToAddSecondSearchText.click();
    }
    //enter second search text
    public void setEnterSecondSearchTextField(String secondSearchText)throws InterruptedException{
        Thread.sleep(3000);
        enterSecondSearchText.sendKeys(secondSearchText);
        enterSecondSearchText.sendKeys(Keys.ENTER);
    }
    //click on plus sign to add second search text
    public void setClickPlusSignToAddThirdSearchText()throws InterruptedException{
        Thread.sleep(3000);
        clickPlusSignToAddThirdSearchText.click();
    }
    //enter second search text
    public void setEnterThirdSearchTextField(String thirdSearchText)throws InterruptedException{
        Thread.sleep(3000);
        enterThirdSearchText.sendKeys(thirdSearchText);
        enterThirdSearchText.sendKeys(Keys.ENTER);
    }
    //click on tweet radio button
    public void clickOnTweetOption()throws InterruptedException{
        Thread.sleep(3000);
        chooseTweetRadioBtn.click();
    }
    //validate tweet search with more search items
    public void setValidateTweetAndMoreSearch()throws InterruptedException{
        Thread.sleep(3000);
        validateTweetAndMoreSearch.isDisplayed();
    }

    public void clickOutletSearchIcon() throws InterruptedException{
        Thread.sleep(3000);
        clickOutletSearchIcon.click();
    }

    public void validateNavigateToAdvancedSearchOutletTab() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToAdvancedSearchOutletTab.isDisplayed();
    }

    public void setClickJournoSearchIcon()throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(clickJournoSearchIcon,driver);
        clickJournoSearchIcon.click();
    }

    public void setValidateNavigateToAdvancedSearchJournoTab() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToAdvancedSearchJournoTab.isDisplayed();
    }
}
