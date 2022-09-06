package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedsPage extends CommonFunctions{
    public WebDriver driver;
    public FeedsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),\"Feeds\")]")
    public WebElement clkFeedTab;
    @FindBy(xpath = "//a[@href=\"/admin/feed/author-list/deleted\"]")
    public WebElement clkDeletedJournalistLists;
    @FindBy(xpath = "//a[contains(text(),\"Last\")]")
    public WebElement clkPageNumberAsLast;
    @FindBy(xpath = "//a[contains(text(),\"Sample list\")]")
    public WebElement clkListNameLink;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[6]/table/tbody/tr[1]/td[3]/input")
    public WebElement clkCheckBoxToSelectJournoForRemoval;
    @FindBy(id = "remove-selected-btn")
    public WebElement clkRemoveAuthorFromListBtn;
    @FindBy(xpath = "//a[contains(text(),\"Unassign\")]")
    public WebElement clkUnAssignBtn;
    @FindBy(xpath = "//strong[contains(text(),\"1\")]")
    public WebElement validateJournalistRemovalFromList;
    @FindBy(xpath = "//a[@class=\"btn btn-default btn-xs person-render\"]")
    public WebElement clickJournalistListName;
    @FindBy(xpath = "//a[@class=\"btn btn-info\"]")
    public WebElement validateJournoProfilePage;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[6]/table/tbody/tr[1]/td[5]/a")
    public WebElement clkUserEmailLinkInDeletedList;
    @FindBy(xpath = "//strong[contains(text(),\"Users\")]")
    public WebElement validateNavigateToUserProfilePage;
    @FindBy(xpath = "//a[contains(text(),\"Last\")]")
    public WebElement clkLastPageInScrollNumbers;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[6]/table/tbody/tr[15]/td[6]/a")
    public WebElement clkUnDeleteBtn;
    @FindBy(xpath = "//*[@id=\"main_content\"]/p")
    public WebElement validateUnDeleteJournoList;


    //click feeds tab in admin page
    public void setClickFeedsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkFeedTab.click();
    }

    //click deleted journalist lists under feeds tab
    public void setClickDeletedJournalistLists() throws InterruptedException{
        Thread.sleep(3000);
        clkDeletedJournalistLists.click();
    }

    //click list name link in deleted journalist list page
    public void setClickListNameLink() throws InterruptedException{
        Thread.sleep(3000);
        clkListNameLink.click();
    }

    //click check box to select journo for removal
    public void setClickCheckBoxToSelectJournoForRemoval()throws InterruptedException {
        Thread.sleep(3000);
        clkCheckBoxToSelectJournoForRemoval.click();
    }

    //click removal author from list button
    public void setClickRemoveAuthorFromListBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkRemoveAuthorFromListBtn.click();
    }

    //click un assign button
    public void setClickUnAssignBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkUnAssignBtn.click();
    }

    //validate journalist removal from the list
    public void setValidateJournalistRemoval() throws InterruptedException{
        Thread.sleep(3000);
        validateJournalistRemovalFromList.isDisplayed();
    }

    //click journalist name link
    public void setClickJournalistNameLink() throws InterruptedException{
        Thread.sleep(3000);
        clickJournalistListName.click();
    }

    //validate journo profile page
    public void setValidateJournoProfilePage() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoProfilePage.isDisplayed();
    }

    //click page numbers as last
    public void setClickPageNumberAsLast() throws InterruptedException{
        Thread.sleep(3000);
        clkPageNumberAsLast.click();
    }

    //click user email
    public void setClickUserEmail() throws InterruptedException{
        Thread.sleep(3000);
        clkUserEmailLinkInDeletedList.click();
    }


    //validate navigate to user profile page
    public void setNavigateToUserProfilePage()throws InterruptedException {
        Thread.sleep(3000);
        validateNavigateToUserProfilePage.isDisplayed();
    }

    //click last page in scroll numbers
    public void setClickLastPageInScrollNumbers() throws InterruptedException{
        Thread.sleep(3000);
        clkLastPageInScrollNumbers.click();
    }

    //click un delete button
    public void setClickUnDeleteBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkUnDeleteBtn.click();
    }

    //validate un delete journalist list
    public void setValidateUnDeleteJournalistList()throws InterruptedException {
        Thread.sleep(3000);
        validateUnDeleteJournoList.isDisplayed();
    }
}
