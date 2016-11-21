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
			ultimo.setProximo(no);
			quantidadeNos++;
		}
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public int getQuantidadeNos() {
		return quantidadeNos;
	}
	
}
