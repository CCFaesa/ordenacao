package principal;

import modelo.Item;
import ordenador.ABB;
import ordenador.AVL;
import utilitario.ArquivoUtilitario;

public class Principal {
	public static void main(String[] args) {
		
		
	
	
	}

	private void testeListaEncadeada(){
		Item[] a = ArquivoUtilitario.arquivoToVetorItem("Texto1.txt");
	
		for (Item item : a) {
			System.out.println(item.getPalavra());
		}
		System.out.println("Ola ordenacao");

	}
	
	private void testeAbb(){
		ABB arvore = new ABB();
		arvore.insere(new Item(1, "Adedonha"));
		arvore.insere(new Item(1, "Adedo"));
		arvore.insere(new Item(2, "Boneca"));
		arvore.insere(new Item(1, "Capoeira"));
		arvore.insere(new Item(2, "Adedonha"));
		arvore.insere(new Item(2, "Moleca"));
		arvore.insere(new Item(2, "Sapo"));
		arvore.insere(new Item(2, "Rato"));
		System.out.println();
	
	}
}
