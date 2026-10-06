package ejercicios02;

import java.util.Scanner;

public class Ejercicios08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime un numero de 5 cifras: ");
		int numero = entrada.nextInt();
		entrada.nextLine();
		int cifra1 = numero / 10000;
		int cifra2 = numero / 1000;
		int cifra3 = numero / 100;
		int cifra4 = numero / 10;
		
		System.out.println("CIFRA     1: " + cifra1);
		System.out.println("CIFRA    12: " + cifra2);
		System.out.println("CIFRA   123: " + cifra3);
		System.out.println("CIFRA  1234: " + cifra4);
		System.out.println("CIFRA 12345: " + numero);
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		
		System.out.print("Dime un numero de 5 cifras: ");
		String numero2 = entrada.nextLine();
		
		System.out.println("CIFRA     1: " + numero2.charAt(0));
		System.out.println("CIFRA    12: " + numero2.substring(0, 2));
		System.out.println("CIFRA   123: " + numero2.substring(0, 3));
		System.out.println("CIFRA  1234: " + numero2.substring(0, 4));
		System.out.println("CIFRA 12345: " + numero2.substring(0, 5));
		
		entrada.close();
	}

}
