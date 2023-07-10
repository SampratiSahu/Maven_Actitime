package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.Actitime_HomePage;
import POM.Actitime_LoginPage;
import POM.Actitime_TypeOfWorkPage;

public class Actitime_LoginDeleteTypeOfWorkLogout extends BaseTest
{
	@Test
	public void loginDeleteTypeOfWorkLogoutMethod() throws IOException, InterruptedException
	{
		Actitime_LoginPage login = new Actitime_LoginPage(driver);
		login.loginMethod();
		
		Actitime_HomePage home = new Actitime_HomePage(driver);
		home.settingMethod();
		home.typeOfWorkMethod();
		
		Actitime_TypeOfWorkPage work = new Actitime_TypeOfWorkPage(driver);
		work.deleteTypeOfWorkMethod();
		work.alertPopupAcceptMethod();
		
		home.logoutMethod();
	}

}
