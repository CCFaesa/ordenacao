package ordenador;

import modelo.Item;
import modelo.NoArvore;

public abstract class Arvore {
	protected NoArvore raiz;
	
	public abstract void insere(Item item);
	
	public String pesquisa(){
		return "";
	}
}
