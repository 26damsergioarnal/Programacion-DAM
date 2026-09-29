package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("========Detective de palabras========");
		System.out.print("Dime una frase: ");
		String frase = entrada.nextLine();
		System.out.println("¿Que busco?");
		String busca = entrada.nextLine();
		
		System.out.println();
		System.out.println(frase.contains(busca) ? "Si contiene eso" : "No contiene eso");
		
		entrada.close();

	}

}
