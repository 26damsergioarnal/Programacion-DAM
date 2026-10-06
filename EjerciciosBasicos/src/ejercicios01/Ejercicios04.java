package ejercicios01;

public class Ejercicios04 {

	public static void main(String[] args) {
		
		int variA = 2;
		int variA2 = variA; // aqui guardo la variable A para tener el 2 guardado y no se me cambie
		int variB = 3;
		int variC = 4;
		int variD = 5;
		
		System.out.println("La variable A es: " + variA);
		System.out.println("La variable B es: " + variB);
		System.out.println("La variable C es: " + variC);
		System.out.println("La variable D es: " + variD);
		System.out.println("--------------------");
		
		variA = variB;
		variB = variC;
		variC = variD;
		variD = variA2;// aquie pongo la variable A2 para poner lo que realmente vale variable A
		
		System.out.println("La variable A es: " + variA);
		System.out.println("La variable B es: " + variB);
		System.out.println("La variable C es: " + variC);
		System.out.println("La variable D es: " + variD);
	}

}
