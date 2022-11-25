package ProgramacionOrientadaAObjetos;

public class ClasesYMetodosGenericos <M,N> {

	public static void main(String[] args) {
		
		String[] nombres = {"Chepe","Pancho","Payo"};

		interger [] enteros = {1,2,3,4,5,6,7};
		
		
		Double[] reales= (1.2,3.4,5.6,7.8);
		
		Imprimir(nombres);
		Imprimir(enteros);
		Imprimir(reales);
	}

	
	static<A>void Imprimir(A [] arreglos) {
		
		for(A s: arreglos) {
		System.out.println(s);
		
		}
	}
	
	static void Imprimir(int [] arreglos) {
		
		for(int s: arreglos) {
		System.out.println(s);
		
		}
	}
	

	static void Imprimir(double [] arreglos) {
		
		for(double s: arreglos) {
		System.out.println(s);
		}
	}
}
