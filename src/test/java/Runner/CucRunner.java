package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/new.feature","src/test/resources/Feature/openAccount.feature"},
        glue = {"StepDefs"},   monochrome = true,
        dryRun = false,
        tags = "@Smoke",
       plugin = {"pretty","html:build/reports/feature.html"})
@Test
class CucRunner extends AbstractTestNGCucumberTests{
}

