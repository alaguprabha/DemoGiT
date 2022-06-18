package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferspageObjects {
	public WebDriver driver;

	public OfferspageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//page object factory model initiazing methods
		
	}
	
//testcases pageobjects for clicking on topdeals
	
	@FindBy(xpath="//input[@id='search-field']")
	private WebElement searchfieldenter;
	@FindBy(xpath="//table[@class='table table-bordered']//tbody//tr//td[1]")
	private WebElement offerpageproductname;
	
public void searchfieldenter(String name)
{
	 searchfieldenter.sendKeys(name);
}


public String  offerpageproductname()
{
	String A=offerpageproductname.getText();
	return  A;
	
	 
}



}
