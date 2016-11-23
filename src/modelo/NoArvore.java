package modelo;

import java.io.Serializable;

import estrutura.ListaEncadeada;

public class NoArvore implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private NoArvore noEsquerda;
	private NoArvore noDireita;
	private ListaEncadeada lista;
	private int fatorBalanceamento;
	
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
