package ejercicios_caseros00;

public class Ejercicios01 {

	public static void main(String[] args) {
		
		String cadena = "Programacion";
		char primeraLetra = cadena.charAt(0);
		char ultimaLetra = cadena.charAt(cadena.length() - 1);
		
		System.out.println("La primera letra de \"" + cadena + "\" es: " + primeraLetra);
		System.out.println("La ultima letra de \"" + cadena + "\" es: " + ultimaLetra);
	}

}
