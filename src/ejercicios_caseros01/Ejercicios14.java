package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("=========LOCALIZADOR DE COORDENADAS=========");
		System.out.print("Dame una palabra: ");
		String palabra = entrada.nextLine();
	
		System.out.print("Dame una letra: ");
		String letra = entrada.nextLine();
		
		System.out.printf("La palabra tiene esa letra en el caracter: %d", palabra.indexOf(letra) + 1);

		entrada.close();
	}

}
