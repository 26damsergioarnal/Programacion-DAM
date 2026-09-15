package variables;

public class Casteo {

	public static void main(String[] args) {
		double notaMedia = 7.9;
		int notaBoletin = (int) notaMedia;
		int notaRedondeada = (int) (notaMedia + .5);// asi redondeara a paratir del 0.5 si pusiera 0.25 redondearia a partir del 0.75
		System.out.println("nota boletin: " + notaBoletin);
		System.out.println("nota boletin redondeada: " + notaRedondeada);
		
		short corto = 128;
		byte aByte = (byte) corto;
		System.out.println("128 en byte es: " + aByte); // te da el valor contrario 
		
		

	}

}
