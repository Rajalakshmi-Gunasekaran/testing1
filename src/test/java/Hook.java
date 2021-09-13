import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import stepDefinitions.BaseStep;

import java.util.concurrent.TimeUnit;

public class Hook {
    @Before
    public void setUp()
    {
          /*System.out.println("Calling @Before Hook");
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          BaseStep.setWebDriver(driver);*/

        System.out.println("Calling @Before Hook");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless","--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        BaseStep.setWebDriver(driver);
<<<<<<< HEAD
       /* System.out.println("Calling @Before Hook");
=======
        /*System.out.println("Calling @Before Hook");
>>>>>>> 778a89970eb516e51650a88ee1e2d3185ce21487
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
<<<<<<< HEAD
        BaseStep.setWebDriver(driver);*/

=======
        BaseStep.setWebDriver(driver);
*/
>>>>>>> 778a89970eb516e51650a88ee1e2d3185ce21487
    }
    @After
    public void afterTests()
    {
        BaseStep.getWebDriver().quit();
    }
}
