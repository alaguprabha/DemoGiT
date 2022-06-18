package pageObject;

import org.openqa.selenium.WebDriver;

import StepDefination.Landingpage;
import StepDefination.Offerpage;
import utilities.TestContextSetup;

public class pageobjectmanager {
public WebDriver driver;
public Landingpageobjects landingpageobjects;
public OfferspageObjects offerspageobjects;
public CheckingPageObjects checkingpageobjects;
public Agreetocondtionspageobjects agreetocondpageobj;
public makemytrippageobject makemytripobj;
public pageobjectmanager(WebDriver driver)
	{
		this.driver=driver;
	}
		
public Landingpageobjects getlandingpageobject()
	{
landingpageobjects=new Landingpageobjects(driver);
return landingpageobjects;
		
	}
public OfferspageObjects getofferpageobject()
	{
		offerspageobjects=new OfferspageObjects(driver);
		return offerspageobjects;
	}
public CheckingPageObjects getcheckingpageobjects()
{
	checkingpageobjects=new CheckingPageObjects(driver);
	return checkingpageobjects;
}
public  Agreetocondtionspageobjects Agreetocondtionspageobjects()

{
	agreetocondpageobj=new Agreetocondtionspageobjects(driver);
	return agreetocondpageobj;
}

public makemytrippageobject getmakemytrippageobject()
{
	makemytripobj=new makemytrippageobject(driver);
	return makemytripobj;
}

}