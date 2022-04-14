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
    @FindBy(xpath = "//a[@href=\"/admin/widgets\"]")
    public WebElement clkWidgetsOptions;
    @FindBy(xpath = "//a[contains(text(),\"Last\")]")
    public WebElement clkLastPageNumberInWidget;
    @FindBy(xpath = "//*[@id=\"main_content\"]/table/tbody/tr[2]/td[7]/a[2]/span")
    public WebElement clkEditBtnInWidgets;
    @FindBy(xpath = "//a[contains(text(),\"Edit\")]")
    public WebElement validateNavigateToChosenWidget;
    @FindBy(xpath = "//a[contains(text(),\"Visibility\")]")
    public WebElement clkVisibilityTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]")
    public WebElement validateVisibilityTab;
    @FindBy(xpath = "//a[contains(text(),\"People\")]")
    public WebElement clkPeopleTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/table")
    public WebElement validatePeopleTab;
    @FindBy(xpath = "//a[contains(text(),\"Panorama\")]")
    public WebElement clkPanoramaTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/table")
    public WebElement validatePanoramaTab;
    @FindBy(xpath = "//a[contains(text(),\"Story Topic Tags\")]")
    public WebElement clkStoryTopicTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/ul[2]")
    public WebElement validateStoryTopicTab;
    @FindBy(name= "widget[title]")
    public WebElement enterWidgetTitle;
    @FindBy(name = "widget[description]")
    public WebElement enterDescription;
    @FindBy(xpath = "//a[@href=\"/admin/widgets?page=7\"]")
    public WebElement clk7thPageInPageNumbers;
    @FindBy(xpath = "//*[@id=\"main_content\"]/table/tbody/tr[6]/td[7]/a[3]")
    public WebElement clkCrossMarkToDeleteBtn;
    @FindBy(xpath = "//a[@href=\"/admin/saved-search\"]")
    public WebElement clkSavedSearchesOptions;
    @FindBy(xpath = "//a[contains(text(),\"Tweet Story saved search\")]")
    public WebElement clickSavedSearchTypeAsTweetStory;
    @FindBy(name = "tweet_story_saved_search[name]")
    public WebElement enterSavedSearchName;
    @FindBy(name = "tweet_story_saved_search[articleType]")
    public WebElement clkTypeDropDownToSelectSavedSearchType;
    @FindBy(xpath = "//option[contains(text(),\"Outlets\")]")
    public WebElement selectTypeAsOutlet;
    @FindBy(xpath = "//input[@placeholder=\"Sector\"]")
    public WebElement enterSectorAsFashion;
    @FindBy(name= "keywords")
    public WebElement clkAndEnterSavedSearchNameFld;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[9]/table/tbody/tr[1]/td[2]/a[2]/span")
    public WebElement clkDeleteSavedSearchBtn;
    
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
    //click add URL check author user alert
    public void setClkAddURLCheckAuthorUserAlert() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewBtnInAlerts.click();
        Thread.sleep(3000);
        getChooseAddAlertTypeAsURLCheckAuthor.click();
    }
    //enter URL author user alert name
    public void setEnterURLAuthorUserAlertName(String urlAuthorUserAlertName) throws InterruptedException{
        Thread.sleep(3000);
        enterURLAuthorUserAlertName.sendKeys(urlAuthorUserAlertName);
    }
    // choose author field in alert creation form and enter author name
    public void setChooseAndEnterAuthor(String author) throws InterruptedException{
        Thread.sleep(3000);
        clkAuthorFieldInAlertCreationForm.click();
        Thread.sleep(3000);
        enterAuthor.sendKeys(author);
        Thread.sleep(6000);
        enterAuthor.sendKeys(Keys.ENTER);
    }
    //choose type as URL author user alert
    public void setChooseTypeAsURLAuthorUserAlert() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeAsURLAuthorUserAlert.click();
    }
    // click enabled drop down as "no" to filter the search
    public void setClickEnabledDropDownAsNo() throws InterruptedException{
        Thread.sleep(3000);
        clkEnableDropDown.click();
        Thread.sleep(3000);
        clickEnabledDropDownAsNo.click();
    }
    //click page numbers to scroll through to the desired page
    public void setClickPageNumber() throws InterruptedException{
        Thread.sleep(3000);
        clickPageNumberLinks.click();
    }
    //click automation URL check author to edit
    public void setClickAutomationUrlCheckAuthorToEdit() throws InterruptedException{
        Thread.sleep(3000);
        clkAutomationAlertURLAuthorToEdit.click();
    }
    //edit author alert name
    public void setEditAuthorAlertName(String editAuthorName)throws InterruptedException {
        Thread.sleep(3000);
        enterURLAuthorUserAlertName.sendKeys(editAuthorName);
    }
    //click widgets option from the app tab
    public void setClickWidgetsOptions() throws InterruptedException{
        Thread.sleep(3000);
        clkWidgetsOptions.click();
    }
    //click last page numbers in widget
    public void setClickLastPageInWidget() throws InterruptedException{
        Thread.sleep(3000);
        clkLastPageNumberInWidget.click();
    }
    //click edit button in widgets
    public void setClickEditBtnInWidgets() throws InterruptedException{
        Thread.sleep(3000);
        clkEditBtnInWidgets.click();
    }
    //navigate to chosen widget
    public void setNavigateToChosenWidget() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToChosenWidget.isDisplayed();
    }
    //click visibility tab
    public void setClickVisibilityTabs() throws InterruptedException{
        Thread.sleep(3000);
        clkVisibilityTab.click();
    }
    //validate visibility tab
    public void setValidateVisibilityTab() throws InterruptedException{
        Thread.sleep(3000);
        validateVisibilityTab.isDisplayed();
    }
    //click people tab
    public void setClickPeopleTab() throws InterruptedException{
        Thread.sleep(3000);
        clkPeopleTab.click();
    }
    //validate people tab opens
    public void setValidatePeopleTab() throws InterruptedException{
        Thread.sleep(3000);
        validatePeopleTab.isDisplayed();
    }
    //click panorama tab
    public void setClickPanoramaTab() throws InterruptedException{
        Thread.sleep(3000);
        clkPanoramaTab.click();
    }
    //validate panorama tab opens
    public void setValidatePanoramaTab() throws InterruptedException{
        Thread.sleep(3000);
        validatePanoramaTab.isDisplayed();
    }
    //click story topic tab
    public void setClickStoryTopicTab() throws InterruptedException{
        Thread.sleep(3000);
        clkStoryTopicTab.click();
    }
    //validate story topic tab opens
    public void setValidateStoryTopicTab() throws InterruptedException{
        Thread.sleep(3000);
        validateStoryTopicTab.isDisplayed();
    }
    //enter widget title to create new widget
    public void setEnterWidgetTitle(String widgetTitle) throws InterruptedException{
        Thread.sleep(3000);
        enterWidgetTitle.sendKeys(widgetTitle);
    }
    //enter widget description
    public void setEnterDescription(String widgetDescription) throws InterruptedException{
        Thread.sleep(3000);
        enterDescription.sendKeys(widgetDescription);
    }
    //click seventh page to navigate to the recently created widget
    public void setClickSeventhPage() throws InterruptedException{
        Thread.sleep(3000);
        clk7thPageInPageNumbers.click();
    }
    //click red cross to delete the chosen widget
    public void setClickMarkDeleteChosenWidget() throws InterruptedException{
        Thread.sleep(3000);
        clkCrossMarkToDeleteBtn.click();
        Thread.sleep(3000);
        clkConfirmDeleteBtn.click();
    }
    //click saved search options under App tab
    public void setClickSavedSearchOptions() throws InterruptedException{
        Thread.sleep(3000);
        clkSavedSearchesOptions.click();
    }
    //choose and click saved search type as tweet story from the options
    public void setClickTypeAsTweetStory() throws InterruptedException{
        Thread.sleep(3000);
        clickSavedSearchTypeAsTweetStory.click();
    }
    //enter saved search name to create new saved search
    public void setEnterSavedSearchName(String savedSearchName) throws InterruptedException{
        Thread.sleep(3000);
        enterSavedSearchName.sendKeys(savedSearchName);
    }
    //click saved search type as outlet
    public void setClickSavedSearchTypeAsOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clkTypeDropDownToSelectSavedSearchType.click();
        Thread.sleep(3000);
        selectTypeAsOutlet.click();
    }
    //enter sector as fashion in creating saved searches
    public void setEnterSectorAsFashion(String sector)throws InterruptedException {
        Thread.sleep(3000);
        enterSectorAsFashion.sendKeys(sector);
        Thread.sleep(3000);
        enterSectorAsFashion.sendKeys(Keys.ENTER);
    }
    //enter saved search name in search field as testing
    public void setEnterSavedSearchNameInSearchField(String savedSearchName) throws InterruptedException{
        Thread.sleep(3000);
        clkAndEnterSavedSearchNameFld.sendKeys(savedSearchName);
        clkAndEnterSavedSearchNameFld.sendKeys(Keys.ENTER);
    }
    //delete recently added saved search
    public void setDeleteSavedSearch()throws InterruptedException {
        Thread.sleep(3000);
        clkDeleteSavedSearchBtn.click();
        Thread.sleep(3000);
        clkConfirmDeleteBtn.click();
    }
}
