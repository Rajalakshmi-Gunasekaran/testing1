package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class DistributionPage{

    public WebDriver driver;
    private Actions action;

    /*initialising web driver*/
    public DistributionPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/nav/ul/li[5]/a/span")
    public WebElement clickDistributionTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav/div[3]/button[2]")
    public WebElement clickNewPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div[1]/input")
    public WebElement enterPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreatePressRelease;
    @FindBy(id = "tinymce")
    public WebElement clickHeaderBlock;
    @FindBy(id = "mceu_30-body")
    public WebElement enterHeaderContext;
    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement clickBodyBlock;
    @FindBy(xpath = "//*[@id=\"tinymce\"]/p[2]/br")
    public WebElement bodyBlock;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[4]/div[1]/div/div[2]/div/div/div/i")
    public WebElement clickSaveButton;
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
    @FindBy(xpath= "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]")
    public WebElement enterFromEmail;
    @FindBy(xpath = "//*[@id=\"campaignEditorFromEmail\"]/div/div/span/text()")
    public WebElement getEnterFromEmail;
    @FindBy(xpath = "//*[@id=\"campaignEditorPressRelease\"]/div/div/span/div")
    public WebElement enterPressReleaseNameToSend;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div/div[1]/div/nav/div[4]/button[2]/i")
    public WebElement sendButton;
    @FindBy(xpath = "")
    public WebElement validateCampaignSending;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div/div/h5/i")
    public WebElement clickSearchIcon;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/form/div/div/input")
    public WebElement enterPressReleaseName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/span[1]/span/span/i")
    public WebElement clickPressRelease;
    @FindBy(css =".icon-menu ")
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
    public void setClickDistributionTab()
    {
        clickDistributionTab.click();
    }

    public void setClickNewPressRelease()
    {
        clickNewPressRelease.click();
    }

    public void setEnterPressRelease(String pressRelease)
    {
        enterPressRelease.sendKeys(pressRelease);
    }

    public void setClickCreatePressRelease()
    {
        clickCreatePressRelease.click();
    }

    public void setHeaderBlock(String headerText)
    {
        clickHeaderBlock.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        enterHeaderContext.sendKeys(headerText);
    }
    public void setBodyBlock(String bodyText)
    {
        clickBodyBlock.click();
        bodyBlock.sendKeys(bodyText);
    }

    public void setClickSaveButton()
    {
        clickSaveButton.click();
    }
    public void setClickSearchIcon()
    {
       clickSearchIcon.click();
    }
    public void setEnterPressReleaseName(String pressRelease)
    {
        enterPressReleaseName.sendKeys(pressRelease);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickPressRelease.click();
    }
    public void enterPressReleaseToValidate(String name)
    {
        enterPressReleaseName.sendKeys(name);
    }
    public void setClickCreateNewCampaign()
    {
        clickCreateNewCampaign.click();
    }
    public void setEnterCampaignNameToCreate(String campaignName)
    {
        enterCampaignNameToCreate.sendKeys(campaignName);
    }
    public void clickCreateNewCampaign(){
        clickCreateButton.click();
    }
    public void setClickOkButton()
    {
        clickOkButton.click();
    }
    public void setClickCopyFromListBtn()
    {
        clickCopyFromListBtn.click();
    }
    public void setEnterListNameToCopy(String listNameToCopy)
    {
        enterListNameToCopy.sendKeys(listNameToCopy);
        enterListNameToCopy.sendKeys(Keys.ENTER);
    }
    public void setEnterFromEmail()
    {
        enterFromEmail.click();
        action.moveToElement(getEnterFromEmail).build().perform();
       // action.click;
       // getEnterFromEmail.click();
       //getEnterFromEmail.sendKeys(email);
    }
    public void setEnterPressReleaseNameToSend(String pressReleaseNameToSend)
    {
      enterPressReleaseNameToSend.sendKeys(pressReleaseNameToSend);
    }
    public void clickSendButton()
    {
        sendButton.click();
    }
    public void setValidateCampaignSending()
    {

        Assert.assertTrue(validateCampaignSending.isDisplayed());
    }
    public void setClickMenuCheckList()
    {
        clickMenuCheckList.click();
    }
    public void setClickDeleteButton()
    {
        clickDeleteButton.click();
    }
    public void setConfirmDeletion()
    {
        confirmDeletion.click();
    }
    public void setValidateDeletePressRelease()
    {

        Assert.assertTrue(validateDeletePressRelease.isDisplayed());
    }
    public void setClickCampaignTab()
    {
        clickCampaignTab.click();
    }
    public void setEnterCampaignName(String campaignName)
    {
        enterCampaignName.sendKeys(campaignName);
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        clickCampaign.click();
    }
    public void enterCampaignName(String campaignName)
    {
        enterCampaignName.sendKeys(campaignName);
    }
    public void setClickCampaign()
    {
        clickCampaign.click();
    }
    public void setValidateCampaignDeleted()
    {

        Assert.assertTrue(validateCampaignDeleted.isDisplayed());
    }
}
