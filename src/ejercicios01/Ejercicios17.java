package ejercicios01;

public class Ejercicios17 {

	public static void main(String[] args) {
		String cadena1 = "holaa";
		String cadena2 = "adio";
		
		boolean comparacion = cadena1.length() > cadena2.length();
		boolean igual = cadena1.length() == cadena2.length() ;
		
		System.out.println("Entre la cadena  (" + cadena1 + ") y la cadena (" + cadena2 + ") ¿Cual es Igual o no?" + "\n" + (igual ? "La cadena (" + cadena1 + ") es igual que la cadena (" + cadena2 + ")" : 
			"La cadena (" + cadena1 + ") NO es igual que la cadena (" + cadena2 + ")"));
		System.out.println();
		
		System.out.println("Entre la cadena  (" + cadena1 + ") y la cadena (" + cadena2 + ") ¿Cual es mayor menor o igual?"
				+ "\n" + (comparacion ? "La cadena (" + cadena1 + ") es mayor que la cadena (" + cadena2 + ")" : "La cadena (" + cadena2 + ") es mayor"
				+ " que la cadena (" + cadena1 + ")"));
	}

}
