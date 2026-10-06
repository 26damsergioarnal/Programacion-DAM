package aprender.string;

public class EqualsCadena {

	public static void main(String[] args) {
		
		String cadena1 = "hola 32";
		String cadena2 = "hola 32";
		
		System.out.println(cadena1 == cadena2); 	//servira porque java usa el mismo objeto para ambas
		
		//si lo forzamos a hacer un objeto nuevo
		
		String cadena3 = new String ("hola 32");
		System.out.println(cadena1 == cadena3); 	// aqui nos dira que no porque hemos forzado a crear otro objeto
		
		
		//entonces por ello hay que usar equals
		
		System.out.println(cadena1.equals(cadena3));
		
		cadena2 = "Hola 32";										// en caso de haya mayusculas
		
		System.out.println(cadena1.equalsIgnoreCase(cadena2));		// las podemos ignorar con ignorecase
		
		// y nos sacara que es verdadero aunque las h y H no sean lo mismo
	}

}
