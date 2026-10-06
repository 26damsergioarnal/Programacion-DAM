package ejercicios_caseros00;

public class Ejercicios12 {

	public static void main(String[] args) {
		
		String palabra1 = "Password";
		String palabra2 = "password";
		
		boolean siONO = palabra1.equals(palabra2);
		
		System.out.printf("¿Las palabras \"%s\" y \"%s\" son iguales? (Contando mayus)\n", palabra1, palabra2);
		System.out.println(siONO);

	}

}
