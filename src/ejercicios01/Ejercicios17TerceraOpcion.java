package ejercicios01;

public class Ejercicios17TerceraOpcion {

	public static void main(String[] args) {
		
		String cadena1 = "2";
		String cadena2 = "10";
		
		int cadena1Conv = Integer.parseInt(cadena1);	//convertir stringer en int
		int cadena2Conv = Integer.parseInt(cadena2);
		
		boolean igual = cadena1.equals(cadena2);		//comparo si la dos cadenas son iguales en un boolean
		boolean compare = cadena1Conv > cadena2Conv; // comparo sus numeros convertidos si son mayores o menores
		
		System.out.println("¿Es MAYOR MENOR O IGUAL?");
		System.out.println("________________________");
		System.out.println();
		System.out.println(igual ? "El numero " + cadena1Conv + " es igual que el numero " + cadena2Conv : 
			compare ? "El numero " + cadena1Conv + " es mayor que el numero " + cadena2Conv : "El numero " + 
				cadena1Conv + " es menor que el numero " + cadena2Conv);		
		
			// Hago un operador ? dentro de otro para poder tener 3 opciones
	}

}
