package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RightPanListPage {
    public WebDriver driver;
    Actions action;

    public RightPanListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[2]/div[7]/div/div[3]/span[1]/span/span/i")
    public WebElement GDPRCheckBox;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[2]/span/span")
    public WebElement validateJournoAddedToList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/div[2]/button[1]/span/span")
    public WebElement clickSelectAll;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[1]/span")
    public WebElement removeFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div/span")
    public WebElement validateJournalistRemovedFromList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span")
    public WebElement deleteList;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/nav/div[4]/span/div/div[2]/div[1]/i")
    public WebElement confirmDeleteList;

    public boolean validateGDPRCheckbox() {
        return GDPRCheckBox.isSelected();
    }

    // validate journalist added to the list
    public void setValidateJournoAddedToList() {
        clickSelectAll.click();
        action = new Actions(driver);
        action.pause(Duration.ofSeconds(5));
        action.build().perform();
        validateJournoAddedToList.isDisplayed();
    }

    public void chooseJournalist() {
        clickSelectAll.click();
    }

    // remove journalist from the list
    public void removeJournalist() {
        removeFromList.click();
    }
    //click on delete button in list page to delete list
    public void setClickDelete()
    {
        deleteList.click();
        confirmDeleteList.click();
    }

      // validate journalist removed from the list
    public String validateJournalistRemoval()
    {
        return  validateJournalistRemovedFromList.getText();
    }
}
