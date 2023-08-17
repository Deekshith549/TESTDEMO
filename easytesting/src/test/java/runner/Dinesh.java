package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features", // Path to your feature files
    glue = "easytesting",
    tags = "@Smoke", // Package where your step definition files are located
    plugin = {
        "pretty"                            // Prints the Gherkin source with additional formatting
    }
    
)
public class Dinesh {
    // This class is intentionally left empty
}

