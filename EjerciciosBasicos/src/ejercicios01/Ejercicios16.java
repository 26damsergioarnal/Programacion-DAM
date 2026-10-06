package ejercicios01;

public class Ejercicios16 {

	public static void main(String[] args) {
		String cadena = "12345";
		boolean contador = cadena.length() >= 5 ;
		int cadenaconv = Integer.parseInt(cadena);
		System.out.println("¿La siguiente cadena -5 tiene 5 o mas cifras? "
				+ "(\"" + (cadenaconv + 5) + "\") " + (contador ? "Si, la cadena " + 
				cadenaconv + " tiene 5 caracateres" : " No, no tiene 5 caracteres" ));

	}

}
