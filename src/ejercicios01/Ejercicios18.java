package ejercicios01;

import java.util.Scanner;

public class Ejercicios18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame un byte: ");
		byte bite = entrada.nextByte();
		entrada.nextLine();
		
		System.out.print("Dame un short: ");
		short corto = entrada.nextShort();
		entrada.nextLine();
		
		System.out.print("Dame un int: ");
		int inte = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Dame un long: ");
		long largo = entrada.nextLong();
		entrada.nextLine();
		
		System.out.print("Dame un float: ");
		float flotante = entrada.nextFloat();
		entrada.nextLine();
		
		System.out.print("Dame un doble: ");
		Double doble = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Dame un boolean: ");
		boolean boole = entrada.nextBoolean();
		entrada.nextLine();
		
		System.out.print("Dame un char: ");
		entrada.nextLine();
		char caracter = entrada.nextLine().charAt(0);
		
		entrada.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("El byte es: " + bite);
		System.out.println();
		System.out.println("El short es: " + corto);
		System.out.println();
		System.out.println("El int es: " + inte);
		System.out.println();
		System.out.println("El long es: " + largo);
		System.out.println();
		System.out.println("El float es: " + flotante);
		System.out.println();
		System.out.println("El doble es: " + doble);
		System.out.println();
		System.out.println("El boolean es: " + boole);
		System.out.println();
		System.out.println("El char es: " + caracter);
		System.out.println();
		
		entrada.close();

	}

}
