package ejercicios02;

import java.util.Scanner;

public class Ejercicios11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("=====cadenas=====");
		System.out.print("Dame una cadena: ");
		String cadena = entrada.nextLine();
		
		String cadenaMinusculas = cadena.toLowerCase();
		
		boolean vocales = cadenaMinusculas.replaceAll("[aeiou]", "").equalsIgnoreCase(cadena);
		boolean empieza = cadenaMinusculas.startsWith("a") || cadenaMinusculas.startsWith("e")
				|| cadenaMinusculas.startsWith("i") || cadenaMinusculas.startsWith("o") || 
				cadenaMinusculas.startsWith("u");
		boolean acaba = cadenaMinusculas.endsWith("a") || cadenaMinusculas.endsWith("e")
				|| cadenaMinusculas.endsWith("i") || cadenaMinusculas.endsWith("o") || 
				cadenaMinusculas.endsWith("u");
		
		System.out.println(vocales ? "No tiene vocales" : "Si tiene vocales");
		System.out.println(empieza ? "Empieza por vocal" : "No empieza por vocal");
		System.out.println(acaba ? "Acaba por vocal" : "No acaba por vocal");
		
		entrada.close();
	}

}
