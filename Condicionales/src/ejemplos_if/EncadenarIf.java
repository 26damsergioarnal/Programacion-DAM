package ejemplos_if;

import java.util.Scanner;

public class EncadenarIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame tu edad: ");
		int edad = entrada.nextInt();
		if (edad >= 18) {
			System.out.println("Mayor edad");
		} else if (edad >= 15) {//PONEMOS UN IF DENTRO DEL ELSE
			System.out.println("Menor de edad tarjeta joven");
		} else {
			System.out.println("Menor de edad y sin tarjeta joven");
		}
		
		
		entrada.close();
	}

}
