package ejercicios02;

import java.util.Scanner;

public class Ejercicios02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame una frase: ");
		String cadena = entrada.nextLine();
		
		System.out.println("la frase sin espacios es: " + cadena.replaceAll(" ", ""));
		
		entrada.close();
		
	}

}
