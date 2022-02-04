package stepDefinitions;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.FilePath;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseStep {
    protected static WebDriver webDriver;

    private Actions action;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver driver) {
        webDriver = driver;
    }

    public void wait(int waitTime) {
        webDriver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }

    public void pauseFor(int seconds) {
        action = new Actions(webDriver);
        action.pause(Duration.ofSeconds(seconds));
        action.build().perform();
    }
    public void maintenanceBanner(WebDriver driver){
        webDriver.manage().addCookie(new Cookie("MAINTENANCE", "bypass"));
    }
    public void refreshPage() {
        webDriver.navigate().refresh();
        wait(10);

    }
    public String readPropertyFile1(String key) throws Exception {
        FileInputStream inputStream=new FileInputStream(FilePath1.configFilePath);
        Properties properties=new Properties();
        properties.load(inputStream);
        return properties.getProperty(key);
    }

    public void javaScripter() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
    }

    public void goToPage(String pageURL) {
        webDriver.navigate().to(pageURL);
    }
}
