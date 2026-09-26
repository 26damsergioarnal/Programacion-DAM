package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame su nombe completo: ");
		String nombre = entrada.nextLine();
		
		System.out.printf("Hola %s, bienvenido, tu nombre tiene %d caracteres", nombre, nombre.length());
		
		entrada.close();
		
		
	}

}
