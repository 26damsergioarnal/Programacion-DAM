package ejercicios01;

public class Ejercicios06SegundaForma {

	public static void main(String[] args) {
		int num = -2;								// Asigno numero a una variable
		int numInv = num * -1;						// hago otra variable donde le invierto el signo 
		boolean esPositivo = num > numInv;			// comparo si la variable principal es mayor a la invertida entonces sera positivo
		System.out.println("el numero " + num + " es: " + (esPositivo ? "Positivo" : "Negativo"));

	}

}
