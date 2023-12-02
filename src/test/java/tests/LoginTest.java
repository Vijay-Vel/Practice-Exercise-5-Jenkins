package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginTest extends TestBase {
	
	HomePage hp;
	LoginPage lp;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser();
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}

	
	@Test()
	public void test_login()
	{
		hp.clickLoginLink();
		lp.user_login();
	}

	@AfterTest
	public void close_browser()
	{
		driver.close();
	}

}
