package ejercicios_caseros02;

import java.util.Scanner;

public class Ejercicios05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("======MAYOR O MENOR======");
		System.out.print("Dame un numero: ");
		int num1 = Integer.valueOf(entrada.nextLine());
		System.out.print("Dame otro: ");
		int num2 = Integer.valueOf(entrada.nextLine());
		
		System.out.println(num1 > num2 ? "El primer numero es mayor" : "El segundo numero es mayor");
		entrada.close();
	}

}
