package StepDefination;

import java.io.IOException;
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
import utilities.TestBasefordriver;
import utilities.TestContextSetup;

public class Landingpage
{
public String landingpageproductname;
public WebDriver driver;
TestContextSetup testcontextsetup;
Landingpageobjects Landingpageobj;
public Landingpage(TestContextSetup testcontextsetup)
	{
this.testcontextsetup=testcontextsetup;
	}

@Given("^The user is on \"([^\"]*)\" Green Kart landing page$")
public void the_user_is_on_green_kart_landing_page(String URL) throws IOException
{
	WebDriver driver=testcontextsetup.testbasefordriver.WebDriverManager();
	driver.get(URL);
	
}
@When("^user searched with shortname \"([^\"]*)\" and extracted the actual name of product$")
public void user_searched_with_shortname_and_extracted_the_actual_name_of_product(String product) throws InterruptedException
{
	 
// Landingpageobj=new Landingpageobjects(testcontextsetup.driver);
Landingpageobj=testcontextsetup.pom.getlandingpageobject();
Landingpageobj.searchboxenter(product);

Thread.sleep(5000);
testcontextsetup.landingpageproductname=Landingpageobj.productnamecheck();

System.out.println("landingpageproductname is :"+testcontextsetup.landingpageproductname);
Thread.sleep(5000);
Landingpageobj.Topdealsclick();

}





}
          
	



