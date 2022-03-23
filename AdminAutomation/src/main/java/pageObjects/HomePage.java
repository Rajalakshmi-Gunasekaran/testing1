package pageObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonFunctions{
    public WebDriver driver;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[2]/div")
    public WebElement userprofile;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[3]/div/div/div/div[3]/span")
    public WebElement logout;
    @FindBy(id = "pinpoint-link-icon")
    public WebElement clickPinPointTab;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/a")
    public WebElement goBackBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/nav/div[2]/span")
    public WebElement validateGoBackBtn;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[3]")
    public WebElement clkWebinarTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button/span/span")
    public WebElement clkSelectAll;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button[2]/span/span")
    public WebElement validateWebinarAlert;
    /*@FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[3]/ul")
    public WebElement clkJournoLink;*/
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[3]")
    public WebElement validateJournoLink;
    @FindBy(id = "btn-help-and-feedback")
    public WebElement clickHelpAndFeedbackButton;
    @FindBy(xpath = "//*[@id=\"TICKET.content-48dcc618-c24c-4632-95b3-32d98b36f850\"]")
    public WebElement enterDesc;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[4]/div/div/div[3]/div/div/div/div[1]/nav/button")
    public WebElement clickSendButton;
    @FindBy(xpath = "//*[@id=\"hubspot-feedback-form\"]/div")
    public WebElement validateHelpAndFeedback;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[5]")
    public WebElement clickJournoFavouritesTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div")
    public WebElement validateJournoAddedToFavourites;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[2]")
    public WebElement clickAllAlertsTabInSubHeaders;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[4]")
    public WebElement clickNewEditionsInSubHeaders;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button[2]/span/span")
    public WebElement validateAllAlertsResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button[2]/span/span")
    public WebElement validateNewEditionsResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button")
    public WebElement selectAll;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div[1]/div[2]/a")
    public WebElement clickOutletLogo;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[2]/div/div")
    public WebElement validateOutletLogoNavigatesToOutletProfile;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[5]/a")
    public WebElement clickSearchAllAlerts;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]")
    public WebElement validateSearchAllAlertsNavigatesToAdvancedSearch;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div")
    public WebElement clickAlertFromAllAlerts;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/div[1]/button[2]/span/span")
    public WebElement validateAlertsResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[1]/nav/div[2]/form/input")
    public WebElement enterKeyword;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]")
    public WebElement validateKeywordSearchResults;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[1]/nav/div[2]/nav/a[3]")
    public WebElement clickWebinarTab;
    @FindBy(xpath = "//p[contains(text(),\"Sign up \")]")
    public WebElement clickSignUpHere;
    @FindBy(xpath = "//a[contains(text(),\" FunctionalTest \")]")
    public WebElement validateFunctionalTestStreamTab;
    @FindBy(xpath = "//div[@class=\"highlight-column h-100\"]")
    public WebElement validateRoxhillHighlights;
    @FindBy(xpath = " //a[contains(text(),\"View Roxhill Help \")]")
    public WebElement clickViewRoxhillHelpBtn;
    @FindBy(xpath = "//*[@id=\"header-menu-section\"]/div/div[1]/div/div/div")
    public WebElement validateNavigateToRoxhillHelp;
    @FindBy(xpath = "//button[contains(text(),\" Roxhill End-User Licence Agreement \")]")
    public WebElement clickEndUserLicenseAgreement;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/div[4]/div/div/div[3]/div/div/div[2]")
    public WebElement validateEULAForm;
    @FindBy(xpath = "//button[contains(text(),\" Close \")]")
    public WebElement clickCloseBtn;
    @FindBy(xpath = "//*[@id=\"header-menu-section\"]")
    public WebElement validateSignUpWebinar;

    /* Initialising Web driver*/
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    /*  validating login with user profile logo*/
    public String getLoginToastMsg() {
        return userprofile.getText();
    }

    /*clicking on user profile to log out*/
    public void userProfile() {
        userprofile.click();
    }

    /*logout from the application*/
    public void logOut()throws InterruptedException {
        Thread.sleep(3000);
        logout.click();
    }

   /*go to pin point tab in order to check go back button*/
    public void setPinpointTab()throws InterruptedException {
        Thread.sleep(3000);
        clickPinPointTab.click();
    }

    /*clicking go back button*/
    public void setGoBackBtn()throws InterruptedException {
        Thread.sleep(6000);
        goBackBtn.click();
    }

    /*validating go back button with highlight displayed on home page which is unique for home page*/
    public void setValidateGoBackBtn() {
        Assert.assertTrue(validateGoBackBtn.isDisplayed());
    }

    /* click on webinar alerts tab*/
    public void clickWebinar()throws InterruptedException {
        Thread.sleep(6000);
        elementClickable(clkWebinarTab,driver);
        clkWebinarTab.click();
    }

    public void clickSelectAll()throws InterruptedException {
        Thread.sleep(6000);
        elementClickable(clkSelectAll,driver);
        clkSelectAll.click();
    }

    public void setValidateWebinarAlert() throws InterruptedException{
        Thread.sleep(6000);
        validateWebinarAlert.isDisplayed();
    }

    /*validating whether the sign up link navigating to the Roxhill site*/
    public void validateQuickLinks()throws InterruptedException {
        Thread.sleep(6000);
        validateJournoLink.isDisplayed();
    }

    /*Validating help and feedback functionality*/
    public void clickHelpAndFeedback()throws InterruptedException {
        Thread.sleep(3000);
        clickHelpAndFeedbackButton.click();
    }

    public void setEnterDesc(String desc)throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(enterDesc,driver);
        enterDesc.sendKeys(desc);
    }

    public void setClickSendButton()throws InterruptedException {
        Thread.sleep(3000);
        elementClickable(clickSendButton,driver);
        clickSendButton.click();
    }

    public void setValidateHelpAndFeedback()throws InterruptedException {
        Thread.sleep(3000);
        validateHelpAndFeedback.isDisplayed();
    }
    public void validateJournoAddedToFavourites()throws InterruptedException {
        Thread.sleep(3000);
         validateJournoAddedToFavourites.isDisplayed();
    }

    public void setClickFavouriteJournoTab() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickJournoFavouritesTab,driver);
        clickJournoFavouritesTab.click();
    }

    public void setClickAllAlertsTab() throws InterruptedException{
        Thread.sleep(6000);
        elementClickable(clickAllAlertsTabInSubHeaders,driver);
        clickAllAlertsTabInSubHeaders.click();
    }

    public void setClickSelectAll() throws InterruptedException{
        Thread.sleep(6000);
        elementClickable(clkSelectAll,driver);
        clkSelectAll.click();
    }

    public void setValidateAllAlertsResults()throws InterruptedException {
        Thread.sleep(6000);
        validateAllAlertsResults.isDisplayed();
    }

    public void setClickNewEditionsTab()throws InterruptedException {
        Thread.sleep(3000);
        elementClickable(clickNewEditionsInSubHeaders,driver);
        clickNewEditionsInSubHeaders.click();
    }

    public void setValidateNewEditionResults() throws InterruptedException{
        Thread.sleep(3000);
        validateNewEditionsResults.isDisplayed();
    }

    public void setClickOutletLogo() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickOutletLogo,driver);
        clickOutletLogo.click();
    }

    public void setValidateOutletLogoNavigatesToOutletProfile() throws InterruptedException{
        Thread.sleep(3000);
        validateOutletLogoNavigatesToOutletProfile.isDisplayed();
    }
    //click search all alerts button in home page
    public void setClickSearchAllAlertsBtn() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickSearchAllAlerts,driver);
        clickSearchAllAlerts.click();
    }
    //validate search all alerts navigates to advanced search alert page
    public void setValidateSearchAllAlertsNavigatesToAdvancedSearch() throws InterruptedException{
        Thread.sleep(3000);
        validateSearchAllAlertsNavigatesToAdvancedSearch.isDisplayed();
    }
    //click alerts tile to select alert from the options
    public void setClickAlertTile() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickAlertFromAllAlerts,driver);
        clickAlertFromAllAlerts.click();
    }
    //validate alerts results
    public void setValidateAlertsResults() throws InterruptedException{
        Thread.sleep(3000);
        validateAlertsResults.isDisplayed();
    }
    //enter quick find by keyword in text field headline home page
    public void setEnterQuickFindByKeyword(String keyword) throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(enterKeyword,driver);
        enterKeyword.sendKeys(keyword);
    }
    //validate quick by find keyword in home page headline alerts tab
    public void validateQuickByFindKeyword() throws InterruptedException{
        Thread.sleep(3000);
        validateKeywordSearchResults.isDisplayed();
    }
    //click webinar alerts tab in headers home page
    public void setClickWebinarTab() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickWebinarTab,driver);
        clickWebinarTab.click();
    }
    //click sign up here link
    public void setClickSignUpHere() throws InterruptedException{
        Thread.sleep(3000);
        elementClickable(clickSignUpHere,driver);
        clickSignUpHere.click();
    }
    //validate stream sets as default home page
    public void validateFunctionalTestStream() throws InterruptedException {
        Thread.sleep(3000);
        elementVisible(validateFunctionalTestStreamTab,driver);
        validateFunctionalTestStreamTab.isDisplayed();
    }
     //validate Roxhill highlights displays in the right side of home page
    public void validateRoxhillHighlghtResults() throws InterruptedException{
        Thread.sleep(3000);
        elementVisible(validateRoxhillHighlights,driver);
        validateRoxhillHighlights.isDisplayed();
    }
    //click "view in roxhill help" button
    public void setClickViewRoxhillHelp() throws InterruptedException{
        Thread.sleep(3000);
        clickViewRoxhillHelpBtn.click();
    }
    //validate navigate to the roxhill help page
    public void validateNavigateToRoxhillHelpPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToRoxhillHelp.isDisplayed();
    }

    public void setClickEndUserLicenseAgreementLink() throws InterruptedException{
        Thread.sleep(3000);
        clickEndUserLicenseAgreement.click();
    }

    public void validateEULAFormPage() throws InterruptedException{
        Thread.sleep(3000);
        validateEULAForm.isDisplayed();
    }

    public void setClickCloseBtnToCloseEULA() throws InterruptedException{
        Thread.sleep(3000);
        clickCloseBtn.click();
    }

    public void setValidateSignUpHere() throws InterruptedException{
        Thread.sleep(3000);
        validateSignUpWebinar.isDisplayed();
    }
}
