package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosPage {

	WebDriver driver;

     public void abrirNavegador(String url ) {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
         driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get(url);
      }
public void clicar(By elemento) {
	driver.findElement(elemento).click();
}
	



}
