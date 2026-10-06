package aprender.concidionales.ternarios;

public class OperadorTernario {

	public static void main(String[] args) {
		int numero = 80;
		boolean esPar = numero % 2 == 0; // si la variable numero al dividir por 2 da 0 sera correcta
		System.out.println(esPar ? "es par" : "es impar");// entonces en esta linea escogera la primera opcion

	}

}
