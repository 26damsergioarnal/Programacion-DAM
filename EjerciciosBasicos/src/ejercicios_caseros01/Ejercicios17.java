package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("========NOTA MEDIA========");
		System.out.print("Dame tu nota (0 - 10): ");
		int nota = entrada.nextInt();
		System.out.println(nota < 5 ? "Suspenso" : nota < 7 ? "Aprobado" : nota <= 8 ? "Notable" : 
			nota <= 10 ? "Sobresaliente" : "Nota imposible");
		entrada.close();
	}

}
