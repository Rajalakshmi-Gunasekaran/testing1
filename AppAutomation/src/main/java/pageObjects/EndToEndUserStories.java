package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndToEndUserStories extends CommonFunctions{
    public WebDriver driver;
    public Actions action;

    public EndToEndUserStories(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//span[contains(text(),\" Create new List called 'AutoList' and add \")]")
    public WebElement CreateAutoListInJournoProfile;
    @FindBy(xpath = "//button[contains(text(),\" Save\")]")
    public WebElement clkSaveBtnToSaveAutoList;

    public void setClickCreateAutoListInJournoProfile() throws InterruptedException{
        Thread.sleep(3000);
        CreateAutoListInJournoProfile.click();
    }

    public void setClickSaveBtnToSaveLists()throws InterruptedException {
        Thread.sleep(3000);
        clkSaveBtnToSaveAutoList.click();
        Thread.sleep(3000);
    }
}
