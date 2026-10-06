package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("=========SUMA=========");
		System.out.print("Dame un numero: ");
		String num1 = entrada.nextLine();
		System.out.print("dame otro numero: ");
		String num2 = entrada.nextLine();
		
		int suma = Integer.valueOf(num1) + Integer.valueOf(num2);
		
		System.out.println("La suma de ambos es: " + suma);
		
		entrada.close();
		
	}

}
