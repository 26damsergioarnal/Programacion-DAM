package ejercicios01;

public class Ejercicios15 {

	static final String INICIO_PROGRAMA = "== Comienza el programa ==";	//incambiable esta variable
	static final String FINALE_PROGRAMA = "== finaliza el programa ==";	//siempre antes del main
	
	public static void main(String[] args) {
		
		System.out.println(INICIO_PROGRAMA);
		String cadena20 = "alskrncharosteqiadomeric";
		String sub = cadena20.substring(0,4); // nombre de la variable a la que estraemos texto + .substring(denumerocaracter,anumerocaracter)
		System.out.println("la cadena completa es: " + cadena20);
		System.out.println("los primeros 4 digitos son: " + 	sub);
		
		
		System.out.println(FINALE_PROGRAMA);
	}

}
