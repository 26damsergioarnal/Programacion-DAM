package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba su año de nacimiento: ");
		String year = entrada.nextLine();
		
		boolean mayor = Integer.valueOf(year) >= 2027;
		boolean s = (2026 - Integer.valueOf(year)) == 1;
		
		System.out.println(mayor ? "Eso es imposible" : 
				s ? ("Tu edad es: " + (2026 - Integer.valueOf(year))) + " año" : 
					("Tu edad es: " + (2026 - Integer.valueOf(year))) + " años");
		
		entrada.close();
		
	}

}
