package org.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "FeatureFile",
		glue = "stepDefo",
		dryRun = false,
		strict = true
		
		)
	
public class RunCucumberTest extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}

}
