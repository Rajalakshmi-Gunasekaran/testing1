package pageObjects;

import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage extends CommonFunctions{
    public WebDriver driver;
    public OrganizationsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),\"Organizations\")]")
    public WebElement clkOrganizationsTab;
    @FindBy(xpath = "//a[@href=\"/admin/widget/organization/no-logo\"]")
    public WebElement clkNoLogoOptions;
    @FindBy(xpath = "//a[@class=\"btn btn-default btn-xs\"]")
    public WebElement clkCompanyLink;
    @FindBy(xpath = "//*[@id=\"_custom_form\"]/div[2]")
    public WebElement validateSelectedCompanyProfile;
    @FindBy(xpath = "//a[@href=\"/admin/organizations/pr-agencies\"]")
    public WebElement clkPRAgenciesOptions;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[8]/table/tbody/tr[1]/td[2]/span/a")
    public WebElement clkPRAgenciesLink;
    @FindBy(xpath = "//a[@href=\"/admin/organization/84787/customer\"]")
    public WebElement clkCustomerTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div/div[6]/form")
    public WebElement validateNavigateToCustomerPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/84787/logo?type=pr\"]")
    public WebElement clkLogoTab;
    @FindBy(xpath = "//*[@id=\"_custom_form\"]/div/div[1]/div[1]/div[1]/div/img")
    public WebElement validateNavigateToLogoPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/84787/logs?type=pr\"]")
    public WebElement clkLogsTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[7]")
    public WebElement validateNavigateToLogsPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/prAgency/84787/divisions?type=pr\"]")
    public WebElement clkDivisionsTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[7]")
    public WebElement validateNavigateToDivisionsPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/prAgency/84787/persons\"]")
    public WebElement clkPersonsTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[9]/table")
    public WebElement validateNavigateToPersonsPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/84787/tickets?type=pr\"]")
    public WebElement clkTicketsTab;
    @FindBy(xpath = "//*[@id=\"ticket-list\"]")
    public WebElement validateNavigateToTicketsPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/84787/aliases-new?type=pr\"]")
    public WebElement clkAliasesTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[6]")
    public WebElement validateNavigateToAliasesPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/acl/84787/list?type=pr\"]")
    public WebElement clkACLTab;
    @FindBy(xpath = "//*[@id=\"_custom_form\"]")
    public WebElement validateNavigateToACLPage;
    @FindBy(xpath = "//a[@href=\"/admin/organization/84787/working-set-tags\"]")
    public WebElement clkWorkingSetsTab;
    @FindBy(xpath = "//*[@id=\"main_content\"]/ul")
    public WebElement validateNavigateToWorkingSetsPage;
    @FindBy(xpath = "//a[@href=\"/admin/organizations/outlets\"]")
    public WebElement clkMediaOutletOptions;
    @FindBy(name = "keywords")
    public WebElement enterMediaOutletNameInSearch;
    @FindBy(xpath = "//a[@href=\"/admin/organization/14637/edit\"]")
    public WebElement selectAndClickMediaOutletLink;
    @FindBy(xpath = "//*[@id=\"_custom_form\"]/div[2]/div/div[2]")
    public WebElement validateMediaOutletPage;
    @FindBy(xpath = "//a[@href=\"/admin/organizations/companies\"]")
    public WebElement clkCompaniesOptions;
    @FindBy(name = "keywords")
    public WebElement enterCompanyName;
    @FindBy(xpath = "//a[@href=\"/admin/organization/12105/edit\"]")
    public WebElement selectAndClickCompanyLink;
    @FindBy(xpath = "//a[@href=\"/admin/organization/company/add\"]")
    public WebElement clkAddNewBtnToCreateCompany;
    @FindBy(name = "company[name]")
    public WebElement enterNewCompanyNameToCreate;
    @FindBy(name = "submit")
    public WebElement clkSaveBtnToCreateNewCompany;
    @FindBy(xpath = "//strong[contains(text(),\"Companies\")]")
    public WebElement clkCompanyTileToGoBackToCompanyHome;
    @FindBy(xpath = "//*[@id=\"_custom_form\"]/div[2]/div/div[2]")
    public WebElement validateNavigateToCompanyProfile;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[11]/table/tbody/tr[1]/td[8]/a/span")
    public WebElement clkDeleteCompany;
    @FindBy(xpath = "//a[contains(text(),\"Delete\")]")
    public WebElement clkConfirmDeleteBtn;
    @FindBy(xpath = "//a[@href=\"/admin/organization/media-outlet/add\"]")
    public WebElement clkAddNewBtnToCreateMediaOutlet;
    @FindBy(name = "media_outlet[name]")
    public WebElement enterMediaOutletNameToCreate;
    @FindBy(name = "media_outlet[mediaOutletType]")
    public WebElement clkChooseAMediaOutletType;
    @FindBy(xpath = "//option[contains(text(),\"Wilderness\")]")
    public WebElement chooseAMediaOutletTypeFromDropDown;
    @FindBy(xpath = "//strong[contains(text(),\"Media Outlets\")]")
    public WebElement clkMediaOutletLinkToNavigateToHomePage;
    @FindBy(xpath = "//*[@id=\"_custom_form\"]/div[2]/div/div[2]")
    public WebElement validateMediaOutletProfilePage;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[9]/table/tbody/tr[1]/td[8]/a/span")
    public WebElement clkDeleteMediaOutlet;
    @FindBy(xpath = "//a[@href=\"/admin/organization/pr-agency/add\"]")
    public WebElement clkAddNewBtnToCreatePRAgencies;
    @FindBy(name = "pr_agency[name]")
    public WebElement enterPRAgenciesName;
    @FindBy(xpath = "//*[@id=\"_custom_form\"]/div[2]/div/div[2]")
    public WebElement validatePRAgencies;
    @FindBy(xpath = "//strong[contains(text(),\"PR Agencies\")]")
    public WebElement PRAgenciesLinkToNavigateToHomePage;
    @FindBy(name = "keywords")
    public WebElement enterPRAgencyNameInSearchField;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[8]/table/tbody/tr[1]/td[4]/a")
    public WebElement clkDeletePRAgencies;
    @FindBy(xpath = "//*[@id=\"main_content\"]/div[9]/table/tbody/tr[1]/td[2]/span/a")
    public WebElement clkMediaOutlet;
    @FindBy(xpath = "//a[@href=\"/admin/organization/208097/merge?type=outlet\"]")
    public WebElement clkDuplicateTab;
    @FindBy(name = "keywords")
    public WebElement enterOutletID;
    @FindBy(xpath = "//span[@class=\"glyphicon glyphicon-search\"]")
    public WebElement clkSearchIcon;
    @FindBy(xpath = "//a[contains(text(),\"Merge\")]")
    public WebElement clkMergeBtn;
    @FindBy(xpath = "//p[contains(text(),\"No duplicates\")]")
    public WebElement validateJournoMerge;

    //click organization tab in app home page
    public void setClickOrganizationTab() throws InterruptedException{
        Thread.sleep(3000);
        clkOrganizationsTab.click();
    }
    //click no logo options from the lists under organization tab
    public void setClickNoLogoOptions() throws InterruptedException{
        Thread.sleep(3000);
        clkNoLogoOptions.click();
    }
    //choose the company or media outlet without logo from the lists
    public void setClickNoLogoCompanyLink() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyLink.click();
    }
    //validate navigating to profile for the chosen no logo item
    public void setValidateProfileForChosenItemWithoutLogo() throws InterruptedException{
        Thread.sleep(3000);
        validateSelectedCompanyProfile.isDisplayed();
    }
     //click PR agencies options under organizations tab
    public void setClickPRAgenciesOptions() throws InterruptedException{
        Thread.sleep(3000);
        clkPRAgenciesOptions.click();
    }
    //choose and click PR agencies links from the list
    public void setClickPRAgenciesLink() throws InterruptedException{
        Thread.sleep(3000);
        clkPRAgenciesLink.click();
    }
    //click customer tab in PR agencies profile page
    public void setClickCustomerTab() throws InterruptedException{
        Thread.sleep(3000);
        clkCustomerTab.click();
    }
    //validate customer page opens
    public void setValidateNavigateToCustomerPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToCustomerPage.isDisplayed();
    }
    //click Logo tab in PR agencies profile page
    public void setClickLogoTab() throws InterruptedException{
        Thread.sleep(3000);
        clkLogoTab.click();
    }
    //validate logo page opens
    public void setValidateNavigateToLogoPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToLogoPage.isDisplayed();
    }
    //click Divisions tab in PR agencies profile page
    public void setClickDivisionsTab()throws InterruptedException {
        Thread.sleep(3000);
         clkDivisionsTab.click();
    }
    //validate divisions page opens
    public void setValidateNavigateToDivisionsPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToDivisionsPage.isDisplayed();
    }
    //click Persons tab in PR agencies profile page
    public void setClickPersonsTab()throws InterruptedException {
        Thread.sleep(3000);
        clkPersonsTab.click();
    }
    //validate persons page opens
    public void setValidateNavigateToPersonsPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToPersonsPage.isDisplayed();
    }
    //click Aliases tab in PR agencies profile page
    public void setClickAliasesTab() throws InterruptedException{
        Thread.sleep(3000);
        clkAliasesTab.click();
    }
    //validate aliases page
    public void setValidateNavigateToAliasesPage()throws InterruptedException {
        Thread.sleep(3000);
        validateNavigateToAliasesPage.isDisplayed();
    }
    //click Tickets tab in PR agencies profile page
    public void setClickTicketsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkTicketsTab.click();
    }
    //validate tickets page
    public void setValidateNavigateToTicketsPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToTicketsPage.isDisplayed();
    }
    //click Logs tab in PR agencies profile page
    public void setClickLogsTab()throws InterruptedException {
        Thread.sleep(3000);
        clkLogsTab.click();
    }
    //validate logs page opens
    public void setValidateNavigateToLogsPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToLogsPage.isDisplayed();
    }
    //click ACL tab in PR agencies profile page
    public void setClickACLTab() throws InterruptedException{
        Thread.sleep(3000);
        clkACLTab.click();
    }
    //validate ACL page opens
    public void setValidateNavigateToACLPage() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToACLPage.isDisplayed();
    }
    //click working sets tab in PR agencies profile page
    public void setClickWorkingSetsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkWorkingSetsTab.click();
    }
    //validate working sets page opens
    public void setValidateNavigateToWorkingSetsPage()throws InterruptedException {
        Thread.sleep(3000);
        validateNavigateToWorkingSetsPage.isDisplayed();
    }
    //click media outlet options under organizations tab
    public void setClickMediaOutletsOptions() throws InterruptedException{
        Thread.sleep(3000);
        clkMediaOutletOptions.click();
    }
    //enter media outlet name as search term
    public void setEnterMediaOutletAsSearchText(String mediaOutlet) throws InterruptedException{
        Thread.sleep(3000);
        enterMediaOutletNameInSearch.sendKeys(mediaOutlet);
        enterMediaOutletNameInSearch.sendKeys(Keys.ENTER);
    }
    //select media outlet and click on it
    public void setClickChosenMediaOutlet() throws InterruptedException{
        Thread.sleep(3000);
        selectAndClickMediaOutletLink.click();
    }
    //validate navigating to media outlet page
    public void setValidateNavigateToMediaOutletPage() throws InterruptedException{
        Thread.sleep(3000);
        validateMediaOutletPage.isDisplayed();
    }
    //click companies options under organization tab
    public void setClickCompaniesOptions() throws InterruptedException{
        Thread.sleep(3000);
        clkCompaniesOptions.click();
    }
    //enter company name as search term
    public void setEnterCompanySearchNameAs(String companyName) throws InterruptedException{
        Thread.sleep(3000);
        enterCompanyName.sendKeys(companyName);
        enterCompanyName.sendKeys(Keys.ENTER);
    }
    //click chosen company name
    public void setClickChosenCompany() throws InterruptedException{
       Thread.sleep(3000);
       selectAndClickCompanyLink.click();
    }
    //click add new button to create new company
    public void setClickAddNewBtnToCreateCompany() throws InterruptedException{
        Thread.sleep(3000);
         clkAddNewBtnToCreateCompany.click();
    }
    //enter company name to create new company
    public void setEnterCompanyNameToCreate(String companyName) throws InterruptedException{
        Thread.sleep(3000);
        enterNewCompanyNameToCreate.sendKeys(companyName);
    }
    //click save button to create new company
    public void setClickSaveBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveBtnToCreateNewCompany.click();
    }
    //click companies link to navigate to home page
    public void setClickCompaniesLink() throws InterruptedException{
        Thread.sleep(3000);
        validateNavigateToCompanyProfile.isDisplayed();
        Thread.sleep(3000);
        clkCompanyTileToGoBackToCompanyHome.click();
    }
    //click delete chosen company by searching company using search text field
    public void setClickDeleteCompany()throws InterruptedException {
        Thread.sleep(3000);
        clkDeleteCompany.click();
        Thread.sleep(3000);
        clkConfirmDeleteBtn.click();
    }
    //click add new button to create media outlet
    public void setClickAddNewBtnToCreateMediaOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewBtnToCreateMediaOutlet.click();
    }
    //enter media outlet name to create new media outlet
    public void setEnterMediaOutletNameToCreate(String mediaOutlet)throws InterruptedException {
        Thread.sleep(3000);
        enterMediaOutletNameToCreate.sendKeys(mediaOutlet);
    }
    //choose media outlet type as wilderness
    public void setChooseMediaOutletType() throws InterruptedException{
        Thread.sleep(3000);
        clkChooseAMediaOutletType.click();
        Thread.sleep(3000);
        chooseAMediaOutletTypeFromDropDown.click();
    }
    //click media outlet link to navigate to home page
    public void setClickMediaOutletLink() throws InterruptedException{
        Thread.sleep(3000);
        validateMediaOutletProfilePage.isDisplayed();
        Thread.sleep(3000);
        clkMediaOutletLinkToNavigateToHomePage.click();
    }
    //enter media outlet name to search for media outlet using search field
    public void setEnterMediaOutletNameToSearch(String mediaOutlet) throws InterruptedException{
        Thread.sleep(3000);
        enterMediaOutletNameInSearch.sendKeys(mediaOutlet);
    }
    //click chosen delete media outlet by searching for the particular outlet
    public void setClickDeleteMediaOutlet() throws InterruptedException{
        Thread.sleep(3000);
        clkDeleteMediaOutlet.click();
        Thread.sleep(3000);
        clkConfirmDeleteBtn.click();
    }
    //click add new button to create PR Agencies
    public void setClickAddNewBtnToCreatePRAgencies()throws InterruptedException {
        Thread.sleep(3000);
        clkAddNewBtnToCreatePRAgencies.click();
    }
    //enter PR agencies name to create new
    public void setEnterPRAgenciesNameToCreate(String prAgenciesName)throws InterruptedException {
        Thread.sleep(3000);
        enterPRAgenciesName.sendKeys(prAgenciesName);
    }
    //navigate to PR Agencies Profile page
    public void setNavigateToPRAgenciesProfilePage() throws InterruptedException{
        Thread.sleep(3000);
        validatePRAgencies.isDisplayed();
        Thread.sleep(3000);
        PRAgenciesLinkToNavigateToHomePage.click();
    }
    //enter search text to look for PR agency
    public void setEnterPRAgenciesSearchText(String prAgencyName)throws InterruptedException {
        Thread.sleep(3000);
        enterPRAgencyNameInSearchField.sendKeys(prAgencyName);
        enterPRAgencyNameInSearchField.sendKeys(Keys.ENTER);
    }
    //click delete PR Agencies
    public void setClickDeletePRAgencies() throws InterruptedException{
        Thread.sleep(3000);
        clkDeletePRAgencies.click();
        Thread.sleep(3000);
        clkConfirmDeleteBtn.click();
    }
    //click media outlet to go to profile page
    public void setClkMediaOutletToGoToProfilePage() throws InterruptedException{
        Thread.sleep(3000);
        clkMediaOutlet.click();
    }
    //click duplicate tab in media outlet profile
    public void setClkDuplicateTab() throws InterruptedException{
        Thread.sleep(3000);
        clkDuplicateTab.click();
    }
    //enter media outlet ID in search ID field to search for duplicate outlet
    public void setEnterMediaOutletIDInSearchIDFld(String outletID) throws InterruptedException{
        Thread.sleep(3000);
        enterOutletID.sendKeys(outletID);
        clkSearchIcon.click();
    }
    //click merge button to merge duplicate outlet
    public void setClkMergeBtn()throws InterruptedException {
        Thread.sleep(3000);
        clkMergeBtn.click();
    }
    //validate duplicate outlet merged
    public void validateJournoMerged() throws InterruptedException{
        Thread.sleep(3000);
        validateJournoMerge.isDisplayed();
    }
}