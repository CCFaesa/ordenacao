package ordenador;

import modelo.Item;
import modelo.NoAVL;

public class AVL {
	private NoAVL raiz;
	private boolean h;

	public AVL(){
		h = true;
	}

	public void insereRaiz (Item item){
		this.raiz = this.insere(item, this.raiz);
	}

	private NoAVL insere (Item item, NoAVL no){

		if (no == null){
			NoAVL novo = new NoAVL(item);
			this.h = true;
			return novo;
		}else{
			int comparacao = item.getPalavra().compareToIgnoreCase(no.getPrimeiroNo().getItem().getPalavra());

			if (comparacao < 0){
				no.setNoEsquerda(this.insere(item, no.getNoEsquerda()));
				no = this.balancearDir(no);
			}else if (comparacao > 0){
				no.setNoDireita(this.insere (item, no.getNoDireita()));
				no = this.balancearEsq(no);
			}else{
				no.add(item);
			}

			return no;
		}
	}

	private NoAVL balancearEsq(NoAVL no) {
		if(this.h){
			switch (no.getFatorBalanceamento()) {
			case 1: 
				no.setFatorBalanceamento(0);
				this.h = false;
				break;
			case 0 : 
				no.setFatorBalanceamento(-1);
				break;
			case -1: 
				no = this.rotacaoDireita(no);
				break;
			}
		}

		return no;
	}

	private NoAVL balancearDir(NoAVL no) {
		if(this.h){
			switch (no.getFatorBalanceamento()) {
			case -1: 
				no.setFatorBalanceamento(0);
				this.h = false;
				break;
			case 0 : 
				no.setFatorBalanceamento(-1);
				break;
			case 1: 
				no = this.rotacaoEsquerda(no);
				break;
			}
		}

		return no;
	}

	private NoAVL rotacaoDireita(NoAVL no){
		NoAVL temp1, temp2;
		temp1 = no.getNoEsquerda();

		if (temp1.getFatorBalanceamento() == -1){
			no.setNoEsquerda(temp1.getNoDireita());
			temp1.setNoDireita(no);
			no.setFatorBalanceamento(0);
			no = temp1;
		} else {
			temp2 = temp1.getNoDireita();
			temp1.setNoDireita(temp2.getNoEsquerda());
			temp2.setNoEsquerda(temp1);
			no.setNoEsquerda(temp2.getNoDireita());
			temp2.setNoDireita(no);

			if (temp2.getFatorBalanceamento() == -1)
				no.setFatorBalanceamento(1);
			else
				no.setFatorBalanceamento(0);

			if (temp2.getFatorBalanceamento() == 1) 
				temp1.setFatorBalanceamento(-1);
			else 
				temp1.setFatorBalanceamento(0);

			no = temp2;
		}

		no.setFatorBalanceamento(0);
		this.h = false;
		return no;
	}

	private NoAVL rotacaoEsquerda(NoAVL no){
		NoAVL temp1, temp2;
		temp1 = no.getNoDireita();

		if (temp1.getFatorBalanceamento() == 1){
			no.setNoDireita(temp1.getNoEsquerda());
			temp1.setNoEsquerda(no);
			no.setFatorBalanceamento(0);
			no = temp1;
		}else{
			temp2 = temp1.getNoEsquerda();
			temp1.setNoEsquerda(temp2.getNoDireita());
			temp2.setNoDireita(temp1);
			no.setNoDireita(temp2.getNoEsquerda());
			temp2.setNoEsquerda(no);

			if (temp2.getFatorBalanceamento() == 1)
				no.setFatorBalanceamento(-1);
			else
				no. setFatorBalanceamento(0);

			if (temp2. getFatorBalanceamento() == -1)
				temp1. setFatorBalanceamento(1);
			else
				temp1. setFatorBalanceamento(0);

			no = temp2;
		}
		
		no.setFatorBalanceamento(0);
		this.h= false;
		return no;
	}

}