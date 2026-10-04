package ejercicios_caseros02;

import java.util.Scanner;

public class Ejercicios03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame una palabra: ");
		String palabra = entrada.nextLine();
		
		System.out.println(palabra.length() >= 8 ? "Palabra larga" : "Palabra corta");
		entrada.close();
	}

}
