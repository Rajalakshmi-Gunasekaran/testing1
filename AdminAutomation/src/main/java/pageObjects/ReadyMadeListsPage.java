package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadyMadeListsPage extends CommonFunctions{
    public WebDriver driver;
    public ReadyMadeListsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href=\"https://admin-v2.roxhillmedia.com/ready-made-lists\"]")
    public WebElement clkReadyMadeListOptionsUnderTagTab;
    @FindBy(xpath = "//input[@placeholder=\"Search for journalists\"]")
    public WebElement enterJournoNameInSearchByJournoTextFld;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div[2]")
    public WebElement validateReadyMadeListSelectedAsPerSearch;
    @FindBy(xpath = "//span[contains(text(),\"Add List or Group\")]")
    public WebElement clkAddListOrGroupBtn;
    @FindBy(xpath = "//span[contains(text(),\"group\")]")
    public WebElement clkGroupBtn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[3]/div[2]/div[2]/input")
    public WebElement enterGroupTitle;
    @FindBy(xpath = "//span[contains(text(),\"Add group\")]")
    public WebElement clkAddGroupBtn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div[2]/div[1]/span/div[15]/div/div/div[1]/div[3]/i")
    public WebElement clkDeleteBtn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[3]/div[2]/div[2]/input")
    public WebElement enterListName;
    @FindBy(xpath = "//span[@class=\"multiselect__placeholder\"]")
    public WebElement chooseAndClickGroupName;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[3]/div[2]/div[3]/div/div[1]/div[3]/ul/li[1]/span/span")
    public WebElement selectTestMattGroup;
    @FindBy(xpath = "//span[contains(text(),\"Add list\")]")
    public WebElement clkAddListBtn;
    @FindBy(xpath = "//span[contains(text(),\"Test Matt\")]")
    public WebElement clkTestMattRMLGroupOption;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div[2]/div[1]/span/div[3]/div/div[2]/span/div/div/div/div[2]/button/span")
    public WebElement clkAddJournalistLink;
    @FindBy(xpath = "//*[@id=\"vs4__combobox\"]/div[1]/input")
    public WebElement enterJournoToAddList;
    @FindBy(xpath = "//span[contains(text(),\"Add Journalists\")]")
    public WebElement clkAddJournalistBtn;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div[2]/div[1]/span/div[3]/div/div[2]/span/div/div/div[1]/div[1]")
    public WebElement clkTestListUnderTestMattGroup;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div[2]/div[1]/span/div[3]/div/div[2]/span/div/div/div/div[1]/div[3]/i")
    public WebElement clkDeleteListFromRML;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div[2]/div[1]/span/div[3]/div/div[2]/span/div/div/div[2]/div/table/tbody[1]/tr/td[7]/div/i")
    public WebElement clkDeleteJournalistFromList;

    //click ready made list options under tags tab in admin page
    public void setClickReadyMadeList() throws InterruptedException{
        Thread.sleep(3000);
        clkReadyMadeListOptionsUnderTagTab.click();
    }
    //enter journalist name in search by journalist text field in ready made list page
    public void setEnterJournoName(String journoName) throws InterruptedException{
       Thread.sleep(3000);
       enterJournoNameInSearchByJournoTextFld.sendKeys(journoName);
    }
    //validate that the searched journo list appeared in selected state and also displays the number of lists that the journo in
    public void setValidateJournalistInReadyMadeListSelected()throws InterruptedException {
        Thread.sleep(3000);
        validateReadyMadeListSelectedAsPerSearch.isDisplayed();
    }
    //click add list or group button to add list or group in RML
    public void setClickAddListOrGroupBtn() throws InterruptedException {
        Thread.sleep(3000);
        clkAddListOrGroupBtn.click();
    }
    //click group button in add list form to create new group
    public void setClickGroupBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkGroupBtn.click();
    }
    //enter group title to create new group in RML page
    public void setEnterGroupTitle(String groupName) throws InterruptedException{
        Thread.sleep(3000);
        enterGroupTitle.sendKeys(groupName);
    }
    //click add group button in the right hand side
    public void setClickAddGroupBtnToCreateNewRML() throws InterruptedException{
        Thread.sleep(3000);
        clkAddGroupBtn.click();
    }
    //click delete button next to the journo in the recently created group
    public void setDeleteGroup() throws InterruptedException{
        Thread.sleep(3000);
        clkDeleteBtn.click();
    }
    //validate chosen RML group deleted
    public void setValidateRMLGroupDeleted() throws InterruptedException{
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
     //enter list name to add new list to the RML group
    public void setEnterListName(String listName) throws InterruptedException{
        Thread.sleep(3000);
        enterListName.sendKeys(listName);
    }
    //choose and click group name to add created list to it
    public void setChooseAndClickGroupName() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickGroupName.click();
        Thread.sleep(3000);
        selectTestMattGroup.click();
    }
    //click add list button to add new list
    public void setClickAddListBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkAddListBtn.click();
    }
    //click test matt group to add list into it
    public void setClickTestMattRMLGroupToAddList() throws InterruptedException{
        Thread.sleep(3000);
        clkTestMattRMLGroupOption.click();
    }
    //click add journalist button to add journo to the list
    public void setClickAddJournalistBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkAddJournalistLink.click();
    }
    //enter journo name to choose from the list to add to the list
    public void setEnterJournoNameToAddToList(String journoName) throws InterruptedException{
        Thread.sleep(3000);
        enterJournoToAddList.sendKeys(journoName);
        Thread.sleep(6000);
        enterJournoToAddList.sendKeys(Keys.ENTER);
    }
    //click add journo list button to add that chosen journalist
    public void setClickAddJournalistBtnToAdd() throws InterruptedException{
        Thread.sleep(3000);
        clkAddJournalistBtn.click();
    }
    //click testing list under selected group to see the journalist added to the list
    public void  setClickListToSeeJournoAdded()throws InterruptedException{
        Thread.sleep(3000);
        clkTestListUnderTestMattGroup.click();
    }
    //click delete to remove journo from list
    public void setClickDeleteToRemoveJournoFromList()throws InterruptedException {
        Thread.sleep(3000);
        clkDeleteJournalistFromList.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
    //click delete list to remove list from group
    public void setClickDeleteListToRemoveListFromGroup() throws InterruptedException{
        Thread.sleep(3000);
        clkDeleteListFromRML.click();
    }
    //validate RML list deleted
    public void setValidateRMLListDeleted() throws InterruptedException{
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
}
