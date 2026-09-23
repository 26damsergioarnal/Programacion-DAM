package ejercicios01;

public class Ejercicios13 {

	public static void main(String[] args) {
		String texto = "hola";
		System.out.println(texto);
		System.out.println("la palabra/frase \"" + texto + "\" tiene esta longitud: " 
		+ texto.length());
		
		System.out.printf("La palabra/frase \"%s\" tiene esta longitud: %d\n", texto, texto.length());
		//otra forma de escribir los print sin tanto +
		// %s es para cadenas y el %d es decimal
		
	}

}
