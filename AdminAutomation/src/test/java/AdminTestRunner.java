import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"."},
        dryRun = false,
        tags={"@AddAndRemoveNewReadyMadeList"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/TSR/tsr3.html"}
                 )
public class AdminTestRunner {
    @AfterClass
    public static void generateReport()
    {
        String extentConfigXml = System.getenv("EXTENT_CONFIG_XML");
        Reporter.loadXMLConfig(extentConfigXml);
    }
}
