package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
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

    public void refreshPage() {
        webDriver.navigate().refresh();
        wait(10);

    }

    public void javaScripter() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
    }

    public void goToPage(String pageURL) {
        webDriver.navigate().to(pageURL);
    }
}
