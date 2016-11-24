package estrutura;

import modelo.Item;
import modelo.No;
import utilitario.ArquivoUtilitario;

public class HashListaEncadeada {
	
	private ListaEncadeadaLista vetorPrincipal[];
	int numeroMod;
//	int adicionado = 0;
	
	public HashListaEncadeada(int tamanhoVetor, int numeroMod){
		vetorPrincipal = new ListaEncadeadaLista[tamanhoVetor];
		this.numeroMod = numeroMod;
	}
	
	private int calculaPosicao(int valor){
		return valor % numeroMod;
	}
	
	public void add(Item item) {
		int i = calculaPosicao(item.getPalavra().hashCode());
		i = (i<0)?(i*(-1)):i;
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
//						adicionado++;
//						System.out.println(adicionado);
					} else {
						noAux = noAux.getProximo();
					}
					if(listaAux != null)
						listaAux = listaAux.getProximaLista();
				}
				

			}
			if(noNaoEncontrado){
				ListaEncadeada listaNova = new ListaEncadeada();
				listaNova.add(item);	
				vetorPrincipal[i].add(listaNova);
				vetorPrincipal[i].setUltimaLista(listaNova);
//				adicionado++;
//				System.out.println(adicionado);
			}
		}

	}
	
	public Item[] buscar(Item item) {
		int i = calculaPosicao(item.getPalavra().hashCode());
		i = (i < 0) ? (i * (-1)) : i;
		if (vetorPrincipal[i] == null) {
			return null;
		} else {
			ListaEncadeada listaAux = vetorPrincipal[i].getPrimeiraLista();
			No noAux = null;
			boolean noNaoEncontrado = true;

			while (listaAux != null && noNaoEncontrado) {
				noAux = listaAux.getPrimeiro();
					if (noAux.getItem().getPalavra().equalsIgnoreCase(item.getPalavra()))
						return listaAux.toArray();
					
					if (listaAux != null)
						listaAux = listaAux.getProximaLista();
			}
			if (noNaoEncontrado)
				return null;
		}
		return null;
	}
	
	public String toString() {
		if (vetorPrincipal == null) {
			return "";
		} else {
			StringBuilder sb = new StringBuilder();
			ListaEncadeada listaAux = null;
			No noAux = null;
			for (int i = 0; i < vetorPrincipal.length; i++) {
				if (vetorPrincipal[i] != null) {
					listaAux = vetorPrincipal[i].getPrimeiraLista();
					if (listaAux != null)
						while (listaAux != null) {
							noAux = listaAux.getPrimeiro();
							if (noAux != null) {
								sb.append(noAux.getItem().getPalavra() + ": " + noAux.getItem().getParagrafo());
								noAux = noAux.getProximo();
								while (noAux != null) {
									sb.append(", " + noAux.getItem().getParagrafo());
									noAux = noAux.getProximo();
								}
							}

							if (listaAux != null) {
								sb.append("\n");
								listaAux = listaAux.getProximaLista();
							}
						}
				}
			}
			return sb.toString();
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
//		h.add(new Item(1,"a"));
//		h.add(new Item(2,"a"));
//		h.add(new Item(3,"b"));
//		h.add(new Item(4,"c"));
//		h.add(new Item(5,"a"));
//		h.add(new Item(2,"c"));
//		h.add(new Item(3,"d"));
//		
//		System.out.println(h.calculaPosicao(8));
		
		for (Item item : ArquivoUtilitario.arquivoToVetorItem("Texto1.txt")) {
			h.add(item);
		}
		
//		// Teste para fazer pesquisa no Hash
//		Item vetItem[] = h.buscar(new Item(3,"Engenheiros"));
//		if(vetItem != null){
//			System.out.print(vetItem[0].getPalavra()+": ");
//			for(int k = 0; k < vetItem.length; k++)
//				System.out.print((k==0?"":", ")+vetItem[k].getParagrafo());
//		}
		
		
		//Teste para imprimir o Hash, criado um toString
		System.out.println(h.toString());
	}
	
	
	
}
