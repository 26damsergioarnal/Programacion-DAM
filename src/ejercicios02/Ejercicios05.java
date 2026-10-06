package ejercicios02;

import java.util.Scanner;

public class Ejercicios05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame una cadena: ");
		String cadena1 = entrada.nextLine();
		System.out.print("Dame otra cadena: ");
		String cadena2 = entrada.nextLine();
		boolean iguales = cadena1.equals(cadena2) == true;
		System.out.println("================");
		System.out.println("¿Son iguales? \n" + (iguales ? "Son iguales" : "No son iguales"));

		entrada.close();
	}

}
