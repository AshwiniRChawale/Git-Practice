package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Feature

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/Features", 
			glue = "stepDefinations", stepNotifications = true, publish = true
			)		
	
	public class TestRunner {	
		
		//Addedd

		}
	

	//src/test/java/
	
