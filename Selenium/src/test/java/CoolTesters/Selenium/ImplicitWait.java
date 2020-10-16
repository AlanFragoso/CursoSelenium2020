package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	       String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
	        // Establecer la propiedad del .exe
	        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
	        // Inicializar el driver
	        WebDriver driver = new ChromeDriver();
	        // Agregar la url de la pagina
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        	        
	        WebElement txtUserName = driver.findElement(By.id("txtUsername"));

	}

}
