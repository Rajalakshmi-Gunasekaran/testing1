package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LeftPanListsPage {
    public WebDriver driver;
    Actions action;

    public LeftPanListsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "lists-link-icon")
    public WebElement listsBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav[1]/div[3]/button[1]")
    public WebElement CreateFolder;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[3]/div/div/div[3]/div[2]/form/div[2]/div/input")
    public WebElement folderName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[3]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreateFolderBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav[1]/div[3]/button[2]")
    public WebElement CreateList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div[1]/input")
    public WebElement listName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button/i")
    public WebElement clickCreateBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[2]/h5")
    public WebElement validateNewListCreated;
    @FindBy(xpath = "//div[@class=\"folder-header p-3 text-nowrap\"]/div/h5/i")
    public WebElement searchIconBtn;
    @FindBy(xpath = "//div[@class=\"layout-v h-100 d-flex flex-column justify-content-between align-items-stretch\"]/div/form/div/div/input")
    public WebElement searchListName;
    @FindBy(xpath = "//li[@class="d-flex justify-content-start align-items-center px-3 py-2 list-browser-list-item text-nowrap"]/a/div[contains(text()," SmokeSuiteList ")]")
    public WebElement getListName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/small")
    public WebElement validationDeleteList;
    @FindBy(css = ".form-control.form-control-big.m-0")
    public WebElement searchFolder;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[1]/span/span/span/i")
    public WebElement clickFolderName;
    @FindBy(css = ".action-button.d-flex.align-items-center")
    public WebElement clickMenuList;
    @FindBy(css = ".mr-1.icon-trash")
    public WebElement clickDelete;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[5]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement confirmDeleteFolder;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/small")
    public WebElement validationDeleteFolder;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/span/span/span/i")
    public WebElement tickCheckBox;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/span/div/div[2]/div[1]/i")
    public WebElement confirmDelete;

    //click on List button on home page
    public void clickListsBtn() {
        listsBtn.click();
    }

    //click create folder in lists page
    public void clickCreateFolder() {
        CreateFolder.click();
    }

    //enter folder name to create new folder
    public void EnterFolderName(String setFolderName) {
        folderName.sendKeys(setFolderName);
    }

    //click create button to create a new folder
    public void clickCreate() {
        clickCreateFolderBtn.click();
    }

    //validate the new folder is created
    public void validateFolderCreated() {
        Assert.assertTrue(clickFolderName.isDisplayed());
    }

    //click create new list button
    public void createList() {
        CreateList.click();
    }

    //enter list name to create new list
    public void enterListName(String ListName) {
        listName.sendKeys(ListName);
    }

    //click create list to create new list
    public void clickCreateList() {
        clickCreateBtn.click();
    }

    //click magnifying glass to search list
    public void searchIcon() {
        searchIconBtn.click();

    }

    //enter search list name in search list text area
    public void enterListNameToValidate(String listNameToValidate) {
        searchListName.sendKeys(listNameToValidate);
    }

    /*validating list creation*/
    public void validateListCreated() {
        validateNewListCreated.isDisplayed();
    }

    //select list from the option
    public void setGetListName() {
        getListName.click();
    }
    //choose journalist from the list

    //enter folder name to create new folder
    public void enterFolderName(String folderName) {
        searchIconBtn.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(10));
        action.build().perform();
        searchFolder.sendKeys(folderName);

    }

    public void enterListNameToDelete(String listName) {
        searchIconBtn.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(10));
        action.build().perform();
        searchListName.sendKeys(listName);
    }

    /* click folder name to open that folder*/
    public void setClickFolderName() {
        clickFolderName.click();
    }

    // click menu list to choose delete button
    public void menuList() {
        clickMenuList.click();

    }

    public void tickCheckBoxToSelectListName() {
        tickCheckBox.click();
    }

    public void deleteListButton() {
        clickDelete.click();
    }

    // confirm folder to delete
    public void confirmDeleteFolder() {

        confirmDeleteFolder.click();
    }

    // validate folder deletion
    public void validateDeletionFolder() {
        validationDeleteFolder.isDisplayed();
    }

    //enter search list text to select and click on it
    public void searchListTxt(String searchText) {
        searchListName.sendKeys(searchText);
    }

    //confirm deletion
    public void confirmDeletion() {
        confirmDelete.click();
    }

    // Validate list deletion
    public void validateListDeleted() {
        String text = "Nothing in this folder";
        Assert.assertEquals(text, validationDeleteList.getText());
    }
}
