package maps;

import core.Element;

public class SubmarinoMap {
	/*
	 * 1. Submarino
	 * 
	 * 2. Campo pesquisa(Pagina principal)
	 * 
	 * 3. link do primeiro livro(Pagina de resultado)
	 * 
	 */
	public Element formSearch = new Element("input[id='h_search-input']");
	
	 /* 4. Titulo do livro(pagina do produto)
	 * 
	 * 5. Valor do livro(pagina do produto)
	 * 
	 * 6. Valor do ISBN(pagina do produto)
	 */
	public Element h4PrimeiroLivro = new Element("h4");
}
