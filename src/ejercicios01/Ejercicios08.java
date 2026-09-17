package ejercicios01;

public class Ejercicios08 {

	public static void main(String[] args) {
		
		int varA = 12;
		boolean esPar = varA % 2 == 0;
		boolean multiplo2Y3 = varA % 6 == 0; // si el res de dividir por 6 es 0
		
		System.out.println("el numero " + varA + " es: " + (esPar ? "Par" : "Impar"));
		System.out.println("¿el numero " + varA + " es multiplo de 2 y de 3? " + 
		(multiplo2Y3 ? "Si" : "No se cumplen las condiciones"));

		//Funcuona porque 6 es el numero que da si multiplicamos 2 por 3 
	}

}
