import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepDefinitions.BaseStep;

import java.util.concurrent.TimeUnit;

public class Hook {
    @Before
    public void setUp(){
        System.out.println("Calling @Before Hook");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseStep.setWebDriver(driver);
    }
    /*@After
    public void afterTests(){
        BaseStep.getWebDriver().quit();
    }*/
}
