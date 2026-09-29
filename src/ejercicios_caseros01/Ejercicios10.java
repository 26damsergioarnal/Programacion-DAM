package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("=========Distancia en el diccionario=========");
		System.out.print("Dame tu nombre y el de tu amigo separados por un espacio: ");
		String nombre1 = entrada.next();
		String nombre2 = entrada.next();
		
		System.out.println("Distancia en el diccionario matematicamente: " + 
		nombre1.compareTo(nombre2));
		
		entrada.close();
		
	}

}
