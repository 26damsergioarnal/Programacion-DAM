package ejercicios_caseros00;

public class Ejercicios11 {

	public static void main(String[] args) {
		
		String electro = "Electroencefalografista";
		
		int num = electro.length();
		
		boolean s = electro.length() == 1;
		
		System.out.printf(s ? "La palabra \"%s\" contiene %d caracter" : "La palabra \"%s\" contiente %d caracteres", 
				electro, num, electro, num);
		

	}

}
