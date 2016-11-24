package modelo;

import java.io.Serializable;

public class No implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Item item;
	private No proximo;

	public No(Item item) {
		this.item = item;
	}

	public No getProximo() {
		return this.proximo;
	}

	public void setProximo(No novo) {
		this.proximo = novo;
	}

	public Item getItem() {
		return item;
	}
}
