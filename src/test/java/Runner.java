import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = ".",tags = "@DeleteStream",
  dryRun =false)
  //plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/TSR/tsr1.html"})
public class Runner {
   /*@AfterClass
    public static void generateReport()
    {
        Reporter.loadXMLConfig("C:\\Users\\RajiAnand\\IdeaProjects\\roxhill\\testing\\src\\main\\resources\\reportConfig\\extent-config.xml");
    }*/
}

