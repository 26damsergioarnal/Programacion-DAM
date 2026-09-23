package ejercicios_caseros00;

public class Ejercicios04 {

	public static void main(String[] args) {
		String java = "curso_java_basico";
		String palabra = "java";
		boolean siONo = java.contains(palabra);
		
		System.out.println("¿La cadena \"" + java + "\" tiene la parabra \"" + palabra 
				+ "\"?" + (siONo ? " Si, la contiene" : "No, no la contiene"));

	}

}
