package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;
import Generics.HelperClass;

public class Actitime_LoginPage extends BasePage implements AutoConstant
{
	WebDriver driver;
	@FindBy(id="username")
	private WebElement usernameTextfield;
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginButton;
	
	public Actitime_LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException, InterruptedException
	{
		HelperClass.highlightelement(driver, usernameTextfield);
		Thread.sleep(4000);
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name1, 1, 0));
		
		HelperClass.highlightelement(driver, passwordTextfield);
		Thread.sleep(4000);
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name1, 1, 1));
		
		javascriptExecutorClick(driver, checkbox);
		javascriptExecutorClick(driver, loginButton);
	}
}
