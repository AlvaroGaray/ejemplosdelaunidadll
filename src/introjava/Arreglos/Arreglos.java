package Arreglos;
import java.util.Scanner;


public class Arreglos {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
	String[] trabajos = new String [5];
	//trabajos[0] = "Desarrollador";
	//trabajos[1] = "Analista";
	//trabajos[2] = "Tester";
	//trabajos[3] = "Control de calidad ";
	//trabajos[4] = "Administrador";
	//Arreglos de otros tipos de datos:
	//int[] edades= new int [10];
	//float[] salarios = new int [10];
	//double[] promedios = new double [10]
	
	
	System.out.println("Ingrese los trabajos: ");
	for (int i = 0 ; i < trabajos.length ;i++) {
		trabajos[i] = lector.nextLine();
		
	}
	
System.out.println("Imprimir trabajos : ");
for (int i = 0 ; i < 5 ;i++) {
System.out.println(trabajos[i]);
}

lector.close();
	}

}
