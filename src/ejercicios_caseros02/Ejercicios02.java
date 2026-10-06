package ejercicios_caseros02;

import java.util.Scanner;

public class Ejercicios02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la contraseña: ");
		String cont = entrada.nextLine();
		System.out.println(cont.equals("1234_admin") ? "Acceso concedido" : "Acceso denegado");
		entrada.close();
		
	}

}
