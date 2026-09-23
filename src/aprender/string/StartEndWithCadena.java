package aprender.string;

public class StartEndWithCadena {

	public static void main(String[] args) {
		
		String cadena = "Hola, ¿Que tal estas?";
		
		boolean esSaludo = cadena.startsWith("Hola");					//¿La cadena empieza por X? (siempre devuelve boolean)
		
		System.out.println("la cadena tiene un saludo? " + esSaludo);
		
		boolean esPregunta = cadena.endsWith("?");						// ¿La cadena acaba en X? (siempre es un boolean)
		
		System.out.println("la cadena contiene una pregunta? " + esPregunta);
		

	}

}
