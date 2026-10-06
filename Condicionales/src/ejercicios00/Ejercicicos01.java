package ejercicios00;

import java.util.Scanner;

public class Ejercicicos01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un numero: ");
		int num = entrada.nextInt();

		if ((num % 2) == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		entrada.close();

	}

}
