package StepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.Agreetocondtionspageobjects;
import pageObject.Landingpageobjects;
import utilities.TestContextSetup;

public class Agreetoconditionspage {
	
	public WebDriver driver;
	TestContextSetup testcontextsetup;
	Agreetocondtionspageobjects agreetocondpageobj;
	public Agreetoconditionspage(TestContextSetup testcontextsetup)
		{
	this.testcontextsetup=testcontextsetup;
		}
	
@Then ("^the user enters the country and click on agree to conditions and click on proceed$")
public void the_user_enters_the_country_and_click_on_agree_to_conditions_and_click_on_proceed() throws InterruptedException
{
	agreetocondpageobj=testcontextsetup.pom.Agreetocondtionspageobjects();
	agreetocondpageobj.dropdownclick();
	//Thread.sleep(2000);
	agreetocondpageobj.Austriaclick();
	//Thread.sleep(2000);
	agreetocondpageobj.Agreetoconditionscheckboxclick();
	//Thread.sleep(2000);
	agreetocondpageobj.proceedbuttonclick();
	System.out.println("Clicking on proceed button1");
	System.out.println("Clicking on proceed button2");
	System.out.println("Clicking on proceed button3");
	
	
	
	
}
@And("^your order has been placed message have come and redirected to home page$")
public void your_order_has_been_placed_message_have_come_and_redirected_to_home_page() throws IOException, InterruptedException

{
	
	agreetocondpageobj.thankyoudisplay();
	System.out.println("Redirecting to homepage");
	System.out.println("Redirecting to homepage prabha");
	
	
	
	WebDriver driver=testcontextsetup.testbasefordriver.WebDriverManager();
	System.out.println(driver.getTitle());
	
}
	
}