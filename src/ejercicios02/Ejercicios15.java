package ejercicios02;

import java.util.Scanner;

public class Ejercicios15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame dos palabras separadas por un espacio: ");
		String palabra1 = entrada.next();
		String palabra2 = entrada.next();
		
		System.out.println(); 
		System.out.println("Del reves: " + palabra2 + " " + palabra1);
		
		entrada.close();

	}

}
