package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.makemytrippageobject;
import utilities.TestContextSetup;

public class makemytripprofileupdate 
{
	public WebDriver driver;
	TestContextSetup testcontextsetup;
	makemytrippageobject makemytripobj;
	public makemytripprofileupdate(TestContextSetup testcontextsetup)
			{
	this.testcontextsetup=testcontextsetup;
			}

	@Given("^The user is on \"([^\"]*)\" website1$")
	public void The_user_is_on_website1(String URL) throws IOException, InterruptedException
	{
		WebDriver driver=testcontextsetup.testbasefordriver.WebDriverManager();
		driver.get(URL);
		
	}

	@When("^The user clicks on login or create accountand enter mobile number and enter mobile number$")
	public void The_user_clicks_on_login_or_create_account_and_enter_mobile_number_and_enter_mobile_number() throws InterruptedException
	{
		makemytripobj=testcontextsetup.pom.getmakemytrippageobject();
		makemytripobj.loginorcreateaccount();
				
		makemytripobj.Entermailormobilenumber();
		makemytripobj.continuebutton();
		
		
	}

	




}
