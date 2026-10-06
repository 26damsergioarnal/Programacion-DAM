package ejemplos_if;

import java.util.Scanner;

public class EjemplosIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("como te llamas: ");
		String nombre = entrada.nextLine();

		if (nombre.toLowerCase().startsWith("d")) { // SOLO SE EJTA CUANDO ES TRUE
			System.out.println("Que nombre mas guay");
		} else {
			System.out.println("Vaya...");
		}

		entrada.close();
	}

}
