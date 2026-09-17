package ejercicios01;

public class Ejercicios10 {

	public static void main(String[] args) {
		
		int varA = 350;
		boolean multiplo5 = varA % 5 == 0;
		boolean multiplo10 = varA % 10 == 0;
		boolean esMayor100 = varA > 100;
		boolean igual = varA == 0;
		
		System.out.println("El valor " + varA + "...");
		System.out.println();
		System.out.println("¿Es multiplo de 5?");
		System.out.println(multiplo5 ? "Si, es multiplo de 5" : "No, no es multiplo de 5");
		System.out.println();
		System.out.println("¿Es multiplo de 10?");
		System.out.println(multiplo10 ? "Si, es multiplo de 10" : "No, no es multiplo de 10");
		System.out.println();
		System.out.println("¿Es mayor que 100?");
		System.out.print(esMayor100 ? "Si, es mayor que 100" : "No, no es mayor que 100");
		System.out.println(igual ? ", es igual a 0" : "");

	}

}
