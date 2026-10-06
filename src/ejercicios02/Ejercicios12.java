package ejercicios02;

import java.util.Scanner;

public class Ejercicios12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame una cadena: ");
		String cadena = entrada.nextLine();
		System.out.println();
		System.out.print("Dame un caracter: ");
		char caracter = entrada.nextLine().charAt(0);
		
		System.out.println(cadena.startsWith(String.valueOf(caracter)) ? "Si empieza por " + caracter :
			"No empieza por " + caracter);
		
		entrada.close();
	}

}
