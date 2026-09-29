package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("======Renovar Contraseña========");
		System.out.print("Ponga su nueva contraseña: ");
		String passwd = entrada.nextLine();
		System.out.print("Repita la contraseña: ");
		String passwd2 = entrada.nextLine();
		
		System.out.println(passwd.equals(passwd2) ? "Contraseña cambiada correctamente" : 
			"Las contraseñas no coinciden");
		entrada.close();
	}

}
