package ejercicios02;

import java.util.Scanner;

public class Ejercicios10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("dame tu dia de nacimiento: ");
		int dia = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Dame tu mes de nacimiento: ");
		int mes = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Dame tu año de nacimiento: ");
		int ano = entrada.nextInt();
		entrada.nextLine();
		
		int suma = dia + mes + ano;
		
		int cifra1 = suma / 1000;
		int cifra2 = (suma % 1000) / 100;
		int cifra3 = (suma % 100) / 10;
		int cifra4 = suma % 10;
		
		int diaSuerte = cifra1 + cifra2 + cifra3 + cifra4;
		
		System.out.println();
		System.out.println("Tu dia de la suerte es: " + diaSuerte);
		
		entrada.close();

	}

}
