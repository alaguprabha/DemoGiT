package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBasefordriver {
	public  WebDriver driver;
	
	

	public WebDriver  WebDriverManager() throws IOException
	{
FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
Properties prop=new Properties();

		
		prop.load(fis);
		String url=prop.getProperty("QAurl");
		String browser_prop=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		String browser=browser_maven!=null? browser_maven : browser_prop;
	
		
		
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.manage().window().maximize();

	}
		
else if(browser.equalsIgnoreCase("firefox"))
		{
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
driver.manage().window().maximize();

		}
else if(browser.equalsIgnoreCase("edge"))
{
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
driver.manage().window().maximize();

}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	//driver.get(url);
	
		}			
return driver;
}}
