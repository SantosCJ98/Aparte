package paquete;

import java.util.Arrays;

public class Clase {

	public static int [] filtrar(int[] miarray, Filtro condicion) {
		
		int [] res = new int [miarray.length];
		
		int contador = 0;

		for (int i = 0; i < miarray.length; i++) {

			if (condicion.par(i)) {

				res[contador] = miarray[i];
				
				contador++;

			}

		}
		
		return Arrays.copyOf(res, contador);

	}

	
	public static void main (String args[]) {
		
		int [] miarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		//Clase interna anónima
//		filtrar(miarray, new Filtro() {
//
//			public boolean par(int indice) {
//				
//				return miarray[indice]%2 == 0;
//				
//			}
//			
//		});

		System.out.println(Arrays.toString(filtrar(miarray, indice -> miarray[indice]%2 == 0)));
		
		
	}
	
	
	
}
