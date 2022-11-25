package Ciclos;

public class OtroDemoCicloFor {
	
		public static void main(String[] args) {
			System.out.println("Segundo ciclo for, controlado por contador");
			int contador=100;
			for(;contador >=0;) {
				System.out.println("Contador="+contador);
				contador=contador-30;
			}
			System.out.println("Fin segundo ciclo for, controlado por contador");
		}
}
