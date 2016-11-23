package ordenador;

import modelo.Item;

public abstract class Sort {
	protected Item[] array;
	
	public void setVetor(Item[] vetor){
		this.array = vetor;
	}
	
	public Item[] getVetor(){
		return this.array;
	}
	
	public abstract Item[] ordena();
}
