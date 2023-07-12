package runners;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt",
        glue = "steps",
        plugin = {"pretty"}
)
public class failedRunner {

}
