package modelo;

import estrutura.ListaEncadeada;

public class NoArvore {
	private NoArvore noEsquerda;
	private NoArvore noDireita;
	private ListaEncadeada lista;
	
	public NoArvore(Item item){
		lista = new ListaEncadeada();
		lista.add(item);
	}
	
	public NoArvore getNoEsquerda() {
		return noEsquerda;
	}

	public void setNoEsquerda(NoArvore no) {
		this.noEsquerda = no;
	}

	public NoArvore getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(NoArvore no) {
		this.noDireita = no;
	}
	
	public No getPrimeiroNo(){
		return lista.getPrimeiro();
	}

	public void add(Item item){
		lista.add(item);
	}
}
