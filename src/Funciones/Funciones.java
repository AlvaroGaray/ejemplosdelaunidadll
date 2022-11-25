package Funciones;

public class Funciones {

	
	//Definicion de la funcion
	static void Dibujar() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
			for (int j = i; j >= 0; j--) {
				System.out.print("-");
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		//LLamada del metodo 
		Dibujar();
		Dibujar();
		Dibujar();
		Dibujar();
	}

}
