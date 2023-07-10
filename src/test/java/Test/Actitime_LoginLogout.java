package Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.Actitime_HomePage;
import POM.Actitime_LoginPage;

@Listeners(Generics.MultipleScreenshot.class)
public class Actitime_LoginLogout extends BaseTest
{
	@Test
	public void loginLogoutMethod() throws IOException, InterruptedException
	{
		Actitime_LoginPage login = new Actitime_LoginPage(driver);
		login.loginMethod();
		
		Actitime_HomePage home = new Actitime_HomePage(driver);
		home.logoutMethod();
	}

}
