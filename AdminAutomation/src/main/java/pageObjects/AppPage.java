package pageObjects;

import cucumber.api.java.cs.A;
import gherkin.lexer.Th;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppPage extends CommonFunctions{
    public WebDriver driver;
    public AppPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),\"App\")]")
    public WebElement appTab;
    @FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[1]/a")
    public WebElement clkUser;
    @FindBy(xpath = "//button[@class=\"btn btn-default dropdown-toggle\"]")
    public WebElement clickStatus;
    @FindBy(xpath = "//a[contains(text(),\"Enabled\")]")
    public WebElement chooseStatus;
    @FindBy(name = "keywords")
    public WebElement enterUserName;
    @FindBy(xpath = "//strong[contains(text(),\"Raji Anand\")]")
    public WebElement clkUserNameFRomList;
    @FindBy(xpath = "//h1[contains(text(),\"raji.anand@roxhillmedia.com (ID: 31498)\")]")
    public WebElement validateUserProfile;
    @FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[3]/a")
    public WebElement clkCustomer;
    @FindBy(xpath = "//button[@class=\"btn btn-default dropdown-toggle\"]")
    public WebElement clickTypeOfCustomer;
    @FindBy(xpath = "//a[contains(text(),\"Subscribed\")]")
    public WebElement chooseCustomerType;
    @FindBy(xpath = "//b[contains(text(),\"Has Overdue Invoice Notification:\")]")
    public WebElement clickOverdueInvoiceNotification;
    @FindBy(xpath = "//a[contains(text(),\"No\")]")
    public WebElement chooseOverdueInvoiceNotificationStatus;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    public WebElement enterCustomerName;
    @FindBy(xpath = "//span[@class=\"glyphicon glyphicon-edit\"]")
    public WebElement clkEditCustomerBtn;
    @FindBy(xpath = "//a[contains(text(),\"Testing\")]")
    public WebElement validateCustomerProfile;
    @FindBy(xpath = "//a[@class=\"btn btn-primary  \"]")
    public WebElement clkAddNewBtn;
    @FindBy(id = "customer_name")
    public WebElement enterCustomerNameToCreateNewCustomer;
    @FindBy(id = "customer_domain")
    public WebElement enterDomainName;
    @FindBy(name= "submit")
    public WebElement clkSaveBtn;
    @FindBy(xpath = "//span[@class=\"glyphicon glyphicon-remove\"]")
    public WebElement clkDeleteBtn;
    @FindBy(xpath = "//a[contains(text(),\"Delete\")]")
    public WebElement clkConfirmDeleteBtn;
    @FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[6]/a")
    public WebElement clkAllAlerts;
    @FindBy(xpath = "//a[@class=\"btn btn-primary dropdown-toggle\"]")
    public WebElement clkAddNewBtnInAlerts;
    @FindBy(xpath = "//a[contains(text(),\"New Story User Alert\")]")
    public WebElement getChooseAlertTypeAsNewStoryUserAlert;
    @FindBy(id = "working_set_user_alert_name")
    public WebElement enterNewStoryUserAlertName;
    @FindBy(id = "working_set_user_alert_workingSetTag")
    public WebElement clickSelectWorkingSetTag;
    @FindBy(xpath = "//option[contains(text(),\"Alert when written\")]")
    public WebElement chooseWorkingSetTagDropDown;
    @FindBy(id = "working_set_user_alert_enabled")
    public WebElement unCheckEnabledCheckBox;
    @FindBy(name = "submit")
    public WebElement clkSaveBtnInUserAlert;
    @FindBy(xpath = "//button[@class=\"btn btn-default dropdown-toggle\"]")
    public WebElement clickTypeDropDown;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[5]/div[1]/ul/li[3]/a")
    public WebElement chooseTypeAsNewStoryUserAlert;
    @FindBy(xpath = "//span[@class=\"glyphicon glyphicon-edit\"]")
    public WebElement clickEditBtn;
    @FindBy(xpath = "//a[contains(text(),\"Url Check Author User Alert\")]")
    public WebElement getChooseAddAlertTypeAsURLCheckAuthor;
    @FindBy(name = "url_check_author_user_alert[name]")
    public WebElement enterURLAuthorUserAlertName;
    @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")
    public WebElement clkAuthorFieldInAlertCreationForm;
    @FindBy(xpath = "//span[@class=\"select2-search select2-search--dropdown\"]")
    public WebElement enterAuthor;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[5]/div[1]/ul/li[4]/a")
    public WebElement chooseTypeAsURLAuthorUserAlert;
    @FindBy(xpath = "//a[contains(text(),\"No\")]")
    public WebElement clickEnabledDropDownAsNo;
    @FindBy(xpath = "//a[contains(text(),\"Last\")]")
    public WebElement clickPageNumberLinks;
    @FindBy(xpath = "//strong[contains(text(),\"Automation\")]")
    public WebElement clkAutomationAlertURLAuthorToEdit;
    @FindBy(xpath = "//b[contains(text(),\"Enabled\")]")
    public WebElement clkEnableDropDown;

    //click app tab in admin page
    public void clickAppTab() throws InterruptedException{
      Thread.sleep(3000);
       appTab.click();
    }

    //click users option under app tab
    public void clickOnUsers() throws InterruptedException{
        Thread.sleep(3000);
        clkUser.click();
    }
    //choose status of the user from the options enabled, disabled or all
    public void chooseStatus() throws InterruptedException{
         Thread.sleep(3000);
         clickStatus.click();
         chooseStatus.click();
    }
    //enter user name to create new user in admin page
    public void enterUserName(String userName) throws InterruptedException{
         Thread.sleep(3000);
         enterUserName.sendKeys(userName);
         enterUserName.sendKeys(Keys.ENTER);
    }
    //choose user from the list to see the user profile
    public void clkUserNameFromTheList() throws InterruptedException{
         Thread.sleep(3000);
         clkUserNameFRomList.click();
    }
    //navigate to user profile and validate the user
    public void validateUserProfile() throws InterruptedException{
         Thread.sleep(3000);
         validateUserProfile.isDisplayed();
    }
    //click customer under app tab in admin page
    public void clkCustomer() throws InterruptedException{
        Thread.sleep(3000);
        clkCustomer.click();
    }
    //choose customer type from the options trialing, full trialing, subscribed, disabled or all
    public void chooseCustomerType() throws InterruptedException{
        Thread.sleep(3000);
        clickTypeOfCustomer.click();
        chooseCustomerType.click();
    }
    //choose customer overdue invoice notification options yes, no or all
    public void chooseCustomerOverdueInvoiceNotification()throws InterruptedException{
        Thread.sleep(3000);
        clickOverdueInvoiceNotification.click();
        chooseOverdueInvoiceNotificationStatus.click();
    }
    //enter customer name in search text field to search for customer in admin page
    public void enterCustomerName(String customerName) throws InterruptedException{
        Thread.sleep(3000);
        enterCustomerName.sendKeys(customerName);
        //Thread.sleep(3000);
        enterCustomerName.sendKeys(Keys.ENTER);
    }
    //click edit customer button to edit customer details
    public void clkEditCustomerBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkEditCustomerBtn.click();
    }
    //validate customer profile
    public void validateCustomer() throws InterruptedException{
        Thread.sleep(3000);
        validateCustomerProfile.isDisplayed();
    }
    //click add new button to add new customer
    public void setClkAddNewBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewBtn.click();
    }
    //enter customer name to create new customer in admin page
    public void setEnterCustomerName(String newCustomerName) throws InterruptedException{
        Thread.sleep(3000);
        enterCustomerNameToCreateNewCustomer.sendKeys(newCustomerName);
    }
    // enter domain name in creating new customer details page
    public void setEnterDomainName(String newDomainName) throws InterruptedException{
        Thread.sleep(3000);
        enterDomainName.sendKeys(newDomainName);
    }
    // click save button to save new customer in admin page
    public void setClkSaveBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveBtn.click();
    }
    //click delete button to delete customer from admin page
    public void setClkDeleteBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkDeleteBtn.click();
    }
    // click confirm delete button to delete customer from admin page
    public void setClkConfirmDeleteBtn()throws InterruptedException {
        Thread.sleep(3000);
        clkConfirmDeleteBtn.click();
    }
    //click all alerts option under app tab in admin page
    public void setClkAllAlerts() throws InterruptedException{
        Thread.sleep(3000);
        clkAllAlerts.click();
    }

    //click add new button and choose and choose and click new story user alert option from drop down
    public void setClkNewStoryUserAlert() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewBtnInAlerts.click();
        Thread.sleep(3000);
        getChooseAlertTypeAsNewStoryUserAlert.click();
    }
    //enter new story user alert name to create new user alert
    public void setEnterNewStoryUserAlertName(String storyAlertName)throws InterruptedException {
        Thread.sleep(3000);
        enterNewStoryUserAlertName.sendKeys(storyAlertName);
    }
    //choose working set tag option as alert when written
    public void setChooseWorkingSetTag() throws InterruptedException{
        Thread.sleep(3000);
        clickSelectWorkingSetTag.click();
        Thread.sleep(3000);
        chooseWorkingSetTagDropDown.click();
    }
    //uncheck enabled check box in creating user alert page
    public void setUncheckEnabled()throws InterruptedException {
         Thread.sleep(3000);
         unCheckEnabledCheckBox.click();
    }
    //click save button in creating user alert page
    public void setClkSaveBtnInUserAlert() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveBtnInUserAlert.click();
    }
    //choose type as new story user alert from type drop down
    public void setChooseTypeAsNewStoryUserAlert() throws InterruptedException{
        Thread.sleep(3000);
        clickTypeDropDown.click();
        Thread.sleep(3000);
        chooseTypeAsNewStoryUserAlert.click();
    }
    // click edit button in alerts page to edit user alert page
    public void setClkEditBtn() throws InterruptedException{
        Thread.sleep(3000);
        clickEditBtn.click();
    }
    //edit user alert name in creating user alert page
    public void setEditUserAlertName(String editUserAlertName) throws InterruptedException{
        Thread.sleep(3000);
        enterNewStoryUserAlertName.sendKeys(editUserAlertName);
    }

    public void setClkAddURLCheckAuthorUserAlert() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewBtnInAlerts.click();
        Thread.sleep(3000);
        getChooseAddAlertTypeAsURLCheckAuthor.click();
    }

    public void setEnterURLAuthorUserAlertName(String urlAuthorUserAlertName) throws InterruptedException{
        Thread.sleep(3000);
        enterURLAuthorUserAlertName.sendKeys(urlAuthorUserAlertName);
    }

    public void setChooseAndEnterAuthor(String author) throws InterruptedException{
        Thread.sleep(3000);
        clkAuthorFieldInAlertCreationForm.click();
        Thread.sleep(3000);
        enterAuthor.sendKeys(author);
        Thread.sleep(6000);
        enterAuthor.sendKeys(Keys.ENTER);
    }

    public void setChooseTypeAsURLAuthorUserAlert() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeAsURLAuthorUserAlert.click();
    }

    public void setClickEnabledDropDownAsNo() throws InterruptedException{
        Thread.sleep(3000);
        clkEnableDropDown.click();
        Thread.sleep(3000);
        clickEnabledDropDownAsNo.click();
    }

    public void setClickPageNumber() throws InterruptedException{
        Thread.sleep(3000);
        clickPageNumberLinks.click();
    }

    public void setClickAutomationUrlCheckAuthorToEdit() throws InterruptedException{
        Thread.sleep(3000);
        clkAutomationAlertURLAuthorToEdit.click();
    }

    public void setEditAuthorAlertName(String editAuthorName)throws InterruptedException {
        Thread.sleep(3000);
        enterURLAuthorUserAlertName.sendKeys(editAuthorName);
    }
}
