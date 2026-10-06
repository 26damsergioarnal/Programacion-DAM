package aprender.string;

public class ReplaceAllCadena {

	public static void main(String[] args) {
		
		String cadena = "quiero unas pipas";
		
		String cadenaRem = cadena.replaceAll("unas pipas", "unos cerales");	//cambia X trozo por otro
		
		System.out.println(cadena);
		System.out.println(cadenaRem);

		String ninini = cadena.replaceAll("[aeiou]", "i"); 					//cabia x vocales por loq ue quieras
		
		System.out.println(ninini);
		
	}

}
