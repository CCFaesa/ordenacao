package utilitario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import estrutura.ListaEncadeada;
import modelo.Item;
import modelo.No;

public abstract class ArquivoUtilitario {
	
	
	/**
	 * Recebe o caminho do arqivo como parametro e 
	 * retorna um vetor de itens
	 * */
	private static Item[] arquivoToVetorItem(String caminho){

		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		try {
			FileReader fr = new FileReader(new File(caminho));
			BufferedReader bf = new BufferedReader(fr);
			String linha = bf.readLine();
			int numLinha = 0;
			String separador = "#";
			
			while(linha != null){

				String[] dado = verificaTexto(linha, separador).split(separador);
				
				for (int i = 0; i < dado.length; i++) {
					listaEncadeada.add(new No(new Item(numLinha, dado[i] + (i==dado.length-1?"\n\n":""))));
				}
				
				numLinha++;
				linha = bf.readLine();
			}
		
		fr.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Item atual = listaEncadeada.getPrimeiro().getItem();
		Item[] itens = new Item[listaEncadeada.getQuantidadeNos()];
		
		int ini = 0;
		while(atual != null){
		  itens[ini] = atual;
		  atual = atual.getProximo();
		  ini++;
		}
		return itens;
	}
	
	
	/**
	 * Trata a linha retirando os caracteres especiais e substituindo pelo que foi
	 * passado por parametro
	 * 
	 * */
	public static String verificaTexto(String linha, String separador){
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		String[] temp = linha.replace(","," ").replace("."," ").split("|");
		StringBuilder palavraTemp = new StringBuilder();
		boolean eEspaco = false;
		int cont = 0;
		
		for (int p = 0; p < temp.length; p++) {
	
			if(temp[p].equals(" ")){
				eEspaco = true;
				
			}else{
				palavraTemp.append(temp[p]);
				eEspaco = false;
			}

			if(!palavraTemp.toString().equals("") && (eEspaco || (temp.length-1 == p))){
				listaEncadeada.add(new No(new Item(cont, palavraTemp.toString())));
				cont++;
				palavraTemp = new StringBuilder();
				eEspaco = false;
			}
			
		}
		
		Item atual = listaEncadeada.getPrimeiro().getItem();
		palavraTemp = new StringBuilder();
		
		while(atual != null){
			palavraTemp.append(atual.getPalavra());
			palavraTemp.append(separador);
			atual = atual.getProximo();
		}
		return palavraTemp.toString();
	}

}
