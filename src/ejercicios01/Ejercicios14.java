package ejercicios01;

public class Ejercicios14 {

	public static void main(String[] args) {
		String decimal = "1.3";
		String aLargo = "9000000000000000000";
		String aByte = "10";
		String aInt = "1000000";
		
		double doble = Double.parseDouble(decimal);
		long largo = Long.parseLong(aLargo);
		byte bite = Byte.parseByte(aByte);
		int striEnInt = Integer.parseInt(aInt);
		
		/*
		 * Usando la siguiente fomacion conviertes una cadena de texto en un numero
		 * TipoDeDatoConMayu.parseTipoDeDatoMayu(nombrecadena)
		 * ejm: byte bite = Byte.parseByte(aByte)
		 * Int se escribe como Intreger
		 */
		
		System.out.println("la cadena de texto" + decimal + "es un double ahora: " + doble);
		System.out.println("la cadena de texto" + aLargo + "es un long ahora: " + largo);
		System.out.println("la cadena de texto" + aByte + "es un byte ahora: " + bite);
		System.out.println("la cadena de texto" + aInt + "es un int ahora: " + striEnInt);
		
		
	}

}
