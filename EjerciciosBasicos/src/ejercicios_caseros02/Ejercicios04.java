package ejercicios_caseros02;

import java.util.Scanner;

public class Ejercicios04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un numero: ");
		int numero = Integer.valueOf(entrada.nextLine());
		boolean cinco = numero % 5 == 0;
		
		System.out.println(cinco ? "Es divisible de 5" : "No es divisible de 5");

	}

}
