package estrutura;

import modelo.Item;
import modelo.No;

public class HashListaEncadeada {
	
	private ListaEncadeada vetorPrincipal[];
	private ListaEncadeada lista;
	int numeroMod;

	public HashListaEncadeada(int tamanhoVetor, int numeroMod){
		vetorPrincipal = new ListaEncadeada[tamanhoVetor];
		this.numeroMod = numeroMod;
	}
	
	private int calculaPosicao(int valor){
		return valor % numeroMod;
	}
	
	public void add(Item item){
		
		int i = calculaPosicao(item.getPalavra().hashCode());
		if(vetorPrincipal[i] == null){
			vetorPrincipal[i] = new ListaEncadeada();
			vetorPrincipal[i].add(item);
		}else{
			No noAux = vetorPrincipal[i].getPrimeiro();
			int quantNos = vetorPrincipal[i].getQuantidadeNos();
			for(int j = 0; j < quantNos; j++){
				if(noAux != null){
					if(noAux.getItem().getPalavra().equalsIgnoreCase(item.getPalavra())){
						vetorPrincipal[i].add(item);
					}else{
						noAux = noAux.getProximo();						
					}
					
				}
			}
			
			
			
		}
		
	}

	public ListaEncadeada[] getVetorPrincipal() {
		return vetorPrincipal;
	}

	public void setVetorPrincipal(ListaEncadeada[] vetorPrincipal) {
		this.vetorPrincipal = vetorPrincipal;
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
		h.add(new Item(3,"a"));
		h.add(new Item(4,"a"));
		h.add(new Item(5,"a"));
		h.add(new Item(2,"a"));
		h.add(new Item(3,"a"));
		
		System.out.println(h.calculaPosicao(8));
	}
	
	
	
}
