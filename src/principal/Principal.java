package principal;

import modelo.Item;
import utilitario.ArquivoUtilitario;

public class Principal {
	public static void main(String[] args) {
		Item[] a = ArquivoUtilitario.arquivoToVetorItem("Texto1.txt");
	
		for (Item item : a) {
			System.out.println(item.getPalavra());
		}
		System.out.println("Ola ordenacao");
	}
}
