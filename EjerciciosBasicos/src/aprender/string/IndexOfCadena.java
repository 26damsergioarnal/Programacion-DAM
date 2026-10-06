package aprender.string;

public class IndexOfCadena {
	
	public static void main(String[] args) {
		
		String cadena = "Hola si o no";
		
		System.out.println(cadena.indexOf("a"));		//Donde esta X caracter en X cadena
		
		System.out.println(cadena.indexOf("si")); 		//Donde esta "si" en la cadena
		
		System.out.println(cadena.indexOf("o"));	 	//Te dice donde esta la primera O
				
		System.out.println(cadena.indexOf("o", 9));	 	//Donde esta la O a partir del caracter 9
		
		System.out.println(cadena.indexOf("ñ"));	 	//Si no esta te da un -1
		
	}
	
}
