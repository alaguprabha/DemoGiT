package StepDefination;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Landingpageobjects;
import pageObject.OfferspageObjects;
import utilities.TestContextSetup;

public class Offerpage
{
	OfferspageObjects offerpageobj;

TestContextSetup testcontextsetup;
public  Offerpage(TestContextSetup testcontextsetup)
	{
this.testcontextsetup=testcontextsetup;
	}

@Then("^The user searched with same short name in offers page to check if \"([^\"]*)\" exists$")
public void The_user_searched_with_same_short_name_in_offers_page_to_check_if_exists(String product1) throws InterruptedException
{
	offerpageobj=testcontextsetup.pom.getofferpageobject();
 //OffPageObj=new OfferspageObjects(testcontextsetup.driver);

testcontextsetup.GM.SwitchTochildwindow();

offerpageobj.searchfieldenter(product1);
String offerpageproductname=offerpageobj.offerpageproductname();
System.out.println("offerpage product name is:"+offerpageproductname);
Assert.assertEquals(offerpageproductname,testcontextsetup.landingpageproductname);



}
   
	


}
 


