 package CucumberOptions;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features",
		glue="StepDefination",
				plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	      "pretty"},tags="@makemytrip2" )
	



public class TestRunner extends AbstractTestNGCucumberTests
{
	
	
	 // @Override
	  
	// @DataProvider(parallel=true) public Object[][] scenarios()
	 // { 
		//  return
	  //super.scenarios(); 
	 }
	 
	 
	

