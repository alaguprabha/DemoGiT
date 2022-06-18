package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpageobjects {
	public WebDriver driver;

	public Landingpageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//page object factory model initiazing methods
		
	}
	


	//testcases pageobjects for searching with short name TOM
	
	@FindBy(xpath="//input[@placeholder='Search for Vegetables and Fruits']")
	private WebElement  searchboxenter;
	
	@FindBy(css="h4.product-name")
	private WebElement productnamecheck;
	
	@FindBy(xpath="//a[normalize-space()='Top Deals']")
	private WebElement Topdeals;
	
	@FindBy(xpath="//a[@class='increment']")
	private WebElement increment;
	
	@FindBy(xpath="//button[normalize-space()='ADD TO CART']")
	private WebElement ADDTOCARTbutton;
	
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement clickonaddtocartbutton;
	
	@FindBy(xpath="//button[normalize-space()='PROCEED TO CHECKOUT']")
	private WebElement Proceedtocheckoutbutton;
	
	
public void searchboxenter(String name)
{
	searchboxenter.sendKeys(name);
}

public void Topdealsclick()
{
	Topdeals.click();
}

public String productnamecheck() {
	String landingpageproductname1=productnamecheck.getText().split("-")[0].trim();
	return landingpageproductname1;
	
}
public void increment()
{
	for(int i=0;i<3;i++)
	{
		increment.click();
	}
}
public void ADDTOCARTbutton()
{
	ADDTOCARTbutton.click();
}

public void clickonaddtocartbutton()
{
	clickonaddtocartbutton.click();
}
public void Proceedtocheckoutbutton()
{
	Proceedtocheckoutbutton.click();
}
		



 
}
