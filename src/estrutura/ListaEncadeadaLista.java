package estrutura;

import java.io.Serializable;

public class ListaEncadeadaLista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private ListaEncadeada primeiraLista;
	private ListaEncadeada ultimaLista;
	private int quantidadeListas = 0;
	
	public void add(ListaEncadeada lista){
		if(quantidadeListas == 0){
			primeiraLista = lista;
			ultimaLista = lista;
			quantidadeListas++;
		}else{
			ultimaLista.setProximaLista(lista);
			ultimaLista = lista;
			quantidadeListas++;
		}
	}	
	
	public ListaEncadeada getPrimeiraLista() {
		return primeiraLista;
	}

	public void setPrimeiraLista(ListaEncadeada primeiraLista) {
		this.primeiraLista = primeiraLista;
	}

	public ListaEncadeada getUltimaLista() {
		return ultimaLista;
	}

	public void setUltimaLista(ListaEncadeada ultimaLista) {
		this.ultimaLista = ultimaLista;
	}

	public int getQuantidadeListas() {
		return quantidadeListas;
	}

	public void setQuantidadeListas(int quantidadeListas) {
		this.quantidadeListas = quantidadeListas;
	}
	

}
