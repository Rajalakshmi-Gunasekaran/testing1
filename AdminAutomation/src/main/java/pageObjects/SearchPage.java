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

    //click search text field 1 to search for journalist and outlet
    public void setClkSearchTextField1()throws InterruptedException{
        clkSearchTextFieldForJournoAndOutlet.click();
    }
    //click search text field 2 to search for company and PR
    public void setClkSearchTextField2()throws InterruptedException{
        clkSearchTextFieldForCompanyAndPR.click();
    }
    //enter journo name in search text field1 to search for journo
    public void setEnterSearchTermInJournoName(String journoName)throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForJournoAndOutlet.sendKeys(journoName);
    }
    //enter outlet name in search text field1 to search for outlet
    public void setEnterSearchTermInOutletName(String outletName)throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForJournoAndOutlet.sendKeys(outletName);
    }
    /* clicking journo from the dropdown list in search journo/outlet field*/
    public void setClkJournoFromTheList()throws InterruptedException{
        Thread.sleep(3000);
        clkJournoFromTheList.click();
    }
    //validate journo page as per the search
    public void setValidateJournoPage()throws InterruptedException{
        Thread.sleep(3000);
        validateJournoPage.isDisplayed();
    }
    /* clicking outlet from the dropdown list in search journo/outlet field*/
    public void setClkOutletFromTheList()throws InterruptedException{
        Thread.sleep(3000);
        clkOutletFromTheList.click();
    }
    /* validate outlet profile page as per the search*/
    public void setValidateOutletProfile()throws InterruptedException{
        Thread.sleep(3000);
        validateOutletProfile.isDisplayed();
    }
    //enter company name in search text field2
    public void setEnterCompanyName(String companyName) throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForCompanyAndPR.sendKeys(companyName);
    }
    //choose and click company name to navigate to profile page
    public void setChooseAndClickCompanyName() throws InterruptedException{
        Thread.sleep(3000);
        chooseAndClickCompanyName.click();
    }
    //validate company profile page as per the search
    public void setValidateCompany()throws InterruptedException {
         Thread.sleep(3000);
         validateCompanyProfile.isDisplayed();
    }
    //enter PR name in search text field2
    public void setEnterPRName(String prName) throws InterruptedException{
        Thread.sleep(3000);
        clkSearchTextFieldForCompanyAndPR.sendKeys(prName);
    }
    //choose and click PR name to navigate to the profile page
    public void setChooseAndClickPRName() throws InterruptedException {
        Thread.sleep(3000);
        chooseAndClickPRName.click();
    }
    //validate PR profile as per the search
    public void setValidatePRProfile() throws InterruptedException{
        Thread.sleep(3000);
        validatePRProfile.isDisplayed();
    }
}
