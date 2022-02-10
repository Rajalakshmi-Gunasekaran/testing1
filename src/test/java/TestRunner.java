import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD
        features = ".",dryRun = false,tags = "@smoke1",
=======
        features = ".", dryRun = false,tags="@smoke",
>>>>>>> 7b8af0bc49932c6bf325b4579c896dea3634058c
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/TSR/tsr3.html"})

 public class TestRunner {
      @AfterClass
    public static void generateReport()
    {
        String extentConfigXml = System.getenv("EXTENT_CONFIG_XML");
        Reporter.loadXMLConfig(extentConfigXml);
    }
}



