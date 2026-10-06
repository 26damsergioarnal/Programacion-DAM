package ejercicios00;

import java.util.Scanner;

public class Ejercicios06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un caracter: ");
		char carac = entrada.nextLine().charAt(0);
		if (Integer.valueOf(carac) < 48 || Integer.valueOf(carac) > 57) {
			System.out.println("No es una cifra");
		} else {
			System.out.println("Es la cifra: " + Integer.valueOf(carac));
		}
		entrada.close();

	}

}
