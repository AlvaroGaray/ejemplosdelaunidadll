package Funciones;

public class VariablesLocalesYGlobales {
     
	static double pi = 3.1;
	
	static double modulo (double n1, double n2) {
		
		double nuevoPI = pi * 2;
		return (n1%n2)* nuevoPI;
	}
	public static void main(String[] args) {
	 
		double residuo = modulo(10,8);
		System.out.println("El residuo es: "+residuo);
		
		
	}

}
