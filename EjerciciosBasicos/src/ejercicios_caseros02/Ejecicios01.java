package ejercicios_caseros02;

import java.util.Scanner;

public class Ejecicios01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un numero: ");
		int numero = Integer.valueOf(entrada.nextLine());

		boolean par = numero % 2 == 0;
		System.out.println(par ? "Es par" : "Es impar");
		entrada.close();
	}

}
