package ordenador;

import modelo.Item;

public class HeapSort{
	
	public static Item[] ordena(Item[] array) {
		int dir = array.length -1;
		int esq = (dir-1)/2;
		Item temp;
		
		while(esq >= 0){
			refazHeap(esq, array.length - 1, array);
			esq--;
		}
		
		while (dir > 0){
			temp = array[0];
			array[0] = array[dir];
			array[dir] = temp;
			dir--;
			refazHeap(0, dir, array);
		}
		
		return array;
	}

	private static void refazHeap(int esq, int dir, Item[] array) {
		int i = esq;
		int mF = 2*i+1;
		Item raiz = array[i];
		boolean heap = false;
		
		while((mF <= dir) && (!heap)){
			if(mF < dir)
				if(array[mF].getPalavra().compareToIgnoreCase(array[mF+1].getPalavra()) < 0 )
					mF++;
			if(raiz.getPalavra().compareToIgnoreCase(array[mF].getPalavra()) < 0 ){
				array[i] = array[mF];
				i = mF;
				mF = 2 * i + 1;
			}else
				heap = true;
		}
		
		array[i] = raiz;
	}

}
