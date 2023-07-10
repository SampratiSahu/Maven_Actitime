package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;

public class Actitime_HomePage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsButton;
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeOfWorkButton;
	
	public Actitime_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptExecutorClick(driver, logoutButton);
	}
	public void settingMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptExecutorClick(driver, settingsButton);
	}
	public void typeOfWorkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptExecutorClick(driver, typeOfWorkButton);
	}
}
