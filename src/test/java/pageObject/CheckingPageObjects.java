package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckingPageObjects {
public WebDriver driver;

public  CheckingPageObjects(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);//page object factory model initiazing methods
}		
	
//testcases pageobjects for searching with short name TOM
	
@FindBy(xpath="//p[@class='product-name']")
private WebElement  productname;

@FindBy(xpath="//input[@placeholder='Enter promo code']")
private WebElement  enteringpromocode;

@FindBy(xpath="//button[@class='promoBtn']")
private WebElement  applybutton;

@FindBy(xpath="//button[normalize-space()='Place Order']")
private WebElement  placeorder;
	
public void productnames()
 {
String productnametomato=productname.getText();
//Assert.assertEquals(productnametomato,"Tomato - 1 Kg");
	 
 } 
public void enteringpromocode()
{
	enteringpromocode.sendKeys("rahulshettyacademy");
}
public void applybutton()

{
	applybutton.click();
	
}
	public void placeorder()
	{
		placeorder.click();
	}
	
	
	
 }