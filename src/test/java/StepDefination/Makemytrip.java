package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Agreetocondtionspageobjects;
import pageObject.makemytrippageobject;
import utilities.TestContextSetup;

public class Makemytrip {
public WebDriver driver;
TestContextSetup testcontextsetup;
makemytrippageobject makemytripobj;
public Makemytrip(TestContextSetup testcontextsetup)
		{
this.testcontextsetup=testcontextsetup;
		}

@Given("^The user is on \"([^\"]*)\" website$")
public void The_user_is_on_website(String URL) throws IOException, InterruptedException
{
	WebDriver driver=testcontextsetup.testbasefordriver.WebDriverManager();
	driver.get(URL);
	
}

@When("^The user clicks on country dropdown and select the country as India$")
public void The_user_clicks_on_country_dropdown_and_select_the_country_as_India() throws InterruptedException
{
	makemytripobj=testcontextsetup.pom.getmakemytrippageobject();
	makemytripobj.selectcountrylanguageINR();

	makemytripobj.selectcountrydropdownclick();

	makemytripobj.Indiaclick();

	
}

@And("^The User click on hindi checkbox and appply button$")
public void The_User_click_on_hindi_checkbox_and_appply_button() throws InterruptedException
{
	makemytripobj.Hindidcheckbox();
	
	makemytripobj.Applybuttonclick();
}

		
@Then("^the whole page appears in hindi language$")
public void the_whole_page_appears_in_hindi_language()
{
	System.out.println("The Website appears in hindi language");
	
}

}


