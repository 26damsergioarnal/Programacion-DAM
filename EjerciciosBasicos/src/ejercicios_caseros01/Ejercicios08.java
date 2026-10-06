package ejercicios_caseros01;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicios08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("=========Comas y Puntos=========");
		System.out.print("Dame un doble: ");
		double doble = entrada.nextDouble();
		entrada.useLocale(Locale.US);
		System.out.println(doble);
		entrada.close();

	}

}
