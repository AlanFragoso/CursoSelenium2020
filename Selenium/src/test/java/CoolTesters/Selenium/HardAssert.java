package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {
	
	@Test
	public void assertEquals() {
	int a= 10;
	int b= 10;
	Assert.assertEquals(a,b, "Los numeros no son iguales");	
	}
	
	@Test
	public void verificarTituloDePagina() {
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
        
        Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void verificarTituloDePaginaBoolean() {
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
       
       boolean titulo= actualTitle.contains(expectedTitle);
       
       Assert.assertTrue(titulo);
	}
}