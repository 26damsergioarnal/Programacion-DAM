package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("=========PDF=========");
		System.out.print("Dame el nombre e tu archivo: ");
		String arch = entrada.nextLine();
		String minus = arch.toLowerCase();
		System.out.println(minus.endsWith("pdf") ? "Archivo valido" : "Archivo invalido");
		
		entrada.close();
	}

}
