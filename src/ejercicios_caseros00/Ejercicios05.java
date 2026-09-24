package ejercicios_caseros00;

public class Ejercicios05 {

	public static void main(String[] args) {
		
		String correo = "ususario@empresa.com";
		String postArroba = correo.substring(9);
		
		System.out.printf("el correo del ususario es: %s\n", correo);
		System.out.printf("El dominio es: %s\n", postArroba);

	}

}
