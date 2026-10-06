package ejercicios00;

import java.util.Scanner;

public class Ejercicios03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un caracter: ");
		char caracter = entrada.nextLine().charAt(0);
		String caracter2 = String.valueOf(caracter);

		if (caracter2.equals(caracter2.toUpperCase())) {
			System.out.println("Es una mayuscula");
		} else {
			System.out.println("Es una minuscula");
		}
		entrada.close();
	}

}
