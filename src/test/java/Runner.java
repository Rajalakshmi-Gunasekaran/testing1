import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = ".",
  tags ={"@DeletePressRelease"}
  ,dryRun =true)
public class Runner {
}

