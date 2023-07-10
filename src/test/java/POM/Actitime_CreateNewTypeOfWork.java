package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;

public class Actitime_CreateNewTypeOfWork extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(name="name")
	private WebElement nameTextfield;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
	
	public Actitime_CreateNewTypeOfWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void nameMethod() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		nameTextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name2, 1, 0));
	}
	public void submitButton()
	{
		javascriptExecutorClick(driver, submitButton);
	}

}
