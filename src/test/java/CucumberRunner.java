import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(
        features="src/test/Features",
        glue = ".",
        tags = "@ALL",
        plugin = {"pretty","html:src/test/SmokeResults.html","json:target/cucumber.json"}


)
public class CucumberRunner {


}
