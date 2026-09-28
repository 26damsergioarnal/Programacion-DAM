package ejercicios02;

import java.util.Scanner;

public class Ejercicios01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un numero entero: ");
		int num = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("El doble es: " + num * 2);
		System.out.println("El triple es: " + num * 3);
		
		entrada.close();
	}

}
