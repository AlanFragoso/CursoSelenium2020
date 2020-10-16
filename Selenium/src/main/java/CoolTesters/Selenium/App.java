package CoolTesters.Selenium;

import java.util.List;
import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        // Saber de que carpeta va a tomar el driver
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
        // Establecer la propiedad del .exe
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
        // Inicializar el driver
        WebDriver driver = new ChromeDriver();
        // Agregar la url de la pagina
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        //obteniendo objetos/elementos de la pagina del login
        WebElement TxtUserName = driver.findElement(By.id("txtUsername"));
        WebElement TxtPassword = driver.findElement(By.id("txtPassword"));
        WebElement BtnLogin = driver.findElement(By.id("btnLogin"));
        
        //Haciendo el login
        TxtUserName.sendKeys("Admin");
        TxtPassword.sendKeys("admin123");
        BtnLogin.click();
        
        //Validacion del Home
        String UrlDashboard = driver.getCurrentUrl();
        System.out.println("URL: " + UrlDashboard);
        UrlDashboard.contains("/dashboard");
        
        //FindElements
        List<WebElement> firstLevelMenu= driver.findElements(By.xpath("//*[@class='firstLevelMenu']/b"));
        System.out.println("Numero de elementos: " + firstLevelMenu.size());
        
        String primerMenu = firstLevelMenu.get(0).getText();
        System.out.println(primerMenu);
        String segundoMenu= firstLevelMenu.get(1).getText();
        System.out.println(segundoMenu);
        
        for (int i=0; i<firstLevelMenu.size(); i++) {
        	System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
        }
        
        //Metodos de navegacion
       // driver.navigate().back();
       // driver.navigate().forward();
      //  driver.navigate().refresh();
        
        String title= driver.getTitle();
        System.out.println("El titulo es: " + title);
        
        //Click assignLeaveBtn
        WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
        assignLeaveBtn.click();
        
        //Obtener Text de un webElement
        String welcomeMSJ = driver.findElement(By.id("welcome")).getText();
        boolean verifywelcomeMSJ = welcomeMSJ.contains("Smith");
        if(verifywelcomeMSJ) {
        	System.out.println("El mensaje contiene el nombre Smith");
        }else {
        	System.out.println("El mensaje NO contiene el nombre esperado");
        }
        
        //Dropdowns
        Select oSelect= new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
        		oSelect.selectByVisibleText("Maternity US");
        		
        //Cerrar Navegador Web
        driver.close();
        driver.quit();
    }
}
