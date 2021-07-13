import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {"@SearchByJournalist,@SearchByOutlet,@SearchByDesk,@SearchByCompany,@Pinpoint,@CreateFolder,@DeletingFolder,@CreateList,@AllJournoMoves,@HomeButton,@Logout,@WebinarAlerts"},dryRun =false)
public class Runner {
}

