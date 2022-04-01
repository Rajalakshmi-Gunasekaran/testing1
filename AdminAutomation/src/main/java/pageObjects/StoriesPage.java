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
    @FindBy(xpath = "//button[contains(text(),\"Create\")]")
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
    @FindBy(xpath = "")
    public WebElement chooseStoryTypeAsMediaRequest;
    @FindBy(xpath = "")
    public WebElement chooseStoryTypeAsBroadcast;

    public void setClickArticlesTab() throws InterruptedException{
        Thread.sleep(3000);
        clkArticlesTab.click();
    }

    public void setClickStoriesTab() throws InterruptedException{
        Thread.sleep(3000);
        clkStoriesTab.click();
        Thread.sleep(3000);
        clkLists.click();
    }
    public void setClickAddNewButton() throws InterruptedException{
        Thread.sleep(3000);
        clkAddNewButton.click();
    }
    public void setChooseStoryType() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryType.click();
        Thread.sleep(3000);
        clkStoryTypeToChooseStory.click();
    }

    public void setClickCreateButton() throws InterruptedException{
        Thread.sleep(3000);
        clkCreateBtn.click();
    }

    public void setEnterHeading(String heading)throws InterruptedException {
        Thread.sleep(3000);
        enterStoryHeading.sendKeys(heading);
    }

    public void setEnterBody(String body) throws InterruptedException{
        Thread.sleep(3000);
        enterStoryBody.sendKeys(body);
    }

    public void setClickSaveAndProcessBtn() throws InterruptedException{
        Thread.sleep(3000);
        clkSaveAndProcessBtn.click();
    }
    public void setEnterJournoNameToAddToStory(String journoName) throws InterruptedException{
        Thread.sleep(3000);
        enterJournoInJournoFieldToAddToStory.sendKeys(journoName);
        Thread.sleep(3000);
        chooseJournoFromTheListToAddToStory.click();
    }

    public void setEnterHeadingSearchField(String heading) throws InterruptedException{
        Thread.sleep(3000);
        enterSearchHeadingToSearchForStory.sendKeys(heading);
        enterSearchHeadingToSearchForStory.sendKeys(Keys.ENTER);
    }

    public void setClickDeleteIcon() throws InterruptedException{
        Thread.sleep(3000);
        clkDeleteCrossMark.click();
        Thread.sleep(3000);
        confirmDeleteBtn.click();
    }

    public void setChooseStoryTypeAsMediaRequest() throws InterruptedException{
        Thread.sleep(3000);
        chooseStoryTypeAsMediaRequest.click();
    }
}
