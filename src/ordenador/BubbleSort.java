package ordenador;

import modelo.Item;

public class BubbleSort extends Sort{
	
	@Override
	public Item[] ordena() {
		int LSup, i, j;
		Item temp;
		LSup = array.length - 1;
		
		do {
			j = 0;
			for (i = 0; i < LSup; i++)
				if(array[i].comparator(array[i + 1]) > 0){
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					j = i;
				}
			LSup = j;
		} while (LSup >= 1);
		
		return array;
	}

}
