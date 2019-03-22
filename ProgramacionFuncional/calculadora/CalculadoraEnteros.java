package calculadora;

import static teclado.Teclado.*;

public class CalculadoraEnteros {

	static int operar(int a, int b, Operacion operacion) {

		return operacion.operacion(a, b);

	}

	public static void main(String args[]) {

		System.out.println("Introduce el primer número:");

		int num1 = readInt();

		System.out.println("Introduce el segundo número:");

		int num2 = readInt();
		
		System.out.println("Selecciona una operación:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Módulo");

		int opcion = readRange(1, 5, Rangos.AMBOSIN);
		
		switch (opcion) {
		
		case 1: 
			
//			operar(num1, num2, new Operacion() {
//
//				public int operacion(int a, int b) {
//
//					return a + b;
//
//				}
//
//			});
			
			System.out.println(operar(num1, num2, (a, b) -> a + b));
			
			break;
			
		case 2:
			
//			operar(num1, num2, new Operacion() {
//
//				public int operacion(int a, int b) {
//
//					return a - b;
//
//				}
//
//			});
			
			System.out.println(operar(num1, num2, (a, b) -> a - b));
			
			break;
			
		case 3: 
			
//			operar(num1, num2, new Operacion() {
//
//				public int operacion(int a, int b) {
//
//					return a * b;
//
//				}
//
//			});
			
			System.out.println(operar(num1, num2, (a, b) -> a * b));
			
			break;
			
		case 4: 
			
//			operar(num1, num2, new Operacion() {
//
//				public int operacion(int a, int b) {
//
//					return a / b;
//
//				}
//
//			});
			
			System.out.println(operar(num1, num2, (a, b) -> a / b));
			
			break;
			
		case 5: 
			
//			operar(num1, num2, new Operacion() {
//
//				public int operacion(int a, int b) {
//
//					return a % b;
//
//				}
//
//			});
			
			System.out.println(operar(num1, num2, (a, b) -> a % b));
			
			break;
		
		}
		
		

		
	}

}
