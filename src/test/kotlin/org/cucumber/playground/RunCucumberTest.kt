package org.cucumber.playground

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/resources/featurefiles"],
    plugin = ["pretty", "html:build/cucumber-report.html"]
)
class RunCucumberTest