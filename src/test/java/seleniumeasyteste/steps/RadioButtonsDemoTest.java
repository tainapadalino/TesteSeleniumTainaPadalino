package seleniumeasyteste.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumeasyteste.elementos.Elementos;
import seleniumeasyteste.metodos.Metodos;

public class RadioButtonsDemoTest {

	WebDriver driver;
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja na tela de demonstracao e acesse botoes de radio")
	public void que_eu_esteja_na_tela_de_demonstracao_e_acesse_botoes_de_radio() throws InterruptedException {
		metodos.abrirNavegador("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		Thread.sleep(2000);
		metodos.clicar(el.getLightboxClose());
	}

	@When("selecionar sexo")
	public void selecionar_sexo() {
		metodos.clicar(el.getMale());
		metodos.clicar(el.getButtoncheck());

	}

	@Then("obtenho valor verificado")
	public void obtenho_valor_verificado() {

	}

	@When("selecionar sexo e idade")
	public void selecionar_sexo_e_idade() {
		metodos.clicar(el.getFemale());
		metodos.clicar(el.getAgeGroup());
		metodos.clicar(el.getGetVallues());

	}

	@Then("obtenho valores verificados")
	public void obtenho_valores_verificados() {
		metodos.fecharNavegador();

	}

}
