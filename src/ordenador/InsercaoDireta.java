package ordenador;

import modelo.Item;

public class InsercaoDireta{

	public static void ordena(Item[] vetor) {
		ordenaPedaco(vetor, 0, vetor.length-1);
	}
	
	public static Item[] ordenaPedaco(Item[] array, int esq, int dir){
		int i, j;
		Item temp;

		for (i=esq+1; i <= dir; i++){
			temp = array[i];
			j = i-1;
			
			while ((j >= 0) && (array[j].comparator(temp) > 0)){
				array[j+1] = array[j];
				j--;
			}

			array[j+1] = temp;
		}
		
		return array;
	}

}
