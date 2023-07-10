package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.Actitime_CreateNewTypeOfWork;
import POM.Actitime_HomePage;
import POM.Actitime_LoginPage;
import POM.Actitime_TypeOfWorkPage;

public class Actitime_LoginCreateTypeOfWorkLogout extends BaseTest
{
	@Test
	public void loginCreateTypeOfWorkLogoutMethod() throws IOException, InterruptedException
	{
		Actitime_LoginPage login = new Actitime_LoginPage(driver);
		login.loginMethod();
		
		Actitime_HomePage home = new Actitime_HomePage(driver);
		home.settingMethod();
		home.typeOfWorkMethod();
		
		Actitime_TypeOfWorkPage work = new Actitime_TypeOfWorkPage(driver);
		work.createTypeOfWorkMethod();
		
		Actitime_CreateNewTypeOfWork newWork = new Actitime_CreateNewTypeOfWork(driver);
		newWork.nameMethod();
		newWork.submitButton();
		
		home.logoutMethod();
		
	}

}
