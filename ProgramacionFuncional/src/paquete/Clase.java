package paquete;

public class Clase {

	public static int [] filtrar(int[] miarray, Filtro condicion) {

		for (int i = 0; i < miarray.length; i++) {

			if (condicion.par(i)) {

				System.out.println(miarray[i]);

			}

		}
		
		return miarray;

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

		filtrar(miarray, indice -> miarray[indice]%2 == 0);
		
		
	}
	
	
	
}
