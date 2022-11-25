package Funciones;

public class Funciones2 {
//Definicion de la funcion 
	
	static float sumar (float n1, float n2) {
		float suma = n1+ n2;
		
		return suma;
	}
	
	static float restar (float n1, float n2) {
		float resta = n1- n2;
		
		return resta;
	}
	
	public static void main(String[] args) {
		// LLamada a la funcion
		
		float sum = sumar (3, 9);
		
		
		System.out.println("La suma es: "+sum);
		
		
		
		float subs = restar (9,5);
		
		System.out.println("La resta es: "+subs);
	}

}
