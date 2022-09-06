package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeoplePage {
    public WebDriver driver;
    public PeoplePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),\"People\")]")
    public WebElement clkPeopleTab;
    @FindBy(xpath = "//a[@href=\"/admin/people/authors\"]")
    public WebElement clkJournoOptions;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    public WebElement enterJournoNameInSearchFld;
    @FindBy(xpath = "//a[@class=\"btn btn-danger btn-xs person-render\"]")
    public WebElement clkSearchedJournoFromList;
    @FindBy(xpath = "//small[contains(text(),\"21.\")]")
    public WebElement clkDuplicateTab;
    @FindBy(xpath = "//input[@placeholder=\"Find other people by ID\"]")
    public WebElement enterMergingJournoID;
    @FindBy(xpath = "//button[@class=\"btn btn-xs btn-primary\"]")
    public WebElement clkMergeBtn;
    @FindBy(xpath = "//a[@href=\"/admin/people/authors?criteriaFromSession=1\"]")
    public WebElement clkJournoBreadCrumbInDuplicatesPage;
    @FindBy(xpath = "//td[contains(text(),\"3059311\")]")
    public WebElement validateJournosMerged;
    @FindBy(xpath = "//a[@href=\"/admin/people/job-titles/list\"]")
    public WebElement clkJobTitle;
    @FindBy(xpath = "//a[@href=\"/admin/people/job-titles/add\"]")
    public WebElement clkAddNewBtnToCreateJobTitle;
    @FindBy(name = "job_title[title]")
    public WebElement enterJobTitleName;
    @FindBy(name = "submit")
    public WebElement clkSaveBtnToCreateNewJobTitle;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    public WebElement enterJobTitleNameInSearchFieldToMerge;
    @FindBy(xpath = "//a[contains(text(),\"Testing\")]")
    public WebElement clkSelectedJobTitle;
    @FindBy(xpath = "//a[@href=\"/admin/people/job-titles/159483/merge?discriminator=author\"]")
    public WebElement clkMergeTabInJobTitle;
    @FindBy(xpath = "//input[@placeholder=\"Search by ID\"]")
    public WebElement enterJobTitleID;
    @FindBy(xpath = "//button[contains(text(),\"Proceed merging\")]")
    public WebElement clkMergeBtnInJobTitle;
    @FindBy(xpath = "//strong[contains(text(),\"Journalists Job Titles\")]")
    public WebElement clkJournalistJobTitleTabToGoBack;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[2]")
    public WebElement validateJobTitleMergedIntoOriginal;
    @FindBy(xpath = "//*[@id=\"main_content\"]/form/div/span/button")
    public WebElement clkSearchIcon;

    //click people tab in app home page admin
    public void setClickPeopleTab() throws InterruptedException {
        Thread.sleep(3000);
        clkPeopleTab.click();
    }

    //click journalist option
    public void setClickJournalistOption()throws InterruptedException {
        Thread.sleep(3000);
        clkJournoOptions.click();
    }

    //enter journo name to search journalist
    public void setEnterJournoName(String journoName) throws InterruptedException{
        Thread.sleep(3000);
        enterJournoNameInSearchFld.sendKeys(journoName);
        enterJournoNameInSearchFld.sendKeys(Keys.ENTER);
    }

    //click searched journo from the results and see navigated to the respective journo page
    public void setClkSearchedJournoFromList()throws InterruptedException{
        Thread.sleep(3000);
        clkSearchedJournoFromList.click();
    }

    //click duplicate tab in journo profile
    public void setClkDuplicateTabInJournoProfile() throws InterruptedException{
        Thread.sleep(3000);
        clkDuplicateTab.click();
    }

    //enter merging journo ID to merge the duplicate
    public void setEnterMergingJournoID(String mergingID) throws InterruptedException{
        Thread.sleep(3000);
        enterMergingJournoID.sendKeys(mergingID);
        enterMergingJournoID.sendKeys(Keys.ENTER);
    }

    //click merge button to merge the duplicate
    public void setClkMergeBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkMergeBtn.click();
    }

    //click journo tab bread crumb in duplicate tab
    public void setClkJournoTabBreadCrumbInDuplicateTab() throws InterruptedException{
        Thread.sleep(6000);
        Actions action = new Actions(driver);
        action.moveToElement(clkJournoBreadCrumbInDuplicatesPage).perform();
        clkJournoBreadCrumbInDuplicatesPage.click();
    }

    //validate duplicate journalist merged into original
    public void setValidateDuplicateJournoMerged() throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertFalse(validateJournosMerged.isDisplayed());
    }

    //click job titles from options
    public void setClkJobTitlesFromOptions()throws InterruptedException {
        Thread.sleep(3000);
        clkJobTitle.click();
    }

    //click add new button to create job title
    public void setClkAddNewBtnToCreateJobTitle() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewBtnToCreateJobTitle.click();
    }

    //enter job title name
    public void setEnterJobTitleName(String jobTitle) throws InterruptedException{
        Thread.sleep(3000);
        enterJobTitleName.sendKeys(jobTitle);
    }

    //click save button to create job title
    public void setClkSaveBtnToCreateJobTitle() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveBtnToCreateNewJobTitle.click();
    }

    //enter job title name in search field
    public void setEnterJobTitleNameInSearchField(String jobTitleName) throws InterruptedException {
        Thread.sleep(3000);
        enterJobTitleNameInSearchFieldToMerge.sendKeys(jobTitleName);
        enterJobTitleNameInSearchFieldToMerge.sendKeys(Keys.ENTER);
    }

    //click selected job title in job title page
   public void setClkSelectedJobTitleInJobTitlePage() throws InterruptedException{
       Thread.sleep(3000);
       clkSelectedJobTitle.click();
   }

   //
    public void setClkMergeTabInJobTitlePage()throws InterruptedException {
        Thread.sleep(3000);
        clkMergeTabInJobTitle.click();
    }

    public void setEnterJobTitleID(String jobTitleID) throws InterruptedException{
        Thread.sleep(3000);
        enterJobTitleID.sendKeys(jobTitleID);
        clkSearchIcon.click();
    }

    public void setClkMergeBtnInJobTitle() throws InterruptedException{
        Thread.sleep(3000);
        clkMergeBtnInJobTitle.click();
    }

    public void setClkJournalistJobTitleToGoBack() throws InterruptedException{
        Thread.sleep(3000);
        clkJournalistJobTitleTabToGoBack.click();
    }

    public void setValidateJobTitleMergedIntoOriginal() throws InterruptedException{
        Thread.sleep(3000);
        validateJobTitleMergedIntoOriginal.isDisplayed();
    }
}
