package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = entrada.nextLine();
		System.out.println("=== GRITANDO ===");
		System.out.println("¡" + frase.toUpperCase() + "!");
		System.out.println();
		System.out.println("=== SUSURRANDO ===");
		System.out.println(frase.toLowerCase());
		
		entrada.close();

	}

}
