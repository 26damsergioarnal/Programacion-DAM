package aprender;

public class CadenaTextoATipoDeDato {

	public static void main(String[] args) {
		String texto = "2.3";								//hacemos una cadena
		double dobleConvertido = Double.parseDouble(texto); // creamos una variable dodne la convertimos en decimal
		System.out.println(dobleConvertido);		  		//la mostramso en pantalla
			
		String aInt = "1333";
		int intConvertido = Integer.parseInt(aInt);			//int se llama Integer
		System.out.println(intConvertido);

	}

}
