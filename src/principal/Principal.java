package principal;

import estrutura.ListaEncadeada;
import modelo.Item;
import ordenador.ABB;
import ordenador.AVL;
import ordenador.BubbleSort;
import ordenador.HeapSort;
import utilitario.ArquivoUtilitario;

public class Principal {
	public static void main(String[] args) {
		testeEscreveArquivo();
	}
	
	private static void testeBubbleSort(){
		Item[] array = BubbleSort.ordena(geraLista().toArray());
		for (Item item : array) {
			System.out.println(item.getPalavra() + "[" + item.getParagrafo() + "]");
		}
	}
	
	private static void testeHeapSort(){
		Item[] array = HeapSort.ordena(geraLista().toArray());
		for (Item item : array) {
			System.out.println(item.getPalavra() + "[" + item.getParagrafo() + "]");
		}
	}
	
	private static ListaEncadeada geraLista(){
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
		
		return listaEncadeada;
	}
	
	private static void testeEscreveArquivo(){
		Item[] a = ArquivoUtilitario.arquivoToVetorItem("Texto1.txt");
		ArquivoUtilitario.vetorItemToArquivo("teste.txt",a);
	}

	private static void testeListaEncadeada(){
//		Item[] a = ArquivoUtilitario.arquivoToVetorItem("Texto1.txt");
//		for (Item item : a) {
//			System.out.println(item.getPalavra());
//		}
//		System.out.println("Ola ordenacao");

		ListaEncadeada lista = new ListaEncadeada();
		lista.add(new Item(1, "Tomate"));
		lista.add(new Item(1, "Amora"));
		lista.add(new Item(1, "Banana"));
		lista.add(new Item(1, "Amora"));
		lista.add(new Item(1, "Maca"));
		lista.add(new Item(2, "Maca"));
		lista.add(new Item(2, "Pera"));
		lista.add(new Item(2, "Maca"));
		lista.add(new Item(2, "Jaca"));
		lista.add(new Item(2, "Maracuja"));
		lista.printLista();
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
