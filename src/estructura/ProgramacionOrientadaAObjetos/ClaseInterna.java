package ProgramacionOrientadaAObjetos;

public class ClaseInterna {

	static class Animal{
		
		String Nombre;
		String Sonido;
	}
	
	
	public static void main(String[] args) {
	

	

	
		
		Animal animal= new Animal();
		animal.Nombre="Tonky";
		animal.Sonido="Ladrido";
		
		System.out.println("Nombre: "+animal.Nombre);
		System.out.println("Sonido: "+animal.Sonido);
		
	
	
	
 }
}
