package ejemplos_if;

public class AmbitosVariables {

	public static void main(String[] args) {
		int a = 7;
		
		if (true){
			int b = 3;
			System.out.println(a + b);//LA VARIABLE SOLO EXISTE DENTRO DEL IF 
		}
		System.out.println(a);//POR ESO DA ERROR FUERA DEL IF +b
		
	}

}
