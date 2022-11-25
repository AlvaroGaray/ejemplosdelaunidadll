package OtrosTemas;

public class java8expresionesLamDa {

	public static void main(String[] args) {
		
		//MiRunnable NuevoRunnable = new MiRunnable();
		
		Runnable NuevoRunnable = ()-> {
			System.out.println("El hilo funciona!");
		
		System.out.println("Segunda linea ");
		};
		Thread h = new Thread(NuevoRunnable);
		h.start();
	}
	
	

}
