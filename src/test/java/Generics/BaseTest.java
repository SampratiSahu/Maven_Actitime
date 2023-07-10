package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void executionStart()
	{
		System.out.println("Execution Started");
	}
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver();
		
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void executionEnd()
	{
		System.out.println("Execution Ended");
	}

}
