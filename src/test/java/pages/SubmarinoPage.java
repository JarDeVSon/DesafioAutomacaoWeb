package pages;

import maps.SubmarinoMap;

public class SubmarinoPage {
	SubmarinoMap submarinoMap = new SubmarinoMap();

	public void realizarPesquisaDeUmLivroQualquer(String value) {
		submarinoMap.formSearch.sendKeys(value);
		submarinoMap.formSearch.click();
	}

	public void guardarNomeDoProdutoValorISBN(String value) {
		submarinoMap.h4PrimeiroLivro.isDisplayed();
	}
}
