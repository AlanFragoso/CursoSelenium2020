package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Saber de que carpeta va a tomar el driver
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
        // Establecer la propiedad del .exe
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
        // Inicializar el driver
        WebDriver driver = new ChromeDriver();
        // Agregar la url de la pagina
        driver.get("https://www.ford.com");
    }
}
