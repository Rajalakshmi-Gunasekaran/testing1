import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = ".",
  tags = "@CreateNewCampaign"
  ,dryRun =false)
public class Runner {
}

