package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsEjemplo {

	public static void main(String[] args) {
		
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
        // Establecer la propiedad del .exe
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
        // Inicializar el driver
        WebDriver driver = new ChromeDriver();
        // Agregar la url de la pagina
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        
        //Obtener e imprimir el ID de la ventana/Tab original
        String originalTab= driver.getWindowHandle();
        System.out.println(originalTab);
        
        //Click en el link que abre otra ventana
        WebElement clickHere = driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]"));
        clickHere.click();
        
        Set<String> ventanasAbiertas = driver.getWindowHandles();
        System.out.println(ventanasAbiertas);
        
        for (String tabNueva : driver.getWindowHandles()) {
        	if(!originalTab.contentEquals(tabNueva)) {
        		driver.switchTo().window(tabNueva);
        		break;
        	}
        }
        
        WebElement emailTxt = driver.findElement(By.name("emailid"));
        emailTxt.sendKeys("test@test.com");
	}

}
