package ejercicios01;

public class Ejercicios09 {

	public static void main(String[] args) {
		int varA = 28;
		boolean multiplo3O7Positivo = (varA  % 3 == 0 || varA % 7 == 0) && varA >= 0;
		System.out.println("¿el numero " + varA + " es multiplo de 3 o de 7 y positivo? " + 
		(multiplo3O7Positivo ? "Si" : "No se cumplen las condiciones"));

	}

}
