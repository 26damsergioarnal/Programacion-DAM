package ejercicios01;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num1 = 7;
		double num2 = 2.71;
		char caracter = 'H';
		
		System.out.println("el int vale: " + num1);
		System.out.println("el double vale: " + num2);
		System.out.println("el charvale: " + caracter);
		System.out.println("int + double: " + (num1 + num2));
		System.out.println("double - int: " + (num2 - num1));
		System.out.println("char (como numero): " + 0 + caracter); //convierte el char en int java 
		System.out.println("char (como numero): " + ((int) caracter));//convierte un char en un int ya que char mide 8 y un int es 32 
		int charComoInt = caracter; // tipo de conversio tambien 
		System.out.println(charComoInt);
	}

}
