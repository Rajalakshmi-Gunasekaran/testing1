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

    public void setClickTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkTagsTab.click();
    }

    public void setClickStoryTopicTag()throws InterruptedException {
        Thread.sleep(3000);
        clkStoryTopicTags.click();
    }

    public void setClickAddNewTag() throws InterruptedException{
        Thread.sleep(3000);
        clkAddButtonInTagsHomePage.click();
    }

    public void setEnterTagName(String tagName) throws InterruptedException{
        Thread.sleep(3000);
        enterTagName.sendKeys(tagName);
    }


    public void setEnterDescription(String tagDesc) throws InterruptedException{
        Thread.sleep(3000);
        enterDescriptionInTextField.sendKeys(tagDesc);
    }

    public void setClickHiddenCheckBox() throws InterruptedException{
        Thread.sleep(3000);
        clkHiddenCheckBox.click();
    }
    public void setClickSaveButtonToAddNewTag() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveButtonToAddNewTag.click();
    }
    public void setClickStoryTopicTagToNavigateToTagHome()throws InterruptedException {
        Thread.sleep(3000);
        clkStoryTopicTagsToGoToTagsHome.click();
    }

    public void setClickDeleteTag() throws InterruptedException{
        Thread.sleep(3000);
        clkCrossDeleteMark.click();
        Thread.sleep(3000);
        clkConfirmDeleteButtonToDeleteTag.click();
    }

    public void setClickProductTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkProductTagsTab.click();
    }

    public void setClickProductTagToNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkProductTagsToGoToTagsHome.click();
    }

    public void setClickJournoAndOutletSectorsTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoAndOutletSectorTagsTab.click();
    }

    public void setClickJournoAndAuthorSectorTagToNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoAndAuthorSectorTagsToGoToTagsHome.click();
    }

    public void setClickMediaPOutletTypesTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkMediaOutletTypesTagTab.click();
    }

    public void setClickMediaOutletTypesNavigateToTagsHome()throws InterruptedException {
        Thread.sleep(3000);
        clkMediaOutletTypesTagsToGoToTagsHome.click();
    }

    public void setClickJournoTypeTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoTypesTagTab.click();
    }

    public void setClickJournoTypesTagNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoTypesTagsToGoToTagsHome.click();
    }

    public void setClickCompanyTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTagsTab.click();
    }

    public void setClickCompanyToNavigateToTagsHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTagsToGoToTagsHome.click();
    }

    public void setClickCompanyTypesTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTypesTab.click();
    }

    public void setClickCompanyTypesToNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkCompanyTypesTagsToGoToTagsHome.click();
    }

    public void setClickJournoPingingEmailsTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkJournoPingingEmailsTagTab.click();
    }

    public void setClickHiddenTagsToNavigateToTagsHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clkHiddenTagToGoToTagsHome.click();
    }

    public void setClickMarketingToPRsTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkMarketingToPRsTagTab.click();
    }

    public void setClickMarketingToPRsToNavigateToTagsHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clkMarketingToPRsTagToGoToTagsHome.click();
    }

    public void setClickWorkingSetTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkWorkingSetTagTab.click();
    }

    public void setClickWorkingSetNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkWorkingSetTagsToGoToTagsHome.click();
    }

    public void setClickLocalitiesTagTab()throws InterruptedException {
        Thread.sleep(3000);
        clkLocalitiesTagTab.click();
    }

    public void setClickLocalitiesNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkLocalitiesTagToGoToTagsHome.click();
    }

    public void setClickForwardFeatureTagTab() throws InterruptedException{
        Thread.sleep(3000);
        clkForwardFeatureTagsTab.click();
    }

    public void setClickForwardFeatureNavigateToTagHome() throws InterruptedException{
        Thread.sleep(3000);
        clkForwardFeatureTagToGoToTagsHome.click();
    }

    public void setClickContentTypeTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkContentTypesTagTab.click();
    }

    public void setClickContentTypeNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkContentTypesTagTabToGoToTagsHome.click();
    }

    public void setClickSavedSearchTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkSavedSearchTagsTab.click();
    }

    public void setClickSavedSearchNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkSavedSearchTagTabToGoToTagsHome.click();
    }

    public void setClickPROpportunityTagsTab() throws InterruptedException{
        Thread.sleep(3000);
        clkPROpportunitiesTagTab.click();
    }

    public void setClickPROpportunityNavigateToTagsHome() throws InterruptedException{
        Thread.sleep(3000);
        clkPROpportunityTagsToGoToTagsHome.click();
    }
}