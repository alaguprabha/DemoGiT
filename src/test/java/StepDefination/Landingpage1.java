package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Landingpageobjects;
import utilities.TestBasefordriver;
import utilities.TestContextSetup;

public class Landingpage1
{
public String landingpageproductname;
public WebDriver driver;
TestContextSetup testcontextsetup;
Landingpageobjects Landingpageobj;
public Landingpage1(TestContextSetup testcontextsetup)
	{
this.testcontextsetup=testcontextsetup;
	}

@Given("^The user is on \"([^\"]*)\" Green Kart landing page1$")
public void the_user_is_on_green_kart_landing_page(String URL) throws IOException
{
	WebDriver driver=testcontextsetup.testbasefordriver.WebDriverManager();
	driver.get(URL);
	
}
@When("^user searched with shortname \"([^\"]*)\" and extracted the actual name of product1$")
public void user_searched_with_shortname_and_extracted_the_actual_name_of_product(String product) throws InterruptedException
{
	 
// Landingpageobj=new Landingpageobjects(testcontextsetup.driver);
Landingpageobj=testcontextsetup.pom.getlandingpageobject();
Landingpageobj.searchboxenter(product);

//Thread.sleep(5000);
testcontextsetup.landingpageproductname=Landingpageobj.productnamecheck();

System.out.println("landingpageproductname is :"+testcontextsetup.landingpageproductname);

}

@And("^The  user adds the products in the shopping cart and  click on  proceed to checkout button$")
public void  The_user_adds_the_products_in_the_shopping_cart_and_click_on_proceed_to_checkout_button() throws InterruptedException
{
	Landingpageobj.increment();
	//Thread.sleep(2000);
	Landingpageobj.ADDTOCARTbutton();
	//Thread.sleep(2000);
	Landingpageobj.clickonaddtocartbutton();
	//Thread.sleep(2000);
	Landingpageobj.Proceedtocheckoutbutton();
	
	
	
}


}

