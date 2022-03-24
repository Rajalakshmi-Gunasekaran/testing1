package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class CommonFunctions
    {
        public void wait(int waitTime, WebDriver driver)
        {
            driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        }

        public void elementClickable(WebElement locator, WebDriver driver)
        {
            WebDriverWait wait = new WebDriverWait(driver, 120);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        public void elementVisible(WebElement locator,WebDriver driver)
        {
            WebDriverWait wait = new WebDriverWait(driver, 120);
            wait.until(ExpectedConditions.visibilityOf(locator));
        }
        public String readPropertyFile(String key) throws Exception {
            FileInputStream inputStream=new FileInputStream(FilePath.configFilePath);
            Properties properties=new Properties();
            properties.load(inputStream);
            return properties.getProperty(key);
        }
    }


       
