package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftPanListsPage {
    public WebDriver driver;
    public LeftPanListsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
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
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/form[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/ul/li[1]/div[2]/div[1]/div[1]/a")
    public  WebElement  getJournalistName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[2]/h5")
    public WebElement validateNewListCreated;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div/h5/i")
    public WebElement searchIconBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[1]/form/div/div/input")
    public WebElement searchList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li/a/div[1]")
    public WebElement getListName;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]")
    public WebElement clickJournalistFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/span")
    public WebElement removeFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/span/div/div[2]/div[1]/i")
    public WebElement confirmDelete;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div/span")
    public WebElement validateJournalistRemovedFromList;
    @FindBy(css = ".form-control.form-control-big.m-0")
    public WebElement searchFolder;
    @FindBy(xpath="//*[@id=\"main-view\"]/div[1]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[1]/span/span/span/i")
    public WebElement clickFolderName;
    @FindBy(css= ".action-button.d-flex.align-items-center")
    public WebElement clickMenuList;
    @FindBy(css= ".mr-1.icon-trash")
    public WebElement clickDelete;
    @FindBy(xpath="//*[@id=\"main-view\"]/div[1]/div/div[5]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement confirmDeleteFolder;
    @FindBy(css = ".name.flex-grow-1.text-truncate.mr-1")
    public WebElement validationDeleteFolder;
    @FindBy(xpath = "")
    public WebElement deleteList;

    public void clickListsBtn()
    {
        listsBtn.click();
    }
    public void clickCreateFolder()
    {
        CreateFolder.click();
    }
    public void EnterFolderName(String setFolderName)
    {
        folderName.sendKeys(setFolderName);
    }
    public void validateFolderCreated()
    {
        Assert.assertTrue(clickFolderName.isDisplayed());
    }
    public void clickCreate()
    {
        clickCreateFolderBtn.click();
    }
    public void createList()
    {
        CreateList.click();
    }
    /*validating list creation*/
    public String validateListCreated()
    {
        return validateNewListCreated.getText();
    }
    public void addingToList()
    {
        getJournalistName.click();
    }
    public void enterListName(String ListName)
    {
        listName.sendKeys(ListName);
    }
    public void clickCreateList()
    {
        clickCreateBtn.click();
    }
    public void addingJournalistToTheList()
    {
        getJournalistName.click();
    }
    public void searchIcon()
    {
        searchIconBtn.click();
    }
    public void searchListTxt(String searchText)
    {
        searchList.sendKeys(searchText);
    }
    public void setGetListName()
    {
        getListName.click();
    }
    public void chooseJournalist()
    {
        clickJournalistFromList.click();
    }
    public void removeJournalist()
    {
        removeFromList.click();
    }
    public void confirmDeletion()
    {
        confirmDelete.click();
    }
    public String validateJournalistRemoval()
    {
        return  validateJournalistRemovedFromList.getText();
    }
    public void enterFolderName(String folderName)
    {
        searchFolder.sendKeys(folderName);

    }
   /* click folder name to open that folder*/
    public void setClickFolderName()
    {
        clickFolderName.click();
    }

    public void menuList()
    {
        clickMenuList.click();
    }
    public void confirmDeleteFolder()
    {
        clickDelete.click();
        confirmDeleteFolder.click();
    }
    public void validateDeletionFolder()
    {
        String text="Nothing in this folder";
        Assert.assertEquals(text,validationDeleteFolder.getText());
    }
}
