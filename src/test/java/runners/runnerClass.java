package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun =false,
        tags = "@Daniel2",
        monochrome = true,
        plugin = {"pretty", "html: target/cucumber.html", "json: target/cucumber.json" }

)


public class runnerClass {

}
