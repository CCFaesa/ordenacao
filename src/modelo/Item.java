package modelo;

public class Item {
	private int paragrafo;
	private String palavra;
	private Item proximo;
	
	public Item(int paragrafo, String palavra) {
		super();
		this.paragrafo = paragrafo;
		this.palavra = palavra;
	}

	public int getParagrafo() {
		return paragrafo;
	}

	public void setParagrafo(int paragrafo) {
		this.paragrafo = paragrafo;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public Item getProximo() {
		return this.proximo;
	}

	public void setProximo(Item item) {
		this.proximo = item;
	}
	
	
}
