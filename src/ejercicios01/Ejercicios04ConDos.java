package ejercicios01;

public class Ejercicios04ConDos {

	public static void main(String[] args) {
		int varA = 1;
		int vaso = varA;
		int varB = 2;
		
		System.out.println("la variable A vale: " + varA);
		System.out.println("la variable B vale: " + varB);
		System.out.println("----------------");
		
		varA = varB;
		
		System.out.println("la variable A vale: " + vaso);
		System.out.println("la variable B vale: " + varB);
	}

}
