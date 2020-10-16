package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Fluent {

	public static void main(String[] args) {
	    String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
        // Establecer la propiedad del .exe
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
        // Inicializar el driver
        WebDriver driver = new ChromeDriver();
        // Agregar la url de la pagina
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        Wait<WebDriver> wait = new Fluent<WebDriver>(driver)
        		 .withTimeout(Duration.ofSeconds(60))
        		 .pollingEvery(Duration.ofSeconds(5))
        		 .ignoring(NoSuchElementException.class);//Esto es lo que ignora nuestro WAIT durante 60 segundos

        		WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() {

        		 public WebElement apply(WebDriver driver) {

        		 driver.navigate().refresh();

        		 return driver.findElement(By.id("txtUsername"));

	}
        		});
	}
}


