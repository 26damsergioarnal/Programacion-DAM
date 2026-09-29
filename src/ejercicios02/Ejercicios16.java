package ejercicios02;

import java.util.Scanner;

public class Ejercicios16 {
	


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime una cadena: ");
		String cadena = entrada.nextLine();
		
		System.out.println("La mitad de la cadena: " + cadena.substring(cadena.length() / 2, cadena.length()));
		
		entrada.close();
	}
}