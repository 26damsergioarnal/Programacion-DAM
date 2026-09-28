package aprender.scanner;

import java.util.Scanner;

public class ScannerNextIntEtc {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("dime un numero: ");
		int num1 = entrada.nextInt();
		System.out.print("Dime otro numero: ");
		int num2 = entrada.nextInt();
		System.out.println("la suma es: " + (num1 + num2));
		System.out.println();
		
		//El scanner puede leer varios numeros con espacios entre 
		//medias sin necesidad de pedirlo varias veces
		
		System.out.print("Dime dos numeor separados por espacios: ");
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		
		System.out.println("La suma es: " + (num3 + num4));
		
		entrada.close();
	}

}
