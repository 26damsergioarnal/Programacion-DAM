package aprender.scanner;

import java.util.Scanner; // introduce Scanner porqeu no lo tiene javaland

public class Escaner {
	
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in); //creo un escanner para na variable (de normal es entrada)
			
			System.out.print("Como te llamas? ");
			String nombre = entrada.nextLine();		//entrada.nexLine() para el programa para qeu escribas
													// y eso lo metemos dentro de na cadena
			
			System.out.println("bienvenido " + nombre);
			
			entrada.close();							// siempre hay que cerrar el scanner que creamos al final de
													// un programa 
			
	}
}
