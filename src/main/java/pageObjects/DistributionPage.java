package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DistributionPage {

    public WebDriver driver;
    /*initialising web driver*/
    public DistributionPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/nav/ul/li[5]/a/span")
    public WebElement clickDistributionTab;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/nav/div[3]/button[2]")
    public WebElement clickNewPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div[1]/input")
    public WebElement enterPressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/form/div[3]/button")
    public WebElement clickCreatePressRelease;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/i")
    public WebElement clickHeaderBlock;
   @FindBy(xpath = "//*[@id=\"tinymce\"]/p/br")
    public WebElement headerBlock;
    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement clickBodyBlock;
    @FindBy(xpath = "//*[@id=\"tinymce\"]/p[2]/br")
    public WebElement bodyBlock;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[4]/div[1]/div/div[2]/div/div/div/i")
    public WebElement clickFooterBlock;
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/nav/div[4]/button[3]")
    public WebElement clickSaveButton;

    /* validate new press release functionality*/
    public void setClickDistributionTab(){
        clickDistributionTab.click();
    }
    public void setClickNewPressRelease(){
        clickNewPressRelease.click();
    }
    public void setEnterPressRelease(String pressRelease){
        enterPressRelease.sendKeys(pressRelease);
    }
    public void setClickCreatePressRelease(){
        clickCreatePressRelease.click();
    }
public void setClickHeaderBlock(){
    clickHeaderBlock.click();
}
        public void setHeaderBlock(String headerText){

        headerBlock.sendKeys(headerText);
    }
    public void setBodyBlock(String bodyText){
        clickBodyBlock.click();
        bodyBlock.sendKeys(bodyText);
    }

    public void setClickSaveButton(){
        clickSaveButton.click();
    }
}
