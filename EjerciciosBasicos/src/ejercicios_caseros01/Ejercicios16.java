package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("========PRIMERO Y ULTIMO========");
		System.out.print("Dame una palabra larga: ");
		String palabra = entrada.next();
		entrada.nextLine();
		System.out.println("Primera y ultima letra: " + palabra.charAt(0) + " " + palabra.charAt(palabra.length() - 1));
		entrada.close();
	}

}
