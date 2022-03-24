package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonFunctions{

    public WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search_1")
    public WebElement clkSearchTextFieldForJournoAndOutlet;
    @FindBy(xpath = "")
    public WebElement a;
    @FindBy(xpath = "//b[contains(text(),\"Matt Simon\")]")
    public WebElement clkJournoFromTheList;
    @FindBy(xpath = "//div[@class=\"well col-md-12\"]")
    public WebElement validateJournoPage;
    @FindBy(xpath = "//b[contains(text(),\"BBC Two\")]")
    public WebElement clkOutletFromTheList;
    @FindBy(xpath = "//img[@class=\"img-responsive\"]")
    public WebElement validateOutletProfile;
    @FindBy(id = "search_2")
    public WebElement clkSearchTextFieldForCompanyAndPR;
    @FindBy(xpath = "//b[contains(text(),\"Apple\")]")
    public WebElement chooseAndClickCompanyName;
    @FindBy(xpath = "//div[@class=\"well col-md-12\"]")
    public WebElement validateCompanyProfile;
    @FindBy(xpath = "//b[contains(text(),\"3c PR\")]")
    public WebElement chooseAndClickPRName;
    @FindBy(xpath = "//img[@class=\"img-responsive\"]")
    public WebElement validatePRProfile;

    public void setClkSearchTextField1()throws InterruptedException{
        clkSearchTextFieldForJournoAndOutlet.click();
    }
    public void setClkSearchTextField2()throws InterruptedException{
        clkSearchTextFieldForCompanyAndPR.click();
    }
    public void setEnterSearchTermInJournoName(String journoName)throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForJournoAndOutlet.sendKeys(journoName);
    }
    public void setEnterSearchTermInOutletName(String outletName)throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForJournoAndOutlet.sendKeys(outletName);
    }
    /* clicking journo from the dropdown list in search journo/outlet field*/
    public void setClkJournoFromTheList()throws InterruptedException{
        Thread.sleep(3000);
        clkJournoFromTheList.click();
    }
    public void setValidateJournoPage()throws InterruptedException{
        Thread.sleep(3000);
        validateJournoPage.isDisplayed();
    }
    /* clicking outlet from the dropdown list in search journo/outlet field*/
    public void setClkOutletFromTheList()throws InterruptedException{
        Thread.sleep(3000);
        clkOutletFromTheList.click();
    }
    /* validate outlet profile page*/
    public void setValidateOutletProfile()throws InterruptedException{
        Thread.sleep(3000);
        validateOutletProfile.isDisplayed();
    }

    public void setEnterCompanyName(String companyName) throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForCompanyAndPR.sendKeys(companyName);
    }

    public void setChooseAndClickCompanyName() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickCompanyName.click();
    }

    public void setValidateCompany()throws InterruptedException {
         Thread.sleep(3000);
         validateCompanyProfile.isDisplayed();
    }

    public void setEnterPRName(String prName) throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForCompanyAndPR.sendKeys(prName);
    }

    public void setChooseAndClickPRName() throws InterruptedException {
        Thread.sleep(3000);
        chooseAndClickPRName.click();
    }

    public void setValidatePRProfile() throws InterruptedException{
        Thread.sleep(3000);
        validatePRProfile.isDisplayed();
    }
}
