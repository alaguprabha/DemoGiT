package StepDefination;

import java.io.File;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilities.TestContextSetup;
 

public class Hooks {
	public TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup)
	{
	this.testcontextsetup=testcontextsetup;
}
	
		
	
	
	@After
	public void Aftertestcase() throws IOException
	{
		WebDriver driver=testcontextsetup.testbasefordriver.WebDriverManager();
		
		//driver.quit();
	}
	
	@AfterStep
	public void AfterScreenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			
			WebDriver driver=testcontextsetup.testbasefordriver.WebDriverManager();
			//TakesScreenshot scrShot =((TakesScreenshot)driver);
			File Sourcefile=((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			//convert the file to bytearray
			//to send to scenario.attach(method, null, null);
			byte[] filecontent=FileUtils.readFileToByteArray(Sourcefile);
			scenario.attach(filecontent,"image/png","image");
			System.out.println("this is architect");
		}
		
	}

}
