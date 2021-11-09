package pageObjects;

import cucumber.api.java.ca.I;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ListsPage extends CommonFunctions{
    public WebDriver driver;
    private Actions action;
    public ListsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "lists-link-icon")
    public WebElement listsBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav[1]/div[3]/button[1]")
    public WebElement CreateFolder;
    @FindBy(xpath = "//input[@class=\"form-control mb-3\"]")
    public WebElement folderName;
    @FindBy(xpath = "//button[contains(text(),\"Create\")]")
    public WebElement clickCreateFolderBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav[1]/div[3]/button[2]")
    public WebElement CreateList;
    @FindBy(xpath = "//input[@class=\"form-control mb-3\"]")
    public WebElement listName;
    @FindBy(xpath = "//button[contains(text(),\"Create\")]")
    public WebElement clickCreateBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[2]/h5")
    public WebElement validateNewListCreated;
    @FindBy(xpath = "//div[@class=\"folder-header p-3 text-nowrap\"]/div/h5/i")
    public WebElement searchIconBtn;
    @FindBy(xpath = "//div[@class=\"layout-v h-100 d-flex flex-column justify-content-between align-items-stretch\"]/div/form/div/div/input")
    public WebElement searchListName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/a/div[1]")
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
    @FindBy(xpath = "//button[contains(text(),\"Delete\")]")
    public WebElement confirmDeleteFolder;
    @FindBy(xpath = "//small[contains(text(),\"Nothing in this folder\")]")
    public WebElement validationDeleteFolder;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/span/span/span/i")
    public WebElement tickCheckBox;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/span/div/div[2]/div[1]/i")
    public WebElement confirmDelete;
    @FindBy(xpath = "//a[contains(text(),\"SmokeSuiteList\")]")
    public WebElement clickSmokeSuiteListNameFromLandingPage;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[2]/div[7]/div/div[3]/span[1]/span/span/i")
    public WebElement GDPRCheckBox;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[2]/span/span")
    public WebElement validateJournoAddedToList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[1]/span/span")
    public WebElement clickSelectAll;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/span")
    public WebElement removeFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/span/div/div[2]/div[1]/i")
    public WebElement confirmRemoveJournoFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div/span")
    public WebElement validateJournalistRemovedFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span")
    public WebElement deleteList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span/div/div[2]/div[1]/i")
    public WebElement confirmDeleteList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/a/div[1]/strong")
    public WebElement clickSmokeSuiteList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[4]/div[2]/span/button/span/i")
    public WebElement clickCopyAllToListsBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div/div/div/input")
    public WebElement enterListNameToCopy;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[4]/div[2]/div/div/div/div[3]/div[2]/form/div[3]/button/i")
    public WebElement clickOkToCopyList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[2]/span/i")
    public WebElement validateListCopied;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span")
    public WebElement deleteListBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span/div/div[2]/div[1]/i")
    public WebElement confirmDeleteBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/small")
    public WebElement validateDeletedList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/a/i")
    public WebElement clickOkToChooseList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/form/div/div/div/button")
    public WebElement clickClearField;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[2]/span/span")
    public WebElement validatePinpointList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[2]/span/span")
    public WebElement validateJournoAddedToStreamList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]")
    public WebElement validateJournoAddedToListFromQuickSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[2]/span/span")
    public WebElement ValidateJournoAddedToListFromAdvancedSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/nav[2]/div[2]/span[2]/button")
    public WebElement clickListViewButton;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div/div/div")
    public WebElement validateListViewResults;

    //click on List button on home page
    public void clickListsBtn() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(listsBtn,driver);
        listsBtn.click();
    }
    //click list name on the list
    public void clickListName(){
        clickSmokeSuiteList.click();
    }
    //click create folder in lists page
    public void clickCreateFolder() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(CreateFolder,driver);
        CreateFolder.click();
    }

    //enter folder name to create new folder
    public void EnterFolderName(String setFolderName) throws InterruptedException{
        Thread.sleep(3000);
        folderName.sendKeys(setFolderName);
    }

    //click create button to create a new folder
    public void clickCreate() throws InterruptedException
    {
        Thread.sleep(3000);
        elementClickable(clickCreateFolderBtn,driver);
        clickCreateFolderBtn.click();
    }

    //validate the new folder is created
    public void validateFolderCreated() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(clickFolderName.isDisplayed());
    }

    //click create new list button
    public void createList() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(CreateList,driver);
        CreateList.click();
    }

    //enter list name to create new list
    public void enterListName(String ListName) throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(listName,driver);
        listName.sendKeys(ListName);
    }

    //click create list to create new list
    public void clickCreateList()throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(clickCreateBtn,driver);
        clickCreateBtn.click();
    }

    //click magnifying glass to search list
    public void searchIcon()throws InterruptedException {
        Thread.sleep(3000);
        //elementClickable(searchIconBtn,driver);
        searchIconBtn.click();
    }
    //enter search list name in search list text area
    public void enterListNameToValidate(String listNameToValidate)throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(searchListName,driver);
        searchListName.sendKeys(listNameToValidate);
    }

    /*validating list creation*/
    public void validateListCreated() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(validateNewListCreated,driver);
        validateNewListCreated.isDisplayed();
    }

    //select list from the option
    public void setGetListName()throws InterruptedException
    {
        Thread.sleep(3000);
        getListName.click();
    }
    // search folder name to delete
    public void searchFolderNameToDelete(String folderToDelete)throws InterruptedException
    {
        Thread.sleep(3000);
        searchFolder.sendKeys(folderToDelete);
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
        elementClickable(clickFolderName,driver);
        clickFolderName.click();
    }

    // click menu list to choose delete button
    public void menuList() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickMenuList,driver);
        clickMenuList.click();
    }
    //click checkbox to select list name
    public void tickCheckBoxToSelectListName()throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(tickCheckBox,driver);
        tickCheckBox.click();
    }
    //delete list button
    public void deleteListButton()throws InterruptedException
    {
        Thread.sleep(3000);
        elementClickable(clickDelete,driver);
        clickDelete.click();
    }
    // confirm folder to delete
    public void confirmDeleteFolder()throws InterruptedException
    {
        Thread.sleep(3000);
        elementClickable(confirmDeleteFolder,driver);
        confirmDeleteFolder.click();
    }
    // validate folder deletion
    public void validateDeletionFolder()throws InterruptedException {
        Thread.sleep(3000);
        validationDeleteFolder.isDisplayed();
    }

    //enter search list text to select and click on it
    public void searchListTxt(String searchText) throws InterruptedException
    {
        Thread.sleep(3000);
        elementVisible(searchListName,driver);
        searchListName.sendKeys(searchText);
    }
    public void setDeleteList(){
        deleteList.click();
        wait(30,driver);
        confirmDelete.click();
    }
    //confirm deletion
    public void confirmDeletion()
    {
        elementClickable(confirmDelete,driver);
        confirmDelete.click();
    }
    // Validate list deletion
    public void validateListDeleted() throws InterruptedException
    {
        Thread.sleep(3000);
        String text = "Nothing in this folder";
        Assert.assertEquals(text, validationDeleteList.getText());
    }
    //click smoke suite list name
    public void clickSmokeSuiteListName() throws InterruptedException{
        Thread.sleep(3000);
        clickSmokeSuiteListNameFromLandingPage.click();
    }
    //validate GDPR checkbox
    public boolean validateGDPRCheckbox() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(GDPRCheckBox,driver);
        return GDPRCheckBox.isSelected();
    }

    // validate journalist added to the list
    public void setValidateJournoAddedToList() {
        clickSelectAll.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        validateJournoAddedToList.isDisplayed();
    }
    //choose journalist from the list
    public void chooseJournalist() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickSelectAll,driver);
        clickSelectAll.click();
    }

    // remove journalist from the list
    public void removeJournalist()throws InterruptedException {
        Thread.sleep(3000);
        elementClickable(removeFromList,driver);
        removeFromList.click();
        wait(30,driver);
        confirmRemoveJournoFromList.click();
    }

    //click on delete button in list page to delete list
    public void setClickDelete() throws InterruptedException
    {
        Thread.sleep(3000);
        elementClickable(deleteList,driver);
        deleteList.click();
        elementClickable(confirmDeleteList,driver);
        confirmDeleteList.click();
    }

    // validate journalist removed from the list
    public String validateJournalistRemoval() throws InterruptedException
    {
        Thread.sleep(3000);
        return  validateJournalistRemovedFromList.getText();
    }
    //click on copy all to lists button in lists page
    public void setClickCopyAllToListsBtn()throws InterruptedException{
        Thread.sleep(3000);
        clickCopyAllToListsBtn.click();
    }
    //enter list name to copy lists
    public void setEnterListNameToCopy(String listNameToCopy)throws InterruptedException{
        Thread.sleep(3000);
        enterListNameToCopy.sendKeys(listNameToCopy);
        enterListNameToCopy.sendKeys(Keys.ENTER);
    }
    //click ok to copy lists from one to another
    public void setClickOkToCopyList()throws InterruptedException{
        Thread.sleep(3000);
        clickOkToCopyList.click();
    }
    //click on delete and confirm delete button
    public void setDeleteListBtn()throws InterruptedException    {
        Thread.sleep(3000);
        deleteListBtn.click();
        Thread.sleep(3000);
        confirmDeleteBtn.click();
    }
    //validate list copied to another list
    public void setValidateListCopied()throws InterruptedException{
        Thread.sleep(3000);
        validateListCopied.isDisplayed();
    }
    //validate list deleted
    public void setValidateDeletedList()throws InterruptedException{
        Thread.sleep(3000);
        validateDeletedList.isDisplayed();
    }
//enter list name to select list
    public void enterListNameToChoose(String selectListName) throws InterruptedException{
        Thread.sleep(3000);
        searchListName.sendKeys(selectListName);

    }
    //click ok to choose list
    public void setClickOkToChooseList()throws InterruptedException{
        Thread.sleep(3000);
        clickOkToChooseList.click();
    }
    //click clear search field in order to search list name
    public void setClickClearField()throws InterruptedException{
        Thread.sleep(3000);
        clickClearField.click();
    }

    public void validateJournoAddedToPinpointList() throws InterruptedException{
        Thread.sleep(3000);
        clickSelectAll.click();
        Thread.sleep(3000);
        validatePinpointList.isDisplayed();
    }

    //validate journo added to streams list
    public void setValidateJournoAddedToStreamList()throws InterruptedException{
        Thread.sleep(3000);
        clickSelectAll.click();
        Thread.sleep(3000);
        validateJournoAddedToStreamList.isDisplayed();
    }
    //validate journo added to quick search list
    public void validateJournoAddedToQuickSearchList() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoAddedToListFromQuickSearch.isDisplayed();
    }
    //validate journo added to list from advanced search
    public void validateJournoAddedToListFromAdvancedSearch() throws InterruptedException{
        Thread.sleep(3000);
        clickSelectAll.click();
        Thread.sleep(3000);
        ValidateJournoAddedToListFromAdvancedSearch.isDisplayed();
    }
    //click list view button in lists page
    public void setClickListViewBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickListViewButton.click();
    }
    //validate list view results
    public void setValidateListView() throws InterruptedException{
        Thread.sleep(3000);
        validateListViewResults.isDisplayed();
    }
}
