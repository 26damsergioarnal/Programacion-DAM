package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("========CUENTA BANCARIA========");
		System.out.print("Dame tu numero de cuenta separado por guines: ");
		String num = entrada.nextLine();
		System.out.println();
		System.out.println("Tu cuenta sin guiones: " + num.replaceAll("-", ""));
		entrada.close();

	}

}
