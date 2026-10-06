package ejercicios02;

import java.util.Scanner;

public class Ejercicios03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("dame el dia que naciste (ej: 12): ");
		int dia = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Dame tu mes (ej: Enero): ");
		String mes = entrada.next();
		entrada.nextLine();
		System.out.print("Dame tu año (ej: 2000): ");
		int ano = entrada.nextInt();
		entrada.nextLine();
		
		boolean cero = dia < 10 && dia > 0 ;
		
		
		
		System.out.println();
		System.out.println("Tu fecha de nacimiento es: " + (cero ? "0" + dia : dia)
				+ "/" + mes + "/" + ano);
		entrada.close();
	}

}
