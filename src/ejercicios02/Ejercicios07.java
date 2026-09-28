package ejercicios02;

import java.util.Scanner;

public class Ejercicios07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Dame tres numeros juntos: ");
			String num = entrada.nextLine();
			System.out.println("El numero es: " + num);
			System.out.println();
			System.out.println("cifra 1: " + num.charAt(0));
			System.out.println("cifra 2: " + num.charAt(1));
			System.out.println("cifra 3: " + num.charAt(2));
			System.out.println();
			System.out.println("=======================");
			System.out.println();
			System.out.print("Dame un numero: ");
			int num2 = entrada.nextInt();
			entrada.nextLine();
			System.out.println();
			
			int primer = num2 / 100;
			int segundo = (num2 -(primer * 100)) / 10;
			int tercero = num2 - ((primer * 100) + (segundo * 10));
			
			System.out.println("cifra 1: " + primer);
			System.out.println("cifra 2: " + segundo);
			System.out.println("cifra 3: " + tercero);
			entrada.close();
	}

}
