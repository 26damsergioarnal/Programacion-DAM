package ejercicios00;

import java.util.Scanner;

public class Ejercicios05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame dos caracteres separados por un espacio: ");
		char carac1 = entrada.next().charAt(0);
		char carac2 = entrada.next().charAt(0);

		if (String.valueOf(carac1).equals(String.valueOf(carac1).toLowerCase())
				&& String.valueOf(carac2).equals(String.valueOf(carac2).toLowerCase())) {
			System.out.println("Estan en minusculas ambas");
		} else {
			System.out.println("No estan en minuscuas ambas");
		}
		entrada.close();

	}

}
