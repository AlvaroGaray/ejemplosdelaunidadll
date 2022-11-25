package Ciclos;


	import java.util.Scanner;
	public class DemoCicloForCentinela {
		public static void main(String[] args) {
			System.out.println("Tercer ciclo for, ciclo centinela");
			Scanner sc=new Scanner(System.in);
			String SioNo="Si";
			int num1=0;
			int sum=0;
			int contador=100;
			System.out.println("num1="+num1);
			for(;;) {
				num1=num1+50;
				System.out.println("num="+num1);
				sum=sum+num1;
				contador=contador-10;
				System.out.println("Ingrese Si para continuar o No para salir");
				SioNo=sc.next();
				if(SioNo.equalsIgnoreCase("No")) {
					break;
				}
			}
			System.out.println("fin tercer ciclo For, ciclo Centinela");
			System.out.println("sum="+sum);
		}
}
