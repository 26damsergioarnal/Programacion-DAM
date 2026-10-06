package aprender.string;

public class LaCadenaTodo {

	public static void main(String[] args) {
		String cadena = "hola 123";
		int longitud = cadena.length(); 						//numero caracteres
		System.out.println("la cadena" + cadena + "tiene longitud: " + longitud + " caracteres");
		
		System.out.println(cadena.charAt(0)); 				//muertra el caracter de la cadena en el numero de posicion
		System.out.println(cadena.charAt(cadena.length() - 1));
		
		String cadena2 = new String ("hola 123"); 			//forzar a hacer distintos String y no usar el mismo objeto para los dos cadenas
															// si no implementaria el mismo objeto a cadena y a cadena2, des esta forma los separa
		
		System.out.println(cadena == cadena2); 				//esto es falso porque no es el mismo objeto
		System.out.println(cadena.equals(cadena2)); 			//esto es cierto porque los objetos si contiene lo mismo
		
		String cadena3 = "Hola 123";
		
		System.out.println(cadena.equals(cadena3));			// es falso por la H mayuscula ya que no es igual que la h minuscula
		System.out.println(cadena.equalsIgnoreCase(cadena3));// dice que es verdad porque ignora mayusculas
		
		System.out.println(cadena.contains("hola"));			//cadena contiene la palabra "hola"
		
		String saludo = cadena3.substring(0,4);					//pilla una parte de la cadena
		System.out.println(saludo);
		
		String despedida = cadena3.replaceAll("Hola", "adios");	//remplaza una palabra por otra
		System.out.println(despedida);
			
		String ninini = cadena3.replaceAll("[aeiou]", "i");		// remplaza varias letras por x
		System.out.println(ninini);
		
		
		cadena = "Horchata y fuet fuet fuet";
		System.out.println(cadena.indexOf("o")); 				// donde esta un o varios caracteres 
		System.out.println(cadena.indexOf("a"));
		System.out.println(cadena.indexOf("fuet"));
		System.out.println(cadena.indexOf("a", 6)); 				// buasca x cadena a partir de x posicion
		System.out.println(cadena.indexOf("ñ"));  				//si no esta la cadena te da -1
		
		
		System.out.println("es cadena un saludo? "+ cadena + " " + cadena.startsWith("Hola"));  // empieza por ...?
		String url = "recetaspaco.es";
		System.out.println("es " + url + " una url española? " + url.endsWith(url)); // acaba en...?
		
		String grito = cadena;
		System.out.println(grito.toUpperCase()); //todo mayusculas
		System.out.println(grito.toLowerCase());  //todo minusculas
		System.out.println(grito);
		
		String persona1 = "Maria Lopez Gonzalez";
		String persona2 = "Maria Lopez Zapata";
		
		System.out.println(persona1.compareTo(persona2)); // sale numero negativo porque Maria Lopez Zapata teine mas valor que Gonzalez
		
		
		int num1 = 7;
		int num2 = 55;
		int suma = num1 + num2;
		
		String sumaEnCadena = "" + suma; //convierte la suma en cadena de forma guarra
		System.out.println(sumaEnCadena);
		//forma correcta
		String sumaEnCadenaBien = String.valueOf(suma); //convierte la suma en cadena
		
		System.out.println("El numero " + suma + " contiene 5 " + sumaEnCadenaBien.contains("5"));
		//contien 5 el numero??
		
		
		

	}

}
