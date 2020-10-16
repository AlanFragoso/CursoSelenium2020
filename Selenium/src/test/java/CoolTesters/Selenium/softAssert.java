package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	SoftAssert softAssert= new SoftAssert();
	
	@Test
	public void softAssertEqual() {
		
		 // Saber de que carpeta va a tomar el driver
	       String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
	       // Establecer la propiedad del .exe
	       System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
	       // Inicializar el driver
	       WebDriver driver = new ChromeDriver();
	       // Agregar la url de la pagina
	       driver.get("https://opensource-demo.orangehrmlive.com/");
	       driver.manage().window().maximize();
	       
	       String actualTitle= driver.getTitle();
	       String expectedTitle= "OrangeHRM";
	       String badTitle= "asd";
	       
	       softAssert.assertEquals(actualTitle, expectedTitle);
	       softAssert.assertEquals(actualTitle, badTitle);
	       softAssert.assertAll();
	}

}
