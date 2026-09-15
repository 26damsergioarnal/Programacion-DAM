package ejercicios00;

public class Ejercicios06 {

	public static void main(String[] args) {
		double euro = 5;
		double libra = 0.91;
		double dolar = 1.17;
		
		System.out.println( euro + "€ euros son esta cantidad de libras: " + euro * libra + " GBP");
		System.out.println(euro + "€ euros son esta cantidad de dolares: " + euro * dolar + " $");
		
		// otra manera
		
		double enLibra = euro * libra;
		System.out.println(euro + "euros son esta cantidad de libras: " + enLibra + "GBP");
		
	}

}
