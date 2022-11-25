package Operadores;

public class DemoSentenciaSwitch3 {
	public static void main(String[] args) {
		String nombre="Danilo";
		System.out.println("Sentencia antes de la primera sentencia switch");
		switch(nombre) {
		case "Luis":
			System.out.println("Nombre tiene el valor luis");
			break;
		case "Juan":
			System.out.println("Nombre tiene el valor Juan");
			break;
		case "Danilo":
			System.out.println("Nombre tiene el valor Danilo");
			break;
		}
		System.out.println("Sentencia despues de la primera sentencia switch");
	}
}
