package estrutura;

import modelo.Item;
import modelo.No;

public class HashListaEncadeada {
	
	private ListaEncadeadaLista vetorPrincipal[];
	int numeroMod;

	public HashListaEncadeada(int tamanhoVetor, int numeroMod){
		vetorPrincipal = new ListaEncadeadaLista[tamanhoVetor];
		this.numeroMod = numeroMod;
	}
	
	private int calculaPosicao(int valor){
		return valor % numeroMod;
	}
	
	public void add(Item item) {
		int i = calculaPosicao(item.getPalavra().hashCode());
		if (vetorPrincipal[i] == null) {
			vetorPrincipal[i] = new ListaEncadeadaLista();
			vetorPrincipal[i].add(new ListaEncadeada());
			vetorPrincipal[i].getPrimeiraLista().add(item);
		} else {
			ListaEncadeada listaAux = vetorPrincipal[i].getPrimeiraLista();
			No noAux = null;
			boolean noNaoEncontrado = true;
			while (listaAux != null && noNaoEncontrado) {
				noAux = listaAux.getPrimeiro();
				while (noAux != null && noNaoEncontrado) {
					if (noAux.getItem().getPalavra().equalsIgnoreCase(item.getPalavra())) {
						listaAux.add(item);
						noNaoEncontrado = false;
					} else {
						noAux = noAux.getProximo();
					}

				}

			}
			if(noNaoEncontrado){
				ListaEncadeada listaNova = new ListaEncadeada();
				listaNova.add(item);	
				vetorPrincipal[i].add(listaNova);
				vetorPrincipal[i].setUltimaLista(listaNova);
			}
		}

	}

	public int getNumeroMod() {
		return numeroMod;
	}

	public void setNumeroMod(int numeroMod) {
		this.numeroMod = numeroMod;
	}

	public static void main(String[] args) {
		HashListaEncadeada h = new HashListaEncadeada(20, 6);
		h.add(new Item(1,"a"));
		h.add(new Item(2,"a"));
		h.add(new Item(3,"b"));
		h.add(new Item(4,"c"));
		h.add(new Item(5,"a"));
		h.add(new Item(2,"c"));
		h.add(new Item(3,"d"));
		
		System.out.println(h.calculaPosicao(8));
	}
	
	
	
}
