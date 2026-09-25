package ejercicios01;

public class Ejercicios17 {

	public static void main(String[] args) {
		String cadena1 = "ruben";
		String cadena2 = "diana";
		
		int compareTo = cadena1.compareTo(cadena2);
		
		System.out.printf("comparando \"%s\" y \"%s\" ...\n", cadena1, cadena2);
		System.out.println(compareTo == 0 ? "las cadena son igual" : compareTo > 0 ? 
				"La primera es mas grande" : "La segunda es mas grande");

	}

}
