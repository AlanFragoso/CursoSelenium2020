package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class navDashboard {

	public navDashboard (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Navegar en el dashboard
		@FindBy(id="welcome")
		private WebElement welcomeDropdown;
		@FindBy(xpath= "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
		private WebElement logoutBtn;
		
		public void logout() {
			welcomeDropdown.click();
			logoutBtn.click();
		}
}
