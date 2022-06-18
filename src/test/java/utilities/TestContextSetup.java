package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.pageobjectmanager;

public class TestContextSetup {

	//we are going to declare variables that are shared between step defination files
	public String landingpageproductname;
public WebDriver driver;
public pageobjectmanager pom;
public TestBasefordriver testbasefordriver;
public Genericmethods GM;


public TestContextSetup() throws IOException
{
	testbasefordriver=new TestBasefordriver();
	 pom=new pageobjectmanager(testbasefordriver.WebDriverManager());//driver is passed as constructor
	// that driver is coming from testbasedriver class
GM=new Genericmethods(testbasefordriver.WebDriverManager());
	 
}

	
	

}
