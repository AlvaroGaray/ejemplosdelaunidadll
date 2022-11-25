package Funciones;

public class Polimorfosmo {
	static double dividir(double n1, double n2){
		return n1/n2;
		
	}
	
	static double dividir(int n1, int n2) {
		return n1/n2*2;	
	}
	
	static double dividir(int n1,double n2) {
		return n1/n2*3;
		
		
	}
	
	
	public static void main(String[] args) {
		double cociente = dividir(5.0,2.0);
		System.out.println("Resultado: "+cociente);
		
		cociente = dividir(9,4);
		System.out.println("Resultado: "+cociente);
		
		cociente = dividir(4,6.0);
		System.out.println("Resultado: "+cociente);

	}

}
