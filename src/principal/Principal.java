package principal;

import estrutura.ListaEncadeada;
import modelo.Item;
import ordenador.ABB;
import ordenador.AVL;
import ordenador.BubbleSort;
import utilitario.ArquivoUtilitario;

public class Principal {
	public static void main(String[] args) {
		
		
	
	
	}
	
	private void testeBubbleSort(){
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		listaEncadeada.add(new Item(1, "Maca"));
		listaEncadeada.add(new Item(1, "Banana"));
		listaEncadeada.add(new Item(1, "Amora"));
		listaEncadeada.add(new Item(1, "Banana"));
		listaEncadeada.add(new Item(1, "Pera"));
		listaEncadeada.add(new Item(2, "Maca"));
		listaEncadeada.add(new Item(2, "Banana"));
		listaEncadeada.add(new Item(2, "Jaca"));
		listaEncadeada.add(new Item(2, "Uva"));
		listaEncadeada.add(new Item(2, "Caja"));
		listaEncadeada.add(new Item(2, "Uva"));
		
		Item[] array = BubbleSort.ordena(listaEncadeada.toArray());
		for (Item item : array) {
			System.out.println(item.getPalavra());
		}
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
