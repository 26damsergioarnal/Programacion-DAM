package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba su correo: ");
		String correo = entrada.nextLine();
		
		System.out.println("Su dominio es: " + correo.substring(correo.indexOf("@"), correo.length()));
		entrada.close();
	}

}
