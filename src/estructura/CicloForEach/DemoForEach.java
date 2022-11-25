package CicloForEach;

	import java.util.ArrayList;
	public class DemoForEach {
		public static void main(String[] args) {
			ArrayList balde=new ArrayList();
			balde.add("Hola");
			balde.add("Hello");
			balde.add("Hi");
			for(Object obj:balde) {
				System.out.println("El objeto es "+obj);
			}
			//for(String obj:balde) {
			//	System.out.println("El objeto es "+obj);
			//}
		}
}
