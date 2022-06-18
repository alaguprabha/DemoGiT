package CucumberOptions;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@tearget/failed_sceanrios.txt",
		glue="StepDefination",
				plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	      "pretty",})
	



public class FailedTestRunner extends AbstractTestNGCucumberTests
{
	
	
	 // @Override
	  
	// @DataProvider(parallel=true) public Object[][] scenarios()
	 // { 
		//  return
	  //super.scenarios(); 
	 }
	 
	 
	

