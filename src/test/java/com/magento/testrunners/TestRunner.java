
package com.magento.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurefiles", 
					glue = "com.magento.stepdefinitions"
					//tags = "@login"
					)
public class TestRunner {
}
