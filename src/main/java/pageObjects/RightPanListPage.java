package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RightPanListPage {
    public WebDriver driver;
    public RightPanListPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/nav[2]/div[7]/div/div[2]/span[1]/span/span/i")
    public WebElement GDPRCheckBox;
    public boolean validateGDPRCheckbox(){
       return GDPRCheckBox.isEnabled();
    }
}
