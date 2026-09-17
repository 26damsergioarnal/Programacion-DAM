package ejercicios01;

public class Ejercicios07 {

	public static void main(String[] args) {
		int num = 2444;
		boolean positivoPar = num >= 0 && num % 2 == 0; 
		// si el numero es mayoro igual a 0 es positivo y si el resto de una division entre dos es 0
		System.out.println("el numero " + num + " es: " + (positivoPar ? 
				"Positivo y par" : "No se cumplen las condiciones"));
 
	}

}
