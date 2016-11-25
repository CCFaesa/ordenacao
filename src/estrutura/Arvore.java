package estrutura;

import java.io.Serializable;

import modelo.Item;
import modelo.No;
import modelo.NoArvore;

public abstract class Arvore implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected NoArvore raiz;

	public abstract void insere(Item item);

	public String pesquisa(String palavra){
		
		int comparacao;
		NoArvore noArvore = raiz;
		while(noArvore != null){
			comparacao = -noArvore.getPrimeiroNo().getItem().comparaPalavra(palavra);
			
			if(comparacao == 0){
				No no = noArvore.getPrimeiroNo();

				StringBuilder stb = new StringBuilder();
				while(no != null){
					stb.append(no.getItem().getParagrafo()).append(" ");
					no = no.getProximo();
				}

				return stb.toString();
			}else if(comparacao < 0){
				noArvore = noArvore.getNoEsquerda();
			}else{
				noArvore = noArvore.getNoDireita();
			}
		}

		return "Nao encontrou";
	}
}
