package ejercicios02;

import java.util.Scanner;

public class Ejercicios14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime una cadena: ");
		String cadena = entrada.nextLine();
		System.out.print("Cuantos caracteres queire mostrar: ");
		int numero = entrada.nextInt();
		
		System.out.println(cadena.substring(0, numero));
		
		entrada.close();
	}

}
