package ejercicios01;

public class Ejercicios05 {

	public static void main(String[] args) {
		
		//VARIABLES A CAMBIAR
		int a = 5;
		int b = 3;
		int c = -12;
		
		// MAYOR O MENOR QUE BOOLEAN
		boolean aMayor3 = a > 3;
		boolean aMayorC = a > c;
		boolean aMenorC = a < c;
		boolean bMenorA = b < a;
		boolean bNoIgualC = b != c;
		boolean aIgual3 = a == 3;
		boolean aPorb15 = a * b == 15;
		boolean cEntreB4 = c / b == 4;
		boolean cEntreBMenorA = c / b < a;
		boolean cEntreBIgualM10 = c / b == -10;
		boolean restoAEntreBIgual2 = a % b ==2;
		boolean aMasBMasCIgual5 = a + b + c == 5;
		
		//AND / OR BOOLEAN
		boolean aMasBIgual8AndAMenosBIgual2 = (a + b == 8) && (a -b == 2);
		boolean aMasBIgual8OrAMenosBIgual6 = (a+b == 8) || (a-b == 6);
		boolean aMAyor3AndBMAyor3AndCMenor3 = a > 3 && b > 3 && c < 3;
		boolean aMayor3AndBmayorIgual3AndCMenorM3 = a > 3 && b >= 3 && c < -3;
		
		// MAYOR O MENOR QUE
		System.out.println("----------------COMPARACIONES DE MAYOR QUE O MENOR QUE (A - L)---------------");
		System.out.println();
		System.out.println("¿el numero " + a + " es mayor qeu 3? " + aMayor3);
		System.out.println("¿el numero " + a + " es mayo que el numero " + c + "? " + aMayorC);
		System.out.println("¿el numero " + a + " es menor que " + c + "? " + aMenorC);
		System.out.println("¿el numero " + b + " es menor que " + a + "? " + bMenorA);
		System.out.println("¿el numero " + b + " no es igual que el numero " + c + "? " + bNoIgualC);
		System.out.println("¿el numero " + a + "es igual a 3? " + aIgual3);
		System.out.println("¿el numero " + a + " por el numero " + b + " es igual a 15? " + aPorb15);
		System.out.println("¿el numero " + c + " entre el numero " + b + " es igual a 4? " + cEntreB4);
		System.out.println("¿el numero " + c + " entre el numero " + b + " es menor que " + a + "? " + cEntreBMenorA);
		System.out.println("¿el numero " + c + " entre el numero " + b + " es igual a -10? " + cEntreBIgualM10);
		System.out.println("¿el resto de " + a + " entre el numero " + b + " es igual a 2? " + restoAEntreBIgual2);
		System.out.println("¿el numero " + a + " mas el numero " + b + " mas el numero " + c +" es igual a 5? " + aMasBMasCIgual5);
		System.out.println();
		System.out.println();
		System.out.println();
		
		//AND / OR
		System.out.println("----------------COMPARACIONES DE AND/OR (M - P)---------------");
		System.out.println();
		System.out.println("¿el siguiente AND es falsa o verdadera, (" + a + " + " + b + " == 8) && (" + a + " - " + b + " == 2)? " + aMasBIgual8AndAMenosBIgual2);
		System.out.println("¿el siguiente OR es falsa o verdadera, (" + a + " + " + b + " == 8) || (" + a + " - " + b + " == 6)? " + aMasBIgual8OrAMenosBIgual6);
		System.out.println("¿el siguiente AND es falsa o verdadera, " + a + " > 3 && " + b + " > 3 && " + c + " < 3? " + aMAyor3AndBMAyor3AndCMenor3);
		System.out.println("¿el siguiente AND es falsa o verdadera, " + a + " > 3 && " + b + " >= 3 && " + c + " -3? " + aMayor3AndBmayorIgual3AndCMenorM3);
		
		
		
		
		
		
		
	}

}
