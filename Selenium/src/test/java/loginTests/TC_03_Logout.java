package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.loginPage;
import navPages.navDashboard;

public class TC_03_Logout {
	
WebDriver driver = DriverSetup.setupDriver();
	
	//login PageObject
	loginPage login = new loginPage(driver);
	navDashboard dashboard = new navDashboard(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_03() {
	  login.login(variablesGlobales.USER_ADMIN,variablesGlobales.PASSWORD_ADMIN);
	  dashboard.logout();
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
