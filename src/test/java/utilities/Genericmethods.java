package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genericmethods {
	
public WebDriver driver;


	
public Genericmethods(WebDriver driver) {
	this.driver=driver;
}

public void SwitchTochildwindow()
	{
		
 String mainWindowHandle = driver.getWindowHandle();
 Set<String> allWindowHandles =driver.getWindowHandles();
 Iterator<String> iterator = allWindowHandles.iterator();
 while (iterator.hasNext()) {
String ChildWindow = iterator.next();
if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
 driver.switchTo().window(ChildWindow);
		    }
		      }}
		       
		
}


