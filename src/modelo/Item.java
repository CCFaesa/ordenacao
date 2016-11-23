package modelo;

public class Item {
	private int paragrafo;
	private String palavra;
	
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
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Item)) return false;
		
		Item outro = (Item)obj;
		return this.palavra.equalsIgnoreCase(outro.getPalavra()) && this.paragrafo == outro.getParagrafo();
	}
	
	public int comparaTudo(Item item){
		int diferenca = this.palavra.compareToIgnoreCase(item.getPalavra());
		if(diferenca == 0){
			return paragrafo - item.getParagrafo();
		}
		
		return diferenca;
	}
	
	public int comparaPalavra(Item item){
		return this.palavra.compareToIgnoreCase(item.getPalavra());
	}
	
	public int comparaPalavra(String palavra){
		return this.palavra.compareToIgnoreCase(palavra);
	}

	@Override
	public String toString() {
		return  palavra + "[" + paragrafo + "]";
	}
	
	
}
