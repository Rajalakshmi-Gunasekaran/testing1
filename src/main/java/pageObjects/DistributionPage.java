package pageObjects;

import cucumber.api.java.cs.A;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static java.awt.SystemColor.menu;

public class DistributionPage extends CommonFunctions{
    public WebDriver driver;
    private Actions action;

    /*initialising web driver*/
    public DistributionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "distribution-link-icon")
    public WebElement clickDistributionTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav/div[3]/button[2]")
    public WebElement clickNewPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div[1]/input")
    public WebElement enterPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreatePressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]")
    public WebElement clickHeaderBlock;
    @FindBy(xpath="//div[@class=\"mce-container mce-flow-layout-item mce-last mce-btn-group\"]/div/div[@aria-label=\"Source code\"][1]")
    public WebElement clickSourceCodeHeaderBlock;
    @FindBy(xpath = "//div[@class=\"mce-container-body mce-window-body mce-abs-layout\"]/div/div/textarea")
    public WebElement enterText;
    @FindBy(xpath = "//div[@class=\"mce-widget mce-btn mce-primary mce-abs-layout-item mce-first mce-btn-has-text\"]/button/span[contains(text(),\"Ok\")]")
    public WebElement clickOkToEnter;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/div[2]")
    public WebElement clickBodyBlock;
    @FindBy(xpath= "//*[@id=\"mceu_77-button\"]/i")
    public WebElement clickSourceCodeBodyBlock;
    @FindBy(xpath = "//div[@class=\"mce-container-body mce-abs-layout\"]/textarea")
    public WebElement enterBodyContext;
    @FindBy(xpath = "//div[@class=\"mce-widget mce-btn mce-primary mce-abs-layout-item mce-first mce-btn-has-text\"]/button/span[contains(text(),\"Ok\")]")
    public WebElement clickOkToEnterBody;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/nav/div[4]/button[3]")
    public WebElement clickSaveButton;
    @FindBy(xpath = "//div[@class=\"preview-container h-100 preview-container\"]/iframe")
    public WebElement validatePressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav/div[3]/button[2]")
    public WebElement clickCreateNewCampaign;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div[1]/input")
    public WebElement enterCampaignNameToCreate;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreateButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/button[1]/i")
    public WebElement clickCopyFromListBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListNameToCopy;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/form/div[3]/button/i")
    public WebElement clickOkButton;
    @FindBy(xpath = "//i[@class=\"open-indicator\"][1]")
    public WebElement enterFromEmail;
    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]//a[contains(text(), 'no-send@roxhillmedia.com')]")
    public WebElement getEnterFromEmail;
    @FindBy(xpath = "//*[@id=\"campaignEditorPressRelease\"]/div/div/i")
    public WebElement clickPressReleaseToSelect;
    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]//span[text() = 'SmokeTest']")
    public WebElement enterPressReleaseNameToSend;
    @FindBy(xpath = "//button[@class=\"waiting-button btn btn-sm btn-outline-primary mr-2\" and contains(text(),\"Save\")]")
    public WebElement clickSave;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[1]/div/nav/div[4]/button[2]")
    public WebElement sendButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div/div[3]/div[2]/form/div[2]/ul/p/span")
    public WebElement validateCampaignSending;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div/div/h5/i")
    public WebElement clickSearchIcon;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/form/div/div/input")
    public WebElement enterPressReleaseName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/span[1]/span/span/i")
    public WebElement clickPressRelease;
    @FindBy(css = ".icon-menu ")
    public WebElement clickMenuCheckList;
    @FindBy(xpath = "//ul[@class=\"dropdown-menu show\"]/li/a[contains(.,\"Delete\")]")
    public WebElement clickDeleteButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[4]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement confirmDeletion;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/small")
    public WebElement validateDeletePressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/ul/li[2]/a/div")
    public WebElement clickCampaignTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/form/div/div/input")
    public WebElement enterCampaignName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/span[1]/span/span/i")
    public WebElement clickCampaign;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/small")
    public WebElement validateCampaignDeleted;


    /* validate new press release functionality*/
    public void setClickDistributionTab() {
        clickDistributionTab.click();
    }

    public void setClickNewPressRelease() {
        clickNewPressRelease.click();
    }

    public void setEnterPressRelease(String pressRelease) {
        enterPressRelease.sendKeys(pressRelease);
    }

    public void setClickCreatePressRelease()
    {
        elementClickable(clickCreatePressRelease,driver);
        clickCreatePressRelease.click();
    }

    public void setClickHeaderBlock() {
        clickHeaderBlock.click();
    }

    public void clickSourceCode() {
        clickSourceCodeHeaderBlock.click();
    }

    public void setHeaderBlock(String headerText) {
        enterText.sendKeys(headerText);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickOkToEnter.click();
    }

    public void setClickBodyBlock() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", clickBodyBlock);
        clickBodyBlock.click();
    }

    public void setClickSourceCodeBodyBlock() {
        clickSourceCodeBodyBlock.click();
    }

    public void setBodyBlock(String bodyText) {
        enterBodyContext.sendKeys(bodyText);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickOkToEnterBody.click();
    }

    public void clickSaveButtonInPressRelease() {
        clickSaveButton.click();
    }

    public void validatePressReleaseCreated() {
        Assert.assertTrue(validatePressRelease.isDisplayed());
    }

    public void setClickSearchIcon() {
        clickSearchIcon.click();
    }

    public void setEnterPressReleaseName(String pressRelease) {
        enterPressReleaseName.sendKeys(pressRelease);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickPressRelease.click();
    }

    public void enterPressReleaseToValidate(String name) {
        enterPressReleaseName.sendKeys(name);
    }

    public void setClickCreateNewCampaign() {
        clickCreateNewCampaign.click();
    }

    public void setEnterCampaignNameToCreate(String campaignName) {
        enterCampaignNameToCreate.sendKeys(campaignName);
    }

    public void clickCreateNewCampaign() {
        elementClickable(clickCreateButton,driver);
        clickCreateButton.click();
    }

    public void setClickOkButton() {
        clickOkButton.click();
    }

    public void setClickCopyFromListBtn() {
        clickCopyFromListBtn.click();
    }

    public void setEnterListNameToCopy(String listNameToCopy) {
        enterListNameToCopy.sendKeys(listNameToCopy);
        enterListNameToCopy.sendKeys(Keys.ENTER);
    }

    public void setEnterFromEmail() {
        enterFromEmail.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(2));
        action.build().perform();
        getEnterFromEmail.click();
    }

    public void selectPressReleaseNameToSend() {
        clickPressReleaseToSelect.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(2));
        action.build().perform();
        enterPressReleaseNameToSend.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(2));
        action.build().perform();
        clickSave.click();
    }

    public void clickSendButtonInCampaignPage() {
        sendButton.click();
    }

    public void setValidateCampaignSending() {

        Assert.assertTrue(validateCampaignSending.isDisplayed());
    }

    public void setClickMenuCheckList() {
        clickMenuCheckList.click();
    }

    public void setClickDeleteButton() {
        clickDeleteButton.click();
    }

    public void setConfirmDeletion() {
        confirmDeletion.click();
    }

    public void setValidateDeletePressRelease() {

        Assert.assertTrue(validateDeletePressRelease.isDisplayed());
    }

    public void setClickCampaignTab() {
        clickCampaignTab.click();
    }

    public void setEnterCampaignName(String campaignName) {
        enterCampaignName.sendKeys(campaignName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickCampaign.click();
    }

    public void enterCampaignName(String campaignName) {
        enterCampaignName.sendKeys(campaignName);
    }

    public void setClickCampaign() {
        clickCampaign.click();
    }

    public void setValidateCampaignDeleted() {
        Assert.assertTrue(validateCampaignDeleted.isDisplayed());
    }
}
