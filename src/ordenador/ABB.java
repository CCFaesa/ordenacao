package ordenador;

import modelo.Item;
import modelo.NoABB;

public class ABB {
	private NoABB raiz;
	
	public void insere(Item item){
		this.raiz = insere(item, this.raiz);
	}
	
	public NoABB insere(Item item, NoABB no){
		if(no == null){
			NoABB novo = new NoABB(item);
			return novo;
		}else{
			int comparacao = item.comparator(no.getPrimeiroNo().getItem());
			
			if(comparacao < 0){
				no.setNoEsquerda(insere(item, no.getNoEsquerda()));
			}else if(comparacao > 0){
				no.setNoDireita(insere(item, no.getNoDireita()));
			}else{
				no.add(item);
			}
			
			return no;
		}	
	}
	
	public NoABB getRaiz(){
		return raiz;
	}
	
	
}
