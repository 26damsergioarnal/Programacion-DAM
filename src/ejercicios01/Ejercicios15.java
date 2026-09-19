package ejercicios01;

public class Ejercicios15 {

	public static void main(String[] args) {
		String comienza = "Comienza el programa";
		System.out.println(comienza);
		
		String cadena20 = "alskrncharosteqiadomeric";
		String sub = cadena20.substring(0,4); // nombre de la variable a la que estraemos texto + .substring(denumerocaracter,anumerocaracter)
		System.out.println("la cadena completa es: " + cadena20);
		System.out.println("los primeros 4 digitos son: " + 	sub);
		
		
		String acaba = "Tremina el programa";
		System.out.println(acaba);
	}

}
