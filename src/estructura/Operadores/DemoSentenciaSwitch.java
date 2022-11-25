package Operadores;

public class DemoSentenciaSwitch {
	public static void main(String[] args) {
		int a=2;
		System.out.println("Sentencia abtes de la primera sentencia switch");
		switch(a) {
		case 1:
			System.out.println("a tiene el valor de 1");
			double d=33.876, d2=44, d3=88.77;
			if(d>40) {
				System.out.println("d>40");
				if(d2 < d3) {
					System.out.println("d2<d3");
				} else {
					System.out.println("d2>d3");
				}
			}
			break;
		case 2:
			System.out.println("a tiene el valor 2");
			break;
		case 3:
			System.out.println("a tiene el valor 3");
			break;
		default:
			System.out.println("a no tiene los valores 1, 2 ni 3");
		}
		System.out.println("Sentencia despues de la primera sentencia switch");
	}
}
