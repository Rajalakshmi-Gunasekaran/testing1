package pageObjects;

import cucumber.api.java.ca.I;
import cucumber.api.java.cs.A;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    @FindBy(xpath = "//button[@class=\"btn btn-secondary ml-2\"]")
    public WebElement clickNewPressRelease;
    @FindBy(xpath = "//input[@class=\"form-control mb-3\"]")
    public WebElement enterPressRelease;
    @FindBy(xpath = "//button[@class=\"d-flex align-items-center btn btn-sm btn-primary font-smallest text-uppercase\"][contains(text(),\" Create \")]")
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
    @FindBy(xpath = "//span[contains(text(),\"This will be sent in 200 years.\")]")
    public WebElement validateCampaignSending;
    @FindBy(xpath = "//i[@class=\"icon-magnifying-glass clickable\"]")
    public WebElement clickSearchIcon;
    @FindBy(xpath = "//input[@class=\"form-control form-control-big m-0\"]")
    public WebElement enterPressReleaseName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/span[1]/span/span/i")
    public WebElement clickPressRelease;
    @FindBy(css = ".icon-menu ")
    public WebElement clickMenuCheckList;
    @FindBy(xpath = "//ul[@class=\"dropdown-menu show\"]/li/a[contains(.,\"Delete\")]")
    public WebElement clickDeleteButton;
    @FindBy(xpath = "//button[contains(text(),\" Delete \")]")
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
    @FindBy(xpath = "//a[@class=\"dropdown-item\"][contains(text(),\"Archive\")]")
    public WebElement clickArchiveMenu;
    @FindBy(xpath = "//i[@class=\"text-center icon-slashed-text-document\"]")
    public WebElement archiveTab;
    @FindBy(xpath = "//i[@class=\"icon-magnifying-glass ml-auto cursor-pointer\"]")
    public WebElement searchIconInArchive;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div[1]/div[1]/input")
    public WebElement enterPressReleaseNameToArchive;
    @FindBy(xpath = "//a[@class=\"dropdown-item\"][contains(text(),\" Unarchive \")]")
    public WebElement unArchivePressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/a/div/span")
    public WebElement selectPressReleaseToEdit;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/ul/li[1]/a/div/i")
    public WebElement clickPressReleaseTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div[1]/div[1]/input")
    public WebElement enterUnArchiveCampaignName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div[2]/div/span/span/span/i")
    public WebElement clickPressReleaseToArchive;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li")
    public WebElement validateUnArchivePressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/ul/li[4]/a/div/i")
    public WebElement archiveCampaignTab;
    @FindBy(xpath = "//div[@class=\"name text-truncate mr-2\"]/span[contains(text(),\"SmokeSuite\")]")
    public WebElement validateUnArchiveCampaign;
    @FindBy(xpath = "//a[@class=\"dropdown-item\"][contains(text(),\" Archive \")]")
    public WebElement clickArchiveCampaign;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div[2]/div/span/span/span/i")
    public WebElement selectCampaignToUnArchive;
    @FindBy(xpath = "//div[@class=\"name text-truncate mr-2\"]")
    public WebElement clickCampaignNameToView;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/ul/li[1]/div[2]")
    public WebElement validateViewCampaign;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div")
    public WebElement chooseBlock;
    @FindBy(xpath = "//ul/li/a/span[contains(text(),\"1Raji\")]")
    public WebElement getChooseBlock;
    @FindBy(xpath = "//img[contains(@alt,\"download.png\")]")
    public WebElement validateEditPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/ul/li[3]/a/div")
    public WebElement clickBlockTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav/div[3]/button[2]")
    public WebElement clickCreateNewBlock;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div[1]/input")
    public WebElement enterBlockName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreateBtn;
    @FindBy(xpath = "//i[@class=\"mce-ico mce-i-link\"]")
    public WebElement clickURLLink;
    @FindBy(css = ".mce-textbox")
    public WebElement enterURLLink;
    @FindBy(xpath = "//div[@class=\"mce-widget mce-btn mce-primary mce-abs-layout-item mce-first mce-btn-has-text\"]/button/span[contains(text(),\"Ok\")]")
    public WebElement clickOkToEnterURLInHeader;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[1]/nav/div[4]/button[2]")
    public WebElement clickSaveBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[1]/nav/div[4]/button[1]")
    public WebElement clickDuplicateBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/span")
    public WebElement clickClearContentBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/span/div/div[2]/div[1]")
    public WebElement confirmClearContent;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[1]/nav/div[4]/span")
    public WebElement clickDeleteBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[1]/nav/div[4]/span/div/div[2]/div[1]/i")
    public WebElement confirmDeletionInBlock;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/form/div/div/input")
    public WebElement enterBlockNameToEdit;
    @FindBy(xpath = "//li[@class=\"widget px-3 py-2\"]/a[contains(text(),\" FunctionalTesting \")]")
    public WebElement chooseBlockFromSearch;
    @FindBy(xpath = "//button[contains(text(),\" New press release \")]")
    public WebElement PressReleaseBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div/input")
    public WebElement enterPressReleaseNameToCreate;
    @FindBy(xpath = "//button[contains(text(),\" Create \")]")
    public WebElement clickCreateNewPressReleaseBtn;
    @FindBy(xpath = "//button[contains(text(),\" New campaign \")]")
    public WebElement clickCampaignBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div/input")
    public WebElement enterCampaignNameToCreateNewCampaign;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreateBtnInNewCampaign;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[3]/form/input[1]")
    public WebElement enterEmailAddress;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[3]/form/input[3]")
    public WebElement enterFirstName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[3]/form/input[4]")
    public WebElement enterLastName;
    @FindBy(xpath = "//form[@class=\"form-inline px-3 py-2 d-flex justify-content-between align-items-center\"]/button[contains(text(),\"Add\")]")
    public WebElement clickAddBtn;
    @FindBy(xpath = "//button[contains(text(),\" Add recipient \")]")
    public WebElement clickAddRecipientBtn;
    @FindBy(xpath = "//button[contains(text(),\" Choose journalists \")]")
    public WebElement clickChooseJournalistBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[3]/div/div/div[3]/div[2]/form/div[2]/div/div/input")
    public WebElement enterJournalistNameToAddRecipient;
    @FindBy(xpath = " //button[contains(text(),\"Ok \")]")
    public WebElement clickOkBtn;
    @FindBy(xpath = "//button[contains(text(),\" Save \")]")
    public WebElement clickSaveBtnInCampaign;
    @FindBy(xpath = "//span[contains(text(),\" Delete \")]")
    public WebElement clickDelete;
    @FindBy(xpath = "//div[@class=\"confirm-button-confirm px-2 d-flex align-items-center\"]")
    public WebElement clickConfirmDelete;
    @FindBy(xpath = "//div[@class=\"ml-auto mr-3 d-flex align-items-center action-buttons\"]/span[contains(text(),\" Delete \")]")
    public WebElement clickDeleteInPressReleasePage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/nav/div[4]/span/div/div[2]/div[1]")
    public WebElement clickConfirmInPressReleasePage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/div/div[2]/ul/li[1]/a")
    public WebElement chooseAndClickPressReleaseFromRightHandSidePan;
    @FindBy(xpath = "//button[contains(text(),\" Start campaign \")]")
    public WebElement clickStartCampaignBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div[2]/form/div[2]/div[1]/input")
    public WebElement enterCampaignNameFromPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreateBtnFromPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div[2]/ul/li[1]/a")
    public WebElement chooseAndClickCampaign;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/form/div[3]/a")
    public WebElement clickViewPressReleaseLink;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div/div/h5/span/span")
    public WebElement validatePressReleaseFromCampaignPage;

    /* validate new press release functionality*/
    public void setClickDistributionTab()throws InterruptedException {
        Thread.sleep(3000);
        clickDistributionTab.click();
    }
    //click create new press release
    public void setClickNewPressRelease()throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(clickNewPressRelease,driver);
        clickNewPressRelease.click();
    }
    // enter press release name to create new press release
    public void setEnterPressRelease(String pressRelease)throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(enterPressRelease,driver);
        enterPressRelease.sendKeys(pressRelease);
    }
    //click create press release after enter press release name
    public void setClickCreatePressRelease()throws InterruptedException
    {
        Thread.sleep(3000);
        elementClickable(clickCreatePressRelease,driver);
        clickCreatePressRelease.click();
    }
    //click header block to enter header content
    public void setClickHeaderBlock()throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(clickHeaderBlock,driver);
        clickHeaderBlock.click();
    }
    //click source code button to enter header text
    public void clickSourceCode()throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(clickSourceCodeHeaderBlock,driver);
        clickSourceCodeHeaderBlock.click();
    }
    //enter text into header block
    public void setHeaderBlock(String headerText)throws InterruptedException {
        Thread.sleep(3000);
        enterText.sendKeys(headerText);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickOkToEnter.click();
    }
    //click body block to add body content
    public void setClickBodyBlock() throws InterruptedException{
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", clickBodyBlock);
        clickBodyBlock.click();
    }
    //click source code button in the body block
    public void setClickSourceCodeBodyBlock()throws InterruptedException {
        Thread.sleep(3000);
        clickSourceCodeBodyBlock.click();
    }
    //enter body content
    public void setBodyBlock(String bodyText)throws InterruptedException {
        Thread.sleep(3000);
        enterBodyContext.sendKeys(bodyText);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickOkToEnterBody.click();
    }
    //click save to add press release
    public void clickSaveButtonInPressRelease()throws InterruptedException
    {
        Thread.sleep(3000);
        clickSaveButton.click();
    }
    //validate press release
    public void validatePressReleaseCreated()throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(validatePressRelease.isDisplayed());
    }
    //click search icon to search for press release
    public void setClickSearchIcon() throws InterruptedException{
        Thread.sleep(3000);
        clickSearchIcon.click();
    }
    //enter press release name in the search field
    public void setEnterPressReleaseName(String pressRelease) throws InterruptedException{
        Thread.sleep(3000);
        enterPressReleaseName.sendKeys(pressRelease);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickPressRelease.click();
    }
    //enter press release name to validate
    public void enterPressReleaseToValidate(String name)throws InterruptedException {
        Thread.sleep(3000);
        enterPressReleaseName.sendKeys(name);
    }
    //click press release to edit content
    public void setClickPressReleaseToEdit()throws InterruptedException{
        Thread.sleep(3000);
        selectPressReleaseToEdit.click();
    }
    //choose block to edit
    public void setClickChooseBlock()throws InterruptedException{
        Thread.sleep(3000);
        chooseBlock.click();
    }
    //click on the desired block form the drop down
    public void setChooseBlock()throws InterruptedException{
        Thread.sleep(3000);
        getChooseBlock.click();
    }
    //validate edit press release
    public void setValidateEditPressRelease()throws InterruptedException{
        Thread.sleep(3000);
        validateEditPressRelease.isDisplayed();
    }
    //click create new campaign
    public void setClickCreateNewCampaign() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickCreateNewCampaign,driver);
        clickCreateNewCampaign.click();
    }
    //enter campaign name to create
    public void setEnterCampaignNameToCreate(String campaignName) throws InterruptedException {
        Thread.sleep(3000);
        enterCampaignNameToCreate.sendKeys(campaignName);
    }
    //click create new campaign
    public void clickCreateNewCampaign() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickCreateButton,driver);
        clickCreateButton.click();
    }
    //click ok button
    public void setClickOkButton() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickOkButton,driver);
        clickOkButton.click();
    }
    //click copy from list button
    public void setClickCopyFromListBtn()throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(clickCopyFromListBtn,driver);
        clickCopyFromListBtn.click();
    }
    //enter list name to copy
    public void setEnterListNameToCopy(String listNameToCopy)throws InterruptedException {
        Thread.sleep(3000);
        enterListNameToCopy.sendKeys(listNameToCopy);
        enterListNameToCopy.sendKeys(Keys.ENTER);
    }
    //enter from email to send campaign
    public void setEnterFromEmail() throws InterruptedException
    {
        Thread.sleep(6000);
        elementVisible(enterFromEmail,driver);
        enterFromEmail.click();
        Thread.sleep(9000);
        elementVisible(getEnterFromEmail,driver);
        getEnterFromEmail.click();
    }
    //select press release name to send
    public void selectPressReleaseNameToSend()throws InterruptedException
    {
        Thread.sleep(3000);
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
    //click send button in campaign page
    public void clickSendButtonInCampaignPage()throws InterruptedException
    {
        Thread.sleep(3000);
        elementClickable(sendButton,driver);
        sendButton.click();
    }
    //validate campaign ready to send dialogue box
    public void setValidateCampaignSending() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(validateCampaignSending,driver);
        Assert.assertTrue(validateCampaignSending.isDisplayed());
    }
    //click menu check list to choose option
    public void setClickMenuCheckList()throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(clickMenuCheckList,driver);
        clickMenuCheckList.click();
    }
    //choose delete option from the menu list
    public void setClickDeleteButton() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(clickDeleteButton,driver);
        clickDeleteButton.click();
    }
    //click confirm delete to confirm deletion
    public void setConfirmDeletion()throws InterruptedException {
        Thread.sleep(3000);
        elementClickable(confirmDeletion,driver);
        confirmDeletion.click();
    }
    //validate chosen press release is deleted
    public void setValidateDeletePressRelease()throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(validateDeletePressRelease.isDisplayed());
    }
    //click campaign tab on distro page
    public void setClickCampaignTab()throws InterruptedException {
        Thread.sleep(3000);
        clickCampaignTab.click();
    }
    //enter campaign name to create new campaign from left hand side menu create options
    public void setEnterCampaignName(String campaignName)throws InterruptedException {
        Thread.sleep(3000);
        enterCampaignName.sendKeys(campaignName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickCampaign.click();
    }
    //enter campaign name to validate campaign deleted
    public void enterCampaignName(String campaignName)throws InterruptedException
    {
        Thread.sleep(3000);
        enterCampaignName.sendKeys(campaignName);
    }

    public void setClickCampaign()
    {
        clickCampaign.click();
    }

    //validate campaign deleted using left hand side option menu
    public void setValidateCampaignDeleted() throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertTrue(validateCampaignDeleted.isDisplayed());
    }
    /*click on archive menu*/
    public void setClickArchiveMenu()throws InterruptedException{
        Thread.sleep(3000);
        clickArchiveMenu.click();
    }
    /*click on archive tab*/
    public void setArchiveTab()throws InterruptedException{
        Thread.sleep(3000);
        archiveTab.click();
    }
    /*click on search icon on archived press release*/
    public void setSearchIconInArchive()throws InterruptedException{
        Thread.sleep(6000);
        elementClickable(searchIconInArchive,driver);
        searchIconInArchive.click();
    }
    /*enter press release name to archive*/
    public void setEnterPressReleaseNameToArchive(String archivePressReleaseName)throws InterruptedException{
        Thread.sleep(3000);
        enterPressReleaseNameToArchive.sendKeys(archivePressReleaseName);
        Thread.sleep(3000);
        clickPressReleaseToArchive.click();
    }
    /*enter campaign name to unarchive */
    public void setEnterCampaignNameToUnArchive(String UnArchiveCampaign)throws InterruptedException{
        Thread.sleep(3000);
        enterUnArchiveCampaignName.sendKeys(UnArchiveCampaign);
        Thread.sleep(3000);
        selectCampaignToUnArchive.click();
    }
    /*click on unarchive menu*/
    public void setUnArchivePressRelease()throws InterruptedException{

        Thread.sleep(3000);
        unArchivePressRelease.click();
    }
    /*click on press release tab*/
    public void setClickPressReleaseTab()throws InterruptedException{
        Thread.sleep(3000);
        clickPressReleaseTab.click();
    }
    /*validate unarchive press release*/
    public void validateUnArchivePressRelease()throws InterruptedException{
        Thread.sleep(3000);
        validateUnArchivePressRelease.isDisplayed();
    }
    //click archive campaign
    public void clickArchiveCampaign()throws InterruptedException{
        Thread.sleep(3000);
        clickArchiveCampaign.click();
    }
    /* click archive campaign tab*/
    public void setArchiveCampaignTab()throws InterruptedException{
        Thread.sleep(3000);
        archiveCampaignTab.click();
    }
    /*validate un archive campaign*/
    public void setValidateUnArchiveCampaign()throws InterruptedException{
        Thread.sleep(3000);
        validateUnArchiveCampaign.isDisplayed();
    }
    /*click campaign name to view*/
    public void setClickCampaignNameToView()throws InterruptedException{
        Thread.sleep(3000);
        clickCampaignNameToView.click();
    }
    /*validate view campaign */
    public void setValidateViewCampaign()throws InterruptedException{
        Thread.sleep(3000);
        validateViewCampaign.isDisplayed();
    }
    //click block tab in distribution page
    public void setClickBlocksTab() throws InterruptedException{
        Thread.sleep(3000);
        clickBlockTab.click();
    }
    //click create new block
    public void setClickCreateNewBlock() throws InterruptedException{
        Thread.sleep(3000);
        clickCreateNewBlock.click();
    }
    //enter block name to create new block
    public void enterBlockNameToCreate(String blockName) throws InterruptedException{
        Thread.sleep(3000);
        enterBlockName.sendKeys(blockName);
        Thread.sleep(3000);
        clickCreateBtn.click();
    }
    //click insert link button to insert content in header
    public void clickInsertLink() throws InterruptedException{
        Thread.sleep(3000);
        clickURLLink.click();
    }
    //enter URL link in the header link pop up
    public void enterURLToCreateLinkInHeader(String urlLink) throws InterruptedException{
        Thread.sleep(3000);
        enterURLLink.sendKeys(urlLink);
    }
    //click ok button to insert link in header block
    public void setClickOkBtnToInsertLink() throws InterruptedException{
        Thread.sleep(3000);
        clickOkToEnterURLInHeader.click();
    }
    //click save button
    public void setClickSaveBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickSaveBtn.click();
    }
    //click duplicate button to create a copy of the block
    public void setClickDuplicateBtn()throws InterruptedException {
        Thread.sleep(3000);
        clickDuplicateBtn.click();
    }
    //click delete button in block
    public void setClickDeleteButtonInBlock() throws InterruptedException{
        Thread.sleep(3000);
        clickDeleteBtn.click();
        Thread.sleep(3000);
        confirmDeletionInBlock.click();
    }

    //choose block name to edit
    public void setChooseBlockNameToEdit() throws InterruptedException{
        Thread.sleep(3000);
        chooseBlockFromSearch.click();
    }
    //click clear content button in blocks body area to remove the existing contents
    public void setClickClearContent() throws InterruptedException{
        Thread.sleep(3000);
        clickClearContentBtn.click();
        Thread.sleep(3000);
        confirmClearContent.click();
    }
    //click new press release button in the right hand side home page
    public void setClickPressReleaseBtn() throws InterruptedException{
        Thread.sleep(3000);
        PressReleaseBtn.click();
    }
    //enter new press release name to create new press release from right hand side button
    public void setEnterNewPressReleaseNameToCreate(String newPressRelease) throws InterruptedException{
        Thread.sleep(3000);
        enterPressReleaseNameToCreate.sendKeys(newPressRelease);
    }
    //click create button to create new press release
    public void setClickCreateNewPressReleaseBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickCreateNewPressReleaseBtn.click();
    }
    //click new campaign button from right hand side home page
    public void setClickCampaignBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickCampaignBtn.click();
    }
    //enter campaign name to create new campaign from right hand side option
    public void enterCampaignNameToCreateNewCampaign(String campaignName)throws InterruptedException {
        Thread.sleep(3000);
        enterCampaignNameToCreateNewCampaign.sendKeys(campaignName);
    }
    //click create button to create new campaign from right hand side options
    public void setClickCreateBtnToCreateNewCampaign() throws InterruptedException{
        Thread.sleep(3000);
        clickCreateBtnInNewCampaign.click();
    }
    //click add recipient button to add recipient manually
    public void setClickAddRecipientBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickAddRecipientBtn.click();
    }
    //enter email address to add recipient
    public void enterEmailAddress() throws InterruptedException{
        Thread.sleep(3000);
        enterEmailAddress.sendKeys("qa@roxhillmedia.com");
    }
    //enter first name to add recipient manually
    public void enterFirstName(String firstName) throws InterruptedException{
        Thread.sleep(3000);
        enterFirstName.sendKeys(firstName);
    }
    //enter last name to add recipient manually
    public void enterLastName(String lastName) throws InterruptedException{
        Thread.sleep(3000);
        enterLastName.sendKeys(lastName);
    }
    //click add button to add the recipients
    public void setClickAddBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickAddBtn.click();
    }
    //click journalist by name to add recipient
    public void setClickJournalistByName() throws InterruptedException{
        Thread.sleep(6000);
        clickChooseJournalistBtn.click();
    }
    //enter journo name to add recipient
    public void setEnterJournoNameToAddRecipient(String journo) throws InterruptedException{
        Thread.sleep(6000);
        enterJournalistNameToAddRecipient.sendKeys(journo);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(10));
        action.build().perform();
        enterJournalistNameToAddRecipient.sendKeys(Keys.ENTER);
    }
    //click ok button to add recipient
    public void clickOkButton() {
        elementClickable(clickOkBtn,driver);
        clickOkBtn.click();
    }
    //click save button in campaign page
    public void setClickSaveBtnInCampaignPage() throws InterruptedException{
        Thread.sleep(3000);
        clickSaveBtnInCampaign.click();
    }
    //delete campaigns from right hand side options
    public void setDeleteCampaign() throws InterruptedException{
        Thread.sleep(3000);
        clickDelete.click();
        Thread.sleep(3000);
        clickConfirmDelete.click();
    }
    //delete press release from right hand side options
    public void setClickDeletePressRelease() throws InterruptedException{
        Thread.sleep(3000);
        clickDeleteInPressReleasePage.click();
        Thread.sleep(3000);
        clickConfirmInPressReleasePage.click();
    }
    // choose press release from the right hand side pan and click on it
    public void setChooseAndClickPressRelease() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickPressReleaseFromRightHandSidePan.click();
    }
    //click start campaign button to create new campaign from press release page
    public void setClickStartCampaignBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickStartCampaignBtn.click();
    }

    public void setEnterCampaignNameFromPressRelease(String pressRelease) throws InterruptedException{
        Thread.sleep(3000);
        enterCampaignNameFromPressRelease.sendKeys(pressRelease);
        Thread.sleep(3000);
        clickCreateBtnFromPressRelease.click();
    }

    public void setChooseAndClickCampaign() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickCampaign.click();
    }

    public void setClickViewPressReleaseLink() throws InterruptedException{
        Thread.sleep(3000);
        clickViewPressReleaseLink.click();
    }

    public void setValidatePressRelease() throws InterruptedException{
        Thread.sleep(3000);
        validatePressReleaseFromCampaignPage.isDisplayed();
    }
}