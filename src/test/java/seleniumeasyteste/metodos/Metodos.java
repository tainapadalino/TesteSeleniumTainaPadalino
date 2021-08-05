package seleniumeasyteste.metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	WebDriver driver;
	WebDriverWait wait;

	/**
	 * Método para abrir navegador com espera de 3 segundos.
	 * 
	 * @author Tainá Padalino
	 * @param site
	 * @param passo
	 */
	public void abrirNavegador(String site) {

		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("***** error ao abrir navegador ***** " + e.getMessage());
		}
	}

	/**
	 * Método para clicar em um elemento
	 * 
	 * @author Tainá Padalino
	 * @param elemento
	 * @param passo
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("***** error ao clicar no elemento ***** " + e.getMessage());
		}
	}

	/**
	 * Método para digitar um texto
	 * 
	 * @author Tainá Padalino
	 * @param elemento
	 * @param texto
	 * @param passo
	 */
	public void digitar(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("***** error ao digitar texto ***** " + e.getMessage());
		}
	}

	/**
	 * Método para fechar navegador
	 * 
	 * @author Tainá Padalino
	 */
	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("***** error ao fechar navegador ***** " + e.getMessage());
		}

	}
}
