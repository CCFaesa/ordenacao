package estrutura;

import modelo.No;

public class ListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int quantidadeNos = 0;
	
	public void add(No no){
		if(quantidadeNos == 0){
			primeiro = no;
			ultimo = no;
			quantidadeNos++;
		}else{
			ultimo.setProx(no);
			quantidadeNos++;
		}
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidadeNos() {
		return quantidadeNos;
	}

	public void setQuantidadeNos(int quantidadeNos) {
		this.quantidadeNos = quantidadeNos;
	}
	
	
	
}
