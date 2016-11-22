package modelo;

import estrutura.ListaEncadeada;

public class NoABB {
	private NoABB noEsquerda;
	private NoABB noDireita;
	private ListaEncadeada lista;
	
	public NoABB(Item item){
		lista = new ListaEncadeada();
		lista.add(item);
	}
	
	public NoABB getNoEsquerda() {
		return noEsquerda;
	}

	public void setNoEsquerda(NoABB no) {
		this.noEsquerda = no;
	}

	public NoABB getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(NoABB no) {
		this.noDireita = no;
	}
	
	public No getPrimeiroNo(){
		return lista.getPrimeiro();
	}

	public void add(Item item){
		lista.add(item);
	}
}
