package ejercicios01;

public class Ejercicios16 {

	public static void main(String[] args) {
		String cadena = "12345";
		boolean contador = cadena.length() >= 5 ;
		int cadenaconv = Integer.parseInt(cadena);
		System.out.println("¿La siguiente cadena tiene 5 o mas cifras? "
				+ "(\"" + cadena + "\") " + (contador ? "si la cadena " + cadenaconv + " tiene 5 caracateres" : " No tiene 5 caracteres" ));

	}

}
