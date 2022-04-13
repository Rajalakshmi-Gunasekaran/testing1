package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoriesPage {
    public WebDriver driver;
    public StoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),\"Articles\")]")
    public WebElement clkArticlesTab;
    @FindBy(xpath ="//span[contains(text(),\"Stories\")]")
    public WebElement clkStoriesTab;
    @FindBy(xpath = "//a[@href=\"/admin/stories/list\"]")
    public WebElement clkLists;
    @FindBy(xpath = "//a[@class=\"btn btn-primary  \"]")
    public WebElement clkAddNewButton;
    @FindBy(xpath = "//a[@class=\"selectBox form-control big-select selectBox-dropdown\"]")
    public WebElement chooseStoryType;
    @FindBy(xpath = "//a[contains(text(),\"Journalist Alert\")]")
    public WebElement clkStoryTypeToChooseStory;
    @FindBy(id = "story_type_submit")
    public WebElement clkCreateBtn;
    @FindBy(name = "story[heading]")
    public WebElement enterStoryHeading;
    @FindBy(name = "story[body]")
    public WebElement enterStoryBody;
    @FindBy(xpath = "//button[contains(text(),\"Save and process\")]")
    public WebElement clkSaveAndProcessBtn;
    @FindBy(id = "autocomplete_credited_persons")
    public WebElement enterJournoInJournoFieldToAddToStory;
    @FindBy(xpath = "//li[@class=\"ui-menu-item\"]")
    public WebElement chooseJournoFromTheListToAddToStory;
    @FindBy(name = "keywords")
    public WebElement enterSearchHeadingToSearchForStory;
    @FindBy(xpath = "//span[@class=\"glyphicon glyphicon-remove\"]")
    public WebElement clkDeleteCrossMark;
    @FindBy(xpath = "//a[contains(text(),\"Delete\")]")
    public WebElement confirmDeleteBtn;
    @FindBy(xpath = "//a[contains(text(),\"Media Request\")]")
    public WebElement chooseStoryTypeAsMediaRequest;
    @FindBy(xpath = "//a[contains(text(),\"Broadcast\")]")
    public WebElement chooseStoryTypeAsBroadcast;
    @FindBy(xpath = "//a[@href=\"/admin/stories/list?discriminator=7\"]")
    public WebElement clkMediaRequestsOptions;
    @FindBy(xpath = "//a[contains(text(),\"Forward Feature\")]")
    public WebElement chooseStoryTypeAsForwardFeatures;
    @FindBy(xpath = "//a[@href=\"/admin/stories/list?discriminator=8\"]")
    public WebElement clkForwardFeaturesOptions;
    @FindBy(xpath = "//a[@href=\"https://admin-v2.roxhillmedia.com/highlights\"]")
    public WebElement clkHighlightsOptions;
    @FindBy(xpath = "//span[contains(text(),\"Add New\")]")
    public WebElement clkAddNewHighlightsBtn;
    @FindBy(xpath = "//input[@placeholder=\"Enter title\"]")
    public WebElement enterHighlightsTitle;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section[2]/div[1]/div[1]/div/div[1]/div[1]/div/div/input")
    public WebElement clickHighlightsVisibilityStartDate;
    @FindBy(xpath = "//button[contains(text(),\"11\")]")
    public WebElement chooseHighlightsVisibilityStartDate;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section[2]/div[1]/div[1]/div/div[2]/div[1]/div/div/input")
    public WebElement clickHighlightsVisibilityEndDate;
    @FindBy(xpath = "//button[contains(text(),\"14\")]")
    public WebElement chooseHighlightsVisibilityEndDate;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div/button/span/span/span")
    public WebElement clkSaveHighlights;
    @FindBy(xpath = "//span[contains(text(),\"Articles\")]")
    public WebElement clickArticles;
    @FindBy(xpath = "//a[@href=\"/highlights\"]")
    public WebElement clkHighlightsOptionUnderArticles;
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/section/div/div[1]/div[1]/div[3]/div/div[3]/div[1]/div/div/span/i")
    public WebElement clkActionsMenu;
    @FindBy(xpath = "//i[@class=\"icon-delete-bin mr-4\"]")
    public WebElement clkDeleteHighlights;
    @FindBy(xpath = "//a[contains(text(),\"Article\")]")
    public WebElement chooseStoryTypeAsArticles;
    @FindBy(xpath = "//b[contains(text(),\"Type\")]")
    public WebElement chooseTypeAsArticleToFilterList;
    @FindBy(xpath = "//a[contains(text(),\"Article\")]")
    public WebElement clickTypeAsArticleToFilterList;
    @FindBy(xpath = "//a[contains(text(),\"Tweet\")]")
    public WebElement chooseStoryTypeAsTweet;
    @FindBy(xpath = "//a[contains(text(),\"Tweet\")]")
    public WebElement clickTypeAsTweetToFilterList;
    @FindBy(xpath ="//a[contains(text(),\"Instagram\")]")
    public WebElement chooseStoryTypeAsInstagram;
    @FindBy(xpath = "//a[contains(text(),\"Instagram\")]")
    public WebElement clickTypeAsInstagramToFilterList;
    @FindBy(xpath = "//a[contains(text(),\"Broadcast\")]")
    public WebElement clickTypeAsBroadcastToFilterList;

    //click articles tab in v2 admin to go to stories tab in admin
    public void setClickArticlesTab() throws InterruptedException{
        Thread.sleep(3000);
        clkArticlesTab.click();
    }
    //click stories tab in admin page
    public void setClickStoriesTab() throws InterruptedException {
        Thread.sleep(3000);
        clkStoriesTab.click();
    }
    //click lists options under stories tab in home page
    public void setClickListsOption() throws InterruptedException{
    Thread.sleep(3000);
        clkLists.click();
    }
    //click add new button in stories page to add a new story type
    public void setClickAddNewButton() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewButton.click();
    }
    //choose story type to create new story
    public void setChooseStoryType() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        clkStoryTypeToChooseStory.click();
    }
    //click create button to create stories after choosing the story type that you want to create
    public void setClickCreateButton() throws InterruptedException{
        Thread.sleep(3000);
        clkCreateBtn.click();
    }
    //enter heading for the story created
    public void setEnterHeading(String heading)throws InterruptedException {
        Thread.sleep(3000);
        enterStoryHeading.sendKeys(heading);
    }
    //enter body description when creating stories
    public void setEnterBody(String body) throws InterruptedException{
        Thread.sleep(3000);
        enterStoryBody.sendKeys(body);
    }
    // save and process the story created tagging journo
    public void setClickSaveAndProcessBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveAndProcessBtn.click();
    }
    //enter journo name to tag journos and their organization to story topics
    public void setEnterJournoNameToAddToStory(String journoName) throws InterruptedException{
        Thread.sleep(3000);
        enterJournoInJournoFieldToAddToStory.sendKeys(journoName);
        Thread.sleep(3000);
        chooseJournoFromTheListToAddToStory.click();
    }
    //enter heading search filed to filter out the story to delete
    public void setEnterHeadingSearchField(String heading) throws InterruptedException{
        Thread.sleep(3000);
        enterSearchHeadingToSearchForStory.sendKeys(heading);
        enterSearchHeadingToSearchForStory.sendKeys(Keys.ENTER);
    }
    //deleting stories by clicking red cross mark and confirm delete button
    public void setClickDeleteIcon() throws InterruptedException{
        Thread.sleep(3000);
        clkDeleteCrossMark.click();
        Thread.sleep(3000);
        confirmDeleteBtn.click();
    }
    //click choose story type and click story type as media request from the options in creating stories
    public void setChooseStoryTypeAsMediaRequest() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        chooseStoryTypeAsMediaRequest.click();
    }
   // click media request option from stories dropdown
    public void setClickMediaRequestsOption()throws InterruptedException {
        Thread.sleep(3000);
        clkMediaRequestsOptions.click();
    }
    //choose type as forward feature to create
    public void setChooseTypeAsForwardFeatures() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        chooseStoryTypeAsForwardFeatures.click();
    }
    //enter journo field forward features to add journo tag
    public void setEnterJournoFieldForwardFeaturesToAddJournoTag(String journo)throws InterruptedException {
         Thread.sleep(3000);
         enterJournoInJournoFieldToAddToStory.sendKeys(journo);
         Thread.sleep(3000);
         chooseJournoFromTheListToAddToStory.click();
    }
    //click forward features options from the list
    public void setClickForwardFeaturesOptions()throws InterruptedException {
        Thread.sleep(3000);
        clkForwardFeaturesOptions.click();
    }
    //click highlights options under stories tab
    public void setClickHighlights()throws InterruptedException {
        Thread.sleep(3000);
        clkHighlightsOptions.click();
    }
    //click add new button in highlights to create new highlights
    public void setClickAddNewBtnInHighlights()throws InterruptedException {
        Thread.sleep(3000);
        clkAddNewHighlightsBtn.click();
    }
    //enter highlights title to create highlights
    public void setEnterHighlightTitle(String highlightsTitle) throws InterruptedException{
        Thread.sleep(3000);
        enterHighlightsTitle.sendKeys(highlightsTitle);
    }

    //choose and click highlights visible start dates
    public void setChooseAndClickHighlightsStartVisibleDates() throws InterruptedException{
         Thread.sleep(3000);
         clickHighlightsVisibilityStartDate.click();
         Thread.sleep(3000);
         chooseHighlightsVisibilityStartDate.click();
    }
    //choose and click highlights visible end dates
    public void setChooseAndClickHighlightsEndVisibleDates() throws InterruptedException{
        Thread.sleep(3000);
        clickHighlightsVisibilityEndDate.click();
        Thread.sleep(3000);
        chooseHighlightsVisibilityEndDate.click();
    }
    //click save button in highlights to save highlights
    public void setClickSaveBtnInHighlights()throws InterruptedException {
       Thread.sleep(3000);
       clkSaveHighlights.click();
    }
    //click highlights options from home page
    public void setClickHighlightsOptionsFromHomePage() throws InterruptedException{
        Thread.sleep(3000);
        clickArticles.click();
        Thread.sleep(3000);
        clkHighlightsOptionUnderArticles.click();
    }
    //click delete options in actions menu to delete highlights
    public void setClickDeleteOptionInActionsMenu() throws InterruptedException{
        Thread.sleep(3000);
        clkActionsMenu.click();
        Thread.sleep(3000);
        clkDeleteHighlights.click();
    }
    //validate delete highlights
    public void setValidateDeletedHighlights() throws InterruptedException{

    }
    //choose story type as articles to create new story
    public void setChooseTypeAsArticles() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        chooseStoryTypeAsArticles.click();
    }
    //click type as articles in story page to filter stories from the list
    public void setClickTypeAsArticleInStoryPage() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeAsArticleToFilterList.click();
        Thread.sleep(3000);
        clickTypeAsArticleToFilterList.click();
    }
    //choose and click type as tweet from the drop down options to create new story
    public void setChooseTypeAsTweet() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        chooseStoryTypeAsTweet.click();
    }
    //click type as Tweet in story type to filter stories from the list
    public void setClickTypeAsTweetInStoryPage() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeAsArticleToFilterList.click();
        Thread.sleep(3000);
        clickTypeAsTweetToFilterList.click();
    }
    //choose and click type as tweet from the drop down options to create new story
    public void setChooseTypeAsInstagram()throws InterruptedException {
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        chooseStoryTypeAsInstagram.click();
    }
    //click type as Tweet in story type to filter stories from the list
    public void setClickTypeAsInstagramStoryPage() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeAsArticleToFilterList.click();
        Thread.sleep(3000);
        clickTypeAsInstagramToFilterList.click();
    }
    //choose and click type as tweet from the drop down options to create new story
    public void setChooseTypeAsBroadcast() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        chooseStoryTypeAsBroadcast.click();
    }
    //click type as broadcast story type to filter stories
    public void setClickTypeAsBroadcastStoryPage() throws InterruptedException{
        Thread.sleep(3000);
        chooseTypeAsArticleToFilterList.click();
        Thread.sleep(3000);
        clickTypeAsBroadcastToFilterList.click();
    }
}
