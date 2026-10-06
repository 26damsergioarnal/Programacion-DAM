package ejercicios_caseros00;

public class Ejercicios10 {

	public static void main(String[] args) {
		
		String manzana = "Manzana";
		String zanahoria = "Zanahoria";
		
		boolean antes = manzana.compareTo(zanahoria) < 0 ;
		
		System.out.println(manzana.compareTo(zanahoria));

		System.out.println("¿De las palabras \"" + manzana + "\" y \"" + zanahoria + "\" cual va antes en el diccionario? \n" + 
		(antes ?  zanahoria + " va antes en el diccionario" :  manzana + " va antes en el diccionario"));
	}

}
