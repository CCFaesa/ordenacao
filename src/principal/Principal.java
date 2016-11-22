package principal;

import modelo.Item;
import ordenador.ABB;

public class Principal {
	public static void main(String[] args) {
//		Item[] a = ArquivoUtilitario.arquivoToVetorItem("Texto1.txt");
//	
//		for (Item item : a) {
//			System.out.println(item.getPalavra());
//		}
//		System.out.println("Ola ordenacao");
		
		ABB abb = new ABB();
		abb.insere(new Item(1, "Capoeira"));
		abb.insere(new Item(1, "Adedonha"));
		abb.insere(new Item(1, "Adedo"));
		abb.insere(new Item(2, "Boneca"));
		abb.insere(new Item(2, "Sapo"));
		abb.insere(new Item(2, "Adedonha"));
		abb.insere(new Item(2, "Moleca"));
		System.out.println();
	}
}
