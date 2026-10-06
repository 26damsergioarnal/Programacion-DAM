package ejercicios00;

import java.util.Scanner;

public class Ejercicios02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame un numero entero: ");
		int num = entrada.nextInt();
		
		if (num % 10 == 0) {
			System.out.println("Multiplo de 10");
		} else {
			System.out.println("No multiplo de 10");
		}
		entrada.close();
	}

}
