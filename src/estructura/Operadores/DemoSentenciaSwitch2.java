package Operadores;

public class DemoSentenciaSwitch2 {
	public static void main(String[] args) {
		char caracter= 'y';
		System.out.println("Sentencia antes de la primera sentencia switch");
		switch(caracter) {
		case 'x':
			System.out.println("caracter tiene el valor x");
			break;
		case 'y':
			System.out.println("caracter tiene el valor y");
			break;
		case 'z':
			System.out.println("caracter tiene el valor z");
			break;
		}
		System.out.println("Sentencia despues de la primera switch");
	}
}
