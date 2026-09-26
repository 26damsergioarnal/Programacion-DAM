package ejercicios_caseros01;

import java.util.Scanner;

public class ejercicios04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame tu año de nacimietno: ");
		String nacimiento = entrada.nextLine();
		boolean mayor = (2026 - Integer.valueOf(nacimiento)) >= 18;
		System.out.println(mayor ? "Puede pasar" : "Acceso denegado");
		entrada.close();
		
	}

}
