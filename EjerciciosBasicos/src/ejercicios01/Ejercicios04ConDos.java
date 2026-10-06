package ejercicios01;

public class Ejercicios04ConDos {

	public static void main(String[] args) {
		int varA = 1;
		int varB = 2;
		int vaso = varA;
		
		System.out.println("la variable A vale: " + varA);
		System.out.println("la variable B vale: " + varB);
		System.out.println("----------------");
		
		varA = varB;
		
		System.out.println("la variable A vale: " + varA);
		System.out.println("la variable B vale: " + vaso);
	}

}
