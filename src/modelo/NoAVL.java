package modelo;

import estrutura.ListaEncadeada;

public class NoAVL {
	private NoAVL noEsquerda;
	private NoAVL noDireita;
	private ListaEncadeada lista;
	private int fatorBalanceamento;
	
	public NoAVL(Item item){
		lista = new ListaEncadeada();
		lista.add(item);
	}
	
	public NoAVL getNoEsquerda() {
		return noEsquerda;
	}

	public void setNoEsquerda(NoAVL no) {
		this.noEsquerda = no;
	}

	public NoAVL getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(NoAVL no) {
		this.noDireita = no;
	}
	
	public No getPrimeiroNo(){
		return lista.getPrimeiro();
	}

	public int getFatorBalanceamento() {
		return fatorBalanceamento;
	}

	public void setFatorBalanceamento(int fatorBalanceamento) {
		this.fatorBalanceamento = fatorBalanceamento;
	}

	public void add(Item item){
		lista.add(item);
	}
}
