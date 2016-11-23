package ordenador;

import modelo.Item;

public class ShellSort{
	
	public static Item[] ordena(Item[] array) {
		int i, j, h;
		Item temp;
		h = 1;
		
		do{
			h = 3 * h + 1;
		}while (h < array.length);
		
		do{
			h = h / 3;
			for (i = h; i < array.length; i++) {
				temp = array[i];
				j = i;
				
				while (array[j - h].comparator(temp) > 0) {
					array[j] = array[j - h];
					j -= h;
					if (j < h) break;
				}
				
				array[j] = temp;
			}
		}while (h != 1);
		
		return array;
	}

}
