package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("=========PAGINA SEGURA=========");
		System.out.print("Dame tu pagina web: ");
		String pagina = entrada.nextLine();
		
		System.out.println(pagina.startsWith("https") ? "Tu pagina es segura" : "Tu pagina es insegura");
		
		entrada.close();
	}

}
