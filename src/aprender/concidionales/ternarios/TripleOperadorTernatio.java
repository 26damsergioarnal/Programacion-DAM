package aprender.concidionales.ternarios;

public class TripleOperadorTernatio {

	public static void main(String[] args) {
		int num = 3;
		
		boolean mayor2 = num > 2;
		boolean igual = num == 2;
		
		System.out.println(igual ? "es igual a 2" : mayor2 ? "es mayor a 2" : "es menor a 2");
		//un operador ternaario dentro de otro

	}

}
