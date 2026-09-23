package ejercicios_caseros00;

public class Ejercicios03 {

	public static void main(String[] args) {
		
		String comas = "200,200,300,400";
		String guion = comas.replaceAll(",", "-");
		
		System.out.println("Con comas: " + comas);
		System.out.println("Con guiones: " + guion);
 
	}

}
