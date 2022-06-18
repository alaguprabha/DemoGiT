package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class makemytrippageobject {
	public WebDriver driver;
	
	public makemytrippageobject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//page object factory model initiazing methods
		
	}
	
	@FindBy(xpath="//span[@class='latoBold capText font11']")
	private WebElement selectcountrylanguageINR;
	
	@FindBy(xpath="//p[@class='selectConInput']")
	private WebElement selectcountrydropdownclick;
	
	@FindBy(xpath="(//p[@class='listRow'])[1]")
	private WebElement Indiaclick;
	
	@FindBy(xpath="//label[@for='hinLang']")
	private WebElement Hindidcheckbox;
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	private WebElement Applybuttonclick;
	
	
	@FindBy(xpath="//li[@data-cy='account']")
	private WebElement loginorcreateaccount;
	
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//button[@data-cy='continueBtn']")
	private WebElement continuebtn;
	


	
	public void selectcountrydropdownclick()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(selectcountrydropdownclick));
		selectcountrydropdownclick.click();
		
	}
	public void Indiaclick()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(Indiaclick));
		 Indiaclick.click();
		
	}
	
	public void Hindidcheckbox()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(Hindidcheckbox));
		Hindidcheckbox.click();
	}
	
	public void Applybuttonclick()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(Applybuttonclick));
		 Applybuttonclick.click();
	}

	public void selectcountrylanguageINR() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(selectcountrylanguageINR));
		selectcountrylanguageINR.click();
		
	}
	
	public void loginorcreateaccount()
	{
		loginorcreateaccount.click();
	}
	
	
	public void Entermailormobilenumber()
	{
		username.sendKeys("alaguprabha@gmail.com");
	}
	
	public void continuebutton() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.doubleClick(continuebtn).perform();
		Thread.sleep(2000);
	
		continuebtn.click();
		Thread.sleep(2000);
		act.doubleClick(continuebtn).perform();
		
		
	}
}
