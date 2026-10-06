package aprender.scanner;

import java.util.Locale;
import java.util.Scanner;

public class ScannerUseLocale {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("dime un doble: ");
		double num1 = entrada.nextDouble();
		System.out.print("dime otro doble: ");
		double num2 = entrada.nextDouble();
		System.out.println("la suma es: " + num1 * num2); 
		// solo valdra con comas porque esta en español
		
		
		entrada.useLocale(Locale.US);					//cambio a US para que lea comas
		System.out.print("dime un doble: ");
		double num3 = entrada.nextDouble();
		System.out.print("dime otro doble: ");
		double num4 = entrada.nextDouble();
		System.out.println("la suma es: " + num3 * num4);
		entrada.close();
	}

}
