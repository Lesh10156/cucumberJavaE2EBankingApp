package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinition"},
        tags = "@Regression",
        plugin = {"pretty", "html:Reports/Banking.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true
)
public class Runner extends AbstractTestNGCucumberTests {
}