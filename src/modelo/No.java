package modelo;

public class No {
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
