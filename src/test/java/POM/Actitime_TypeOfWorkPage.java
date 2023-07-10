package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;

public class Actitime_TypeOfWorkPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(xpath="//a[.='Customer Service']/../..//a[contains(text(),'delete')]")
	private WebElement deleteTypeOfWork;
	
	public Actitime_TypeOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createTypeOfWorkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptExecutorClick(driver, createTypeOfWorkButton);
	}
	
	public void deleteTypeOfWorkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptExecutorClick(driver, deleteTypeOfWork);
	}
	public void alertPopupAcceptMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

}
