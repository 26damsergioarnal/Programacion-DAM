package ejercicios00;

public class Ejercicios08 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		int num3 = 6;
		boolean resultado = num1 > num3; // para esto sirve un boolean (comparacion etc)
		System.out.println("num1 > mun3: " + resultado);
		resultado = num3 > num2;
		System.out.println("num3 > num2: " + resultado);
		resultado = num1 > num3 && num3 > num2;
		System.out.println("AND de las anteriores: " + resultado);
		resultado = num1 > num3 || num3 > num2;
		System.out.println("OR de las anteriores: " + resultado);
		resultado = true;
		resultado = !resultado;
		System.out.println("NOT true es: " + resultado);
		resultado = false;
		resultado = !resultado;
		System.out.println("NOT false es: " + resultado);
		

	}

}
