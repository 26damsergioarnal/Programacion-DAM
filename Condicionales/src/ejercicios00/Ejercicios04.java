package ejercicios00;

import java.util.Scanner;

public class Ejercicios04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame dos caracteres separados por un espacio: ");
		char carac1 = entrada.next().charAt(0);
		char carac2 = entrada.next().charAt(0);
		String carac1S = String.valueOf(carac1);
		String carac2S = String.valueOf(carac2);

		if (carac1S.equals(carac2S)) {
			System.out.println("Los caracteres son iguales");
		} else {
			System.out.println("Los caracteres son distintos");
		}
		entrada.close();
	}

}
