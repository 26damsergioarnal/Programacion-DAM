package ejercicios01;

public class Ejercicios02 {

	public static void main(String[] args) {
		
		//Byte - short - int - long - float - double - char
		byte byteNum = 1;
		short cortoNum = 2;
		int intNum = 32;
		long largoNum = 50;
		float floatNum = 2.5f;
		double doubleNum = 2.5;
		char caracter = 'Ñ';
		boolean verdadero = true;
		// suma resta multiplicacion division resto
		
		System.out.println("byte + short: " + (byteNum + cortoNum));
		System.out.println("int - long: " + (intNum - largoNum));
		System.out.println("char * double: " + (caracter * doubleNum));
		System.out.println("int / float: " + intNum / floatNum);
		System.out.println("Resto de int entre double: " + (intNum % doubleNum));
		

	}

}
