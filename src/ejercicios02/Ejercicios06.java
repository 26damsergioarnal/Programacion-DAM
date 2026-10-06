package ejercicios02;

import java.util.Scanner;

public class Ejercicios06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==========HIPOTENUSA==========");
		System.out.print("Dame los dos catetos separados por un espacio: ");
		double cateto1 = entrada.nextDouble();
		double cateto2 = entrada.nextDouble();
		System.out.println();
		
		double hipotenusaCuadrado = ((cateto1 * cateto1) + (cateto2 * cateto2)) ;
		double hipotenusa = Math.sqrt(hipotenusaCuadrado);
		
		System.out.println("La hipotenusa es: " + hipotenusa);
		entrada.close();

	}

}
