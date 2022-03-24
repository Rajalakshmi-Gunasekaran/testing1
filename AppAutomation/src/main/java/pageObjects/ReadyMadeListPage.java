package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadyMadeListPage extends CommonFunctions{
    public WebDriver driver;
    public ReadyMadeListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/ul/li[2]/a/div")
    public WebElement clickReadyMadeListTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[1]/a/div[1]")
    public WebElement clickListInReadyMadeList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[1]")
    public WebElement validateReadyMadeListsFilteredByOutlet;
    @FindBy(xpath = "//div[contains(text(),\"EU Nationals Business desks\")]")
    public WebElement clickFolderInRML;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/ul/li[11]")
    public WebElement clickListInsideFolderInRML;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/div/div[2]/div[2]/div[3]/input")
    public WebElement enterJobTitleInRML;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[1]")
    public WebElement validateRMLResultsForJobTitleFilter;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div/div/div")
    public WebElement clickCollapsibleChevron;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div")
    public WebElement validateRMLHomePage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[1]/a/div[1]")
    public WebElement chooseAndClickRMLList;
    @FindBy(xpath = "//span[contains(text(),\"Download all\")]")
    public WebElement clickDownloadBtnInRML;
    @FindBy(xpath = "//span[contains(text(),\"Desks\")]")
    public WebElement clickAddDesk;
    @FindBy(xpath = "")
    public WebElement clickRemoveDesk;
    @FindBy(xpath = "//button[contains(text(),\" Cancel \")]")
    public WebElement clickCancel;



    public void clickReadyMadeListTab() throws InterruptedException{
        Thread.sleep(3000);
        clickReadyMadeListTab.click();
    }

    public void clickOnListsInRML() throws InterruptedException{
        Thread.sleep(3000);
        clickListInReadyMadeList.click();
    }

    public void validateReadyMadeListFilteredByOutlet() throws InterruptedException{
        Thread.sleep(3000);
        validateReadyMadeListsFilteredByOutlet.isDisplayed();
    }

    public void clickFolderInReadyMadeList() throws InterruptedException{
        Thread.sleep(3000);
        clickFolderInRML.click();
    }

    public void clickOnListInsideFolder()throws InterruptedException {
        Thread.sleep(3000);
        //elementVisible(clickListInsideFolderInRML,driver);
        clickListInsideFolderInRML.click();
    }

    public void enterJobTitleInRML(String jobTitle)throws InterruptedException {
        Thread.sleep(3000);
        enterJobTitleInRML.sendKeys(jobTitle);
    }

    public void validateSelectedJobTitleInReadyMadeList() throws InterruptedException{
       Thread.sleep(3000);
       validateRMLResultsForJobTitleFilter.isDisplayed();
    }

    public void clickCollapsibleChevron() throws InterruptedException{
        Thread.sleep(3000);
        clickCollapsibleChevron.click();
    }

    public void validateRMLHomePage() throws InterruptedException{
        Thread.sleep(3000);
        validateRMLHomePage.isDisplayed();
    }

    public void chooseRMLList() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickRMLList.click();
    }

    public void clickDownloadBtn() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickDownloadBtnInRML,driver);
        clickDownloadBtnInRML.click();
    }

    public void clickAddDeskColumn() throws InterruptedException{
        Thread.sleep(3000);
        clickAddDesk.click();
    }

    /*public void clickRemoveDeskColumn() throws InterruptedException{
        Thread.sleep(3000);
        clickRemoveDesk.click();
    }*/

    public void clickCancelBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickCancel.click();
    }
}
