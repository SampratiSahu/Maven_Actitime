package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;


public class BaseTestCrossBrowser implements AutoConstant
{
public static WebDriver driver;
	
	@BeforeSuite
	public void executionStart()
	{
		System.out.println("Execution Started");
	}
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver(options);
			ChromeDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		  else if(browser.equalsIgnoreCase("edge")) 
		  {
			  EdgeOptions options = new EdgeOptions(); 
			  options.addArguments("--remote-allow-origins=*");
			  System.setProperty("webdriver.edge.silentOutput", "true"); 
			  driver = new EdgeDriver(options); 
			  EdgeDriverManager.edgedriver().setup();
			  driver.manage().window().maximize(); 
			  driver.get(url); 
		}
		 
		  else if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.firefox.silentOutput", "true");
			FirefoxDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			driver.get(url);
		}
	}
	
	@AfterClass
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
