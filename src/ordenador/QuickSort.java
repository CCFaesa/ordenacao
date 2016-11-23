package ordenador;

import modelo.Item;

public class QuickSort extends Sort{
	
	@Override
	public Item[] ordena() {
		return ordena(array, 0, array.length - 1);
	}

	public Item[] ordena(Item[] array, int esq, int dir){
		Item pivo; 
		int i = esq, j = dir;
		Item temp;

		pivo = array[(i+j)/2];

		do {
			while (array[i].comparator(pivo) < 0) i++;
			while (array[j].comparator(pivo) > 0) j--;

			if (i <= j) {
				temp = array[i];

				array[i] = array[j];
				array[j] = temp;i++;
				j--;
			}
		}while (i <= j);

		if (esq < j) ordena (array, esq, j);
		if (dir > i) ordena (array, i, dir);
		
		return array;
	}

}
