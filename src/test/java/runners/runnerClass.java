package runners;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        tags = "@login",
        monchrome = true,
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
                "rerun:target/failed.txt"}
)


public class runnerClass {

}
