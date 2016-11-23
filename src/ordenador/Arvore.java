package ordenador;

import modelo.Item;
import modelo.No;
import modelo.NoArvore;

public abstract class Arvore {
	protected NoArvore raiz;

	public abstract void insere(Item item);

	public String pesquisa(String palavra){
		
		int comparacao;
		NoArvore noArvore = raiz;
		while(noArvore != null){
			comparacao = -noArvore.getPrimeiroNo().getItem().comparaPalavra(palavra);
			
			if(comparacao == 0){
				No no = noArvore.getPrimeiroNo();

				String retorno = "";
				while(no != null){
					retorno += no.getItem().getParagrafo() + " ";
					no = no.getProximo();
				}

				return retorno;
			}else if(comparacao < 0){
				noArvore = noArvore.getNoEsquerda();
			}else{
				noArvore = noArvore.getNoDireita();
			}
		}

		return "Nao encontrou";
	}
}
