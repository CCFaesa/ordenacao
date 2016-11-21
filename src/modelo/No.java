package modelo;

public class No {
	private Item item;
	private No proximoNo;
	
	public No(Item item) {
		this.item = item;
	}

	public No getProx() {
		return this.proximoNo;
	}

	public void setProx(No novo) {
		this.proximoNo = novo;
	}

	public Item getInfo() {
		return item;
	}

	public void setInfo(Item item) {
		this.item = item;
	}
}
