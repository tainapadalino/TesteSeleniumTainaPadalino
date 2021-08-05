package seleniumeasyteste.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumeasyteste.elementos.Elementos;
import seleniumeasyteste.metodos.Metodos;

public class SimpleFormDemoTest {

	WebDriver driver;
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja na tela de demonstracao e acesse o formulario")
	public void que_eu_esteja_na_tela_de_demonstracao_e_acesse_o_formulario() throws InterruptedException {
		metodos.abrirNavegador("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(2000);
		metodos.clicar(el.getLightboxClose());
		metodos.clicar(el.getInputForms());

	}

	@When("digitar mensagem")
	public void digitar_mensagem() {
		metodos.digitar(el.getUserMessage(), "teste");
		metodos.clicar(el.getButton());

	}

	@Then("valido mensagem")
	public void valido_mensagem() {

	}

	@When("inserir valor para a e b")
	public void inserir_valor_para_a_e_b() {
		metodos.digitar(el.getSum1(), "5");
		metodos.digitar(el.getSum2(), "10");
		metodos.clicar(el.getButton2());

	}

	@Then("valido a soma feita")
	public void valido_a_soma_feita() {
		metodos.fecharNavegador();

	}

}
