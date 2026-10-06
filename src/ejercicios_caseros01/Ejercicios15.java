package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("========CARACTERES========");
		System.out.print("Dame un caractar: ");
		char caracter = entrada.nextLine().charAt(0);
		int caracterConv = caracter;
		System.out.println("El caracter en el estandar es: " + caracterConv);
		entrada.close();
	}

}
