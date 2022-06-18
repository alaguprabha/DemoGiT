package StepDefination;

import io.cucumber.java.en.Then;
import pageObject.Landingpageobjects;
import pageObject.CheckingPageObjects;
import utilities.TestContextSetup;

public class Checkoutpage {
	
TestContextSetup testcontextsetup;
CheckingPageObjects checkingpageobj;
public  Checkoutpage(TestContextSetup testcontextsetup)
{
	this.testcontextsetup=testcontextsetup;
}

@Then("^the user checks the items in checkout page and verify whether apply promo button and place order button is enabled$")
public void the_user_checks_the_items_in_checkout_page_and_verify_whether_apply_promo_button_and_place_order_button_is_enabled() throws InterruptedException
	{
	checkingpageobj=testcontextsetup.pom.getcheckingpageobjects();
	checkingpageobj.productnames();
	Thread.sleep(2000);
	checkingpageobj.enteringpromocode();
	Thread.sleep(2000);
	checkingpageobj.applybutton();
	Thread.sleep(2000);
	checkingpageobj.placeorder();
	Thread.sleep(2000);
	
	
		
	}
}
