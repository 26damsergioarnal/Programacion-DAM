package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("========ANALISTA DE INVENTARIO========");
		System.out.print("Dime un codifo de producto (Ejemplo: \"MESA-350\"): ");
		String codigo = entrada.nextLine();
		boolean num = codigo.substring(codigo.indexOf("-") + 1, codigo.length()) > 500;

	}

}
