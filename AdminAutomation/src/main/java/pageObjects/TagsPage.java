package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagsPage {
    public WebDriver driver;
    public TagsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),\"Tags\")]")
    public WebElement clkTagsTab;
    @FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[5]/ul/li[1]/a")
    public WebElement clkStoryTopicTags;
    @FindBy(xpath = "//a[contains(text(),\"Product tags\")]")
    public WebElement clkProductTagsTab;
    @FindBy(xpath = "//a[contains(text(),\"Journo and Outlet sectors\")]")
    public WebElement clkJournoAndOutletSectorTagsTab;
    @FindBy(xpath = "//a[contains(text(),\"Media outlet types\")]")
    public WebElement clkMediaOutletTypesTagTab;
    @FindBy(xpath = "//a[contains(text(),\"Journo types\")]")
    public WebElement clkJournoTypesTagTab;
    @FindBy(xpath = "//a[contains(text(),\"Company tags\")]")
    public WebElement clkCompanyTagsTab;
    @FindBy(xpath = "//a[contains(text(),\"Company types\")]")
    public WebElement clkCompanyTypesTab;
    @FindBy(xpath = "//a[contains(text(),\"Journo pinging emails\")]")
    public WebElement clkJournoPingingEmailsTagTab;
    @FindBy(xpath = "//a[contains(text(),\"Marketing to PRs\")]")
    public WebElement clkMarketingToPRsTagTab;
    @FindBy(xpath = "//a[contains(text(),\"Working sets\")]")
    public WebElement clkWorkingSetTagTab;
    @FindBy(xpath = "//a[contains(text(),\"Localities\")]")
    public WebElement clkLocalitiesTagTab;
    @FindBy(xpath = "//a[contains(text(),\"Forward Feature tags\")]")
    public WebElement clkForwardFeatureTagsTab;
    @FindBy(xpath = "//a[contains(text(),\"Content Type tags\")]")
    public WebElement clkContentTypesTagTab;
    @FindBy(xpath = "//a[contains(text(),\"Saved Search tags\")]")
    public WebElement clkSavedSearchTagsTab;
    @FindBy(xpath = "//a[contains(text(),\"PR Opportunity tags\")]")
    public WebElement clkPROpportunitiesTagTab;
    @FindBy(xpath = "//*[@id=\"browse-tags\"]/ul/li[1]/a")
    public WebElement clkAddButtonInTagsHomePage;
    @FindBy(name= "tag[name]")
    public WebElement enterTagName;
    @FindBy(name = "tag[description]")
    public WebElement enterDescriptionInTextField;
    @FindBy(name = "tag[hidden]")
    public WebElement clkHiddenCheckBox;
    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement clkSaveButtonToAddNewTag;
    @FindBy(xpath = "//strong[contains(text(),\"Story topic tag\")]")
    public WebElement clkStoryTopicTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Product tag\")]")
    public WebElement clkProductTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Journo and Author sector\")]")
    public WebElement clkJournoAndAuthorSectorTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Media outlet type tag\")]")
    public WebElement clkMediaOutletTypesTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Journo type tag\")]")
    public WebElement clkJournoTypesTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Company tag\")]")
    public WebElement clkCompanyTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Company type tag\")]")
    public WebElement clkCompanyTypesTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Hidden tag\")]")
    public WebElement clkHiddenTagToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Marketing to PR tag\")]")
    public WebElement clkMarketingToPRsTagToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Forwad feature tag\")]")
    public WebElement clkForwardFeatureTagToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Working set tag\")]")
    public WebElement clkWorkingSetTagsToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Locality tag\")]")
    public WebElement clkLocalitiesTagToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Content type tag\")]")
    public WebElement clkContentTypesTagTabToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"Saved search tag\")]")
    public WebElement clkSavedSearchTagTabToGoToTagsHome;
    @FindBy(xpath = "//strong[contains(text(),\"PR Opportunity tag\")]")
    public WebElement clkPROpportunityTagsToGoToTagsHome;
    @FindBy(xpath = "//span[@class=\"glyphicon glyphicon-remove\"]")
    public WebElement clkCrossDeleteMark;
    @FindBy(xpath = "//a[contains(text(),\"Delete\")]")
    public WebElement clkConfirmDeleteButtonToDeleteTag;

    //click tags tab in v2 admin page
    public void setClickTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkTagsTab.click();
    }
    //click story topic options under tag tab in admin home page
    public void setClickStoryTopicTag()throws InterruptedException {
        Thread.sleep(3000);
        clkStoryTopicTags.click();
    }
    //click "+" button in tags page to add or create new tag
    public void setClickAddNewTag() throws InterruptedException{
        Thread.sleep(3000);
        clkAddButtonInTagsHomePage.click();
    }
    //enter tag name in name text field in create tags form
    public void setEnterTagName(String tagName) throws InterruptedException{
        Thread.sleep(3000);
        enterTagName.sendKeys(tagName);
    }
    //enter description in description text field in create tags form
    public void setEnterDescription(String tagDesc) throws InterruptedException{
        Thread.sleep(3000);
        enterDescriptionInTextField.sendKeys(tagDesc);
    }
    //click hidden checkbox to hide the tags from front end
    public void setClickHiddenCheckBox() throws InterruptedException{
        Thread.sleep(3000);
        clkHiddenCheckBox.click();
    }
    //click save button to save the changes and add new tag
    public void setClickSaveButtonToAddNewTag() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveButtonToAddNewTag.click();
    }
    //click story topic tag to navigate to the tags home page
    public void setClickStoryTopicTagToNavigateToTagHome()throws InterruptedException {
        Thread.sleep(3000);
        clkStoryTopicTagsToGoToTagsHome.click();
    }
    //click red cross mark and confirm delete button to delete tag
    public void setClickDeleteTag() throws InterruptedException{
        Thread.sleep(3000);
        clkCrossDeleteMark.click();
        Thread.sleep(3000);
        clkConfirmDeleteButtonToDeleteTag.click();
    }
    //click product tag tab from the options to create product tab
    public void setClickProductTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkProductTagsTab.click();
    }
    //choose and click on product tag to navigate to tags home
    public void setClickProductTagToNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkProductTagsToGoToTagsHome.click();
    }
    //choose and click journo and outlet sectors tag
    public void setClickJournoAndOutletSectorsTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoAndOutletSectorTagsTab.click();
    }
    //click journo and author sector tag to navigate to tags home
    public void setClickJournoAndAuthorSectorTagToNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoAndAuthorSectorTagsToGoToTagsHome.click();
    }
    //click media outlet types tag from the options
    public void setClickMediaPOutletTypesTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkMediaOutletTypesTagTab.click();
    }
     //click media outlet types navigate to tags home
    public void setClickMediaOutletTypesNavigateToTagsHome()throws InterruptedException {
        Thread.sleep(3000);
        clkMediaOutletTypesTagsToGoToTagsHome.click();
    }
    //click journo type tags from the options
    public void setClickJournoTypeTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoTypesTagTab.click();
    }
    //choose and click journo types tag navigate to tags home
    public void setClickJournoTypesTagNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoTypesTagsToGoToTagsHome.click();
    }
    // click company tags from the options
    public void setClickCompanyTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTagsTab.click();
    }
    //click company to navigate to tags home page
    public void setClickCompanyToNavigateToTagsHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTagsToGoToTagsHome.click();
    }
    //click company types tag from the options
    public void setClickCompanyTypesTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTypesTab.click();
    }
    //choose and click company types to navigate to tags home page
    public void setClickCompanyTypesToNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTypesTagsToGoToTagsHome.click();
    }
    //click journo pinging emails tag from the options
    public void setClickJournoPingingEmailsTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoPingingEmailsTagTab.click();
    }
    //click hidden tags to navigate to tags home page
    public void setClickHiddenTagsToNavigateToTagsHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clkHiddenTagToGoToTagsHome.click();
    }
    //click marketing to PRs tag from the options
    public void setClickMarketingToPRsTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkMarketingToPRsTagTab.click();
    }
    //click marketing to PRs to navigate to tags home page
    public void setClickMarketingToPRsToNavigateToTagsHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clkMarketingToPRsTagToGoToTagsHome.click();
    }
    //click working set tag from the options
    public void setClickWorkingSetTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkWorkingSetTagTab.click();
    }
    //click working set navigate to tags home page
    public void setClickWorkingSetNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkWorkingSetTagsToGoToTagsHome.click();
    }
    //click localities tag from the options
    public void setClickLocalitiesTagTab()throws InterruptedException {
        Thread.sleep(3000);
        clkLocalitiesTagTab.click();
    }
    //choose and click localities navigate to tags home page
    public void setClickLocalitiesNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkLocalitiesTagToGoToTagsHome.click();
    }
    //click forward feature tag from the options
    public void setClickForwardFeatureTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkForwardFeatureTagsTab.click();
    }
    //click forward features navigate to tags home page
    public void setClickForwardFeatureNavigateToTagHome() throws InterruptedException{
        Thread.sleep(3000);
        clkForwardFeatureTagToGoToTagsHome.click();
    }
    //click content type tag from the options
    public void setClickContentTypeTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkContentTypesTagTab.click();
    }
    //choose and click content type navigate to tags home page
    public void setClickContentTypeNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkContentTypesTagTabToGoToTagsHome.click();
    }
    //click saved search tags from the option
    public void setClickSavedSearchTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkSavedSearchTagsTab.click();
    }
    //click saved search navigate to tags home page
    public void setClickSavedSearchNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkSavedSearchTagTabToGoToTagsHome.click();
    }
    //click PR opportunity tags from the options
    public void setClickPROpportunityTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkPROpportunitiesTagTab.click();
    }
    //click PR opportunity navigate to tags home page
    public void setClickPROpportunityNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkPROpportunityTagsToGoToTagsHome.click();
    }
}