package aprender.scanner;

import java.util.Scanner;

public class ScannerHasNextIntEtc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("dime un int: ");
		System.out.println(entrada.hasNextInt()); //si es int da true sino error
		System.out.println(entrada.nextInt() + 5);
		entrada.close();
	}

}
