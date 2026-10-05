package ejercicios02;

import java.util.Scanner;

public class Ejercicios13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame una cadena: ");
		String cadena = entrada.nextLine();
		System.out.print("Dame otra cadena: ");
		String cadena2 = entrada.nextLine();
		
		System.out.println(cadena2.contains(cadena) ? "La segunda cadena contiene la primera" : 
			"La segunda cadena no contiene la primera");
		
		entrada.close();
		
		
	}

}
