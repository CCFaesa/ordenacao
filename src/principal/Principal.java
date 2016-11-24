package principal;

import estrutura.HashListaEncadeada;
import modelo.Item;
import ordenador.ABB;
import ordenador.AVL;
import ordenador.Arvore;
import ordenador.HeapSort;
import ordenador.QuickSort;
import ordenador.QuickSortInsercaoDireta;
import ordenador.ShellSort;
import ordenador.Sort;
import utilitario.ArquivoUtilitario;

public class Principal {
	
	private static long inicio;
	
	public static void main(String[] args) {
		ArquivoUtilitario.limpaResultados();
		
		
		Sort ordenador;
		Arvore arvore;
		HashListaEncadeada hashListaEncadeada; 
		long tempo;
		
		ordenador = new ShellSort();
		// ShellSort com Texto1.txt
		tempo = ordena(ordenador, "Texto1.txt", "ShellSort.txt");
		ArquivoUtilitario.salvaResultado("Texto1.txt com shellsort: " + (tempo/5) + " milisegundos");
		
		
		// ShellSort com Texto2.txt
		tempo = ordena(ordenador, "Texto2.txt", "ShellSort.txt");
		ArquivoUtilitario.salvaResultado("Texto2.txt com shellsort: " + (tempo/5) + " milisegundos");
		
		
		// ShellSort com Texto3.txt
		tempo = ordena(ordenador, "Texto3.txt", "ShellSort.txt");
		ArquivoUtilitario.salvaResultado("Texto3.txt com shellsort: " + (tempo/5) + " milisegundos");
		
		
		// ShellSort com Texto4.txt
		tempo = ordena(ordenador, "Texto4.txt", "ShellSort.txt");
		ArquivoUtilitario.salvaResultado("Texto4.txt com shellsort: " + (tempo/5) + " milisegundos");
		
		
		// ShellSort com Texto5.txt
		tempo = ordena(ordenador, "Texto5.txt", "ShellSort.txt");
		ArquivoUtilitario.salvaResultado("Texto5.txt com shellsort: " + (tempo/5) + " milisegundos");
		
		
		ordenador = new QuickSort();
		// QuickSort com Texto1.txt
		tempo = ordena(ordenador, "Texto1.txt", "QuickSort.txt");
		ArquivoUtilitario.salvaResultado("Texto1.txt com QuickSort: " + (tempo/5) + " milisegundos");
		
		
		// QuickSort com Texto2.txt
		tempo = ordena(ordenador, "Texto2.txt", "QuickSort.txt");
		ArquivoUtilitario.salvaResultado("Texto2.txt com QuickSort: " + (tempo/5) + " milisegundos");
		
		
		// QuickSort com Texto3.txt
		tempo = ordena(ordenador, "Texto3.txt", "QuickSort.txt");
		ArquivoUtilitario.salvaResultado("Texto3.txt com QuickSort: " + (tempo/5) + " milisegundos");
		
		
		// QuickSort com Texto4.txt
		tempo = ordena(ordenador, "Texto4.txt", "QuickSort.txt");
		ArquivoUtilitario.salvaResultado("Texto4.txt com QuickSort: " + (tempo/5) + " milisegundos");
		
		
		// QuickSort com Texto5.txt
		tempo = ordena(ordenador, "Texto5.txt", "QuickSort.txt");
		ArquivoUtilitario.salvaResultado("Texto5.txt com QuickSort: " + (tempo/5) + " milisegundos");
		
		
		ordenador = new HeapSort();
		// HeapSort com Texto1.txt
		tempo = ordena(ordenador, "Texto1.txt", "HeapSort.txt");
		ArquivoUtilitario.salvaResultado("Texto1.txt com HeapSort: " + (tempo/5) + " milisegundos");
		
		
		// HeapSort com Texto2.txt
		tempo = ordena(ordenador, "Texto2.txt", "HeapSort.txt");
		ArquivoUtilitario.salvaResultado("Texto2.txt com HeapSort: " + (tempo/5) + " milisegundos");
		
		
		// HeapSort com Texto3.txt
		tempo = ordena(ordenador, "Texto3.txt", "HeapSort.txt");
		ArquivoUtilitario.salvaResultado("Texto3.txt com HeapSort: " + (tempo/5) + " milisegundos");
		
		
		// HeapSort com Texto4.txt
		tempo = ordena(ordenador, "Texto4.txt", "HeapSort.txt");
		ArquivoUtilitario.salvaResultado("Texto4.txt com HeapSort: " + (tempo/5) + " milisegundos");
		
		
		// HeapSort com Texto5.txt
		tempo = ordena(ordenador, "Texto5.txt", "HeapSort.txt");
		ArquivoUtilitario.salvaResultado("Texto5.txt com HeapSort: " + (tempo/5) + " milisegundos");
		
		
		ordenador = new QuickSortInsercaoDireta();
		// QuickSortInsercaoDireta com Texto1.txt
		tempo = ordena(ordenador, "Texto1.txt", "QuickSortInsercaoDireta.txt");
		ArquivoUtilitario.salvaResultado("Texto1.txt com QuickSortInsercaoDireta: " + (tempo/5) + " milisegundos");
		
		
		// QuickSortInsercaoDireta com Texto2.txt
		tempo = ordena(ordenador, "Texto2.txt", "QuickSortInsercaoDireta.txt");
		ArquivoUtilitario.salvaResultado("Texto2.txt com QuickSortInsercaoDireta: " + (tempo/5) + " milisegundos");
		
		
		// QuickSortInsercaoDireta com Texto3.txt
		tempo = ordena(ordenador, "Texto3.txt", "QuickSortInsercaoDireta.txt");
		ArquivoUtilitario.salvaResultado("Texto3.txt com QuickSortInsercaoDireta: " + (tempo/5) + " milisegundos");
		
		
		// QuickSortInsercaoDireta com Texto4.txt
		tempo = ordena(ordenador, "Texto4.txt", "QuickSortInsercaoDireta.txt");
		ArquivoUtilitario.salvaResultado("Texto4.txt com QuickSortInsercaoDireta: " + (tempo/5) + " milisegundos");
		
		
		// QuickSortInsercaoDireta com Texto5.txt
		tempo = ordena(ordenador, "Texto5.txt", "QuickSortInsercaoDireta.txt");
		ArquivoUtilitario.salvaResultado("Texto5.txt com QuickSortInsercaoDireta: " + (tempo/5) + " milisegundos");
		
		
		// ABB com Texto1.txt
		arvore = new ABB();
		tempo = insere(arvore, "Texto1.txt");
		ArquivoUtilitario.salvaResultado("Texto1.txt com ABB: " + (tempo/5) + " milisegundos");
		
		
		// ABB com Texto2.txt
		arvore = new ABB();
		tempo = insere(arvore, "Texto2.txt");
		ArquivoUtilitario.salvaResultado("Texto2.txt com ABB: " + (tempo/5) + " milisegundos");
		
		
		// ABB com Texto3.txt
		arvore = new ABB();
		tempo = insere(arvore, "Texto3.txt");
		ArquivoUtilitario.salvaResultado("Texto3.txt com ABB: " + (tempo/5) + " milisegundos");
		
		
		// ABB com Texto4.txt
		arvore = new ABB();
		tempo = insere(arvore, "Texto4.txt");
		ArquivoUtilitario.salvaResultado("Texto4.txt com ABB: " + (tempo/5) + " milisegundos");
		
		ArquivoUtilitario.serializaABB((ABB) arvore);
		
		
		// ABB com Texto5.txt
		arvore = new ABB();
		tempo = insere(arvore, "Texto5.txt");
		ArquivoUtilitario.salvaResultado("Texto5.txt com ABB: " + (tempo/5) + " milisegundos");
		
		
		// AVL com Texto1.txt
		arvore = new AVL();
		tempo = insere(arvore, "Texto1.txt");
		ArquivoUtilitario.salvaResultado("Texto1.txt com AVL: " + (tempo/5) + " milisegundos");
		
		
		// AVL com Texto2.txt
		arvore = new AVL();
		tempo = insere(arvore, "Texto2.txt");
		ArquivoUtilitario.salvaResultado("Texto2.txt com AVL: " + (tempo/5) + " milisegundos");
		
		
		// AVL com Texto3.txt
		arvore = new AVL();
		tempo = insere(arvore, "Texto3.txt");
		ArquivoUtilitario.salvaResultado("Texto3.txt com AVL: " + (tempo/5) + " milisegundos");
		
		
		// AVL com Texto4.txt
		arvore = new AVL();
		tempo = insere(arvore, "Texto4.txt");
		ArquivoUtilitario.salvaResultado("Texto4.txt com AVL: " + (tempo/5) + " milisegundos");
		
	
		// AVL com Texto5.txt
		arvore = new AVL();
		tempo = insere(arvore, "Texto5.txt");
		ArquivoUtilitario.salvaResultado("Texto5.txt com AVL: " + (tempo/5) + " milisegundos");
		
		
		// HASH com Texto1.txt
		hashListaEncadeada = new HashListaEncadeada(697, 697);
		tempo = insere(hashListaEncadeada, "Texto1.txt");
		ArquivoUtilitario.salvaResultado("Texto1.txt com HASH: " + (tempo/5) + " milisegundos");
		
		
//		// HASH com Texto2.txt
//		hashListaEncadeada = new HashListaEncadeada(1597, 1597);
//		tempo = insere(hashListaEncadeada, "Texto2.txt");
//		ArquivoUtilitario.salvaResultado("Texto2.txt com HASH: " + (tempo/5) + " milisegundos");
//		
//		
//		// HASH com Texto3.txt
//		hashListaEncadeada = new HashListaEncadeada(6431,6431);
//		tempo = insere(hashListaEncadeada, "Texto3.txt");
//		ArquivoUtilitario.salvaResultado("Texto3.txt com HASH: " + (tempo/5) + " milisegundos");
//		
//		
//		// HASH com Texto4.txt
//		hashListaEncadeada = new HashListaEncadeada(12881,12881);
//		tempo = insere(hashListaEncadeada, "Texto4.txt");
//		ArquivoUtilitario.salvaResultado("Texto4.txt com HASH: " + (tempo/5) + " milisegundos");
//		
//		
//		// HASH com Texto5.txt
//		hashListaEncadeada = new HashListaEncadeada(168129,168129);
//		tempo = insere(hashListaEncadeada, "Texto5.txt");
//		ArquivoUtilitario.salvaResultado("Texto5.txt com HASH: " + (tempo/5) + " milisegundos");
//		
		ArquivoUtilitario.serializaAVL((AVL) arvore);
		
		System.out.println("FIM PARTE 1");
		
		
		Item[] palavrasPesquisar = ArquivoUtilitario.arquivoToVetorItem("palavras.txt");
		StringBuilder stb;
		
		
		inicio = System.currentTimeMillis();
		arvore = ArquivoUtilitario.deserializaABB();
		
		for(int i = 0; i < 5; i++){
			stb = new StringBuilder();
			for (Item item : palavrasPesquisar) {
				stb.append(item.getPalavra())
					.append(" ")
					.append(arvore.pesquisa(item.getPalavra()))
					.append("\n");
			}
			ArquivoUtilitario.salvaArquivo(stb.toString(), "buscaABB.txt");
		}
		ArquivoUtilitario.salvaResultado("Pesquisa ABB: " + ((System.currentTimeMillis() - inicio)/5) + " milisegundos");
		
		
		inicio = System.currentTimeMillis();
		arvore = ArquivoUtilitario.deserializaAVL();
		for(int i = 0; i < 5; i++){
			stb = new StringBuilder();
			for (Item item : palavrasPesquisar) {
				stb.append(item.getPalavra())
					.append(" ")
					.append(arvore.pesquisa(item.getPalavra()))
					.append("\n");
			}
			ArquivoUtilitario.salvaArquivo(stb.toString(), "buscaAVL.txt");
		}
		ArquivoUtilitario.salvaResultado("Pesquisa AVL:" + ((System.currentTimeMillis() - inicio)/5) + " milisegundos");
		
		System.out.println("FIM PARTE 2");
		
		
//		ArquivoUtilitario.salvaResultado(ArquivoUtilitario.pesquisaBinariaNoArquivo("palavras.txt","Texto5.txt"));
	}

	
	
	
	public static long ordena(Sort ordenador, String arquivoLer, String arquivoSalvar){
		inicio = System.currentTimeMillis();
		for(int i = 0; i < 5; i++){
			ordenador.setVetor(ArquivoUtilitario.arquivoToVetorItem(arquivoLer));
			ordenador.ordena();
			ArquivoUtilitario.vetorItemToArquivo(arquivoSalvar, ordenador.getVetor());
		}
		return System.currentTimeMillis() - inicio;
	}
	
	public static long insere(Arvore arvore, String arquivoLer){
		inicio = System.currentTimeMillis();
		for(int i = 0; i < 5; i++){
			for (Item item : ArquivoUtilitario.arquivoToVetorItem(arquivoLer)) {
				arvore.insere(item);
			}
		}
		return System.currentTimeMillis() - inicio;
	}
	
	public static long insere(HashListaEncadeada hashListaEncadeada, String arquivoLer){
		inicio = System.currentTimeMillis();
		for(int i = 0; i < 5; i++){
			for (Item item : ArquivoUtilitario.arquivoToVetorItem(arquivoLer)) {
				hashListaEncadeada.add(item);
			}
		}
		return System.currentTimeMillis() - inicio;
	}
	
}
