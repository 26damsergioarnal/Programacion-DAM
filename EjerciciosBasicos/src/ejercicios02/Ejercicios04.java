package ejercicios02;

import java.util.Scanner;

public class Ejercicios04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame el radio de la circunferencia: ");
		double radio = entrada.nextDouble();
		
		System.out.println("La logitud es: " + (2 * Math.PI * radio));
		System.out.println("El area es: " + (Math.PI * (radio*radio)));
		
		entrada.close();
	}

}
