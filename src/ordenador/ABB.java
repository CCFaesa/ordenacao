package ordenador;

import modelo.Item;
import modelo.NoArvore;

public class ABB {
	private NoArvore raiz;
	
	public void insere(Item item){
		this.raiz = insere(item, this.raiz);
	}
	
	public NoArvore insere(Item item, NoArvore no){
		if(no == null){
			NoArvore novo = new NoArvore(item);
			return novo;
		}else{
			int comparacao = item.getPalavra().compareToIgnoreCase(no.getPrimeiroNo().getItem().getPalavra());
			
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
	
	
}
