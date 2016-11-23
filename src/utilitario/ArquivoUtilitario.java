package utilitario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import estrutura.ListaEncadeada;
import modelo.Item;
import modelo.No;

public abstract class ArquivoUtilitario {
	
	
	/**
	 * Recebe o caminho do arqivo como parametro e 
	 * retorna um vetor de itens
	 * */
	public static Item[] arquivoToVetorItem(String caminho){

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
					listaEncadeada.add(new Item(numLinha, dado[i]));
				}
				
				numLinha++;
				linha = bf.readLine();
			}
		
		fr.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		No atual = listaEncadeada.getPrimeiro();
//		Item[] itens = new Item[listaEncadeada.getQuantidadeNos()];
//		
//		int ini = 0;
//		while(atual != null){
//		  itens[ini] = atual.getItem();
//		  atual = atual.getProximo();
//		  ini++;
//		}
		return listaEncadeada.toArray();
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
				listaEncadeada.add(new Item(cont, palavraTemp.toString()));
				cont++;
				palavraTemp = new StringBuilder();
				eEspaco = false;
			}
			
		}
		
		No atual = listaEncadeada.getPrimeiro();
		palavraTemp = new StringBuilder();
		
		while(atual != null){
			palavraTemp.append(atual.getItem().getPalavra());
			palavraTemp.append(separador);
			atual = atual.getProximo();
		}
		return palavraTemp.toString();
	}
	
	public static void vetorItemToArquivo(String caminho, Item[] vetorItem){
		try {
			File f = new File(caminho);
			f.mkdir();
			FileWriter fw = new FileWriter(f);
			for(int i = 0; i < vetorItem.length; i++){
				fw.write(vetorItem[i].getPalavra() + " ");
			}
			fw.flush();
		    fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
