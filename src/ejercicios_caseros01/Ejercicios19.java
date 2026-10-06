package ejercicios_caseros01;

import java.util.Scanner;

public class Ejercicios19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("========EVALUADOR COMERCIAL========");
		System.out.print("Precio del producto: ");
		String precioProducto = entrada.nextLine();
		System.out.print("Cuanto tienes en cartera: ");
		String cartera = entrada.nextLine();
		
		System.out.println(Double.parseDouble(precioProducto) - Double.parseDouble(cartera) > 0 ? "Compra realizada" : "Saldo insuficiente");
		entrada.close();
	}

}
