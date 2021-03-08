package steps;

import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SubmarinoPage;

public class SubmarinoSteps {

	SubmarinoPage submarinoPage = new SubmarinoPage();

	@When("Realizar pesquisa de um livro qualquer")
	public void realizarPesquisaDeUmLivroQualquer(Map<String, String> map) {

		submarinoPage.realizarPesquisaDeUmLivroQualquer(map.get("livro qualquer"));
	}

	@Then("Guardar nome do produto, valor e ISBN")
	public void guardarNomeDoProdutoValorISBN(Map<String, String> map) {
		submarinoPage.guardarNomeDoProdutoValorISBN(map.get("nome do produto"));
		submarinoPage.guardarNomeDoProdutoValorISBN(map.get("valor"));
		submarinoPage.guardarNomeDoProdutoValorISBN(map.get("ISBN"));
	}
}
