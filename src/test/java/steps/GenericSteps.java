package steps;

import java.io.IOException;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class GenericSteps {
	
	@Before
	public void abreNavegador() throws IOException {
		Driver.abreNavegador();

	}

	@After
	public void fechaNavegador(Scenario cenario) throws IOException {
		System.out.println(cenario.getName() + " Status: " + cenario.getStatus());
		Driver.printScreen("Scenario: "+cenario.getName());
		Driver.fechaNavegador();
	}
	/*
	 * @Dado("que esteja na pagina {string}") public void queEstejaNaPagina(String
	 * url) throws InterruptedException {
	 * 
	 * Driver.driver.get(url); }
	 */
	@Given("Entrar no site da submarino {string}")
	public void entrarNoSiteDaSubmarino(String url) {
		Driver.driver.get(url);
	}
	
}
