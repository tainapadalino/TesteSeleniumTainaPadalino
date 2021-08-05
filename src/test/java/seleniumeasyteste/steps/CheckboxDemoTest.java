package seleniumeasyteste.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumeasyteste.elementos.Elementos;
import seleniumeasyteste.metodos.Metodos;

public class CheckboxDemoTest {

	WebDriver driver;
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja na tela de selecao CheckBox")
	public void que_eu_esteja_na_tela_de_selecao_check_box() throws InterruptedException {
		metodos.abrirNavegador("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		Thread.sleep(2000);
		metodos.clicar(el.getLightboxClose());
	}

	@When("selecionar caixa de selecao")
	public void selecionar_caixa_de_selecao() {
		metodos.clicar(el.getIsAgeSelected());

	}

	@Then("Valido mensagem de sucesso")
	public void valido_mensagem_de_sucesso() {

	}

	@When("selecionar marcar todas as selecoes")
	public void selecionar_marcar_todas_as_selecoes() {
		metodos.clicar(el.getCheck1());

	}

	@When("selecionar desmarcar todas as selecoes")
	public void selecionar_desmarcar_todas_as_selecoes() {
		metodos.clicar(el.getCheck1());

	}

	@When("selecionar apenar uma caixa")
	public void selecionar_apenar_uma_caixa() {
		metodos.clicar(el.getCb1element());

	}

	@Then("Valido alteracoes nas mensagens")
	public void valido_alteracoes_nas_mensagens() {
		metodos.fecharNavegador();

	}

}
