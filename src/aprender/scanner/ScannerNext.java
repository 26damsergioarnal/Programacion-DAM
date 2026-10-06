package aprender.scanner;

import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//lee hasta el espacio
		System.out.print("Dime tu nombre y apellidos: ");
		String nombre = entrada.next();
		String apellido = entrada.next();
		
		System.out.println("tu nombre es: " + nombre);
		System.out.println("tu apellido es: " + apellido);
		
		entrada.close();


	}

}
