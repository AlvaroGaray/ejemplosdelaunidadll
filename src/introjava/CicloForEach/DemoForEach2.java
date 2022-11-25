package CicloForEach;

	import java.util.ArrayList;

	public class DemoForEach2 {
		public static void main(String[] args) {
			ArrayList<String> baldeString=new ArrayList<>();
			String nombre="Danilo";
			baldeString.add("Hello");
			baldeString.add("Hello");
			baldeString.add("Hi");
			baldeString.add(nombre);
			for(String cadena:baldeString) {
			System.out.println("La cadena es "+cadena);
			}
			System.out.println("--------------------");
			for(Object cadena:baldeString) {
			System.out.println("La cadena es "+cadena);
			}
		}
}
