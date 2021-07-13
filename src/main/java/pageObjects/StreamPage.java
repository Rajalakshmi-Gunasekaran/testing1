package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.cssSelector;

public class StreamPage {
    public WebDriver driver;
    //initialising web driver
    public StreamPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/nav/ul/li[1]/a/span")
    public WebElement clkStreamLink;
    @FindBy(xpath = "//div[@class='name flex-grow-1 text-truncate mr-2'and text()='All Journo Moves']")
    public WebElement clickAllJournoMoves;
   // @FindBy(xpath = "//span[@class='ml-1' and text()='Select all']")
   // @FindBy(css = ".icon-hair-cross")
    //public WebElement selectAll;

        @FindBy(css=".d-inline-flex.align-items-center")
   public WebElement selectAll ;

    @FindBy(xpath = "//span[@class='ml-1' and text()='50']")
    public WebElement selectedNumbers;

    //click streams on home page
    public void clkStreams(){
        clkStreamLink.click();
    }
    //click All Journo Moves streams to see the streams as per the set up
    public void clkAllJournoMoves(){
        clickAllJournoMoves.click();
    }
    //Use select all option to validate the stream set up
    public void clkSelectAll(){
        selectAll.click();
    }
    //Validate stream page
    public String validateAllJournoStream(){
      return selectedNumbers.getText();
    }
}
