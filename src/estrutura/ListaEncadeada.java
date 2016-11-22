package estrutura;

import modelo.Item;
import modelo.No;

public class ListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int quantidadeNos = 0;
	
	public void add(Item item){
		if(quantidadeNos == 0){
			No no = new No(item);
			primeiro = no;
			ultimo = no;
			quantidadeNos++;
		}else{
			No no = new No(item);
			ultimo.setProximo(no);
			ultimo = no;
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
