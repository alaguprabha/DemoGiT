package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agreetocondtionspageobjects {
	public WebDriver driver;

	public  Agreetocondtionspageobjects(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);//page object factory model initiazing methods
	}	
	
	@FindBy(xpath="//div[@class='wrapperTwo']//div//select")
	private WebElement dropdownclick;
	@FindBy(xpath="(//select//option)[13]")
	private WebElement Austriaclick;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement Agreetoconditionscheckboxclick;

	@FindBy(xpath="//button[normalize-space()='Proceed']")
	private WebElement proceedbuttonclick;
	
	@FindBy(xpath="//span[contains(text(),'Thank you, your order has been placed successfully')]")
	private WebElement thankyoudisplay;
	
	
	
	
	public void dropdownclick()
	{
		dropdownclick.click();
	}
	
	public void Austriaclick()
	{
		Austriaclick.click();
}
	
	public void Agreetoconditionscheckboxclick()
	{
		Agreetoconditionscheckboxclick.click();
	}
	
	public void proceedbuttonclick()
	
	{
		proceedbuttonclick.click();
	}
	
	

	public void thankyoudisplay() {
		thankyoudisplay.click();
		
	}

}
