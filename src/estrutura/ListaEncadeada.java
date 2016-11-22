package estrutura;

import modelo.Item;
import modelo.No;

public class ListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int quantidadeNos = 0;
	private No inicioParagrafo = null;
	
	public void add(Item item){
		if(quantidadeNos == 0){
			No no = new No(item);
			primeiro = no;
			ultimo = no;
			inicioParagrafo = no;
			quantidadeNos++;
		}else{
			No no = new No(item);

			if(inicioParagrafo.getItem().getParagrafo() != no.getItem().getParagrafo())
				inicioParagrafo = no;
			if(verificaRepetido(inicioParagrafo, no)){
				System.out.println("Palavra repetida: " + no.getItem().getPalavra());
			}else{
				ultimo.setProximo(no);
				ultimo = no;
				quantidadeNos++;
			}
		}
	}

	private boolean verificaRepetido(No noInicioParagrafo, No no) {

		if (noInicioParagrafo.getItem().getParagrafo() == no.getItem().getParagrafo()) {
			while (noInicioParagrafo.getItem() != null) {
				if(! noInicioParagrafo.getItem().getPalavra().equals(no.getItem().getPalavra())){
					noInicioParagrafo = noInicioParagrafo.getProximo();
				}else{
					return true;
				}
			}
			return false;
		}
		return false;
	}
	
	public void printLista() {
		printLista(this);
	}
	
	public void printLista(ListaEncadeada lista) {
		No noInicioLista = lista.primeiro;
		printLista(noInicioLista);	
	}
	
	public void printLista(No noInicioLista){
		while ((noInicioLista != null) && (noInicioLista.getItem() != null)) {
			System.out.println(noInicioLista.getItem().getParagrafo() +" - " + noInicioLista.getItem().getPalavra());
			noInicioLista = noInicioLista.getProximo();
		}
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public int getQuantidadeNos() {
		return quantidadeNos;
	}
	
	public Item[] toArray(){
		Item[] array = new Item[quantidadeNos];
		
		No no = getPrimeiro();
		
		
		for (int i = 0; i < quantidadeNos; i++) {
			array[i] = no.getItem();
			no = no.getProximo();
		}
		
		return array;
	}
	
}
