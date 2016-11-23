package utilitario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import estrutura.ListaEncadeada;
import modelo.Item;
import modelo.No;
import ordenador.QuickSort;
import ordenador.ShellSort;
import ordenador.Sort;

public abstract class ArquivoUtilitario {
	public static final String ARQUIVO_RESULTADOS = "resultados.txt";
	
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
			int numLinha = 1;
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
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			for(int i = 0; i < vetorItem.length; i++){
				fw.write(vetorItem[i].toString() + " ");
			}
			fw.flush();
		    fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void limpaResultados(){
		PrintWriter writer;
		try {
			writer = new PrintWriter(ARQUIVO_RESULTADOS);
			writer.print("");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void salvaResultado(String resultado){
		try {
			FileWriter fw = new FileWriter(ARQUIVO_RESULTADOS, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.append(resultado + "\n");
			
			pw.close();
	        fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Faz uma busca binaria no vetor
	 * */
	public static Item[] buscaBinariaNoVetor(Item[] vetor, Item chave) {
		int inicioVetor = 0;
		int finalVetor = vetor.length - 1;
		ListaEncadeada lista = new ListaEncadeada();
		Sort sort = new QuickSort();
		
		while (inicioVetor <= finalVetor) {
			int meio = (inicioVetor + finalVetor) >>> 1;
			Item midVal = vetor[meio];

			if (midVal.getPalavra().compareToIgnoreCase(chave.getPalavra()) < 0)
				inicioVetor = meio + 1;
			else if (midVal.getPalavra().compareToIgnoreCase(chave.getPalavra()) > 0)
				finalVetor = meio - 1;
			else{				
				int auxIndice = meio;
				lista.add(new Item(midVal.getParagrafo(), chave.getPalavra()));
				
				while(vetor[auxIndice-1].getPalavra().compareToIgnoreCase(vetor[auxIndice].getPalavra()) == 0){
					lista.add(new Item(vetor[auxIndice-1].getParagrafo(), vetor[auxIndice-1].getPalavra()));
					
					auxIndice--;	
				}
				auxIndice = meio;
				while(vetor[auxIndice+1].getPalavra().compareToIgnoreCase(vetor[auxIndice].getPalavra()) == 0){
					lista.add(new Item(vetor[auxIndice+1].getParagrafo(), vetor[auxIndice+1].getPalavra()));
					auxIndice++;	
				}
				sort.setVetor(lista.toArray());
					return sort.ordena();
				}
				
		}
		return lista.toArray();
	}
	
	public static String pesquisaBinariaNoArquivo(String arquivoIndice, String arquivoPesquisar){
		Item[] vetChaves = ArquivoUtilitario.arquivoToVetorItem(arquivoIndice);
		Sort ordenador = new ShellSort();
		ordenador.setVetor(ArquivoUtilitario.arquivoToVetorItem(arquivoPesquisar));
		Item[] vet = ordenador.ordena();
		Item[] aux= null;
		StringBuilder sb;
		StringBuilder sbResultado = new StringBuilder();
		ArquivoUtilitario.salvaResultado("Pesquisa: ");
		
		for(int i = 0; i < vetChaves.length; i++){
			aux = ArquivoUtilitario.buscaBinariaNoVetor(vet, vetChaves[i]);
			sb = new StringBuilder();
			for(int j = 0; j<aux.length;j++)
				sb.append((j>0?",":"")+aux[j].getParagrafo());
			
			sbResultado.append(vetChaves[i].getPalavra() + " - " + (sb.length()>0?sb:"Palavra nao encontrada") + "\n");
		}
		return sbResultado.toString();
	}
}
