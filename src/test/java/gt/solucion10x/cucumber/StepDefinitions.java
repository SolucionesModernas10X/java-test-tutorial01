package gt.solucion10x.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static junit.framework.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    
    WebDriver driver;
        
    public StepDefinitions() {
        WebDriverManager.chromedriver().setup();
    }
    
    @Given("Abrir navegador web e ingresar al sitio web")
    public void abrir_navegador_web_e_ingresar_al_sitio_web() {        
        this.driver  = new ChromeDriver();
    }

    @And("Navegador debe mostrar el sitio web")
    public void navegador_debe_mostrar_el_sitio_web() {
        String URL = "https://www.10x.gt/";
        this.driver.get(URL);
    }

    @Then("El sitio web debe mostrar el logo")
    public void el_sitio_web_debe_mostrar_el_logo() {
        String tagLogo = driver.findElement(By.className("custom-logo")).getTagName();
        assertTrue(tagLogo.equals("img"));
        driver.close();        
    }
    

}
