package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("========Quitar Decimales=========");
		System.out.print("Dame un numero con muchos decimales: ");
		double doble = entrada.nextDouble();
		int sinDeci = (int)doble;
		System.out.println("El numero sin decimales es: " + sinDeci);
		
		entrada.close();
	}

}
